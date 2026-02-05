import java.util.Scanner;
public class ex4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();

        if (a != 0)
        {
            if (a > 0)
            {
                System.out.println("The number " + a + " is positive.");
            } else {
                System.out.println("The number " + a + " is negative.");
            }
        } else {
            System.out.println("The number " + a + " is neutral.");
        }
    }
}
