public class Conta {
    private String titular;
    private double saldo;
    private double limite;

    public Conta() {}

    public Conta(String titular, double saldoInicial, double limite) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.limite = limite;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // setSaldo() removido para proteger o saldo contra alteracao direta

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Métodos da Fase 2
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso para " + titular);
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }

    public boolean sacar(double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso na conta de " + titular);
            return true;
        } else {
            System.out.println("Erro: Saldo e limite insuficientes para o saque de R$ " + valor);
            return false;
        }
    }

    public boolean pagarDespesa(Despesa despesa) {
        if (despesa.isPaga()) {
            System.out.println("Despesa '" + despesa.getDescricao() + "' ja esta paga.");
            return false;
        }
        if (sacar(despesa.getValor())) {
            despesa.setPaga(true);
            System.out.println("Despesa '" + despesa.getDescricao() + "' paga com sucesso!");
            return true;
        } else {
            System.out.println("Falha ao pagar despesa '" + despesa.getDescricao() + "'.");
            return false;
        }
    }

    public boolean poupar(Meta meta, double valor) {
        if (sacar(valor)) {
            meta.adicionarValor(valor);
            System.out.println("R$ " + valor + " guardados na meta: " + meta.getDescricao());
            return true;
        } else {
            System.out.println("Erro: Saldo insuficiente para poupar R$ " + valor);
            return false;
        }
    }
}
