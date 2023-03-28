package br.com.sisnema.banco.services;

import br.com.sisnema.banco.dtos.FuncaoDto;
import br.com.sisnema.banco.dtos.UsuarioDto;
import br.com.sisnema.banco.entities.Funcao;
import br.com.sisnema.banco.entities.Usuario;
import br.com.sisnema.banco.repositories.FuncaoRepository;
import br.com.sisnema.banco.repositories.UsuarioRepository;
import br.com.sisnema.banco.services.exceptions.RecursoNaoEncontrado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private FuncaoRepository funcaoRepository;

    @Transactional(readOnly = true)
    public List<UsuarioDto> procurarTodos() {
        List<Usuario> list = repository.findAll();
        return list.stream().map(x -> new UsuarioDto(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public UsuarioDto procurarPorId(Long id) {
        Optional<Usuario> objeto = repository.findById(id);
        Usuario entidade = objeto.orElseThrow(() ->
                    new RecursoNaoEncontrado("Este ID não existe em nosso sistema.")
                );
        return new UsuarioDto(entidade);
    }

    @Transactional
    public UsuarioDto inserir(UsuarioDto dto) {
        Usuario entidade = new Usuario();
        copiarDtoParaEntidade(dto, entidade);
        // A senha será criptografada
        entidade = repository.save(entidade);
        return new UsuarioDto(entidade);
    }

    // Atualizar

    // Excluir

    private void copiarDtoParaEntidade(UsuarioDto dto, Usuario entidade) {
        entidade.setNome(dto.getNome());
        entidade.setSobrenome(dto.getSobrenome());
        entidade.setEmail(dto.getEmail());

        entidade.getFuncoes().clear();
        for (FuncaoDto funcDto : dto.getFuncaoDtos()) {
            Funcao func = funcaoRepository.getReferenceById(funcDto.getId());
            entidade.getFuncoes().add(func);
        }
    }

}
