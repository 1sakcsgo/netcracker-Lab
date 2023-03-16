package org.example.repo;

import org.example.entity.Contract;
import org.example.exceptions.ContractNotFound;

import java.util.Arrays;

/**
 * Класс служит для хранения контрактов
 * @author Ilya Korobko
 *
 */
public class ContractRepo {


    /**
     * поле для хранения контрактов
     */
    private Contract[]values;

    public ContractRepo() {
        this.values = new Contract[0];
    }

    /**
     *  метод добавляет контракт в репозиторий
     * @param contract это обьект класса контракт
     * @return возвращает true при успешном добавлении
     */
    public boolean add(Contract contract){
        try {
            Contract[]temp=values;
            values=new Contract[temp.length+1];
            System.arraycopy(temp,0,values,0,temp.length);
            values[values.length-1]= contract;
        }catch (ClassCastException ex){
            ex.printStackTrace();
        }
        return false;
    }

    /**
     *  метод возвращает кобьект контракт по id
     * @param id уникальный индетификатор контактов
     * @return  обьект контакта
     */
     public Contract get(int id){

        return Arrays.stream(values).filter(item -> item.getId()==id).findFirst().orElseThrow(()->new  ContractNotFound("Contract not found with id: " + id));
     }


    /**
     * Метод предназначен для удаления из репозитория
     * @param index номер элемента
     *
     */
     public void delete(int index){
        try{
            Contract[]temp=values;
            values=new Contract[temp.length-1];
            System.arraycopy(temp,0,values,0,index);
            int amountElemAfterIndex = temp.length-index-1;
            System.arraycopy(
                    temp,index+1,
                    values,index,
                    amountElemAfterIndex);}
        catch (ClassCastException ex){
            ex.printStackTrace();
        }
     }

    /**
     * Метод служащий для удаления контракта по индетификатору
     * @param id уникальный индетификатор контактов
     */
     public void deleteById(int id){
        for (int i =0;i< values.length;i++){
            if(values[i].getId()==id){
                delete(i);
            }
        }
     }

    /**
     * Метод возвращающий массив контрактов
     * @return массив котактов
     */
    public Contract[] getValues() {
        return values;
    }

    /**
     * Метод служащий для установки значения
     * @param values массив контрактов
     */
    public void setValues(Contract[] values) {
        this.values = values;
    }

}
