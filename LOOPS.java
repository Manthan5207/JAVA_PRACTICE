public class LOOPS {
    public static void main(String[] args) {
        // Example of a for loop
        for (int i = 0; i < 11 ; i++){
            System.out.println(i);
        
        }

        // Example of a while loop sum of numbers from 1 to 10
        int sum = 0;
        int j = 1;
        while (j <= 10) {
            sum += j;
            j++;
        }
        System.out.println("------Example of a while loop sum of numbers from 1 to 10-----");
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);


        // Example of a do-while loop multiplication table of 5
                System.out.println("------Example of a do-while loop multiplication table of 5-----");
        int k = 1;
        do {
            System.out.println("5 x " + k + " = " + (5 * k));
            k++;
        } while (k <= 10);


    }
}