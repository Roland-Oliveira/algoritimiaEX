import java.util.Scanner;
public class ficha43 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int valor1, valor2=0, contador = 0;

        System.out.println("Indique o Valor1 entre 0-100: ");
        valor1 = input.nextInt();
    if (valor1 >= 0 ) {
        do {
            System.out.println("Indique o Valor2 entre 0-100: ");
            valor2 = input.nextInt();

            if (valor2 > valor1) {
                System.out.println("O valor é menor!");
            } else if (valor2 < valor1) {
                System.out.println("O valor é maior!");
            }
            contador++;

        } while (valor1 != valor2);
        System.out.println("O jogador acertou em: " + contador + " tentativas");

    } else {
        System.out.println("Valor aceito 0-100");
    }


    }
}
