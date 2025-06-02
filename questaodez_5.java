public class IndiceMenorValor {
    public static void main(String[] args) {
        int[] vetor = {8, 5, 3, 9, 1, 3, 6, 5};

        int indiceMenor = 0; 

       
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < vetor[indiceMenor]) {
                indiceMenor = i;
            }
        }

        System.out.println("O índice do menor valor no vetor é: " + indiceMenor);
    }
}