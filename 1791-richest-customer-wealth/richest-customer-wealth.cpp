class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int maxi = 0;

        for(auto &row : accounts) {
            int sum = 0;
            for(int x : row) sum += x;
            maxi = max(maxi, sum);
        }
        return maxi;
    }
};