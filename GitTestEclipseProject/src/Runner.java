public class Runner {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		for(int n : num)
			System.out.println("Numbers in Array are: " + n);
		
		// This will be Commit 2
		String[] chars = {"a", "b", "c", "d", "e", "f", "g"};
		
		for(String s : chars)
			System.out.println("The Chars in the Array are: " + s);
	}
}