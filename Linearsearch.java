public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 70, 40}; // Our list of numbers
        int target = 70;                      // The number we want to find
        boolean found = false;

        // Loop checks every index position from 0 to the end of the array
        for (int i = 0; i < numbers.length; i++) {
            
            // If the value in the current box matches our target
            if (numbers[i] == target) {
                System.out.println("Target " + target + " found at index: " + i);
                found = true;
                break; // Exit the loop immediately because we found it!
            }
        }

        // If the loop finished checking everything and never found the target
        if (found == false) {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
