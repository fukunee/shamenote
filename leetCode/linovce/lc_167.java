class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] r = new int[2];
        
        if(numbers.length<2)
            return r;
        
        
        
        for(int i=0;i<numbers.length;i++){
            int f=i+1;
            int l=numbers.length-1;
            int mid=0;
            while(f<=l){
                mid = (f+l)/2;
                
                if(numbers[mid]+numbers[i]==target){
                    r[0]=i+1;
                    r[1]=mid+1;
                    return r;
                }else if(numbers[mid]+numbers[i]>target){
                    l=mid-1;
                }
                else if(numbers[mid]+numbers[i]<target){
                    f=mid+1;
                }
                    
            }
        }
        
        return r;
    }
}