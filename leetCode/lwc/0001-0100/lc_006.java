package solution2;

/**
 *
 */
public class U6 {
    public String convert(String s, int numRows) {
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i = 0;i<numRows;i++) sb[i] = new StringBuffer();
        int i = 0;
        while(i<s.length()){
            for(int j = 0;j<numRows && i<s.length();j++)
                sb[j].append(s.charAt(i++));
            for(int j = numRows-2;j>0 && i<s.length();j--)
                sb[j].append(s.charAt(i++));
        }
        for(int j = 1;j<numRows;j++){
            sb[0].append(sb[j]);
        }
        return sb[0].toString();
    }
}
