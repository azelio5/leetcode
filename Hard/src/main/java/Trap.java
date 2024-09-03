public class Trap {
    public static void main(String[] args) {

    }

    public int trap(int[] height) {
        int total = 0;
        int left = 0, right = height.length - 1;
        int lMax = 0, rMax = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > lMax) {
                    lMax = height[left];
                } else {
                    total += lMax - height[left];
                }
                left++;
            } else {
                if (height[right] > rMax) {
                    rMax = height[right];
                } else {
                    total += rMax - height[right];
                }
                right--;
            }
        }
        return total;
    }
}
