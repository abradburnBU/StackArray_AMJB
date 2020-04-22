/**
 * Tests the classes that are used in the ArrayStack class
 */
package jsjf;

public class TestStack {
	
	public static void main(String[] args) {
		
	
	int initialCapacity=10; //sets the initial capacity to be passed into the preferred constructor.
	ArrayStack test1 = new ArrayStack();
	ArrayStack test2 = new ArrayStack(initialCapacity);
	
	/**
	 * creates new ArrayStacks using the empty-argument and preferred constructors
	 */
	
	test2.push("hubjkb");
	test2.push("uio");
	test2.push("jokni");
	
	//Pushes 3 random strings of letters into the ArrayStack
	
	test2.pop();
	
	//Removes the top string from the ArrayStack
	
	System.out.println(test2.peek());
	
	//Views the top string in the ArrayStack
	
	System.out.println(test2.isEmpty());
	
	//Tests whether or not the ArrayStack is empty
	
	System.out.println(test2.size());
	
	//Displays how many strings are in the ArrayStack
	
	System.out.println(test2.toString());
	
	//Prints each of the strings in the ArrayStack on their own lines
	}
}
