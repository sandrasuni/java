import java.util.*;
public class Deques
{
public static void main(String[]args)
{
	Deque<String>deque=new ArrayDeque<String>();
	deque.add("A");
	deque.add("B");
	deque.add("C");
	deque.add("D");
	deque.add("E");
	deque.add("F");
	deque.add("G");
	
	System.out.print("\nQueue after inserting the values:");
	for(String str:deque)
	{
		System.out.print(str+" ");
	}
	deque.addFirst("z");
	
	System.out.print("\nQueue after inserting the element at first:");
	for(String str:deque)
	{
		System.out.print(str+" ");
	}
	deque.remove();
	
	
	System.out.print("\n\nAfter First Element is Deleted :");
	for(String str:deque)
	{
		System.out.print(str+" ");
	}
	deque.addLast("x");
	
	System.out.print("\n\nAfter inserting the last:");
	for(String str:deque)
	{
		System.out.print(str+"");
	}
	deque.clear();
	
	System.out.print("\n\nAfter clearing and inserting a new element:");
	for(String str:deque)
	{
		System.out.print(str+"");
	}
}
}
