package demo6;
import java.util.*;
public class Arry{

	  public static void main(String[] args) {
          Adder.getdata();
	  }
	  
Arry(int arr[]){    //Parameterized Constructor
	System.out.print("\nThe Array elements entered []: {");
	for (int element: arr) {
        System.out.print(" "+element+" ");
    }
	System.out.print("}");
}

public class Adder{
	
	  private static void getdata() {  //Static Void Method 
		  
		  Scanner sc = new Scanner(System.in);
		  Scanner s = new Scanner(System.in);
		  Scanner y = new Scanner(System.in);
		  int n; ///Total number of Array Elements
		  int targetSum;  //The Target Sum
		  
		  System.out.print("Enter length of array : ");
		  n= sc.nextInt();
		  System.out.println();
		  
		  
		  int nums[] = new int [n];   ////Array Initialization
		  
		  for (int i=0;i<n;i++) {
			  System.out.print("Enter the array elements "+Integer.valueOf(i+1)+" : ");
			  nums[i] = s.nextInt();
		  }
		  
		  Arry a = new Arry(nums);   // Constructor
		  
		  System.out.print("\n\nEnter the Target Sum : ");
		  targetSum= y.nextInt();
		  Adder.numsum(nums, targetSum);
		  
		  sc.close();
		  s.close();
		  y.close();

	  }
	  private static int[] numsum(int nums[], int targetSum) { //returns int[]
		  int num = 0;
	      for (int i = 0; i < nums.length; i++) {
	    	  for (int j = i + 1; j < nums.length; j++) {
	    		  if ((nums[i] + nums[j]) == targetSum) {
	//Line 61 //System.out.println("\nPair(s) found :[" + nums[i] + "," + nums[j] + "]");
	          
	    			  int a[] = {nums[i],nums[j]};  // Anyone line can be used between the above line and this line
	    			  num++;

	    			  System.out.print("The Pair(s) found are : "); //Not required line 61 is used
	    			  System.out.print(Arrays.toString(a));         //Not required line 61 is used
	        	}
	        }      
	    }
	     if(num==0) {
	    	 System.out.print("No Pairs found : ");
	    	 System.out.print("[]");
	    }    
	    return nums;
	    }
	    
	}
}
	
