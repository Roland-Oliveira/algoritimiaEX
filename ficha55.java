import java.util.Scanner;
public class ficha55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int [10];
        int i, soma= 0;

        for (i=0; i < vetor.length; i++){
            System.out.println("indique valor");
            vetor[i] = input.nextInt();
            soma += vetor[i];
        }

        System.out.println("Média é: " + soma/ vetor.length);

    }
}
