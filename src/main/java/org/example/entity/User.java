package org.example.entity;

import java.time.LocalDate;
import java.time.Period;
/**
 * Класс сущности пользователь
 * @author Ilya Korobko
 *
 */
public class User {
    /**
     * уникальный индетификатор пользователя
     */
    private  int id;
    /**
     * поля для хранения имени,фамилии,отчества
     */
    private String fio;
    /**
     *поле для хранения даты рождения
     */
    private LocalDate birthDate;
    /**
     *поле для хранения пола
     */
    private char sex;
    /**
     * поле для хранения серии и номера паспорта
     */
    private String numberAndSeriesPasport;
    /**
     * поле для хранения возраста
     */
    private int age;
    /**
     * поле для хранения счетчика
     */
    protected static int counter = 1;

    public User(String fio, LocalDate birthDate, char sex, String numberAndSeriesPasport) {

        this.fio = fio;
        this.birthDate = birthDate;
        this.sex = sex;
        this.numberAndSeriesPasport = numberAndSeriesPasport;
        this.age = Period.between(birthDate, LocalDate.now()).getYears();
        this.id = counter++;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", birthDate=" + birthDate +
                ", sex=" + sex +
                ", numberAndSeriesPasport='" + numberAndSeriesPasport + '\'' +
                ", age=" + age +
                '}';
    }
}
