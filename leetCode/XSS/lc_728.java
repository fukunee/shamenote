import java.util.ArrayList;
import java.util.List;

public class lc_728 {
    public static void main(String[] args) {
        System.out.println(new Solution().selfDividingNumbers(100,150));
    }
    static class Solution {
        public  List<Integer> list;
        public List<Integer> selfDividingNumbers(int left, int right) {
            list=new ArrayList<>();
            for(int i=left;i<=right;i++)
            {
                int len=Nbit(i);boolean b=true;
                for(int j=len;j>=1;j--)
                {
                    int d=i/_10mi(j-1);
                    int k=0;
                    if(len==j){k=d;}
                    else {
                        for(int m=len-j;m>0;m--) k=d%_10mi(m);
                    }
                    if(k==0||i%k!=0)
                    {
                        b=false;
                        break;
                    }
                }
                if(b)
                {
                    list.add(i);
                }
            }
            return list;
        }

        public int Nbit(int n)
        {
            int res=0;
            int i=0;
            while(n/_10mi(i)>0)
            {
                i++;
                res++;
            }
            return res;

        }
        public int _10mi(int n)
        {
            int res=1;
            if(n<0) return 0;
            if(n==0) return 1;
            for(int i=1;i<=n;i++)
            {
                res=res*10;
            }
            return  res;
        }
    }
}
