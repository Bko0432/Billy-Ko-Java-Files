import javax.swing.*;
public class EnhanceLoop1{



	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		
		    {
		        int [] score = {56,33,22,44,7,57,46};
		        int [] okay = {46,56,66,78,89,87,90};
		        int total1 = 0;
		        int total2 = 0;
		        int total3 = 5;
		        int total4 = 10;
		        int total5 = 55;
		        
		        // Basic Implementation - - - - - - - - - - - - - - - - - - - 
		        System.out.println("For Loop Method");
		        for (int x=0; x < score.length; x++)
		        {
		            System.out.println(score[x]);
		            total1 = total1 + score[x];
		            
		       
		        }
		        System.out.println("Total: " + total1);
		        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
		        
		        System.out.println(); //spacer


		        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -        
		        /*System.out.println("Enhanced For Loop Method");
		        for (int x : score)
		        {
		            System.out.println(x);
		            total2 += x;
		        }
		        System.out.println("Total: " + total2);*/
		        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
		        System.out.println("SimpleEnhance");
		        for(int dex = 1; dex < score.length; dex++ ){
		        	System.out.println(score[dex]);
		        	total3 = total3 / dex;
		        	System.out.println("Total: / total3");
		      
		        }
		    System.out.println("Enhance For Loop");
			for(int dex : okay)
		    {
		    	System.out.println(dex);
		    	  total4 += dex;
		    }
		    	System.out.println("Total: / total4");
		    }
	}
} 
		    
	



	


