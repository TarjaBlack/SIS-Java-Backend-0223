import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, adicao, subtracao, mult, div;

        // Atribuição de um objeto Scanner na variável sc;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n1: ");
        n1 = sc.nextInt();
        //System.out.println("N1: " + n1);

        System.out.print("Digite o valor de n2: ");
        n2 = sc.nextInt();
        //System.out.println("N2: " + n2);

        adicao = n1 + n2;
        System.out.printf("O resultado da adição é: " + adicao);

        sc.close(); // Destroi o objeto na memória RAM;
    }
}