package org.example.sorters;

import org.example.entity.Contract;

import java.util.Comparator;

public interface ISorter {
    void sort(Contract[]objects, Comparator<Contract> comparator);

}
