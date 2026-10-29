import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CADASTRO DE CONTAS ===");
        System.out.print("Nome Titular Conta 1: ");
        String t1 = scanner.nextLine();
        System.out.print("Saldo Inicial Conta 1: ");
        double s1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Limite Conta 1: ");
        double l1 = Double.parseDouble(scanner.nextLine());
        Conta conta1 = new Conta(t1, s1, l1);

        System.out.print("\nNome Titular Conta 2: ");
        String t2 = scanner.nextLine();
        System.out.print("Saldo Inicial Conta 2: ");
        double s2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Limite Conta 2: ");
        double l2 = Double.parseDouble(scanner.nextLine());
        Conta conta2 = new Conta(t2, s2, l2);

        System.out.println("\n=== CADASTRO DE RECEITA ===");
        System.out.print("Descrição da Receita: ");
        String descR = scanner.nextLine();
        System.out.print("Valor da Receita: ");
        double valR = Double.parseDouble(scanner.nextLine());
        Receita receita = new Receita(descR, valR);

        System.out.println("\n=== CADASTRO DE 3 DESPESAS ===");
        System.out.print("Descrição Despesa 1: ");
        String d1 = scanner.nextLine();
        System.out.print("Valor Despesa 1: ");
        double v1 = Double.parseDouble(scanner.nextLine());
        Despesa despesa1 = new Despesa(d1, v1);

        System.out.print("Descrição Despesa 2: ");
        String d2 = scanner.nextLine();
        System.out.print("Valor Despesa 2: ");
        double v2 = Double.parseDouble(scanner.nextLine());
        Despesa despesa2 = new Despesa(d2, v2);

        System.out.print("Descrição Despesa 3: ");
        String d3 = scanner.nextLine();
        System.out.print("Valor Despesa 3: ");
        double v3 = Double.parseDouble(scanner.nextLine());
        Despesa despesa3 = new Despesa(d3, v3);

        System.out.println("\n=== CADASTRO DE META ===");
        System.out.print("Descrição da Meta: ");
        String mDesc = scanner.nextLine();
        System.out.print("Valor Alvo da Meta: ");
        double mAlvo = Double.parseDouble(scanner.nextLine());
        Meta meta = new Meta(mDesc, mAlvo);

        System.out.println("\n--- EXECUÇÃO DE OPERAÇÕES ---");
        conta1.depositar(receita.getValor());
        conta1.pagarDespesa(despesa1);
        conta1.pagarDespesa(despesa2);
        conta2.pagarDespesa(despesa3);
        conta1.poupar(meta, 150.0);

        System.out.println("\n==========================================");
        System.out.println("           RELATÓRIO FINANCEIRO           ");
        System.out.println("==========================================");
        System.out.println("CONTAS:");
        System.out.println("Conta 1 (" + conta1.getTitular() + ") - Saldo: R$ " + conta1.getSaldo() + " | Limite: R$ " + conta1.getLimite());
        System.out.println("Conta 2 (" + conta2.getTitular() + ") - Saldo: R$ " + conta2.getSaldo() + " | Limite: R$ " + conta2.getLimite());

        System.out.println("\nDESPESAS:");
        System.out.println("- " + despesa1.getDescricao() + ": R$ " + despesa1.getValor() + " [Paga: " + despesa1.isPaga() + "]");
        System.out.println("- " + despesa2.getDescricao() + ": R$ " + despesa2.getValor() + " [Paga: " + despesa2.isPaga() + "]");
        System.out.println("- " + despesa3.getDescricao() + ": R$ " + despesa3.getValor() + " [Paga: " + despesa3.isPaga() + "]");

        System.out.println("\nMETA:");
        System.out.println("- " + meta.getDescricao() + ": R$ " + meta.getValorPoupado() + " / R$ " + meta.getValorAlvo());
        System.out.println("==========================================");

        scanner.close();
    }
}
