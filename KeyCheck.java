public class KeyCheck {
    public static boolean isKeyPresent(String s, String key) {
        // Check if the key is present in the string
        return s.contains(key);
    }

    public static void main(String[] args) {
        String inputString = "Hello123!"; // Replace this with your actual string
        String targetKey = "123"; // Replace this with the key you want to check

        boolean isPresent = isKeyPresent(inputString, targetKey);

        if (isPresent) {
            System.out.println("The key '" + targetKey + "' is present in the string.");
        } else {
            System.out.println("The key '" + targetKey + "' is not present in the string.");
        }
    }
}
