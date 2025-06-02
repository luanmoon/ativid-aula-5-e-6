public class BuscaBinariaPasso {

public static void main(String[] args) {
        int[] vetor = {21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
        int chave = 35;
        
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        int passo = 1;
        
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            System.out.println("Passo " + passo + ": inicio=" + inicio + ", fim=" + fim + ", meio=" + meio + ", vetor[meio]=" + vetor[meio]);
            
            if (vetor[meio] == chave) {
                System.out.println("Valor " + chave + " encontrado no índice " + meio + "!");
                break;
            } else if (vetor[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
            passo++;
        }
        
        if (inicio > fim) {
            System.out.println("Valor " + chave + " não encontrado no vetor.");
        }
    }
}