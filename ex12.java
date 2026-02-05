import java.util.Scanner;
public class ex12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0) a *= -1;

        String str = a + "";
        String[] str2 = str.split("");
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < str.length(); i++)
        {
            sum += Integer.parseInt(str2[i]);
            prod *= Integer.parseInt(str2[i]);
        }

        int average = sum/str.length();
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + prod);
        System.out.println("Average (rounded down)1 = " + average);
    }
}
