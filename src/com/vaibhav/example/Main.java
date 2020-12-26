package com.vaibhav.example;

public class Main {

    public static void main(String[] args) {
	int [] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(getMaxProfit(arr));
    }

    public static int getMaxProfit(int [] arr){
        int currentProfit = 0;
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            int end = i+1 >= arr.length ? i : i+1;
            if(arr[start] > arr[end]){
                continue;
            } else{
                for (int j = start; j < arr.length; j++) {
                    int temp = j+1 >= arr.length ? j : j+1;
                    currentProfit = arr[temp] - arr[start];
                    if(maxProfit < currentProfit){
                        maxProfit = currentProfit;
                    }
                }
            }
        }
        return maxProfit;
    }
}
