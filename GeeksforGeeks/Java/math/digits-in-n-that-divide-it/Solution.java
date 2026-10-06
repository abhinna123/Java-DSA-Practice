class Solution {
    static int evenlyDivides(int n) {
        int temp = n;
        int count = 0;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 0 && n % digit == 0) {
                count++;
            }
            temp /= 10;
        }
        return count;
    }

    public int divisibleByDigits(String s) {
        long num = Long.parseLong(s);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit != 0 && num % digit == 0) {
                count++;
            }
        }
        return count;
    }
}
