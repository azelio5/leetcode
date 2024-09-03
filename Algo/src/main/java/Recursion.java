public class Recursion {

    public static void main(String[] args) {
        //  System.out.println(fact(5));
        //  printN(5);
        //  System.out.println(countDigits(12345));
        //  System.out.println(sumOfDigits(15));

        String s = "madam";
        int n = 2;
        int k = 3;
        int[] arr = {1, 2, 3, 4};


//        int month = 1;
//        String message = switch (month) {
//            case 1, 2, 12 -> "Зима, холода";
//            case 3, 4, 5 -> "Весна красна!";
//            case 6, 7, 8 -> "Лето — это маленькая жизнь";
//            case 9, 10, 11 -> "Осень, прозрачное утро";
//            default -> {
//                throw new IllegalArgumentException("Упс, это не месяц");
//            }


            //  System.out.println(stringBlocks);


            //        char[] ar = new char[n*2]; //for balPar

            //      System.out.println(reverseString(s, "", s.length() - 1));
            //      System.out.println(isPalindrome(s, 0, s.length()-1));

            //  System.out.println("the right position is: " + jos(n,k));

            //  System.out.println(sum(arr,0));
            // balPar(ar,n,0,0,0);


        };

        static void balPar ( char[] ar, int n, int i, int open, int close){
            if (i == ar.length) System.out.println(ar); // Array of string can be printed directly, auto convert
            if (open < n) {
                ar[i] = '(';
                balPar(ar, n, i + 1, open + 1, close);
            }
            if (close < open) {
                ar[i] = ')';
                balPar(ar, n, i + 1, open, close + 1);
            }
        }

        static int sum ( int[] arr, int i){
            if (i == arr.length) return 0;
            return sum(arr, i + 1) + arr[i];
        }

        static int jos ( int n, int k){
            if (n == 1) return 0; // if 1 left - its position is 0
            return (jos(n - 1, k) + k) % n;
        }

        static String reverseString (String s, String r,int i){
            if (i < 0) return r;
            return reverseString(s, r + s.charAt(i), i - 1);

        }

        static boolean isPalindrome (String s,int i, int j){
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            if (j <= i) return true;
            return isPalindrome(s, i + 1, j - 1);

        }

        static int fact ( int n){
            if (n == 1 || n == 0) return 1;
            return n * fact(n - 1);
        }

        static void printN ( int n){
            if (n == 0) {
                return;
            }
            printN(n - 1);  // changed if
            System.out.println(n);// reversed order

        }

        static int countDigits ( int n){
            if (n == 0) {
                return 0;
            }
            return countDigits(n / 10) + 1;
        }

        static int sumOfDigits ( int n){
            if (n == 0) return 0;
            return sumOfDigits(n / 10) + (n % 10);
        }
    }

