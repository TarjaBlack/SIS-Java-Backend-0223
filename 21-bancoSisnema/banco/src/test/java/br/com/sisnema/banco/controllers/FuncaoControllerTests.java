package br.com.sisnema.banco.controllers;

import br.com.sisnema.banco.dtos.FuncaoDto;
import br.com.sisnema.banco.factories.Factory;
import br.com.sisnema.banco.services.FuncaoService;
import br.com.sisnema.banco.services.exceptions.RecursoNaoEncontrado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(FuncaoController.class)
public class FuncaoControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FuncaoService service;

    private Long idExistente;
    private Long idNaoExistente;
    private Long idChaveEstrangeira;
    private FuncaoDto funcaoDto;
    private List<FuncaoDto> funcaoDtoList;

    @BeforeEach
    void Setup() throws Exception {
        idExistente = 1L;
        idNaoExistente = 999L;
        idChaveEstrangeira = 2L;
        funcaoDto = Factory.criarFuncaoDto();
        funcaoDtoList = new ArrayList<>();

        when(service.procurarTodos()).thenReturn(funcaoDtoList);

        when(service.procurarPorId(idExistente)).thenReturn(funcaoDto);
        when(service.procurarPorId(idNaoExistente)).thenThrow(RecursoNaoEncontrado.class);

        when(service.inserir(any())).thenReturn(funcaoDto);

        when(service.atualizar(eq(idExistente), any())).thenReturn(funcaoDto);
        when(service.atualizar(eq(idNaoExistente), any())).thenThrow(RecursoNaoEncontrado.class);

        doNothing().when(service).excluir(idExistente);
        doThrow(RecursoNaoEncontrado.class).when(service).excluir(idNaoExistente);
    }

    @Test
    public void procurarTodosDeveriaRetornarUmaListaDeDtos() throws Exception {
        ResultActions resultado = mockMvc.perform(get("/v1/funcoes")
                .accept(MediaType.APPLICATION_JSON));

        resultado.andExpect(status().isOk());
    }

    // Procurar por ID

    // Procurar por ID com Exceção

    // Inserir

    // Atualizar

    // Atualizar com Exceção

    // Excluir

    // Excluir com exceção

}
