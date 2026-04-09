public class practiceJava4 {
    public static void main(String[] args) {
        // task-16
//    practiceJava4 t16 = new practiceJava4();
//    int[] nums = {1, 4, 1, 4};
//    System.out.println(t16.only14(nums));
        // task-17
        practiceJava4 t17 = new practiceJava4();
        int[] nums = {1, 2, 3, 4};
        System.out.println(t17.isEverywhere(nums, 1));


    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;
    }


    public boolean isEverywhere(int[] nums, int val){
        for (int i = 0; i < nums.length - 1; i++){

            if (nums[i] != val && nums[i + 1] != val){

                return false;
            }
        }
        return true;
    }
}