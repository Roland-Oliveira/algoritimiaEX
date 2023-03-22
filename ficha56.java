import java.util.Scanner;
public class ficha56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i,anterior=0;
        boolean crescente = true;
        int[] vetor = new int [10];

        for(i=0; i < vetor.length; i++){
            System.out.println("indique valor");
            vetor[i] = input.nextInt();

            if (anterior > vetor [i]){
                crescente = false;
            }

            anterior = vetor [i];
        }


        if  (crescente==true){
            System.out.println("A ordem é crescente!");
        }




    }
}
