/*Container With Most Water*/
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int res=0;
        while(left<right){
            int sum=(right-left)*(Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
            if(sum>res){
                res=sum;
            }
        }
        return res;
    }
}