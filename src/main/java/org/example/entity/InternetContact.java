package org.example.entity;

import java.time.LocalDate;
/**
 * Класс сущности контакт на прооводной интернет
 * @author Ilya Korobko
 *
 */
public class InternetContact extends Contact{
    /**
     * поле для хранения скорости интернета
     *
     */
    private int speed;

    public InternetContact(int speed, LocalDate startDate, LocalDate finishDate, int numberContact, User user) {
        super(startDate,finishDate,numberContact,user);
        this.speed = speed;
    }

    /**
     * метод служащий для получения скорости интернета
     * @return скорость интернета
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * метод служащий для установки значения скорости интернета
     * @param speed скорость интергнета
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InternetContact that = (InternetContact) o;
        if (getId() != that.getId()) return false;
        if (getNumberContact() != that.getNumberContact()) return false;
        if (getFinishDate() != that.getFinishDate()) return false;

        return getSpeed() == that.getSpeed();
    }

    @Override
    public int hashCode() {
        return getSpeed();
    }
}
