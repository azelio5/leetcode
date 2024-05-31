import java.util.Scanner;

public class PowOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit: ");

        int digit = scanner.nextInt();

        System.out.println("digit is: " + digit);

        String binaryString = String.format("%8s", Integer.toBinaryString(digit)).replace(" ", "0");
        System.out.println("in binary: " + binaryString);

        System.out.println(powOf2(digit));
    }

    public static boolean powOf2(int n){
        if(n == 0) return false;
        return (n & (n-1)) == 0;

    }
}
