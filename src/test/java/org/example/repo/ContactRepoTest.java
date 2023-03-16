package org.example.repo;

import org.example.entity.Contact;
import org.example.entity.MobileContact;
import org.example.entity.TvContact;
import org.example.entity.User;
import org.junit.Assert;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
public class ContactRepoTest {
    private static final User user= new User("SDSD", LocalDate.of(2001, 1, 1),'w',"2661 45616 166");
    private static final User user2= new User("SDSD", LocalDate.of(2003, 3, 4),'m',"2661 45dfdsfs16 166");
    private static final TvContact tvContact = new TvContact(LocalDate.of(2023, 3, 4),LocalDate.of(2022, 10, 17),8548513,user,"Full");
    private static final MobileContact  mobileContact = new MobileContact(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
    private static final MobileContact mobileContact1 = new MobileContact(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);

    @org.junit.Test
    public void add() {
        ArrayList<Contact> contactArrayList = new ArrayList<>();
        contactArrayList.add(tvContact);
        contactArrayList.add(mobileContact);
        contactArrayList.add(mobileContact1);
        ContactRepo contactRepo = new ContactRepo();
        contactRepo.add(tvContact);
        contactRepo.add(mobileContact);
        contactRepo.add(mobileContact1);

        Assert.assertEquals(contactArrayList, Arrays.asList(contactRepo.getValues()));
    }

    @org.junit.Test
    public void get() {
        ContactRepo contactRepo = new ContactRepo();
        contactRepo.add(tvContact);
        contactRepo.add(mobileContact);
        contactRepo.add(mobileContact1);
        Assert.assertEquals(tvContact, contactRepo.get(1));
    }

    @org.junit.Test
    public void delete() {
        ArrayList <Contact>contactArrayList = new ArrayList<>();

         contactArrayList.add(mobileContact);
        contactArrayList.add(mobileContact1);

        ContactRepo contactRepo = new ContactRepo();
        contactRepo.add(tvContact);
        contactRepo.add(mobileContact);
        contactRepo.add(mobileContact1);
        contactRepo.delete(0);
        Assert.assertEquals(contactArrayList, Arrays.asList(contactRepo.getValues()));
    }

    @org.junit.Test
    public void deleteById() {
        ArrayList <Contact>contactArrayList = new ArrayList<>();
        contactArrayList.add(tvContact);
        contactArrayList.add(mobileContact1);
        ContactRepo contactRepo = new ContactRepo();
        contactRepo.add(tvContact);
        contactRepo.add(mobileContact);
        contactRepo.add(mobileContact1);
        contactRepo.deleteById(2);
        Assert.assertEquals(contactArrayList, Arrays.asList(contactRepo.getValues()));


    }


}