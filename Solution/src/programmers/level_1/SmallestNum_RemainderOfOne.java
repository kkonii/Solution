package programmers.level_1;

public class SmallestNum_RemainderOfOne {
    public int solution(int n) {
        int answer = 0;
	        
	    for(int i=1;i<n;i++) {
	        if(n % i == 1) {
	            answer = i; break;
	        }
	    }
	        
	    return answer;
    }
}
