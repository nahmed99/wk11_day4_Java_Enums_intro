import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS);
    }


    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

//    @Test
//    public void suitCanBeMispelled() {
//        card = new Card("Heeearrts");
//        assertEquals("Heeearrts", card.getSuit());
//    }




}
