import calculator.Calci;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calci calci = new Calci();

        float op1 = sc.nextFloat();
        char opr = sc.next().charAt(0);
        float op2 = sc.nextFloat();

        float result = calci.getResult(opr,op1,op2);

        if(result!=-1)
            System.out.println(result);
        else
            System.out.println("Invalid Operation");
    }
}