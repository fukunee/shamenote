/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int f=1,l=n;
        int mid=0;
        while(f<=l){
            mid=f+(l-f)/2;
            if(guess(mid)==0)
                return mid;
            else if(guess(mid)<0)
                l=mid-1;
            else if(guess(mid)>0)
                f=mid+1;
        }
        return -1;
    }
    
}