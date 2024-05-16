package semester.sessional;

class SecondSessional4thsem {

    public static String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s);

        sb.reverse();
        int start = 0;
        for (int i = 0; i <= sb.length(); i++) {
            if (i == sb.length() || sb.charAt(i) == ' ') {
                StringBuilder word = new StringBuilder(sb.substring(start, i));
                sb.replace(start, i, word.reverse().toString());
                start = i + 1;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String word = "My name is John Smith ";
        String reversedword = reverseWords(word);
        System.out.println(reversedword);
    }
}
