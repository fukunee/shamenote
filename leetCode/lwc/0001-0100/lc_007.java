package solution2;

public class U7 {
    public int reverse(int x){
        int result = 0,tail = 0,newResult = 0;

        while(x!=0){
            tail = x%10;
            newResult = result*10+tail;
            if((newResult-tail)/10!=result)
                return 0;
            result = newResult;
            x = x/10;
        }

        return result;
    }
}
