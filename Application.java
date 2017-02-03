/**
 * Created by Lori on 2/2/2017.
 */
public class Application {

    /**
     * This method verifies if the array contains a 2 next to a 2 somewhere.
     *
     * @param nums the array.
     * @return true if it has found the pair or false if it didn't.
     */
    private String has22(int[] nums) {
        String trueResult = String.valueOf(true);
        String falseResult = String.valueOf(false);
        int previousNumber = 0;

        if (nums == null || nums.length == 0)
            return "You have provided a null or empty array.";

        for (int counter = 0; counter < nums.length; counter++) {
            if (previousNumber == 2 && nums[counter] == 2)
                return trueResult;
            previousNumber = nums[counter];
        }

        return falseResult;
    }

    public static void main(String[] args) {
        Application application = new Application();
        int[] nums = {2,1,2};

        System.out.println(application.has22(nums));
    }
}
