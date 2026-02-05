import java.util.Scanner;
public class ex15 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Boolean hash = false;

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if (hash) System.out.print("#"); else System.out.print("*");
                if (!(size % 2 == 0 && j == size - 1)) hash = !hash;
            }

        System.out.print("\n");
        }
    }
}
