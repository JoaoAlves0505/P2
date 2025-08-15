import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de pessoas: ");
        int quant = sc.nextInt();

        String[] nomes = new String[quant];
        double[] impostos = new double[quant];
        double total = 0;

        for(int i = 1; i <= quant; i++) {
            System.out.print("Pessoa #" + i + " data:\n" +
                    "Física ou jurídica (f/j)? ");
            sc.nextLine();
            String tipo = sc.nextLine();

            System.out.print("nome: ");
            String nome = sc.nextLine();
            nomes[i - 1] = nome;

            System.out.print("Renda anual: ");
            double renda = sc.nextDouble();

            if(tipo.equals("f")) {
                System.out.print("Gastos com saúde: ");
                double saude = sc.nextDouble();

                Fisica f = new Fisica(nome, renda, saude);

                impostos[i - 1] = f.calcularImposto();
            }
            else {
                System.out.print("Número de funcionários: ");
                int func = sc.nextInt();

                Juridica j = new Juridica(nome, renda, func);

                impostos[i - 1] = j.calcularImposto();
            }
            total += impostos[i - 1];
        }

        System.out.println("\nIMPOSTOS PAGOS:");

        for(int i = 0; i < quant; i++) {
            System.out.println(nomes[i] + ": R$ " + impostos[i]);
        }

        System.out.print("\nIMPOSTO TOTAL: R$ " + total);
        sc.close();
    }
}
