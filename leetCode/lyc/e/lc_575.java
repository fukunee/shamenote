/*Distribute Candies*/
class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for(int num : candies){
            set.add(num);
        }
        
        return Math.min(candies.length / 2,set.size());
    }
}