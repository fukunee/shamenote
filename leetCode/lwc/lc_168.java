package solution2;

/**
 * @author lwc
 * @date 2019/11/14 11:36
 */
public class U168 {
    public String convertToTitle(int n) {
        StringBuilder ts = new StringBuilder();
        while(n > 0){
            if(n % 26 == 0){
                ts.insert(0, 'Z');
                n = n / 26 + 1;
            }
            else{
                ts.insert(0, (char) ((n % 26) + 'A' - 1));
                n = n / 26;
            }
        }
        return ts.toString();
    }
}
