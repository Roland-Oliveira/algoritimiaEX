import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nSequencia = 0, n=0, contador=0, anterior = 0;
        boolean crescente = true;

        System.out.println("Defina a quantidade de numeros");
        nSequencia = input.nextInt();


        while (nSequencia > contador){
            System.out.println("Defina o numero: ");
            n = input.nextInt();

            contador++;
            if (n <= anterior){
                crescente = false;

            }


            anterior = n;

        }
        if (crescente == true)
        System.out.print("A ordem é crescente!");

    }
}