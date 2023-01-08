package Models;

/**
 * Модель перевозчика
 */
public class Carrier {

    private int id;
    private int[] zones;
    private long cardNumber;

    /**
     * Конструктор класса
     */
    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    /**
     * Возвращает id перевозчика
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Возвращает номер карты
     *
     * @return
     */
    public long getCardNumber() {
        return cardNumber;
    }
}
