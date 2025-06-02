public class BuscaBinariaPosicao {
    public static void main(String[] args) {
        int[] vetor = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};  
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para buscar: ");
        int numero = scanner.nextInt();
        
        int posicao = buscaBinaria(vetor, numero);
        
        if (posicao != -1) {
            System.out.println("O número " + numero + " foi encontrado na posição (índice) " + posicao + ".");
        } else {
            System.out.println("Valor não encontrado.");
        }
        
        scanner.close();
    }
    
    public static int buscaBinaria(int[] vetor, int chave) {
        int inicio = 0;
        int fim = vetor.length - 1;
        
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            
            if (vetor[meio] == chave) {
                return meio;  
            } else if (vetor[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;  
    }
}