package org.example;

import org.example.entity.Contract;
import org.example.entity.MobileContract;
import org.example.entity.TvContract;
import org.example.entity.User;
import org.example.sorters.BubbleSorter;
import org.example.repo.ContractRepo;
import org.example.sorters.ISorter;
import org.example.sorters.InsertionSort;
import org.example.sorters.QuickSorter;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        User user= new User("SDSD", LocalDate.of(2001, 1, 1),"w","2661 45616 166");
        User user2= new User("SDSD", LocalDate.of(2003, 3, 4),"m","2661 45dfdsfs16 166");
        TvContract tvContact = new TvContract(LocalDate.of(2023, 3, 4),LocalDate.of(2022, 10, 17),8548513,user,"Full");
        MobileContract mobileContact = new MobileContract(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        MobileContract mobileContact1 = new MobileContract(LocalDate.of(2004, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        mobileContact1.setId(10L);
        MobileContract mobileContact2 = new MobileContract(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        MobileContract mobileContact3 = new MobileContract(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        MobileContract mobileContact4 = new MobileContract(LocalDate.of(2009, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        MobileContract mobileContact5 = new MobileContract(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        MobileContract mobileContact6 = new MobileContract(LocalDate.of(2177, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        ContractRepo contractRepo = new ContractRepo();
        contractRepo.add(tvContact);
        contractRepo.add(mobileContact);
        contractRepo.add(mobileContact1);
        contractRepo.add(mobileContact2);
        contractRepo.add(mobileContact3);
        contractRepo.add(mobileContact4);
        contractRepo.add(mobileContact5);
        System.out.println("До сортировки " +contractRepo);
        Predicate<Contract>contractPredicate =  (contract) -> contract.getStartDate().isAfter(LocalDate.of(2100,1,1));
//        BubbleSorter bubbleSorter = new BubbleSorter();
//        InsertionSort insertionSort = new InsertionSort();
//        QuickSorter quickSorter = new QuickSorter();

       Comparator <Contract>comparator = (c1,c2)->c1.getId().compareTo(c2.getId());
        System.out.println("Компаратор "+comparator.compare(mobileContact1,mobileContact3));;
      //  quickSorter.sort(contractRepo.getValues(), comparator);
        System.out.println("После сортировки " +contractRepo);
        System.out.println("5555555555   "+contractRepo.SearchContratByCriteria(contractPredicate));
        System.out.println(mobileContact1.equals(mobileContact2));
        System.out.println(contractRepo.size());
    }
}