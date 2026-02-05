import java.util.Scanner;
public class Sum {
    public static void main(String[] args)
    {
        System.out.print("Enter 2 numbers separated by a space: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum = " + (a + b));
    }
}
