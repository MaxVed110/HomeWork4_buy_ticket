package Models;

import java.util.Date;

/**
 * Модель билета
 */
public class Ticket {

    private long id;
    private int place;
    private Date date;
    private int routeNumber;
    private int zoneStart;
    private int zoneStop;
    private int price;
    private boolean isValid;

    /**
     * Конструктор класса
     */
    public Ticket(int routeNumber, int place, int price, Date date, boolean isValid) {
        this.routeNumber = routeNumber;
        this.place = place;
        this.price = price;
        this.date = date;
        this.isValid = isValid;
    }

    /**
     * Возвращает данные билета в строке
     *
     * @return
     */
    @Override
    public String toString() {
        return "Ticket" +
                " Route Number " + routeNumber +
                ", Place " + place +
                ", Price " + price + " rub." +
                ", Date " + date +
                ", " + (isValid ? "Free" : "Busy");
    }

    /**
     * Возвращает данные билета построчно для печати
     *
     * @return
     */
    public String toPrint() {
        return "Ticket" +
                "\nRoute Number " + routeNumber +
                "\nPlace " + place +
                "\nPrice " + price + "rub." +
                "\nDate " + date;
    }

    /**
     * Возврвзает хэш данных билета
     *
     * @return
     */
    @Override
    public int hashCode() {
        return date.hashCode() ^ (routeNumber + place + price);
    }

    /**
     * Проверяет класс объекта
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return this.equals((Ticket) obj);
    }

    /**
     * Проверяет равенство (одинаковость) билетов
     *
     * @param ticket
     * @return
     */
    public boolean equals(Ticket ticket) {
        boolean isIt = ticket != null
                && ticket.getRouteNumber() == this.routeNumber
                && ticket.getPlace() == this.place
                && ticket.getPrice() == this.price
                && ticket.getDate() == this.date
                && ticket.hashCode() == this.hashCode();

        if (isIt) {
            return true;
        }
        return false;
    }

    /**
     * Возвращает номер маршрута
     *
     * @return
     */
    public int getRouteNumber() {
        return routeNumber;
    }

    /**
     * Возвращает номер места
     *
     * @return
     */
    public int getPlace() {
        return place;
    }

    /**
     * Возвращает стоимость
     *
     * @return
     */
    public int getPrice() {
        return price;
    }

    /**
     * Возвращает дату билета
     *
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     * Возвращает актуальность билета
     *
     * @return
     */
    public boolean getValid() {
        return isValid;
    }

    /**
     * Устанавливает актуальность билета
     *
     * @param valid
     */
    public void setValid(boolean valid) {
        isValid = valid;
    }

    /**
     * Устанавливает зону старта
     *
     * @param zoneStart
     */
    public void setZoneStart(int zoneStart) {
        this.zoneStart = zoneStart;
    }

    /**
     * Устанавливает зону окончания
     *
     * @param zoneStop
     */
    public void setZoneStop(int zoneStop) {
        this.zoneStop = zoneStop;
    }
}
