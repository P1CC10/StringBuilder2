public class Unicode {

    private String inputString;
    private int position;

    public Unicode(String inputString, int position) {
        this.inputString = inputString;
        this.position = position;
    }

    public String getUnicodeCharacter() {
        if (position >= 0 && position < inputString.length()) {
            char character = inputString.charAt(position);
            return "Unicode character at position " + position + ": " + (int) character;
        } else {
            return "Invalid position. Please provide a valid index within the string length.";
        }
    }
   }

