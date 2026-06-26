import java.util.* ; // for all utility classes
public class conditional_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int x = sc.nextInt();
        
        if (x>= 18) {
            System.out.println("You are eligible to vote");

        }
        else {
            System.out.println("You are not eligible to vote");

        }



    }
}
