public class ex2 {
    public static void main(String[] args)
    {
        if (args.length < 3)
        {
            System.out.println("Usage: java ex2 <num1> <operator> <num2>. Note that multiplication has operand 'x'.");
        }
        int a = Integer.parseInt(args[0]);
        String op = args[1];
        int b = Integer.parseInt(args[2]);

        switch (op)
        {
            case "+":
                System.out.println("Sum = " + (a+b));
                break;
            case "-":
                System.out.println("Difference = " + (a-b));
                break;
            case "x":
                System.out.println("Multiplication = " + (a*b));
                break;
            case "/":
                System.out.println("Ratio = " + (a/b));
                break;
        }
    }
}
