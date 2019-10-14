public class lc_345 {
    public static void main(String[] args) {
        String s="hello";
        new Solution().reverseVowels(s);
        System.out.print(s);
    }
    static class Solution{
        public String reverseVowels(String s) {
            char sa[]=s.toCharArray();
            if(sa.length<=1) return s;
            char temp;
            int left=0,right=sa.length-1;
            while(left<right)
            {
                if(isVowels(sa[left])&&isVowels(sa[right]))
                {
                    swap(sa,left,right);
                    left++;right--;
                }
                else if(isVowels(sa[left])||isVowels(sa[right]))
                {
                    if(isVowels(sa[left]))
                    {
                        right--;
                    }
                    else
                    {
                        left++;
                    }
                }
                else
                {
                    left++;right--;
                }
            }
            return new String(sa);

        }
        public boolean isVowels(char c)
        {
            switch (c)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                        return true;
                default:
                    return false;
            }
        }
        public void swap(char a[],int p1,int p2)
        {
            char temp=a[p1];
            a[p1]=a[p2];
            a[p2]=temp;
        }
    }
}
