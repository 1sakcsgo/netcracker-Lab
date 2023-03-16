package org.example;

import org.example.entity.MobileContract;
import org.example.entity.TvContract;
import org.example.entity.User;
import org.example.repo.ContractRepo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        User user= new User("SDSD", LocalDate.of(2001, 1, 1),'w',"2661 45616 166");
        User user2= new User("SDSD", LocalDate.of(2003, 3, 4),'m',"2661 45dfdsfs16 166");
        TvContract tvContact = new TvContract(LocalDate.of(2023, 3, 4),LocalDate.of(2022, 10, 17),8548513,user,"Full");
        MobileContract mobileContact = new MobileContract(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        MobileContract mobileContact1 = new MobileContract(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        MobileContract mobileContact2 = new MobileContract(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        MobileContract mobileContact3 = new MobileContract(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        MobileContract mobileContact4 = new MobileContract(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        MobileContract mobileContact5 = new MobileContract(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        System.out.println(user);
        System.out.println(user2);
        ContractRepo contractRepo = new ContractRepo();
        contractRepo.add(tvContact);
        contractRepo.add(mobileContact);
        contractRepo.add(mobileContact1);
        contractRepo.add(mobileContact2);
        contractRepo.add(mobileContact3);
        contractRepo.add(mobileContact4);
        contractRepo.add(mobileContact5);
        contractRepo.deleteById(5);
        System.out.println(mobileContact1.equals(mobileContact2));
        System.out.println(user2);
    }
}