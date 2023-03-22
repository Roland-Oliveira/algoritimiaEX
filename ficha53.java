import java.util.Scanner;
public class ficha53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, max=0;
        int[] vetor = new int[10];

        for (n=0; n<10; n++){
            System.out.println("indique valor");
            vetor[n] = input.nextInt();
           if (vetor[n] > max){
               max = vetor [n];
           }
        }

        System.out.println(max);







    }


    }

