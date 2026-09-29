public class WhilePointers {
    public static void main(String[] args) {
        int low = 0;
        int high = 6;

        // Loop runs as long as low marker is less than or equal to high marker
        while (low <= high) {
            System.out.println("Low pointer: " + low + " | High pointer: " + high);
            
            low = low + 1;   // Shift low marker up
            high = high - 1; // Shift high marker down
        }
    }
}
