package first_TEST.second_TEST.THREE_TEST;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] var = {1,2,3};
		String in = "comeon";
		System.out.println(in);
		System.out.print("hello");
		System.out.print(" every one");
		
		Date today = new Date();
	    System.out.println(today);
	        
	    SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
	    SimpleDateFormat sdf = new SimpleDateFormat("HH");
	        
	    System.out.println("Date: "+date.format(today));
	    System.out.println("Time: ");
	    System.out.println("00".equals(sdf.format(today)) ? sdf.format(today) : "NO");
	    
	    int[][] var2 = {{1,2,3},{2,3,4}};
	    //System.out.println(Arrays.deepToString(var2));
	    System.out.println(var2.length);
	    for(int i = 0; i<var2.length; i++){
	    	int arr3[] = var2[i];
	    	for(int j = 0; j<arr3.length;j++){
	    		
	    		System.out.print(arr3[j]);
	    	}
	    	System.out.println();
	    }
	    

		
	}

}
