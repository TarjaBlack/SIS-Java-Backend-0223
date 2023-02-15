package entities;

import java.time.Instant;

public class Produto {

    // Declaração dos atributos (substantivos)
    public int id;
    public String nome;
    public String desc;
    public double valor;
    public int estoque;
    public Instant dataCadastro;

    // Contrutores
    // Quando não se cria mais de um construtor o construtor padrão está implícito.
    public Produto() {
    }

    public Produto(int id, String nome, String desc, double valor, int estoque, Instant dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.desc = desc;
        this.valor = valor;
        this.estoque = estoque;
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", desc='" + desc + '\'' +
                ", valor=" + valor +
                ", estoque=" + estoque +
                ", dataCadastro=" + dataCadastro +
                '}';
    }
}
