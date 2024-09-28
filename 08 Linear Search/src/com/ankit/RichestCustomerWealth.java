//1672
package com.ankit;

public class RichestCustomerWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts){
        // person = row
        // account = col
        int ans = Integer.MAX_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // whenyou start a new col, take a new sum of that row
            int sum =0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // now we have sum of account of person
            // check with overall answer
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
