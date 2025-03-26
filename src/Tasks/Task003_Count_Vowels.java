package Tasks;

public class Task003_Count_Vowels {
    public static void main(String[] args) {
        String s = "Hello Supriya welcome to the world of Java";
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowels++;
            }else {
                consonants++;
            }
        }
        System.out.println("Number of vowels in the string: " + vowels);
        System.out.println("Number of consonants in the string: " + consonants);
    }
}
