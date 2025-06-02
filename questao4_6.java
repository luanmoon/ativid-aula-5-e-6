public class BuscaBinariaNomes {
    public static void main(String[] args) {
        String[] nomes = {"gustave", "lune", "maelle", "maria", "monoco", "sciel", "verso"};
        
        
        Arrays.sort(nomes);
        
        String chave = "maria";
        
        boolean encontrado = buscaBinaria(nomes, chave);
        
        if (encontrado) {
            System.out.println(chave );
        } else {
            System.out.println(" NÃO foi encontrado no vetor.");
        }
    }
    
    public static boolean buscaBinaria(String[] vetor, String chave) {
        int inicio = 0;
        int fim = vetor.length - 1;
        
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = vetor[meio].compareToIgnoreCase(chave);
            
            if (comparacao == 0) {
                return true;
            } else if (comparacao < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return false;
    }
}