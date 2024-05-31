public class Bitwise {
    public static void main(String[] args) {
//        System.out.println(5 | 9);
//        System.out.println(9 & 5);
//        System.out.println(9 ^ 5);
//        System.out.println(5>>2);

        int n = 36;
        int i = 5;

        int onMask = 1 << i;
        int offMask = ~(1 << i);
        int toggleMask = 1  << i;
        int checkMask = 1  << i;

       // System.out.println(n | onMask);
//        System.out.println(n & offMask);
  //      System.out.println(n ^ toggleMask);

        if((n & checkMask) == 0){
            System.out.println("OFF");
        }else System.out.println("ON");




    }
}
