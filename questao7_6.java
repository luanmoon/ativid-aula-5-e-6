public class UltimaPosicao {
    public static void main(String[] args) {
        int[] vetor = {5, 10, 10, 10, 15, 20};  
        
        int chave = 10;
        int posicao = buscaUltimaPosicao(vetor, chave);
        
        if (posicao != -1) {
            System.out.println("O número " + chave + " aparece pela última vez na posição (índice) " + posicao + ".");
        } else {
            System.out.println("O número " + chave + " não foi encontrado no vetor.");
        }
    }
    
    public static int buscaUltimaPosicao(int[] vetor, int chave) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int resultado = -1;
        
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            
            if (vetor[meio] == chave) {
                resultado = meio;  
                inicio = meio + 1;  
            } else if (vetor[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        
        return resultado;  
    }
}