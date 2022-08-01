// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int start =0;
//         int end = 0;  
//         int max=0;
        
//         HashSet<Character> hs= new HashSet();
//         while(end<s.length()){
//             if(!hs.contains(s.charAt(end))){
//                 hs.add(s.charAt(end));
//                 end++;
//                 max= Math.max(hs.size(),max);
//             }else{
//                 hs.remove(s.charAt(start));
//                 start++;
//             }
//         }
//         return max;
//     }
// }

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mpp = new HashMap<Character, Integer>();
        
        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        
        while(right < n) {
            if(mpp.containsKey(s.charAt(right)))
                left = Math.max(mpp.get(s.charAt(right)) +1, left);
            
            mpp.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}