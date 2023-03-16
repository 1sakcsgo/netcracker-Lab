package org.example;

import org.example.entity.MobileContact;
import org.example.entity.TvContact;
import org.example.entity.User;
import org.example.repo.ContactRepo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        User user= new User("SDSD", LocalDate.of(2001, 1, 1),'w',"2661 45616 166");
        User user2= new User("SDSD", LocalDate.of(2003, 3, 4),'m',"2661 45dfdsfs16 166");
        TvContact tvContact = new TvContact(LocalDate.of(2023, 3, 4),LocalDate.of(2022, 10, 17),8548513,user,"Full");
        MobileContact mobileContact = new MobileContact(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        MobileContact mobileContact1 = new MobileContact(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        MobileContact mobileContact2 = new MobileContact(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        MobileContact mobileContact3 = new MobileContact(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        MobileContact mobileContact4 = new MobileContact(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        MobileContact mobileContact5 = new MobileContact(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
        System.out.println(user);
        System.out.println(user2);
        ContactRepo contactRepo = new ContactRepo();
        contactRepo.add(tvContact);
        contactRepo.add(mobileContact);
        contactRepo.add(mobileContact1);
        contactRepo.add(mobileContact2);
        contactRepo.add(mobileContact3);
        contactRepo.add(mobileContact4);
        contactRepo.add(mobileContact5);
        contactRepo.deleteById(5);
        System.out.println(mobileContact1.equals(mobileContact2));
        System.out.println(user2);
    }
}