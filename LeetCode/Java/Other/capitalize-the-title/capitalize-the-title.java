class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            if (word.length() <= 2) {
                result.append(word);
            } else {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1));
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}