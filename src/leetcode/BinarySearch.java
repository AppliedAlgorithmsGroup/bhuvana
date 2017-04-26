package leetcode;

/**
 * Created by bhuvanabellala on 2/1/17.
 */
public class BinarySearch {

    /**
     * Iterative binary search
     *
     * @param arr
     * @param num
     * @return
     */
    public static int bst(int[] arr, int num) {

        int lo = 0;
        int hi = arr.length - 1;

        int index = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            //System.out.println(mid);
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return index;

    }

    /**
     * Recursive binary search
     *
     * @param arr
     * @param num
     * @param lo
     * @param hi
     * @return
     */
    public static int recBst(int[] arr, int num, int lo, int hi) {

        if (lo > hi) {
            return -1;
        }


        int mid = (lo + hi) / 2;
        if (arr[mid] == num) {
            return mid;
        } else if (arr[mid] > num) {
            return recBst(arr, num, lo, mid - 1);
        } else {
            return recBst(arr, num, mid + 1, hi);
        }
    }

    /**
     * rotated binary search
     *
     * @param arr
     * @param num
     * @return
     */
    public static int rotBst(int[] arr, int num) {
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        System.out.println(bst(arr, 11));
        System.out.println(recBst(arr, 1, 0, 11));
    }

}
