import java.util.Arrays;
import java.lang.Object;

public class sort_arrays {
    public static void main() {
       int []  nums = {0, 1, 0, 1, 0, 1};


        int n = nums.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (nums[i] == 1 && nums[j] == 0) {
                nums[i] = 0;
                nums[j] = 1;
            }
            if (nums[i] == 0) {
                i++;
            }
            if (nums[j] == 1) {
                j--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
