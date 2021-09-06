package ex03;

public class CardCompany {
    private static CardCompany instance = new CardCompany();
    private int serialNum = 10000;

    private CardCompany() {}

    public static CardCompany getInstance() {
        return instance;
    }

    public Card createCard() {
        return (new Card(++serialNum));
    }
}
