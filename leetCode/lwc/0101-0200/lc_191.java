package leetcode;

/**
 * @author lwc
 * @date 2019/11/17 21:18
 */
public class lc_191 {
    public int hammingWeight(int n) {
        char[] chars = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == '1') count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new lc_191().hammingWeight(3));
    }
}
