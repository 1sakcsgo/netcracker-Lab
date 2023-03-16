package org.example.repo;

import org.example.entity.Contact;

/**
 * Класс служит для хранения контактов
 * @author Ilya Korobko
 *
 */
public class ContactRepo {


    /**
     * поле для хранения контактов
     */
    private Contact[]values;

    public ContactRepo() {
        this.values = new Contact[0];
    }

    /**
     *  метод добавляет контакт в репозиторий
     * @param contact это обьект класса контакт
     * @return возвращает true при успешном добавлении
     */
    public boolean add(Contact contact){
        try {
            Contact[]temp=values;
            values=new Contact[temp.length+1];
            System.arraycopy(temp,0,values,0,temp.length);
            values[values.length-1]=contact;
        }catch (ClassCastException ex){
            ex.printStackTrace();
        }
        return false;
    }

    /**
     *  метод возвращает кобьект контакт по id
     * @param id уникальный индетификатор контактов
     * @return  обьект контакта
     */
     public Contact get(int id){
        Contact contact1 = null;
         for (Contact contact:values) {
             if(contact.getId()==id){
                 contact1=contact;
             }

         }
         return contact1;
     }

    /**
     * Метод предназначен для удаления из репозитория
     * @param index номер элемента
     *
     */
     public void delete(int index){
        try{
            Contact[]temp=values;
            values=new Contact[temp.length-1];
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
     * Метод служащий для удаления контакта по индетификатору
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
     * Метод возвращающий массив контактов
     * @return массив котактов
     */
    public Contact[] getValues() {
        return values;
    }

    /**
     * Метод служащий для установки значения
     * @param values массив контактов
     */
    public void setValues(Contact[] values) {
        this.values = values;
    }

}
