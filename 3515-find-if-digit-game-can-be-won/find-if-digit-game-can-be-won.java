class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0;
        int dbl = 0;

        for (int num : nums) {
            if (num < 10) {
                single += num;
            } else {
                dbl += num;
            }
        }

        return single != dbl;
    }
}