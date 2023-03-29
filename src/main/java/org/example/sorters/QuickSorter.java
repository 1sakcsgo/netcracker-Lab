package org.example.sorters;

import org.example.entity.Contract;

import java.util.Comparator;

public class QuickSorter implements ISorter {
    @Override
    public void sort(Contract[] contracts, Comparator<Contract> comparator) {
        int low = 0;
        int high = contracts.length - 1;
        quickSort(contracts, comparator, low, high);

    }
    private void quickSort(Contract[] arr, Comparator<Contract> comp, int low, int high) {
        //завершить,если массив пуст или уже нечего делить
        if (arr.length == 0 || low >= high) return;
        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        Contract border = arr[middle];

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            //левый указатель
            while (comp.compare(arr[i], border) < 0) i++;
            //правый указатель
            while (comp.compare(arr[j], border) > 0) j--;
            if (i <= j) {
                Contract swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }
        }
        //рекурсия для сортировки левой и правой части
        if (low < j) quickSort(arr, comp, low, j);
        if (high > i) quickSort(arr, comp, i, high);
    }

}
