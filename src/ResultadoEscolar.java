public class ResultadoEscolar {
    
    public static void main(String[] args) {
        int nota = 4;

        if (nota>6) {
            System.out.println("Aluno aprovado!");
            
         } else if (nota>= 5 && nota <7) {
            System.out.println("Aluno em recuperação!");
            
         } else  {System.out.println("Aluno reprovado!");
        }
        
    }
}
