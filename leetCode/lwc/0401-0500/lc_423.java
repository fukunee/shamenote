package leetcode;

import java.util.List;

/**
 * @author lwc
 * @date 2019/12/26 15:57
 */
public class lc_423 {
    public String originalDigits(String s) {
        int[] v = new int[26];
        for(char ch : s.toCharArray()){
            v[ch - 'a'] += 1;
        }

        String[] nums = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        int[][] t = new int[][]{{25,0}, {22,2}, {20,4}, {23,6}, {6,8}, {14,1}, {17,3}, {5,5}, {18,7}, {8,9}};
        int[] c = new int[10];
        for(int[] temp : t){
            int ch = temp[0];
            int num = temp[1];
            if(v[ch] != 0){
                c[num] += v[ch];
                help(nums[num], v, v[ch]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < c.length; i++){
            while(c[i] > 0){
                sb.append(i);
                c[i]--;
            }
        }
        return sb.toString();
    }

    public void help(String str, int[] v, int num){
        for(char ch : str.toCharArray()){
            v[ch - 'a'] -= num;
        }
    }
}
