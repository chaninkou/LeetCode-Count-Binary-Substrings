package leetcode696;

public class Main {
	public static void main(String[] args) {
		String s = "011000111";
		
		System.out.println("Input: " + s);
		
		CountAllSubstrings solution = new CountAllSubstrings();
		
		System.out.println("Solution: " + solution.countBinarySubstrings(s));
	}
}
