// https://www.codechef.com/problems/INDIVISIBLE
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
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c = s.nextInt();
		    for(int i=2;i<100;i++){
		      if(a%i!=0 && b%i!=0 && c%i!=0){
		           System.out.println(i);
		           break;
		       }
		    }
		}
		
		
		
	}
}
