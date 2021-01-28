import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, RankType.QUEEN);
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.QUEEN, card.getRank());
    }

    @Test
    public void queenHasValue10(){
        assertEquals(10, card.getValueFromEnum());
    }

    @Test
    public void canGetAllSuits() {
        SuitType[] suits = SuitType.values();
        for (SuitType suit : suits) {
            System.out.println(suit);
        }
    }

    @Test
    public void canGetSuitValue() {
        RankType rank = RankType.valueOf("SEVEN");
        System.out.println(rank);
    }

}
