package solution2;

public class U8 {
    public int myAtoi(String str) {
        int flag = 1,result = 0;
        if(str.trim().isEmpty()) return 0;
        char[] c = str.trim().toCharArray();
        if(!(Character.isDigit(c[0]) || c[0]=='-' || c[0]=='+'))
            return 0;
        flag = c[0]=='-'?-1:1;
        for(int i = 0;i<c.length;i++){
            if(i==0 && (c[i]=='-' || c[i]=='+')) continue;
            if(!Character.isDigit(c[i])) break;
            int value = Character.getNumericValue(c[i]);
            int newResult  = result*10+ value;
            if(newResult<0 || (newResult-value)/10 != result)
                return flag>0?Integer.MAX_VALUE:Integer.MIN_VALUE;
            result = newResult;
        }
        return result*flag;
    }
}
