package br.com.sisnema.banco.factories;

import br.com.sisnema.banco.entities.Funcao;
import br.com.sisnema.banco.entities.Usuario;

public class Factory {

    public static Funcao criarFuncao() {
        Funcao funcao = new Funcao(1L, "ROLE_PILOT");
        return funcao;
    }

    public static Usuario criarUsuario() {
        Usuario usuario = new Usuario(1L, "Felipe", "Massa", "massa@gmail.com", "123456");
        return usuario;
    }

}
