public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 500.0;
        double valorSaque = 700.0;
        if (saldo>valorSaque) {
            saldo = saldo - valorSaque;
                System.out.println(saldo);            
        } else {
            System.out.println("Saldo insuficiente, transação não realizada!");
        }
    }
}
