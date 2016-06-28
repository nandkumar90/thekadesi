package dymnamicProgrammig;

import java.util.Stack;

public class LargestRectangleInHistogram {

	public static void main(String[] args) {
		int input[]={2,1,2};
		int maxarea=histogram(input);
		System.out.println(maxarea);
		
	}

	public static int histogram(int[] input) {
		Stack<Integer> stack = new Stack<Integer>();
		int maxArea = 0;
		int area = 0;
		int i = 0;
		for (; i < input.length;) {

			if (stack.isEmpty() || input[stack.peek()] <= input[i]) {

				stack.push(i++);
			}

			else {

				int top = stack.pop();
				if (stack.isEmpty()) {
					area = input[top] * i;
				} else {
					area = input[top] * (i - stack.peek() - 1);

				}

				if (area > maxArea) {

					maxArea = area;
				}

			}

		}

		while (!stack.isEmpty()) {

			int top = stack.pop();
			if (stack.isEmpty()) {

				area = input[top] * i;

			} else {
				area = input[top] * (i - stack.peek() - 1);

			}
			if (maxArea < area) {

				maxArea = area;
			}
		}

		return maxArea;
	}

	public int largestRectangleArea(int[] height) {
		if (height == null || height.length == 0) {
			return 0;
		}

		Stack<Integer> stack = new Stack<Integer>();

		int max = 0;
		int i = 0;

		while (i < height.length) {

			if (stack.isEmpty() || height[i] >= height[stack.peek()]) {
				stack.push(i);
				i++;
			} else {

				int h = height[stack.pop()];
				int wid = stack.isEmpty() ? i : i - stack.peek() - 1;
				max = Math.max(h * wid, max);
			}

		}

		while (!stack.isEmpty()) {
			int h = height[stack.pop()];
			int wid = stack.isEmpty() ? i : i - stack.peek() - 1;
			max = Math.max(h * wid, max);
		}

		return max;
	}
}