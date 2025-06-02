public class ContaZeros {
    public static void main(String[] args) {
        int[] vetor = {9, 33, 21, 1, 0, 6, 0, 7, 0, 9};

        int contadorZeros = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 0) {
                contadorZeros++;
            }
        }

        System.out.println("O número 0 aparece " + contadorZeros + " vezes no vetor.");
    }
}