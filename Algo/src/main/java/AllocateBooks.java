public class AllocateBooks {

    private static boolean isPossibleSolution(int[] arr, int b, int m) {
        int students = 1;
        int studentPageCount = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > m) {
                return false;
            }
            if (studentPageCount + arr[i] <= m) {
                studentPageCount += arr[i];
            } else {
                students++;
                if (students > b) {
                    return false;
                }
                studentPageCount = arr[i];
            }
        }
        return true;
    }

    public static int maxPages(int[] books, int students) {
        if (students > books.length) {
            return -1;
        }

        int l = books[0], h = 0;

        for (int i = 0; i < books.length; i++) {
            if (books[i] < l) {
                l = books[i];
            }
            h += books[i];

        }

        int result = -1;

        while (l <= h) {
            int m = (l + h) / 2;

            if (isPossibleSolution(books, students, m) == true) {
                result = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return result;
}



    public static void main(String[] args) {
        int[] ar = {12, 34, 67, 90};
        int b = 2;

        System.out.println(maxPages(ar, b));
    }
}

