package com.abhi.sortingAlgorithms;
/*
* Bubble sort is a simple algorithm
*
* DEF- compare two values in a row till the end of the array and then repeat till sorted
*
* */
public class BubbleSort implements sortingAlgorithm{

    int[] input_array;
    // Constructor take in Array and initialises instance variable
    public BubbleSort(int[] input_array){
        this.input_array = input_array;
    }
    /*
    * Method to impliment sorting
    * ORDER - SET asc = true for Ascending
    *       - SET asc = false for Descending
    * */
    public int[] sort(boolean asc){
        // Looping through the Array
        for(int i=0;i<input_array.length;i++){
            for(int j = 0; j<input_array.length-1;j++){
                //System.out.println("Comparing pair = ("+this.input_array[j]+","+this.input_array[j+1]+")"); //checking the pairs
                //ASCENDING ORDER condition check
                if(asc) {
                    if (this.input_array[j] > this.input_array[j + 1]) {
                        //Swapping elements in the instance variable
                        var temp = this.input_array[j + 1];
                        this.input_array[j + 1] = this.input_array[j];
                        this.input_array[j] = temp;
                    }
                }
                //DESCENDING ORDER condition
                else{
                    if (this.input_array[j] < this.input_array[j + 1]) {
                        //Swapping elements in the instance variable
                        var temp = this.input_array[j + 1];
                        this.input_array[j + 1] = this.input_array[j];
                        this.input_array[j] = temp;
                    }
                }
            }
        }
        return this.input_array;
    }
}
