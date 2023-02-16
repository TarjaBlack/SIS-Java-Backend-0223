import entities.Carrinho;

public class Main {
    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();
        carrinho.setId(1);
        carrinho.setItem("Impressora Epson LX-300");
        carrinho.setQuantidade(2);
        carrinho.setValor(699.39);
        carrinho.setPromocao(false);

        // Chamando o método sem parãmetros
        System.out.println("Valor total do item: " + carrinho.calcularTotalItem());
        System.out.println(carrinho);

        // Chamando o método com parâmetros
        System.out.println("Valor total do item modificado: " + carrinho.alterarValorItem(29.20));
        System.out.println("Valor total do item: " + carrinho.calcularTotalItem());
        System.out.println(carrinho);

    }
}