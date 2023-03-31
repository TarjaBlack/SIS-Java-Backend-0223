package br.com.sisnema.banco.factories;

import br.com.sisnema.banco.entities.Funcao;

public class Factory {

    public static Funcao criarFuncao() {
        Funcao funcao = new Funcao(1L, "ROLE_PILOT");
        return funcao;
    }


}
