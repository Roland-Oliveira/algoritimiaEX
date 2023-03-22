import java.util.Scanner;

public class ficha54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,min=0;

        int[] vetor = new int[10];
        for (n=0; n < vetor.length; n++){
            System.out.println("indique valor");
            vetor[n] = input.nextInt();

            if(vetor[n] < min){
                min += vetor[n];
            }

        }

        System.out.println(min);


    }
}

