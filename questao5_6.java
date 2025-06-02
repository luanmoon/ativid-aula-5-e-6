public class MenorMaiorQue50 {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 45, 50, 55, 60, 70, 80, 90}; 
        
        int resultado = encontrarMenorMaiorQue50(vetor);
        
        if (resultado != -1) {
            System.out.println("O menor valor maior que 50 é: " + resultado);
        } else {
            System.out.println("Não há valor maior que 50 no vetor.");
        }
    }
    
    public static int encontrarMenorMaiorQue50(int[] vetor) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int resultado = -1;
        
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            
            if (vetor[meio] > 50) {
               
                fim = meio - 1;
            } else {
               
                inicio = meio + 1;
            }
        }
        
        return resultado;
    }
}
