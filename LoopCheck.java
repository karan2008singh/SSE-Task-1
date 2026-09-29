public class LoopCheck {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Loop looks at every index box one by one
        for (int i = 0; i < numbers.length; i++) {
            
            // Condition checks if the value matches 30
            if (numbers[i] == 30) {
                System.out.println("Found 30 at index position: " + i);
            }
        }
    }
}
