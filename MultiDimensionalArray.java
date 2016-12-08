

public class MultiDimensionalArray {
	
	String a = "Value of a";
	String b = "Value of b";
	String array1[] = {"Hey", a, b, "Me"};
	String array2[] = {"Hey2", "a2", "b2", "Me2"};
	int arr[][]={{1,2,3},  								//normally like this:  int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
				 {4,5,6},
				 {7,8,9}};

	void method1() throws InterruptedException{
		for (int y = 0; y < arr.length; y++) 			// this is like controlling where youd like to start in the y-axis, DOWN, in relation to index; vs to how far you would like to go, in relation to arg.length
		{
			for (int x = 0; x < arr.length; x++) 		//this is like controlling where youd like to start in the x-axis, RIGHT , in relation to index; vs to how far you would like to go, in relation to arg.length
			{
				Thread.sleep(1000); 				//Delays 1s 10 times; 10s overall delay
			    System.out.print(arr[y][x]+" ");		//order of index printing example:  index[0][0]=element 1, index[0][1]=element 2, index[0][2]=element 3, println(), repeat but now [1][0]
			    									//realize: arr[0][2]=3 not same as arr[2][0]=7,, remember y-axis and x-axis, arr[y][x]
			}
		    
		    System.out.println();				//this statement is part of the y-axis action
		}
											//graphical x and y axis
		
	}
	 
	public static void main(String arg[]) throws InterruptedException  {
		MultiDimensionalArray practice2Obj = new MultiDimensionalArray();
		practice2Obj.method1();
		
	}
}
	

