import entities.Produto;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.id = 1;
        p1.nome = "Microfone Condensador";
        p1.desc = "Este microfone é omnidirecional";
        p1.valor = 49.95;
        p1.estoque = 55;
        p1.dataCadastro = Instant.now();

        Produto p2 = new Produto();
        p2.id = 2;
        p2.nome = "Impressora HP MFP128fn";
        p2.desc = "Impressora multifuncional da HP - LaserJet";
        p2.valor = 650.40;
        p2.estoque = 95;
        p2.dataCadastro = Instant.now();

        Produto p3 = new Produto(3, "Mouse Óptico Logitech", "Kit Mouse + teclado sem fio", 110.20,65, Instant.now());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}