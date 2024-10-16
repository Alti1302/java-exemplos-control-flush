public class SaldoBancarioTernario {
    public static void main(String[] args) {
        double saldo = 500.0;
        double saque = 250.0;

        String resultado = saque <saldo ? "Saque realizado com sucesso!" : "saldo insuficiente!";

        System.out.println(resultado);
    }
}
