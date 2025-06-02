public class PrimeiraPosicao {
    public static void main(String[] args) {
        int[] vetor = {10, 15, 20, 20, 20, 25, 30}; 
        
        int chave = 20;
        int posicao = buscaPrimeiraPosicao(vetor, chave);
        
        if (posicao != -1) {
            System.out.println("O número " + chave + " aparece pela primeira vez na posição (índice) " + posicao + ".");
        } else {
            System.out.println("O número " + chave + " não foi encontrado no vetor.");
        }
    }
    
    public static int buscaPrimeiraPosicao(int[] vetor, int chave) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int resultado = -1;
        
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            
            if (vetor[meio] == chave) {
                resultado = meio; 
                fim = meio - 1;    
            } else if (vetor[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        
        return resultado;  
    }
}