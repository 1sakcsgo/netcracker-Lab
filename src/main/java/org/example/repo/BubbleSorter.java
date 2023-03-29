package org.example.repo;

import org.example.entity.Contract;

import java.util.Comparator;

public class BubbleSorter implements ISorter{



    @Override
    public void sort(Contract[] objects, Comparator<Contract> comparator) {
        for (int i = 0; i < objects.length - 1; i++) {
            for(int j = 0; j < objects.length - i - 1; j++) {
                if(comparator.compare(objects[j],objects[j+1])>0) {
                    Contract temp =  objects[j];
                    objects[j] = objects[j + 1];
                    objects[j + 1] = temp;
                }
            }
        }
    }


}
