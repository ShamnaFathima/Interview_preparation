package RECURSION;

    import java.util.Scanner;
    public class PowerofaNo{
        static int power(int base, int exponent) {
            if (exponent == 0)
                return 1;
            return base * power(base, exponent - 1);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter base: ");
            int base = scanner.nextInt();

            System.out.print("Enter exponent: ");
            int exponent = scanner.nextInt();

            int result = power(base, exponent);
            System.out.println(result);

            scanner.close();
        }
    }

