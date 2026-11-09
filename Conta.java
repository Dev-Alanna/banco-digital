public class Conta {

    private String titular;
    private int numero;
    private double saldo;

    public Conta(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public boolean depositar(double valor){
        if (valor > 0){
            saldo = saldo + valor;
            return true;
        }
        return false;
    }
    public boolean sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
}
