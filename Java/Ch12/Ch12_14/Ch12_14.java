public class Ch12_14 {
    public static void main(String[] args) {
        String originalString = "Habit is second nature.";
        
        // Find the index of "nature"
        int startIndex = originalString.indexOf("nature");
        
        // Extract the substring starting from the startIndex
        String extractedSubstring = originalString.substring(startIndex, startIndex + "nature".length());
        
        System.out.println(extractedSubstring);
    }
}