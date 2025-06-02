 public class BuscaNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = {"gustava", "lune", "maelle", "verso", "monoco", "renoir"};

       
        System.out.print("Digite o nome a ser buscado: ");
        String nomeBuscado = scanner.nextLine();

        boolean encontrado = false;

        
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBuscado)) {
                encontrado = true;
                break; 
            }
        }

        
        if (encontrado) {
            System.out.println("O nome está presente no vetor.");
        } else {
            System.out.println("O nome NÃO está presente no vetor.");
        }

        scanner.close();
    }
}