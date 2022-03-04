public class Account {
    private double saldo;

    public Account(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double quantidade){
        return saldo += quantidade;
    }

    public double retirar(double quantidade){
        return saldo -= quantidade;
    }

}
