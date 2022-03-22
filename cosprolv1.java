package kr.co.kccworld.bwj;

public class test1 {

	public static void main(String[] args) {
		Solution sol = new Solution();
        long num = 591599;
        long ret = sol.solution(num);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");

	}

}

class Solution {
    public long solution(long num) {
        // Write code here.
        long answer = 0;
        
        num += 1;
        answer = num;
       String a = String.valueOf(answer);
       a = a.replace("0","1");
       long answer2 = Integer.valueOf(a);
        return answer2;
    }
}


