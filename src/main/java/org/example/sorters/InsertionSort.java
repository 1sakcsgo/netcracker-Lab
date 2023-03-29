package org.example.sorters;

import org.example.entity.Contract;
import org.example.sorters.ISorter;

import java.util.Comparator;

public class InsertionSort implements ISorter {
    @Override
    public void sort(Contract[] objects, Comparator<Contract> comparator) {
        int j;
        for (int i = 1; i < objects.length; ++i) {
            Contract contract = objects[i];
            j = i;

            while (j >= 0 && comparator.compare(objects[j-1],contract)>0) {
                objects[j] = objects[j-1];
                --j;
            }
            objects[j] = contract;
        }
    }
}
