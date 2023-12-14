public class Main {
    public static void main(String[]args){
        Unicode unicodeCharacter = new Unicode("Hello, World!", 7);
        String result = unicodeCharacter.getUnicodeCharacter();
        System.out.println(result);
    }
}
