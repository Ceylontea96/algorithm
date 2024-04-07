import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] clear = new double[N][2];
        int len = stages.length;
        for(int i = 1; i <= N; ++i) {
            clear[i-1][0] = i;
            int c = 0, c_f = 0;
            for(int j = 0; j < len; ++j) {
                if(stages[j] == i) ++c_f;
                else if(stages[j] > i) ++c;
            }
            if(c_f == 0)    {
                clear[i-1][1] = 0;
            }
            else            {
                clear[i-1][1] = (double) c_f * 100 / (c + c_f) ;
            }
            
        }
        
        Arrays.sort(clear, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return Double.compare(o2[1], o1[1]);
            }
        });
        
        for(int i = 0; i < N; ++i) {
            answer[i] = (int)clear[i][0];
        }
        
        return answer;
    }
}