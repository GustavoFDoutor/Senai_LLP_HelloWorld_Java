import java.util.Scanner;

public class HelloWorldInteracao {

    public static void main(String[] args) {
        
        Scanner Scan = new Scanner(System.in);

        String Nome = "";
        
        System.out.print("Digite Seu Nome: ");
        Nome = Scan.nextLine();

        System.out.println("Hello World! " + Nome);
    }
}