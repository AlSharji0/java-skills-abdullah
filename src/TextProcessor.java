public class TextProcessor {
    public static int countWords(String string) {
        int counter = 0;
        for (char c : string.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                ++counter;
            }
        }

        return counter;
    }

   public static String replaceWord(String text, String oldWord, String newWord) {
       String split = text.strip();
       return split.replace(oldWord, newWord);
   }

   public static void main(String[] args) {
        String text = "This is a test";
        System.out.println("Testing this: " + text);
        System.out.println("Word count: " + countWords(text));
        System.out.println("Replaced text: " + replaceWord(text, "test", "example"));
   }
}