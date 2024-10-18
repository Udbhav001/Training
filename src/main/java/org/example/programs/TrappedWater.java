package org.example.programs; /******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.lang.*;
public class TrappedWater
{
	public static void main(String[] args) {
	    int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(maxTrapWater(arr));
	}
    
    private static int maxTrapWater(int arr[]) {
        int n = arr.length;
        int pre[] = new int[n];
        int suf[] = new int[n];
        pre[0] = arr[0];
        for(int i = 1; i < n; i++)
            pre[i] = Math.max(pre[i-1], arr[i]);
        suf[n-1] = arr[n-1];
        for(int i = n-2; i > -1; i--)
            suf[i] = Math.max(suf[i+1], arr[i]);
        int totalWater = 0;
        for(int i = 0; i < n; i++)
            totalWater += Math.min(pre[i], suf[i]) - arr[i];
        return totalWater;
    }
    
}