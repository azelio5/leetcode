public class Trap {
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println(badTrapArrays(height));
    }
    //O(n2) bad
    public static int badTrap(int[] height) {
        int result = 0;
        for (int i = 1; i <= height.length - 2; i++) {
            int lb = height[i]; //assume
            for (int j = 0; j < i; j++) {
                if (height[j] > lb) {
                    lb = height[j]; //left boundary
                }
            }

            int rb = height[i]; //assume
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] > rb) {
                    rb = height[j]; //right boundary
                }
            }
            // find water level
            int wt = 0;
            if (lb > rb) {
                wt = rb;
            } else wt = lb;
            int trapped = wt - height[i];
            result += trapped;
        }
        return result;
    }
    //O(n) bad coz space +
    public static int badTrapArrays(int[] height) {
        int result = 0;
        int[] lb = new int[height.length]; //left boundary
        int[] rb = new int[height.length]; //right boundary

        lb[0] = height[0];

        for (int i = 1; i < height.length - 1; i++) {
            lb[i] = Math.max(height[i], lb[i - 1]);
        }
        rb[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i > 0; i--) {
            rb[i] = Math.max(height[i], rb[i + 1]);
        }
        for (int i = 1; i < height.length-1; i++) {
            //tw = wl - height
            result += Math.min(lb[i],rb[i])-height[i];
        }
        return result;
    }
    //O(n) Space O(1)
    public static int trap(int[] height) {
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
    //O(n) Space O(1)
}
