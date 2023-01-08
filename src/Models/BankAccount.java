package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {

    private long card;
    private int balance;
    private long oldCard;

    /**
     * Конструктор класса
     */
    public BankAccount() {
        this.card = oldCard + 1;
        oldCard = this.card;
        balance = 1000;
    }

    /**
     * Возвращает строку с информацией об аккаунте
     *
     * @return
     */
    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }

    /**
     * Возвращает номер карты
     *
     * @return
     */
    public long getCard() {
        return card;
    }

    /**
     * Возвращает текущий баланс
     *
     * @return
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Изменяет баланс
     *
     * @param balance
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
