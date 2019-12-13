package leetcode;

import java.util.Arrays;

/**
 * @author lwc
 * @date 2019/12/2 16:29
 */
public class lc_318 {
    public int maxProduct(String[] words) {
        Arrays.sort(words, (v1,v2) -> Integer.compare(v1.length(),v2.length()));
        int max = 0;
        int len = words.length;
        int[][] v = new int[len][len];
        for(int i = len - 1; i > 0; i--){
            for(int j = i - 1; j >= 0; j--){
                int value = words[i].length() * words[j].length();
                if(value <= max) break;
                if(v[i][j] == 0){
                    int re = isSame(words[i],words[j]);
                    v[i][j] = re;
                    v[j][i] = re;
                }
                if(v[i][j] == -1){
                    max = value;
                }
            }
        }

        return max;
    }

    public int isSame(String s1, String s2){
        for(char ch1 : s1.toCharArray()){
            for(char ch2 : s2.toCharArray()){
                if(ch1 == ch2) return 1;
            }
        }
        return -1;
    }


    public int maxProduct2(String[] words) {
        int len = words.length;
        int[] arr = new int[len];
        for(int i = 0; i < len; ++i){
            for(char ch : words[i].toCharArray()){
                arr[i] |= 1 << (ch - 'a');
            }
        }
        int ans = 0;
        for(int i = 0; i < len; ++i){
            for(int j = i + 1; j < len; ++j){
                if((arr[i] & arr[j]) == 0){
                    int k = words[i].length() * words[j].length();
                    ans = ans < k ? k : ans;
                }
            }
        }
        return ans;
    }
}
