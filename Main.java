package com.company;

public class Main {

    public static void main(String[] args) {

        int array [] = new int[]{ 10,20,30,41,55,64,75,82,91,109 };
        BinarySearch bn = new BinarySearch();

        System.out.println(" " + bn.binarySearch(20,array,0,9));

    }
}
