class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int N = nums.length / 2;
        int[] arr = new int[200001];
        for(int i = 0; i < nums.length; ++i) {
            if(arr[nums[i]] != 0) continue;
            arr[nums[i]] = 1;
            ++answer;
        }
        if(answer > N) answer = N;
        return answer;
    }
}