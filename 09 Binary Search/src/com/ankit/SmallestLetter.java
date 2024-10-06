package com.ankit;

public class SmallestLetter {
    public static void main(String[] args) {
        int arr[] = {'c', 'f', 'j'};
        int target = 'c';
        char[] letters = new char[0];
        int ans = nextGreatestLetter(letters, (char) target);
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letters, char target) {

        int start =0;
        int end = letters.length-1;
        while (start<=end){

            int mid = start + (end-start)/2;
                if (target<letters[mid]){
                    end=mid-1;
                } else{
                    start = mid+1;
                }
            }
        return letters[start% letters.length];
    }
}
