import java.util.Scanner;
public class ficha52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] mercado = new int[10];

        int n, v=0,totalValor = 0;

    for (n=0; n<10; n++){
        System.out.println("Insira o valor do produto");
            mercado [n] = input.nextInt();
            totalValor = totalValor+ mercado[n];

        }





            System.out.println(totalValor);



    }
}
