class Solution {
    public double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        double sum = 0;

        for (int s : salary) {
            minSalary = Math.min(minSalary, s);
            maxSalary = Math.max(maxSalary, s);
            sum += s;
        }

        sum = sum - minSalary - maxSalary;
        return sum / (salary.length - 2);
    }
}
