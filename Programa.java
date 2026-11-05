import java.util.Scanner;
import model.*;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Cadastramos a primeira conta e guardamos o nome em 't1'
        System.out.println("=== CADASTRO DE CONTAS ===");
        System.out.print("Nome Titular Conta 1: ");
        String t1 = scanner.nextLine();
        System.out.print("Saldo Inicial Conta 1: ");
        double s1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Limite Conta 1: ");
        double l1 = Double.parseDouble(scanner.nextLine());
        Conta conta1 = new Conta(t1, s1, l1);

        // 2. Cadastramos a segunda conta e guardamos o nome em 't2'
        System.out.print("\nNome Titular Conta 2: ");
        String t2 = scanner.nextLine();
        System.out.print("Saldo Inicial Conta 2: ");
        double s2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Limite Conta 2: ");
        double l2 = Double.parseDouble(scanner.nextLine());
        Conta conta2 = new Conta(t2, s2, l2);

        // 3. Receita: A mensagem já inclui o nome do titular (t1) diretamente na descrição
        System.out.println("\n=== REGISTRO DE RECEITA ===");
        System.out.print("Digite a descricao da receita para " + t1 + ": ");
        String descR = scanner.nextLine();
        System.out.print("Digite o valor da receita: ");
        double valR = Double.parseDouble(scanner.nextLine());
        Receita receita = new Receita(descR, valR);

        // 4. Despesas: Cada mensagem de descrição já fala para qual titular é
        System.out.println("\n=== REGISTRO DE DESPESAS ===");
        System.out.print("Digite a descricao da 1ª despesa para " + t1 + ": ");
        String d1 = scanner.nextLine();
        System.out.print("Digite o valor dessa despesa: ");
        double v1 = Double.parseDouble(scanner.nextLine());
        Despesa despesa1 = new Despesa(d1, v1);

        System.out.print("Digite a descricao da 2ª despesa para " + t1 + ": ");
        String d2 = scanner.nextLine();
        System.out.print("Digite o valor dessa despesa: ");
        double v2 = Double.parseDouble(scanner.nextLine());
        Despesa despesa2 = new Despesa(d2, v2);

        System.out.print("Digite a descricao da despesa para " + t2 + ": ");
        String d3 = scanner.nextLine();
        System.out.print("Digite o valor dessa despesa: ");
        double v3 = Double.parseDouble(scanner.nextLine());
        Despesa despesa3 = new Despesa(d3, v3);

        // 5. Meta: A descrição da meta também identifica o titular
        System.out.println("\n=== REGISTRO DE META ===");
        System.out.print("Digite a descricao da meta para " + t1 + ": ");
        String mDesc = scanner.nextLine();
        System.out.print("Digite o valor alvo da meta: ");
        double mAlvo = Double.parseDouble(scanner.nextLine());
        Meta meta = new Meta(mDesc, mAlvo);

        // ... resto da execução das movimentações e exibição dos relatórios ...

        scanner.close();
    }
}
