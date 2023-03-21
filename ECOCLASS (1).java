// https://www.codechef.com/problems/ECOCLASS
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
		    int count = 0;
		    
		    int arr1[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr1[i] = s.nextInt();
		    }
		    
		    int arr2[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr2[i] = s.nextInt();
		    }
		    
            
            int i=0;
            while(i<n){
                if(arr1[i]==arr2[i]){
                    count++;
                }
                i++;
            }
            System.out.println(count);
            
		}
	}
}
