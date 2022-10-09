
import java.util.Scanner;


public class App {
    public static void main(String[] args){
        Scanner enterScanner = new Scanner(System.in);
        
        double a;
        double b;
        double c;
        double d;

        System.out.println("Digite a nota do primeiro bimestre");
        a = enterScanner.nextDouble();
        System.out.println("Digite a nota do segundo bimestre");
        b = enterScanner.nextDouble();
        System.out.println("Digite a nota do terceiro bimestre");
        c = enterScanner.nextDouble();
        System.out.println("digite a nota do quarto bimestre");
        d = enterScanner.nextDouble();

        Double e;
        e = (a + b + c + d) / 4;

        

        System.out.println("O resultado da media foi de: " + e); 

        enterScanner.close();


    }
}
