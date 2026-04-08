public class practiceJava3 {

    public static void main(String[] args) {

        practiceJava3 p = new practiceJava3();

        // task-1
        int[] nums1 = {2, 1, 2, 3, 4};
        System.out.println(p.countEvens(nums1));

    }

    public int countEvens(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}