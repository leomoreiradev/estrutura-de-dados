package aula01_vetor;

public class Main {
    public static void main(String[] args) {
        int[] vetorzao = new int[10];
        vetorzao[0] = 3;
        vetorzao[1] = 4;
        vetorzao[2] = 8;
        vetorzao[3] = 13;
        vetorzao[4] = 22;
        vetorzao[5] = 51;
        vetorzao[6] = 33;

        for (int i = 0; i < vetorzao.length ; i++) {
            System.out.println("Imprimindo: Valor de =" + i + " é " + vetorzao[i]);
        }
        System.out.println("Fim do laço");
    }
}
