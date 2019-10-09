class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int num=0;
        
        for(int i=0,j=people.length-1;i<=j;){
            if(j-i<1){
                num++;
                break;
            }
                
            if(people[j]==limit){
                num++;
                j--;
            }else if(people[j]+people[j-1]<=limit){
                num++;
                j=j-2;
            }else if(people[j]+people[i]<=limit){
                num++;
                i++;
                j--;
            }else{
                num++;
                j--;
            }
        }
        
        return num;
    }
}