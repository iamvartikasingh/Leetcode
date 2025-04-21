class Solution {
    public List<Integer> majorityElement(int[] nums) {
    //  int k=nums.length;
    //  List<Integer> result = new ArrayList<>();
//      System.out.println(k);
//      Map<Integer, Integer> map = new HashMap<>();

    
//      int count=0;
//      Arrays.sort(nums);
//   for(int num:nums){
//     if(map.containsKey(num)){
//         map.put(num, map.get(num)+1);
//     }else {
//         map.put(num, 1); 
//     }
//   }
//   for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//     if (entry.getValue() > k) {
//         arr.add(entry.getKey());
//     }
// }

    
        int n = nums.length;
        int c1 = 0, c2 = 0;
        Integer el1 = null, el2 = null;

        for (int num : nums) {
            if (el1 != null && num == el1) {
                c1++;
            } else if (el2 != null && num == el2) {
                c2++;
            } else if (c1 == 0) {
                el1 = num;
                c1 = 1;
            } else if (c2 == 0) {
                el2 = num;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }

        // Validate counts
        c1 = 0;
        c2 = 0;
        for (int num : nums) {
            if (el1 != null && num == el1) c1++;
            else if (el2 != null && num == el2) c2++;
        }

        List<Integer> result = new ArrayList<>();
        if (c1 > n / 3) result.add(el1);
        if (c2 > n / 3) result.add(el2);



    return result;
    }
}