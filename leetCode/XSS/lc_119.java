import java.util.ArrayList;
import java.util.List;

public class lc_119 {
    public static void main(String[] args) {
        //杨辉三角2，公式法解决，涉及组合数公式Cnk
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        int N = rowIndex;
        long pre = 1;
        ans.add(1);
        for (int k = 1; k <= N; k++) {
            long cur = pre * (N - k + 1) / k;
            ans.add((int) cur);
            pre = cur;
        }
        return ans;
    }

}
