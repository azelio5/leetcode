public class SubSetSum {
    static int countSubsets(int[] ar, int sum, int i){
        if(sum == 0) return 1;
        if(sum < 0) return 0;
        if(i == ar.length) return 0;

        return countSubsets(ar, sum-ar[i], i+1) + countSubsets(ar, sum, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {20, 10, 15, 5};

        System.out.println(countSubsets(arr,25,0));
    }
}
