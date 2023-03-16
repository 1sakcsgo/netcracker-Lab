package org.example.entity;

import java.time.LocalDate;
/**
 * Класс сущности контакт на цифровое телевидение
 * @author Ilya Korobko
 *
 */
public class TvContact extends Contact{
    /**
     * поле для хранения пакета каналов
     */
    private String channelPackage;

    public TvContact(LocalDate startDate, LocalDate finishDate, int numberContact, User user, String channelPackage) {
        super(startDate, finishDate, numberContact, user);
        this.channelPackage = channelPackage;
    }
    /**
     * метод служащий для получения пакета каналов
     * @return пакет канелов
     */
    public String getChannelPackage() {
        return channelPackage;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TvContact)) return false;

        TvContact tvContact = (TvContact) o;
        if (getId() != tvContact.getId()) return false;
        return getChannelPackage() != null ? getChannelPackage().equals(tvContact.getChannelPackage()) : tvContact.getChannelPackage() == null;
    }

    @Override
    public int hashCode() {
        return getChannelPackage() != null ? getChannelPackage().hashCode() : 0;
    }
}
