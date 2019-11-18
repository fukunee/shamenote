package solution2;

/**
 * @author lwc
 * @date 2019/10/12 15:15
 */
public class U263 {
    public boolean isUgly(int num) {
        if(num == 0) return false;

        while(num != 1){

            if(num % 2!=0 && num % 3!=0 && num % 5!=0) return false;

            if(num % 2 == 0) num = num / 2;
            if(num % 3 == 0) num = num / 3;
            if(num % 5 == 0) num = num / 5;
        }

        return true;
    }
}
