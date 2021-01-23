
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class Card{
    public String suit;
    public int num;

    public Card(String suit, int num) {
        this.suit = suit;
        this.num = num;
    }

    @Override
    public String toString() {
        return "[" + suit + " " + num + "]";
    }
}
class DeskCard{
    //创造一副牌
    public static final String[] suits = {"♥","♠","♦","♣"};
    public List<Card> card(){
        List<Card> porkList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                Card card = new Card(suits[i],j);
                porkList.add(card);
            }

        }
        return porkList;
    }
    //洗牌
    public void washCard(List<Card> cards){
        for (int i = cards.size() - 1; i > 0; i--) {
            Random rd = new Random();
            int rand = rd.nextInt(i);
            swap(cards,i,rand);
        }
    }
    public void swap(List<Card> cards,int i,int j){
        Card tmp = cards.get(i);
        cards.set(i,cards.get(j));
        cards.set(j,tmp);
    }
}

public class PorkCard {
    public static void main(String[] args) {
        DeskCard dc = new DeskCard();
        List<Card> cards = dc.card();
        dc.washCard(cards);
        System.out.println(cards);

        List<List<Card>> hands = new ArrayList<>();
        List<Card> hand1 = new ArrayList<>();
        List<Card> hand2 = new ArrayList<>();
        List<Card> hand3 = new ArrayList<>();
        hands.add(hand1);
        hands.add(hand2);
        hands.add(hand3);

        //发牌
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                Card card = cards.remove(0);
                hands.get(i).add(card);
            }
        }

        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println(hand3);

        System.out.println(cards);
    }




}
