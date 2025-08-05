import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Preco: ");
        double preco = sc.nextDouble();

        System.out.println("Quantidade: ");
        int quant = sc.nextInt();

        Produto p = new Produto(nome, preco, quant);
        System.out.println(p);

        System.out.println("Digite a quantidade de produtos a ser adicionada no estoque: ");
        p.addQuant(sc.nextInt());
        System.out.println(p);

        System.out.println("Digite a quantidade de produtos a ser subtraida no estoque: ");
        p.subQuant(sc.nextInt());
        System.out.println(p);

        sc.close();
    }
}