import java.util.Random;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        double coin = 0.0;

        System.out.println("Who are you??\n");
        System.out.println("> ");
        System.out.println("\n");
        String user_name = sc.nextLine();
        System.out.printf("Hello, " + user_name + "!\n");*/
        System.out.println("Tossing a coin...\n");

        for(int i = 0 ; i < 3 ; i++)
        {
            coin = random.nextInt();

            if(coin % 2.0 == 0.0)
            {
                count++;

                System.out.printf("Round %d: Heads\n", count);

                count2++;
            }
            else
            {
                count++;

                System.out.printf("Round %d: Tails\n", count);

                count3++;
            }

            //System.out.printf("%f", coin); 
        }

         System.out.printf("Heads: %d, Tails: %d\n", count2, count3);
         /*if(count2 > count3)
         {
            System.out.printf(user_name + " won!");
         }
         else
         {
            System.out.printf(user_name + " lost!");
         }*/
            
    }
 
}