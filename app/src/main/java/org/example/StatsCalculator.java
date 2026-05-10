package org.example;

public class StatsCalculator {
    public int minimumUsingForLoop(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public int maximumUsingForLoop(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public int sumUsingForLoop(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }

    public double averageUsingForLoop(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return (double) sum / nums.length;
    }

    public int minimumUsingStream(int[] nums) {
        return java.util.Arrays.stream(nums).min().getAsInt();
    }

    public int maximumUsingStream(int[] nums) {
        return java.util.Arrays.stream(nums).max().getAsInt();
    }

    public int sumUsingStream(int[] nums) {
        return java.util.Arrays.stream(nums).sum();
    }

    public double averageUsingStream(int[] nums) {
        return java.util.Arrays.stream(nums).average().getAsDouble();
    }
}
