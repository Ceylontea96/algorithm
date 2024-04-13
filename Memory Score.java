class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int len = photo.length;
        int[] answer = new int[len];
        for(int i = 0; i < len; ++i) {
            int sum = 0;
            for(int j = 0; j < photo[i].length; ++j) {
                String p = photo[i][j];
                for(int k = 0; k < name.length; ++k) {
                    if(p.equals(name[k])) {
                        sum += yearning[k];
                        break;
                    }
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}