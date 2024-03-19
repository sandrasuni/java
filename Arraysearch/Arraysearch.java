import java.util.Scanner;
import java.util.*;
class Arraysearch
{
	public static void main(String[] Args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter no of elements: ");
	int size=sc.nextInt();
	int numbers[]=new int [size];
	System.out.print("\nEnter elements of Array: ");
	for (int i=0;i<size;i++)
	{
		numbers[i]=sc.nextInt();
	}
	Arraysearch as=new Arraysearch();


	System.out.println("Enter the element to search : ");
	int se=sc.nextInt();
	System.out.println(" 1:Linear Search \n 2:Simple Binary Search \n 3:Recursive Binary search\n 4:Binary Search \n 5:Exit");
	System.out.print("\n\nEnter your option: ");
	int opt=sc.nextInt();
	int result=-1;
	switch(opt)
	{
		case 1:System.out.println("Linear Search");
			result=as.linearsearch(se,numbers);
		break;
		case 2:System.out.println("Simple Binary Search");
			Arrays.sort(numbers);
        		result=as.simpleBinarySearch(se,numbers);
        	break;
        	case 3: Arrays.sort(numbers);
        		result=as.recursiveBinarySearch(numbers,0,size-1,se);
        	break;
        	case 4:System.out.println("Binary Search");
        		Arrays.sort(numbers);
       			result=Arrays.binarySearch(numbers,se);
        	break;
        	case 5:System.exit(0);
        	break;
        }
        if(result>-1)
        {
        	System.out.println(se+" is found\n");
        }
        else
        {
        	System.out.println(se+" is not found\n");
        
        }
}

//Linear search method
 int linearsearch(int n,int[] numbers)
 {
 	for(int i=0;i<numbers.length;i++)
 	{
 		if(numbers[i]==0)
 		{
 			return i;
 		}
 	}
 	return -1;
}

//simple binary search method 	

int simpleBinarySearch(int n,int[] numbers)  
{
	int first=0;
	int last=numbers.length-1;
	int mid=(first+last)/2;
	while(first<=last)
	{
		if(numbers[mid]<n)
		{
			first=mid-1;
		}
		else if(numbers[mid]>n)
        	{
			last=mid-1;
		}
		else
		{
			return mid;
		}
		mid=(first+last)/2;
	}
	return -1;
}

//Recursive binary search method

int recursiveBinarySearch(int[] numbers,int first,int last,int x)
{
	if(first<=last && first<numbers.length-1)
	{
		int mid=first+(last-first)/2;
		if(numbers[mid]<x)
		{
			return recursiveBinarySearch(numbers,mid+1,last,x);
		}
		if(numbers[mid]>x)
		{
			return recursiveBinarySearch(numbers,first,mid-1,x);
		}
		return mid;
	}
	return -1;
}
}	






