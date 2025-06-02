import java.util.Scanner;

public class BuscaBinariaComContagem {
    public static void main(String[] args) {
        int[] vetor = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para buscar no vetor (1 a 30): ");
        int chave = scanner.nextInt();

        int[] resultado = buscaBinariaComContagem(vetor, chave);
        int posicao = resultado[0];
        int comparacoes = resultado[1];

        if (posicao != -1) {
            System.out.println("Número " + chave + " encontrado na posição (índice) " + posicao + ".");
        } else {
            System.out.println("Número " + chave + " não encontrado no vetor.");
        }
        System.out.println("Total de comparações feitas: " + comparacoes);

        scanner.close();
    }

    public static int[] buscaBinariaComContagem(int[] vetor, int chave) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int comparacoes = 0;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            comparacoes++;

            if (vetor[meio] == chave) {
                return new int[]{meio, comparacoes};
            } else if (vetor[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return new int[]{-1, comparacoes};
    }
}
