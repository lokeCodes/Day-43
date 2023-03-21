// https://www.codechef.com/problems/BIN_BAT
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int n = s.nextInt();
		    int a = s.nextInt();
		    int b = s.nextInt();
		    for(int i=1;i<n;i++){
                int temp = (int) Math.pow(2,i);
                if(temp==n){
                    System.out.println( (a*i) + (b* (i-1)) );
                    break;
                }
		    }
		    
		    
		}
	}
}
