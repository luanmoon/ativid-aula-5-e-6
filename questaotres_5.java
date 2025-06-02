public class Busca25 {
    public static void main(String[] args) {
        int[] vetor = {8, 5, 3, 9, 1, 3, 6, 5, 11, 33};

        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 25) {
                encontrado = true;
                break; 
            }
        }

       
        if (encontrado) {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}