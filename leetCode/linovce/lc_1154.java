class Solution {
    public int dayOfYear(String date) {
        String [] str = date.split("-");
        int n=0;
        
        for(int i=1;i<Integer.valueOf(str[1]);i++){
            if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
                n+=31;
            else if(i==4||i==6||i==9||i==11)
                n+=30;
            else
                n+=28;
        }
        
        if(isLeap(Integer.valueOf(str[0]))){
            if(Integer.valueOf(str[1])>2)
                n++;
        }
        
        n+=Integer.valueOf(str[2]);
        return n;
    }
    
    public boolean isLeap(int n){
        if(n%400==0||n%4==0&&n%100!=0)
            return true;
        else
            return false;
    }
}