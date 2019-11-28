package solution2;

public class U12 {
    public String intToRoman(int num) {
        String[] M = {"","M","MM","MMM"};
        String[] C = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","MC"};
        String[] X = {"","X","XX","XXX","LX","L","LX","LXX","LXXX","CX"};
        String[] I = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return M[num/1000]+C[num%1000/100]+X[num%100/10]+I[num%10];
    }
}
