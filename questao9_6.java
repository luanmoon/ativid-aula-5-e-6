import java.util.Scanner;

public class BuscaBinariaComEliminados {
    public static void main(String[] args) {
        int[] vetor = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30
        };
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para buscar no vetor (1 a 30): ");
        int chave = scanner.nextInt();
        
        ResultadoBusca resultado = buscaBinariaComEliminados(vetor, chave);
        
        if (resultado.posicao != -1) {
            System.out.println("Número " + chave + " encontrado na posição (índice) " + resultado.posicao + ".");
        } else {
            System.out.println("Número " + chave + " não encontrado no vetor.");
        }
        System.out.println("Total de comparações feitas: " + resultado.comparacoes);
        System.out.println("Total de elementos eliminados da busca: " + resultado.eliminados);
        
        scanner.close();
    }
    
    static class ResultadoBusca {
        int posicao;
        int comparacoes;
        int eliminados;
        
        ResultadoBusca(int posicao, int comparacoes, int eliminados) {
            this.posicao = posicao;
            this.comparacoes = comparacoes;
            this.eliminados = eliminados;
        }
    }
    
    public static ResultadoBusca buscaBinariaComEliminados(int[] vetor, int chave) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int comparacoes = 0;
        int eliminados = 0;
        
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            comparacoes++;
            
            if (vetor[meio] == chave) {
                return new ResultadoBusca(meio, comparacoes, eliminados);
            } else if (vetor[meio] < chave) {
                eliminados += (meio - inicio + 1);
                inicio = meio + 1;
            } else {
                eliminados += (fim - meio + 1);
                fim = meio - 1;
            }
        }
        
        return new ResultadoBusca(-1, comparacoes, eliminados);
    }
}