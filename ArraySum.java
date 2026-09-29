public class ArraySum {
    public static void main(String[] args) {
        // Creating an array to hold 5 integer values
        int[] performanceScores = {80, 85, 90, 95, 100};
        int totalSum = 0;

        // Loop through the array boxes step-by-step to calculate total sum
        for (int i = 0; i < performanceScores.length; i++) {
            totalSum = totalSum + performanceScores[i];
        }

        System.out.println("The total sum of elements in the array is: " + totalSum);
    }
}
