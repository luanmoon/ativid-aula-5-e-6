public class BuscaSequencial {

    public static int buscaSequencial(int[] v, int chave) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == chave) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] dados = {8, 5, 3, 9, 1};
        int pos = buscaSequencial(dados, 9);
        System.out.println("Encontrado na posição: " + pos);
    }
}