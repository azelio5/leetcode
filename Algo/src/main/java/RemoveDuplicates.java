public class RemoveDuplicates {
//        public static int removeDuplicates(int[] nums) {
//            int[] temp = new int[nums.length];
//            int rd = nums[0];
//            temp[0] = rd;
//            for (int i = 1; i < nums.length; i++) {
//                if (temp[rd] != nums[i]) {
//                    rd++;
//                    temp[rd]=nums[i];
//                }
//            }
//            return rd;
//
//        }

    public static int removeDuplicates(int[] nums) {
        int rd = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[rd] != nums[i]) {
                rd++;
                nums[rd] = nums[i];
            }
        }
        return rd + 1; //size of array
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 4, 6, 6};

        for (int j : arr) {
            System.out.print(j);
        }

        int rd = removeDuplicates(arr);
        System.out.println();

        for (int i = 0; i < rd; i++) {
            System.out.print(arr[i]);
        }
    }
}

