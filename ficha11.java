import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);
     
    
    //declarar variaveis 
      int num1;
      int num2;
      int resultado;
    

    // ler numero 1 
    System.out.println("Insira um número: ");
      num1 = input.nextInt();
    

    // ler numero2
    System.out.println("Insira outro número: ");
      num2 = input.nextInt();
    // somar num1 e num2
    
    resultado = num1 + num2;
    //imprimir o resultado
    System.out.println("A soma do número 1 e número 2 é " + resultado);
  }
  
}