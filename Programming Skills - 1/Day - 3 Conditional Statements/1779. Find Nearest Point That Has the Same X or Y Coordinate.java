class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int nearest = -1;
        for(int i = 0, minDistance = Integer.MAX_VALUE; i < points.length; i++){
            if(x == points[i][0] || y == points[i][1]){
                int distance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if(minDistance > distance){
                    minDistance = distance;
                    nearest = i;
                }
            }
        }
        return nearest;
    }
}
