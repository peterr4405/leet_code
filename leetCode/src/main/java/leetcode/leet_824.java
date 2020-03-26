package leetcode;

public class leet_824 {

    public static String toGoatLatin(String S) {

        String[] stringArray = S.split(" ");
        StringBuilder finalBuilder = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++) {
            StringBuilder sb = new StringBuilder();
            if (firstCharVowel(stringArray[i].charAt(0))) {
                sb.append(stringArray[i]);
            } else {
                sb.append(stringArray[i].substring(1, stringArray[i].length()));
                sb.append(String.valueOf(stringArray[i].charAt(0)));
            }

            sb.append("ma");
            for (int j = 0; j < i + 1; j++) {
                sb.append(String.valueOf('a'));
            }
            finalBuilder.append(sb.toString());
            finalBuilder.append(" ");
        }

        return finalBuilder.toString().trim();

    }

    static boolean firstCharVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String S = "I speak Goat Latin";
        String ans = toGoatLatin(S);
        System.out.println(ans);
    }

}
