import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_On_Add_N_values {
	public static void main(String[] args) 
	{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=s.nextInt();
        System.out.println("Enter "+n +" values");
        TreeSet ts=new TreeSet();
        
        for(int i=0;i<n;i++)
        { 
        	ts.add(s.nextInt());
        }
        System.out.println(ts);
        System.out.println(ts.descendingSet());
		  		 
	}

}
