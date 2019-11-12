package easy;


import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main (String[] args){
        Solution solution = new FizzBuzz().new Solution();
        int n = 15;
        System.out.print(solution.fizzBuzz(n));
    }
    class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> list = new ArrayList<>();
            for(int i = 1; i <= n;i++){
                if(i % 3 == 0 && i % 15 != 0){
                    list.add("Fizz");
                }else if(i % 5 == 0 && i % 15 != 0){
                    list.add("Buzz");
                }else if(i % 15 == 0){
                    list.add("FizzBuzz");
                }else{
                    list.add(String.valueOf(i));
                }
            }
            return  list;
        }
    }
}
