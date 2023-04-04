package br.com.sisnema.banco.factories;

import br.com.sisnema.banco.entities.Conta;

public class FactoryFK {

    public static Conta criarConta() {
        Conta conta = new Conta(6L, 1, "5541-5", "10445", 250.0, 635.25, Factory.criarTipoConta());
        return conta;
    }

}
