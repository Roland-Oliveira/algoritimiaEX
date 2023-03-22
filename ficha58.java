import java.util.Scanner;
public class ficha58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nome = new String[2];
        int i;

        for (i=0;i < nome.length; i++) {
            System.out.println("introduza uma caracter: ");
            nome[i] = input.nextLine();

        }
            if (nome[0].equals(nome[1])){
                System.out.println("As palavras são iguais!");
            }
            else {
                System.out.println("As palavras são diferentes");
            }
    }
}
