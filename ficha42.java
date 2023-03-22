import java.util.Scanner;
public class ficha42 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int menu = 0;

    while (menu != 4 ) {
        System.out.println("indique o menu");
        menu = input.nextInt();
        switch (menu) {

            case 1:
                System.out.println("Criar");
                break;

            case 2:
                System.out.println("Atualizar");
                break;

            case 3:
                System.out.println("Eliminar");
                break;

            case 4:
                break;

            default:
                System.out.println("Opção invalida");

        }

        menu = input.nextInt();
    }



        }




    }

