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
    private String sex;
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

    public User() {
    }

    public User(String fio, LocalDate birthDate, String sex, String numberAndSeriesPasport) {

        this.fio = fio;
        this.birthDate = birthDate;
        this.sex = sex;
        this.numberAndSeriesPasport = numberAndSeriesPasport;
        this.age = Period.between(birthDate, LocalDate.now()).getYears();
        this.id = counter++;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNumberAndSeriesPasport() {
        return numberAndSeriesPasport;
    }

    public void setNumberAndSeriesPasport(String numberAndSeriesPasport) {
        this.numberAndSeriesPasport = numberAndSeriesPasport;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
