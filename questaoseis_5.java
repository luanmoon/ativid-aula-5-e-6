public class PosicoesZeros {
    public static void main(String[] args) {
        int[] vetor = {9, 33, 21, 1, 0, 6, 0, 7, 0, 9};

        boolean encontrouZero = false;

        System.out.println("O número 0 aparece nas posições:");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 0) {
                System.out.println("Posição: " + i);
                encontrouZero = true;
            }
        }

        if (!encontrouZero) {
            System.out.println("Nenhuma posição encontrada. O número 0 não aparece no vetor.");
        }
    }
}