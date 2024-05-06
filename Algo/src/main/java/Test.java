import java.util.Scanner;

public class Test {
    public static String main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        String binary = ""; // initialize an empty string to hold the binary digits

        while (decimal > 0) {
            int remainder = decimal % 2; // get the remainder of dividing the decimal by 2
            binary = remainder + binary; // prepend the remainder to the binary string
            decimal = decimal / 2; // divide the decimal by 2
        }

        binary = "Binary equivalent: " + binary;
        return binary;
    }

}
