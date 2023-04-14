package org.example.entities;

public class PedidoEletro extends Pedido {

    private String descricao;

    public PedidoEletro(Double valor) {
        super(valor);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
