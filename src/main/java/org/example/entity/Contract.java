package org.example.entity;

import java.time.LocalDate;
/**
 * Класс сущности контракт
 * @author Ilya Korobko
 *
 */
public class Contract {
    /**
     * поле уникального индетификатора контракт
     */
    private Long id;
    /**
     * поле для хранения даты начала контракт
     */
    private LocalDate startDate;
    /**
     * поле для хранения даты окончания контракт
     */
    private LocalDate finishDate;
    /**
     * поле для хранения номера контракт
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

    public void setId(Long id) {
        this.id = id;
    }

    public Contract(LocalDate startDate, LocalDate finishDate, int numberContact, User user) {
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.numberContact = numberContact;
        this.user = user;
        this.id = (long) count++;
    }

    /**
     * метод служит для получения уникального индетификатора контракта
     * @return уникальный индетификатор
     */
    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * метод служит для получения даты начала контракта
     * @return дата начала контакта
     */
    public LocalDate getStartDate() {
        return startDate;
    }



    /**
     * метод служит для получения даты окончания контракта
     * @return дата окончания контакта
     */
    public LocalDate getFinishDate() {
        return finishDate;
    }



    /**
     * метод служит для получения номера контракта
     * @return номера контакта
     */
    public int getNumberContact() {
        return numberContact;
    }


    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", numberContact=" + numberContact +
                ", user=" + user +
                '}';
    }
}
