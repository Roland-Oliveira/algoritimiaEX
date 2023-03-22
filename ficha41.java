import java.util.Scanner;
public class ficha41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, op = 1;

        char operacao;


    while(op != 0) {

        System.out.println("Indique o primeiro numero: ");
        n1 = input.nextInt();
        System.out.println("Indique o segundo numero: ");
        n2 = input.nextInt();
        System.out.println("Indique a operacao: ");
        operacao =  input.next().charAt(0);

        switch (operacao) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '/':
                System.out.print(n1 / n2);
                break;
            case 'x':
                System.out.println(n1 * n2);
                break;

        }
        System.out.println("indique 1 para continuar e 0 para parar: ");
        op = input.nextInt();


    }





    }
}