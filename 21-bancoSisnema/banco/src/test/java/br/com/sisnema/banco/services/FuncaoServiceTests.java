package br.com.sisnema.banco.services;

import br.com.sisnema.banco.dtos.FuncaoDto;
import br.com.sisnema.banco.entities.Funcao;
import br.com.sisnema.banco.factories.Factory;
import br.com.sisnema.banco.repositories.FuncaoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.times;

@ExtendWith(SpringExtension.class)
public class FuncaoServiceTests {

    @InjectMocks
    private FuncaoService service;

    @Mock
    private FuncaoRepository repository;

    private Long idExistente;
    private Long idNaoExistente;
    private Long idChaveEstrangeira;
    private Long contagemTotalDeFuncoes;
    private Funcao funcao;
    private FuncaoDto funcaoDto;
    private List<Funcao> funcaoList;

    @BeforeEach
    void Setup() throws Exception {
        idExistente = 1L;
        idNaoExistente = 999L;
        idChaveEstrangeira = 2L;
        contagemTotalDeFuncoes = 3L;
        funcao = Factory.criarFuncao();
        funcaoDto = Factory.criarFuncaoDto();
        funcaoList = new ArrayList<>();

        // Simulações da camada de Repository - MOCK
        Mockito.when(repository.findAll()).thenReturn(funcaoList);

        Mockito.when(repository.findById(idExistente)).thenReturn(Optional.of(funcao));
        Mockito.when(repository.findById(idNaoExistente)).thenReturn(Optional.empty());

        Mockito.when(repository.save(ArgumentMatchers.any())).thenReturn(funcao);

        Mockito.when(repository.getReferenceById(idExistente)).thenReturn(funcao);
        Mockito.when(repository.getReferenceById(idNaoExistente)).thenThrow(EntityNotFoundException.class);

        Mockito.doNothing().when(repository).deleteById(idExistente);
        Mockito.doThrow(EmptyResultDataAccessException.class).when(repository).deleteById(idNaoExistente);
        Mockito.doThrow(DataIntegrityViolationException.class).when(repository).deleteById(idChaveEstrangeira);
    }

    @Test
    public void procurarTodosDeveriaRetornarUmaListaDeObjetos() {
        List<FuncaoDto> list = service.procurarTodos();

        Assertions.assertNotNull(list);
        Mockito.verify(repository, times(1)).findAll();
    }

    @Test
    public void procurarPorIdDeveriaRetornarUmDtoQuandoOIdExistir() {
        FuncaoDto resultado = service.procurarPorId(idExistente);

        Assertions.assertNotNull(resultado);
    }
}
