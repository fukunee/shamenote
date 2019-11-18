package solution2;

/**
 * @author lwc
 * @date 2019/11/13 21:41
 */
public class U165 {
    public int compareVersion(String version1, String version2) {
        int start_1 = 0, end_1 = 0;
        int start_2 = 0, end_2 = 0;
        int len1 = version1.length(), len2 = version2.length();
        char[] v1 = version1.toCharArray(), v2 = version2.toCharArray();
        while(start_1 < len1 && start_2 < len2){

            while(end_1 < len1 && v1[end_1] != '.') end_1++;
            while(end_2 < len2 && v2[end_2] != '.') end_2++;
            int value1 = start_1 == end_1 ? 0 : Integer.valueOf(version1.substring(start_1,end_1));
            int value2 = start_2 == end_2 ? 0 : Integer.valueOf(version2.substring(start_2,end_2));
            if(value1 > value2) return 1;
            else if(value1 < value2) return -1;
            else {
                end_1 += 1;
                start_1 = end_1;
                end_2 += 1;
                start_2 = end_2;
            }
        }

        if(end_1 >= len1){
            while(end_2 < len2 && (v2[end_2]=='.'||v2[end_2]=='0')) end_2++;
        }
        if(end_2 >= len2){
            while(end_1 < len1 && (v1[end_1]=='.'||v1[end_1]=='0')) end_1++;
        }
        if(end_1 >= len1 && end_2 >= len2) return 0;
        return end_1 >= len1 ? -1 : 1;
    }
}
