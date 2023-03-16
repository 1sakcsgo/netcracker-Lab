package org.example.entity;

import java.time.LocalDate;
/**
 * Класс сущности контакт
 * @author Ilya Korobko
 *
 */
public class Contact {
    /**
     * поле уникального индетификатора контакта
     */
    private int id;
    /**
     * поле для хранения даты начала контакта
     */
    private LocalDate startDate;
    /**
     * поле для хранения даты окончания контакта
     */
    private LocalDate finishDate;
    /**
     * поле для хранения номера контакта
     */
    private int numberContact;
    /**
     * поле для хранения сущности пользователь
     */
    private User user;
    /**
     * поле для хранения счетчика
     */
    protected static int count = 1;



    public Contact(LocalDate startDate, LocalDate finishDate, int numberContact, User user) {
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.numberContact = numberContact;
        this.user = user;
        this.id = count++;
    }

    /**
     * метод служит для получения уникального индетификатора контакта
     * @return уникальный индетификатор
     */
    public int getId() {
        return id;
    }


    /**
     * метод служит для получения даты начала контакта
     * @return дата начала контакта
     */
    public LocalDate getStartDate() {
        return startDate;
    }



    /**
     * метод служит для получения даты окончания контакта
     * @return дата окончания контакта
     */
    public LocalDate getFinishDate() {
        return finishDate;
    }



    /**
     * метод служит для получения номера контакта
     * @return номера контакта
     */
    public int getNumberContact() {
        return numberContact;
    }




}
