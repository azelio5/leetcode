import java.util.Scanner;

import static java.lang.Math.log;
import static java.lang.Math.log10;

public class PosOfRMSB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit: ");

        int digit = scanner.nextInt();

        System.out.println("digit is: " + digit);

        String binaryString = String.format("%8s", Integer.toBinaryString(digit)).replace(" ", "0");
        System.out.println("in binary: " + binaryString);

        System.out.println("RMSB (position) of digit is: ");

        System.out.println(posOfRMSB(digit));


    }


//    // O(LogN)
//    public static int posOfRMSB(int digit) {
//        int mask = 1;
//        int pos = 0;
//
//        if(digit == 0) return -1;
//        while ((digit & mask) == 0) {
//            mask = mask << 1;
//            pos++;
//        }
//
//        return pos + 1;
//
//    }

    // O(1)
    public static int posOfRMSB(int digit) {
        return (int) (log10(digit ^ (digit & (digit - 1)))/ log10(2)) + 1;

    }
}
