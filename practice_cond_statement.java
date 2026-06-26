import java.util.*; // for all utility classes
public class practice_cond_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float x = sc.nextFloat();

        System.out.print("Enter second number: ");
        float y = sc.nextFloat();

        if (x > y) {
            System.out.println("first number is greater than second number");

        }
        else if (x < y) {
            System.out.println("first number is lesser than second number");
        }
        else {
            System.out.println("first number is equal to second number");

        }


    }
}
