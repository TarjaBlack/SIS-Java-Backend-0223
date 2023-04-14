package org.example;

import org.example.entities.Pedido;

public class Main {
    public static void main(String[] args) {

        Pedido p1 = new Pedido(1000.0);
        System.out.println("Valor do pedido P1: " + p1.getValor());
        System.out.println("Valor do frete comum: " + p1.calcFreteComum(p1.getValor()));
        System.out.println("Valor do frete expresso: " + p1.calcFreteExpresso(p1.getValor()));

    }
}