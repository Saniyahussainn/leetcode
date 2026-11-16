class Solution {
    public int countDigits(int num) {
        int count = 0;
        int temp = num;
        
        while (temp > 0) {
            int digit = temp % 10;
            // Check if digit divides num
            if (num % digit == 0) {
                count++;
            }
            temp /= 10;
        }
        
        return count;
    }
}
