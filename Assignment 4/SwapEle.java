import java.util.*;

class SwapEle
{
	public static void main(String[] args)
	{
		ArrayList<String> mylist =
						new ArrayList<String>();
		mylist.add("code");
		mylist.add("practice");
		mylist.add("quiz");
		mylist.add("geeksforgeeks");

		System.out.println("Original List : \n" + mylist);

		Collections.swap(mylist, 1, 2);

		System.out.println("\nAfter swap(mylist, 1, 2) : \n"
						+ mylist);

		Collections.swap(mylist, 3, 1);

		System.out.println("\nAfter swap(mylist, 3, 1) : \n"
						+ mylist);
	}
}

