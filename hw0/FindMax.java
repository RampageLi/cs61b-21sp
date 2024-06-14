public class FindMax {
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }

    public static int max(int[] arr) {
        int ret = -1;

        for (int i = 0; i < arr.length; i++) {
            ret = Math.max(ret, arr[i]);
        }
        return ret;
    }
}
