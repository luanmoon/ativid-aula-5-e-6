public class BuscaBinariaExemplo {
    public static void main(String[] args) {
        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para buscar: ");
        int numero = scanner.nextInt();
        
        boolean encontrado = buscaBinaria(vetor, numero);
        
        if (encontrado) {
            System.out.println( numero);
        } else {
            System.out.println (" NÃO foi encontrado no vetor.");
        }
        
        scanner.close();
    }
    
    public static boolean buscaBinaria(int[] vetor, int chave) {
        int inicio = 0;
        int fim = vetor.length - 1;
        
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            
            if (vetor[meio] == chave) {
                return true;
            } else if (vetor[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        
        return false;
    }
}