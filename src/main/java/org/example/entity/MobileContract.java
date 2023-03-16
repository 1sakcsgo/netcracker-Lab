package org.example.entity;

import java.time.LocalDate;
/**
 * Класс сущности контакт на мольную связь
 * @author Ilya Korobko
 *
 */
public class MobileContract extends Contract {
    /**
     * поле для хранения количества минут
     */
    private int countMinuts;
    /**
     * поле для хранения количества смс
     */
    private int countSMS;
    /**
     * поле для хранения количества трафика
     */
    private int countTrafic;


    public MobileContract(LocalDate startDate, LocalDate finishDate, int numberContact, User user, int countMinuts, int countSMS, int countTrafic) {
        super(startDate, finishDate, numberContact, user);
        this.countMinuts = countMinuts;
        this.countSMS = countSMS;
        this.countTrafic = countTrafic;
    }
    /**
     * метод служащий для получения количества минут
     * @return количество минут
     */
    public int getCountMinuts() {
        return countMinuts;
    }


    /**
     * метод служащий для получения количества смс
     * @return количество смс
     */
    public int getCountSMS() {
        return countSMS;
    }

    /**
     * метод служащий для получения количества трафика
     * @return количество трафика
     */

    public int getCountTrafic() {
        return countTrafic;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MobileContract that = (MobileContract) o;

        if (getId() != that.getId()) return false;
        if (getCountMinuts() != that.getCountMinuts()) return false;
        if (getStartDate() != that.getStartDate()) return false;
        return getCountTrafic() == that.getCountTrafic();
    }

    @Override
    public int hashCode() {
        int result = getCountMinuts();
        result = 31 * result + getCountSMS();
        result = 31 * result + getCountTrafic();
        return result;
    }
}
