/**
 * Created by Lori on 2/2/2017.
 */
public class Application {

    /**
     * This method verifies if the array contains a 2 next to a 2 somewhere.
     * @param nums the array.
     * @return true if it has found the pair or false if it didn't.
     */
    private String has22(int[] nums) {
        String true_result = String.valueOf(true);
        String false_result = String.valueOf(false);
        int check = 0;
        int previous_number = 0;

        if (nums == null || nums.length == 0)
            return "You have provided a null or empty array.";

        for (int counter = 0; counter < nums.length; counter++) {
            if (previous_number == 2 && nums[counter] == 2)
                check = 1;
            previous_number = nums[counter];
        }
        if (check == 1)
            return true_result;
        else
            return false_result;
    }

    public static void main(String []args)
    {
        Application application = new Application();
        int[] nums = {1,2,2};

        System.out.println(application.has22(nums));
    }
}
