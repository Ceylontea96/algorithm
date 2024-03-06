class Solution {
    public String solution(int a, int b) {
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] monthDays = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
        int days = monthDays[(a-1)] + (b-1);
        return week[days % 7];
    }
}