class Solution {
    public void rotate(int[] nums, int k) {
        int p=nums.length;
     int[] temp = new int [p];
    
        for (int i = 0; i < p; i++) {
            temp[(i + k) % p] = nums[i];
            System.out.println((i + k)%p); 
        }
        for (int i = 0; i < p; i++) {
            nums[i] = temp[i];
        }
    }
}