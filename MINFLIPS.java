// https://www.codechef.com/problems/MINFLIPS
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
	        int arr[] = new int[a];
	        int p =0;
	        int n =0;
	        for(int i=0;i<a;i++){
	            arr[i] = s.nextInt();
	            if(arr[i]==1){
	                p++;
	            }else{
	                n++;
	            }
	        }
	        
	        if(a%2==0 && p==n){
	            System.out.println(p-n);
	        }else if(a%2==0 && p>n){
	            for(int i=1;i<p;i++){
	                p--;
	                n++;
	                if(n==p){
	                    System.out.println(i);
	                    break;
	                }
	            }
	        }else if(a%2==0 && p<n){
	            for(int i=1;i<n;i++){
	                p++;
	                n--;
	                if(p==n){
	                    System.out.println(i);
	                    break;
	                }
	            }
	        }else{
	            System.out.println(-1);
	        }
	    }
	}
}
