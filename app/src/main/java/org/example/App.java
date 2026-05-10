package org.example;

public class App {
    public String getGreeting() {
        return "Hello, welcome to my Stats Calculator!";
    }

    public static void main(String[] args) {
        StatsCalculator sc = new StatsCalculator();
        int[] nums = {5, 2, 9, 1, 7};

        System.out.println("Minimum (loop): " + sc.minimumUsingForLoop(nums));
        System.out.println("Maximum (loop): " + sc.maximumUsingForLoop(nums));
        System.out.println("Sum (loop): " + sc.sumUsingForLoop(nums));
        System.out.println("Average (loop): " + sc.averageUsingForLoop(nums));

        System.out.println("Minimum (stream): " + sc.minimumUsingStream(nums));
        System.out.println("Maximum (stream): " + sc.maximumUsingStream(nums));
        System.out.println("Sum (stream): " + sc.sumUsingStream(nums));
        System.out.println("Average (stream): " + sc.averageUsingStream(nums));

        System.out.println(new App().getGreeting());
    }
}
