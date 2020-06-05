package leetcode;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author lwc
 * @date 2020/1/4 21:50
 */
public class lc_441 {
    public int arrangeCoins(int n) {
        int i = 1;
        for(; i <= n; i++){
            n = n - i;
        }
        return i - 1;
    }
}
