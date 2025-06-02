public class BuscaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {8, 5, 3, 9, 1, 3, 6, 5};

        
        System.out.print("Digite o número a ser buscado: ");
        int numeroBuscado = scanner.nextInt();

        
        int posicao = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroBuscado) {
                posicao = i;
                break;
            }
        }

        
        if (posicao != -1) {
            System.out.println("O número foi encontrado na posição: " + posicao);
        } else {
            System.out.println("O número não foi encontrado no vetor. Retornando -1.");
        }

        scanner.close();
    }
}