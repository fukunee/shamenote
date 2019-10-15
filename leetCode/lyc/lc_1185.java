class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int sum=0;
        String[] week=new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int[] mon=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=1971;i<year;i++){
            if(isleapyear(i)){
                sum+=366;
            }else{
                sum+=365;
            }
        }
        for(int i=0;i<month-1;i++){
            if(i==1&&isleapyear(year)){
                sum+=1;
            }
            sum+=mon[i];
        }
       
        sum+=day;
        sum=sum%7;
        return week[(sum+4)%7];
    }
    public boolean isleapyear(int num){
        if(num%400==0){
            return true;
        }
        if(num%4==0&&num%100!=0){
            return true;
        }
        return false;
    }
}