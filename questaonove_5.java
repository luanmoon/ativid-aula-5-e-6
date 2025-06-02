public class ProdutosComM {
    public static void main(String[] args) {
        String[] produtos = {"corda", "machado", "maca", "rede", "cama", "mola"};

        

        System.out.println("Produtos que começam com a letra 'M':");

       
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].toLowerCase().startsWith("m")) {
                System.out.println(produtos[i]);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum produto começa com a letra 'M'.");
        }
    }
}