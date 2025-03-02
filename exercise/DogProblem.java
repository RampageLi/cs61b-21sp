import java.util.ArrayList;

public class DogProblem {
    public static void main(String[] args) {
        int[] nums = {10, 15, 20, 15, 10, 5, 10, 15, 22, 20};
        ArrayList<Integer> ret = solve(nums);
        System.out.println(ret);
    }

    public static ArrayList<Integer> solve(int[] nums) {
        ArrayList<Integer> ret = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int cur = nums[i];
            boolean flag = true;
            for (int j = i - 2; j <= i + 2; j++) {
                if (j == i) {
                    continue;
                }
                if (j >= 0 && j < n && nums[j] >= cur) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ret.add(cur);
            }

        }
        return ret;
    }
}
