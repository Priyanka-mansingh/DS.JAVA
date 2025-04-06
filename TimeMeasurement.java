public class TimeMeasurement {
    
    // Function whose execution time is to be measured
    static void fun() {
        // Dummy task: sum of first 1 million numbers
        long sum = 0;
        for (int i = 1; i <= 1_000_000; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        // Record start time
        long startTime = System.nanoTime();

        // Call the function
        fun();

        // Record end time
        long endTime = System.nanoTime();

        // Calculate elapsed time in nanoseconds and milliseconds
        long durationNano = endTime - startTime;
        double durationMillis = durationNano / 1_000_000.0;

        System.out.println("Time taken by fun(): " + durationNano + " nanoseconds");
        System.out.println("Time taken by fun(): " + durationMillis + " milliseconds");
    }
}
