class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        answer.append(0);

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(answer);
                sb.append(i);
                answer = sb;
            }
        }

        return answer.toString();
    }
}