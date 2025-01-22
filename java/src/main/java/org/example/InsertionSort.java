package org.example;

public class InsertionSort {
    //Sorts the array using Insertion Sort.
    public void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            insert(i, a);
        }
    }

    private void insert(int i, Comparable[] a) {
        //Inserts the 'Transition element' into its correct position in the sorted portion of the array.
        for(int j = i; j > 0; j--) {
            if(a[j].compareTo(a[j-1]) < 0) {
                swap(a, j, j-1);
            }
        }
        //TODO: TO BE IMPLEMENTED
    }

    private void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
