import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        int[] arr = {1,0,2};
        System.out.println(candy(arr));
    }
    public static int candy(int[] ratings) {
        int sum=0;
        int[] left = new int[ratings.length];
        int[] right = new int[ratings.length];

        Arrays.fill(left,1);
        Arrays.fill(right,1);

        for(int i=1;i<ratings.length;i++)
        {
            if(ratings[i]>ratings[i-1])
                left[i] = left[i-1]+1;
        }

        for(int i=ratings.length-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1])
            {
                right[i] = right[i+1]+1;
            }
        }

        for(int i=0;i<ratings.length;i++)
            sum+=Math.max(left[i],right[i]);


        //  O(3n)
        return sum;
    }
}
