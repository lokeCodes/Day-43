// https://www.codechef.com/problems/RCBPLAY
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
		    int x = s.nextInt();
		    int y = s.nextInt();
		    int z = s.nextInt();
		    int res1 = x+(z*2);
		    String res = (res1>=y) ? "YES" : "NO" ;
		    System.out.println(res);
		}
	}
}
