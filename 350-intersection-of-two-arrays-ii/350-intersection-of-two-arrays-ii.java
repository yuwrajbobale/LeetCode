class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        
    List<Integer> arr=new ArrayList<Integer>();
    HashMap<Integer, Integer> map1 = new HashMap<>();
    HashMap<Integer, Integer> map2 = new HashMap<>();
    
    for(int i=0; i<nums1.length; i++){
        if(map1.containsKey(nums1[i])){
            map1.put(nums1[i], map1.get(nums1[i])+1);
        }else{
            map1.put(nums1[i], 1);
        }
    }
    
    for(int i=0; i<nums2.length; i++){
        if(map2.containsKey(nums2[i])){
            map2.put(nums2[i], map2.get(nums2[i])+1);
        }else{
            map2.put(nums2[i], 1);
        }
    }
    
    for(Integer key : map1.keySet()){
        if(map2.containsKey(key)){
            int x = Math.min(map2.get(key), map1.get(key));
            while(x > 0){
                arr.add(key);
                x--;
            }
        }
    }
    
    int res[] = new int[arr.size()];
    for(int i=0; i<arr.size(); i++){
        res[i] = arr.get(i);
    }
    
    return res;
        
        // Second ans
        
//         HashSet<Integer> s1 = new HashSet<>();
//         HashSet<Integer> s2 = new HashSet<>();
        
//         for(int element:nums1){
//             s1.add(element);
//         }
        
//         for(int element:nums2){
//             if(s1.contains(element)){
//                 s1.remove(element);
//                 s2.add(element);
//             }
//         }
        
//         int res[] = new int[s2.size()];

//         for(int i=0; i<s2.size(); i++){
//             res[i] = s2.get(i);
//         }
        
//         return res;
        
        
    }
}