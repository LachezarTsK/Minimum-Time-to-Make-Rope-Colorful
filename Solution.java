
public class Solution {

    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int maxTimeForCurrentColor = neededTime[0];

        for (int i = 1; i < colors.length(); ++i) {
            if (colors.charAt(i - 1) != colors.charAt(i)) {
                maxTimeForCurrentColor = 0;
            }
            totalTime += Math.min(neededTime[i], maxTimeForCurrentColor);
            maxTimeForCurrentColor = Math.max(maxTimeForCurrentColor, neededTime[i]);

        }
        return totalTime;
    }
}
