class Solution {
    public String intToRoman(int num) {
        String[] ro={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] sum={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String str="";
        for(int i=0;i<ro.length;i++){
            while(num>=sum[i]){
                num-=sum[i];
                str+=ro[i];
            }
        }
        
        return str;      
    }
}