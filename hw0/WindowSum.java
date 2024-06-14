public class WindowSum {
    public static void windowPosSum(int[] a, int size) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            if (a[i] <= 0) {
                continue;
            }
            int tot = 0;
            for (int j = i; j <= i + size; j++) {
                if (j >= n) {
                    break;
                }
                tot += a[j];
            }
            a[i] = tot;
        }
    }
    public static void main(String[] args) {
        int[] a = {1, -1, -1, 10, 5, -1};
        int size = 2;
        windowPosSum(a, size);
        System.out.println(java.util.Arrays.toString(a));
    }
}
