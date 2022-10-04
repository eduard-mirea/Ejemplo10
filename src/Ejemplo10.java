    import java.util.Scanner;
public class Ejemplo10 {
    public static void main(String[] args) {

        int n;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce a number: ");
        n   =   inputValue.nextInt();

        inputValue.close();

        if (n >=0) {
            System.out.println("It's positive number");
        }else {
            System.out.println("It's negative number");

        }
    }
}
