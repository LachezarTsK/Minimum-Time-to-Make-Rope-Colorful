
class Solution {
    
public:
    int minCost(string colors, vector<int>& neededTime) {
        int totalTime = 0;
        int maxTimeForCurrentColor = neededTime[0];

        for (int i = 1; i < colors.length(); ++i) {
            if (colors[i - 1] != colors[i]) {
                maxTimeForCurrentColor = 0;
            }
            totalTime += min(neededTime[i], maxTimeForCurrentColor);
            maxTimeForCurrentColor = max(maxTimeForCurrentColor, neededTime[i]);
        }
        return totalTime;
    }
};
