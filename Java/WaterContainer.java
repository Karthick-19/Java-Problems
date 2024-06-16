package Java;

// Container With Most Water:
// Given an array of non-negative integers representing the heights of vertical lines drawn on the x-axis, you need to find the two lines that, together with the x-axis, can form a container that holds the maximum amount of water.
public class WaterContainer {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        waterContainer(height);
    }

    //Formula to calculate area
    //min(height[l],height[r]) * (j - i)
    public static void waterContainer(int[] heights){
        int l = 0;
        int r = heights.length -1;
        int maxArea = 0;
        //Calculate area
        while(l < r){
            // to get the maximum possible height we choose the minimum height
            int height = Math.min(heights[l],heights[r]);
            //Width from end to end
            int width = r - l;
            //Area formula height x width
            int currentArea = height * width;
            //Saving the maximum value for each iteration
            maxArea = Math.max(currentArea,maxArea);
            //Moving towards the smaller tile inwards as it has possiblity to get a bigger tile
            if(heights[l] < heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        System.out.println(maxArea);
        return;
    }
}
