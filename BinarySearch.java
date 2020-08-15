package com.company;

public class BinarySearch {

    public int findMidPoint(int min, int max){
        return ( min + max ) / 2 ;
    }

    public int binarySearch(int key,int array[],int min,int max){
        int midpoint;
        if(min > max ){
            return -1;
        }
        //Finding midpoint
            midpoint = findMidPoint(min,max);
            System.out.println("Midpoint " + midpoint + " " + array[midpoint]);
            //Checking when key is greater than midpoint value
            if(array[midpoint] < key) {
                return binarySearch(key,array,midpoint + 1,max);
            }
            //Checking when key is less than midpoint value
            else if(array[midpoint] > key){
                return  binarySearch(key,array,min,midpoint - 1);

            }
            return midpoint;
    }
}
