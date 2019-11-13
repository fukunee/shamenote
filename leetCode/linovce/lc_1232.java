class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2)
            return true;

        if(coordinates[0][0]==coordinates[1][0]){
            for(int i=2;i<coordinates.length;i++){
                if(coordinates[i][0]!=coordinates[0][0])
                    return false;
            }
        }

        else if(coordinates[0][1]==coordinates[1][1]){
            for(int i=2;i<coordinates.length;i++){
                if(coordinates[i][1]!=coordinates[0][1])
                    return false;
            }
        }else{
            double k=(coordinates[1][1]-coordinates[0][1])/(coordinates[1][0]-coordinates[0][0]);

            for(int i=2;i<coordinates.length;i++){
                double x1 =coordinates[0][0],x2=coordinates[i][0];
                double y1=coordinates[0][1],y2=coordinates[i][1];

                double kk=(y2-y1)/(x2-x1);
                if(kk!=k)
                    return false;
            }
        }



        return true;
    }
}