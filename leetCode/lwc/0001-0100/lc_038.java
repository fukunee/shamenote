package solution2;

public class U38 {
    public String countAndSay(int n) {
        String[] rs = new String[31];
        rs[1] = "1";


        int m = 2;
        while(m <= n){
            StringBuffer str = new StringBuffer();
            String target = rs[m-1];
            int i = 0;
            while(i < target.length()){
                int count = 1;
                while(++i < target.length() && target.charAt(i-1) == target.charAt(i)) ++count;
                str.append(count).append(target.charAt(i-1));
            }
            rs[m] = str.toString();
            m = m + 1;
        }

        return rs[n];

    }
}
