package ch1;

public class MainMethod {

	// this is a comment
	
	/* this is a multi-line comment, it ends after the 
	 * 
	 */
	
//	public static void main(String[] args) {
//		System.out.println("This is main");
//	}
	
	
	// The JVM needs to find a main method or it will fail.
	// it needs to have a return type of void, take in a string array, and be public and static
	// you can write String[] args, String args[]. and String...
	// all three are valid are are interpreted as a string array
	// the ... syntax is called varargs (variable argument lists)
	/**
	 * This is a javadoc you can tell because there are two ** after / instead of 1
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.println("This is main");
	}
	
	// variants:
	// 
}
