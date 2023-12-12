/* Section 13, Practice 16 */
public class MyChar {
    public boolean isVowel(char ch) {

        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': return true;

            default: return false;
        }
    }
}
