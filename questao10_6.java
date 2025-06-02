import java.util.Scanner;

public class BuscaBinariaStrings {
    public static void main(String[] args) {
        String[] vetor = {"ana", "beatriz", "carla", "daniel", "eduardo", "fabio", "maria", "paulo", "roberta", "zeca"};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome para buscar no vetor: ");
        String chave = scanner.nextLine();
        
        ResultadoBusca resultado = buscaBinariaStringsComLetras(vetor, chave);
        
        if (resultado.posicao != -1) {
            System.out.println("Nome \"" + chave + "\" encontrado na posição (índice) " + resultado.posicao + ".");
        } else {
            System.out.println("Nome \"" + chave + "\" não foi encontrado no vetor.");
        }
        System.out.println("Total de letras comparadas: " + resultado.letrasComparadas);
        
        scanner.close();
    }
    
    static class ResultadoBusca {
        int posicao;
        int letrasComparadas;
        
        ResultadoBusca(int posicao, int letrasComparadas) {
            this.posicao = posicao;
            this.letrasComparadas = letrasComparadas;
        }
    }
    
    public static ResultadoBusca buscaBinariaStringsComLetras(String[] vetor, String chave) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int letrasComparadas = 0;
        
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            
            int letras = contarLetrasComparadas(vetor[meio], chave);
            letrasComparadas += letras;
            
            int cmp = vetor[meio].compareTo(chave);
            
            if (cmp == 0) {
                return new ResultadoBusca(meio, letrasComparadas);
            } else if (cmp < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        
        return new ResultadoBusca(-1, letrasComparadas);
    }
    
    public static int contarLetrasComparadas(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        int count = 0;
        for (int i = 0; i < minLength; i++) {
            count++;
            if (s1.charAt(i) != s2.charAt(i)) {
                return count;
            }
        }
        
        return count;
    }
}