package org.example.repo;

import org.example.entity.Contract;
import org.example.entity.MobileContract;
import org.example.entity.TvContract;
import org.example.entity.User;
import org.example.parser.CsvParser;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ContractRepoTest {
    private static final User user= new User("Коробко Илья Владимирович", LocalDate.of(2001, 1, 1),"w","2661 45616 166");
    private static final User user2= new User("Данченко Денис Евгеньевич", LocalDate.of(2003, 3, 4),"m","2661 45dfdsfs16 166");
    private static final TvContract tvContact = new TvContract(LocalDate.of(2023, 3, 4),LocalDate.of(2022, 10, 17),8548513,user,"Full");
    private static final MobileContract mobileContact = new MobileContract(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
    private static final MobileContract mobileContact1 = new MobileContract(LocalDate.of(2008, 3, 4),LocalDate.of(2010, 10, 17),8458513,user2,800,100,28);
    ContractRepo contractRepo =new ContractRepo();
    @org.junit.Test
    public void add() {
        ArrayList<Contract> contractArrayList = new ArrayList<>();
        contractArrayList.add(tvContact);
        contractArrayList.add(mobileContact);
        contractArrayList.add(mobileContact1);
        ContractRepo contractRepo = new ContractRepo();
        contractRepo.add(tvContact);
        contractRepo.add(mobileContact);
        contractRepo.add(mobileContact1);

        Assert.assertEquals(contractArrayList, Arrays.asList(contractRepo.getValues()));
    }

    @org.junit.Test
    public void get() {
        ContractRepo contractRepo = new ContractRepo();
        contractRepo.add(tvContact);
        contractRepo.add(mobileContact);
        contractRepo.add(mobileContact1);
        Assert.assertEquals(tvContact, contractRepo.get(1));
    }

    @org.junit.Test
    public void delete() {
        ArrayList <Contract> contractArrayList = new ArrayList<>();

         contractArrayList.add(mobileContact);
        contractArrayList.add(mobileContact1);

        ContractRepo contractRepo = new ContractRepo();
        contractRepo.add(tvContact);
        contractRepo.add(mobileContact);
        contractRepo.add(mobileContact1);
        contractRepo.delete(0);
        Assert.assertEquals(contractArrayList, Arrays.asList(contractRepo.getValues()));
    }

    @org.junit.Test
    public void deleteById() {
        ArrayList <Contract> contractArrayList = new ArrayList<>();
        contractArrayList.add(tvContact);
        contractArrayList.add(mobileContact1);
        ContractRepo contractRepo = new ContractRepo();
        contractRepo.add(tvContact);
        contractRepo.add(mobileContact);
        contractRepo.add(mobileContact1);
        contractRepo.deleteById(2);
        Assert.assertEquals(contractArrayList, Arrays.asList(contractRepo.getValues()));


    }
    @org.junit.Test
    public void SearchContratByCriteria(){
        ContractRepo contractRepo = new ContractRepo();
        contractRepo.add(tvContact);
        contractRepo.add(mobileContact);
        contractRepo.add(mobileContact1);
        ContractRepo newRepo =  contractRepo.SearchContratByCriteria(x -> x.getUser().getFio().equals("Данченко Денис Евгеньевич"));
        long[] expectedIds = new long[]{2,3};
        long[] actualIds = Arrays.stream(newRepo.getValues()).filter(Objects::nonNull).mapToLong(Contract::getId).toArray();
        assertEquals(2, newRepo.getValues().length);
        assertArrayEquals(expectedIds, actualIds);
    }
    @org.junit.Test
    public void sort(){
        ContractRepo contractRepo = new ContractRepo();
        Comparator<Contract> comparator = Comparator.comparing(Contract::getId);
        contractRepo.add(tvContact);
        contractRepo.add(mobileContact);
        mobileContact.setId(10L);
        contractRepo.add(mobileContact1);
        System.out.println(Arrays.toString(contractRepo.getValues()));
        contractRepo.sort(comparator);
        System.out.println(Arrays.toString(contractRepo.getValues()));
    }

    @Test
    public void loadToRepo(){
        CsvParser parser = new CsvParser();
        File csv = new File("src/test/java/org/example/repo/contracts.csv");
        parser.loadToRepo(csv,contractRepo);
        assertEquals(7,contractRepo.size());
        System.out.println(Arrays.toString(contractRepo.getValues()));
    }


}