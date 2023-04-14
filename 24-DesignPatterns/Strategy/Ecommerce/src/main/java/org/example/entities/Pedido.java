package org.example.entities;

public class Pedido {

    private Double valor;

    public Pedido() {
    }

    public Pedido(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double calcFreteComum(Double valor) {
        return valor * 0.02; // 2%
    }

    public Double calcFreteExpresso(Double valor) {
        return valor * 0.05; // 5%
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "valor=" + valor +
                '}';
    }
}
