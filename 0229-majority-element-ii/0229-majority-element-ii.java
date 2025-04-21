class Solution {
    public List<Integer> majorityElement(int[] nums) {
     int k=nums.length/3;
     System.out.println(k);
     Map<Integer, Integer> map = new HashMap<>();
     List<Integer> arr = new ArrayList<>();
    
     int count=0;
     Arrays.sort(nums);
  for(int num:nums){
    if(map.containsKey(num)){
        map.put(num, map.get(num)+1);
    }else {
        map.put(num, 1); 
    }
  }
  for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if (entry.getValue() > k) {
        arr.add(entry.getKey());
    }
}
    return arr;
    }
}