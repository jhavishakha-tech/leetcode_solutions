class Solution {
    public int maximumPopulation(int[][] logs) {
        int[]diff=new int[101];
        for(int[]log:logs) {
            int birth=log[0]-1950;
            int death=log[1]-1950;
            diff[birth]++;
            diff[death]--;
        }
        int maxPop=0;
        int year=1950;
        int currentPop=0;
        for(int i=0;i<101;i++) {
            currentPop+=diff[i];
            if(currentPop>maxPop){
                maxPop=currentPop;
                year=i+1950;
            }
        }
        return year;
    }
}