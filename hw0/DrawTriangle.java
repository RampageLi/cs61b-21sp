public class DrawTriangle {
    public static void main(String[] args) {
        Draw(10);
    }

    public static void Draw(int x) {
        int i = 0;
        while (i < x) {
            int j = i + 1;
            int cur = 0;
            while (cur < j) {
                System.out.print("*");
                cur++;
            }
            System.out.println();
            i++;
        }
    }
}
