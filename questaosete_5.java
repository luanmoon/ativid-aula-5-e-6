public class PrimeiraNotaMaiorQueSete {
    public static void main(String[] args) {
        double[] notas = {2, 8, 6, 4, 5, 8};

        
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 7) {
                System.out.println("A primeira nota maior que 7 é: " + notas[i]);
                encontrou = true;
                break; 
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma nota maior que 7 foi encontrada no vetor.");
        }
    }
}