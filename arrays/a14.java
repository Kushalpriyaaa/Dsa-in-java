import java.util.Arrays;

class a14 {
    // Helper function to check if two numbers are almost equal
    public boolean areAlmostEqual(int x, int y) {
        char[] xChars = String.valueOf(x).toCharArray();
        char[] yChars = String.valueOf(y).toCharArray();
        Arrays.sort(xChars);
        Arrays.sort(yChars);
        return Arrays.equals(xChars, yChars);
    }

    public int countPairs(int[] nums) {
        int count = 0;

        // Iterate over all pairs of indices
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (areAlmostEqual(nums[i], nums[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3, 12, 30, 17, 21};
        System.out.println(solution.countPairs(nums1)); // Output: 2

        int[] nums2 = {1, 1, 1, 1, 1};
        System.out.println(solution.countPairs(nums2)); // Output: 10

        int[] nums3 = {123, 231};
        System.out.println(solution.countPairs(nums3)); // Output: 0
    }
}
