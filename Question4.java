package fujitsu;

import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) 
	{
        int[] a = { 1, 20, 11, 40 }; 
        int[] b = { 9, 6, 7, 80 }; 
        int a1 = a.length; 
        int b1 = b.length; 
        int c1 = a1 + b1; 
        int[] c = new int[c1]; 
        System.arraycopy(a, 0, c, 0, a1); 
        System.arraycopy(b, 0, c, a1, b1); 
        System.out.println(Arrays.toString(c)); 
	}

}
