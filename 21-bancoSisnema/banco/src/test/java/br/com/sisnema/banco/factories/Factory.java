package br.com.sisnema.banco.factories;

import br.com.sisnema.banco.dtos.FuncaoDto;
import br.com.sisnema.banco.dtos.TipoContaDto;
import br.com.sisnema.banco.dtos.UsuarioDto;
import br.com.sisnema.banco.entities.Funcao;
import br.com.sisnema.banco.entities.TipoConta;
import br.com.sisnema.banco.entities.Usuario;

public class Factory {

    public static Funcao criarFuncao() {
        Funcao funcao = new Funcao(1L, "ROLE_PILOT");
        return funcao;
    }

    public static FuncaoDto criarFuncaoDto() {
        Funcao funcao = criarFuncao();
        return new FuncaoDto(funcao);
    }

    public static TipoConta criarTipoConta() {
        TipoConta tipoConta = new TipoConta(1L, "Conjunta");
        return tipoConta;
    }

    public static TipoContaDto criarTipoContaDto() {
        TipoConta tipoConta = criarTipoConta();
        return new TipoContaDto(tipoConta);
    }

    public static Usuario criarUsuario() {
        Usuario usuario = new Usuario(1L, "Felipe", "Massa", "massa@gmail.com", "123456");
        return usuario;
    }

    public static UsuarioDto criarUsuarioDto() {
        Usuario usuario = criarUsuario();
        return new UsuarioDto(usuario);
    }
}
