class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        //1971年1月1日星期五
        int d=0;
        for(int i=1971;i<year;i++){
            if(isleap(i))
                d+=366;
            else    
                d+=365;
        }

        for(int i=1;i<month;i++){
            if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
                d+=31;
            else if(i==4||i==6||i==9||i==11)
                d+=30;
            else if(isleap(year))
                d+=29;
            else
                d+=28;
        }

        d+=day;

        d=d%7;
        if(d==1)
            return "Friday";
        if(d==2)
            return "Saturday";
        if(d==3)
            return "Sunday";
        if(d==4)
            return "Monday";
        if(d==5)
            return "Tuesday";
        if(d==6)
            return "Wednesday";

        return "Thursday";


    }

    public boolean isleap(int year){
        if(year%4==0&&year%100!=0||year%100==0&&year%400==0)
            return true;
        else
            return false;
    }
}