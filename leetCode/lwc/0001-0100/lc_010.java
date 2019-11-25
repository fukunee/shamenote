package solution2;

public class U10 {

    public boolean isMatch(String s, String p) {
        return match(0, 0, s, p);
    }

    public boolean match(int m, int n, String s, String p) {
        if (m < s.length() && n < p.length()) {
            if (p.charAt(n) != '.') {
                if (n + 1 == p.length() || p.charAt(n + 1) != '*') {
                    if (p.charAt(n) == s.charAt(m)) return match(++m, ++n, s, p);
                    else return false;
                } else {
                    while (m < s.length() && p.charAt(n) == s.charAt(m)) {
                        if (match(m, n + 2, s, p)) return true;
                        m++;
                    }
                    return match(m, n + 2, s, p);

                }
            } else {
                if (n + 1 == p.length() || p.charAt(n + 1) != '*')
                    return match(++m, ++n, s, p);
                else {
                    for (int i = 0; i <= s.length() - m; i++) {
                        if (match(m + i, n + 2, s, p))
                            return true;
                    }
                    return false;
                }
            }
        } else {
            if (m == s.length() && n == p.length()) return true;
            else {
                if (m == s.length()&&n!=p.length()){
                    while(n<p.length()-1&&p.charAt(n-1)=='*'){
                        n=n+2;
                    }
                    if(n==p.length()) return true;
                    else return false;
                }
                else return false;
            }
        }
    }

}
