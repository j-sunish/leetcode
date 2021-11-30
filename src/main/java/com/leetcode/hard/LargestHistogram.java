package com.leetcode.hard;

/**
 * 84. Largest Rectangle in Histogram
 * @author Sunish
 *
 */
public class LargestHistogram {
	
	/**
	 * Bruteforce method
	 * @param heights
	 * @return
	 */
	public static int largestRectangleArea(int[] heights) {
		int maxArea = 0;
        for(int i=0;i<heights.length;i++) {
            int minheight = heights[i];
            for(int j=i;j<heights.length;j++) {
                minheight = Math.min(minheight, heights[j]);
                System.out.println(" Min height:"+minheight);
                int area = (j-i+1)*minheight;
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

}
