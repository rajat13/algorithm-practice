//LeetCode 167

import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15};
        int target = 26;
        int [] result = twoSum(input, target);
        System.out.println(result[0] + " " + result[1]);
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int [] res = {0, 0};

        for(int i=0; i<nums.length; i++){
            int j = BiSearch(nums, i, nums.length-1, target - nums[i]);
            if(j != -1){
                res[0] = i + 1;
                res[1] = j + 1;
                
            }
        }
        return res;
    }
    
    public static int BiSearch(int[] A, int start, int end, int key){
        int L = start;
        int R = end;
        
        while(L<R){
            int M = L + (R-L)/2;
            if(A[M] < key) {
                L = M + 1;
            } else {
                R = M;
            }
        }
        return (L == R && A[L] == key) ? L : -1;
    }
}