import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int operator;
        double n1, n2;
        System.out.println("1 - Addieren \n 2 - Subtrahieren \n 3 - Multiplizieren \n 4 - Dividieren");
        System.out.print("wählen Sie einen Operator aus: ");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.print("erste Zahl: ");
        n1 = sc.nextDouble();
        System.out.print("zweite Zahl: ");
        n2 = sc.nextDouble();

        double result = 0;
        switch (operator) {
            case 1:
                result = n1 + n2;
                break;

            case 2:
                result = n1 - n2;
                break;

            case 3:
                result = n1 * n2;
                break;

            case 4:
                result = n1 / n2;
                break;

            default:
                System.out.println("eingegebener Operator ist nicht gültig");

        }

        System.out.println("Ergebnis ist : " + result);
    }
}