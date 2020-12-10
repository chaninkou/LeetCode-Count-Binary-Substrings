package leetcode696;

public class CountAllSubstrings {
    public int countBinarySubstrings(String s) {
        int current = 1;
        int previous = 0;
        int result = 0;
        
        for(int i = 1; i < s.length(); i++){
        	// Keep track of number of time one number repeat
            if(s.charAt(i) == s.charAt(i - 1)){
                current++;
            } else { // update result and reset current
                result += Math.min(current, previous);
                previous = current;
                current = 1;
            }
        }
        
        return result + Math.min(current, previous);
    }
}
