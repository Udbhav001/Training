package org.example.programs; /******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.lang.*;
public class FindSumEqualK
{
	public static void main(String[] args) {
	    int arr[] = {5, 8, 50, 4};
	    int k = 50;
        System.out.println(findSum(arr, k));
	}
    
    private static int findSum(int arr[], int k) {
        int l = 0, r = 0;
        int count = 0, curr = 0;
        while(r < arr.length) {
            curr += arr[r];
            while(curr > k) {
                curr -= arr[l];
                l++;
            }
            if(curr == k)
                count++;
            r++;
        }
        return count;
    }
    
}