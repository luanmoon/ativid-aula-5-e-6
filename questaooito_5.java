public class SomaMaioresQueReferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {33, 67, 0, 4, 6, 5, 10, 8, 9, 3};

        
        System.out.print("Digite o valor de referência: ");
        int referencia = scanner.nextInt();

        int soma = 0;

       
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > referencia) {
                soma += vetor[i];
            }
        }

       
        System.out.println("A soma dos números maiores que " + referencia + " é: " + soma);

        scanner.close();
    }
}