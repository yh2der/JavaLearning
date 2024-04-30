public class Ch12_24 {
    public static void main(String[] args) {
        String originalString = "Two heads are better than one.";
        
        // Find the index of "nature"
        int startIndex = originalString.indexOf("better");
        
        // Extract the substring starting from the startIndex
        String extractedSubstring = originalString.substring(startIndex, startIndex + "nature".length());
        
        System.out.println(extractedSubstring);
    }
}