import coin.Coin;
import coin.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

 private Coin coin;

    @Before
    public void before(){
        coin = new Coin(CoinType.ONEPOUND);
    }

    @Test
    public void canGetType(){
        assertEquals(CoinType.ONEPOUND, coin.getCoinType());
    }

    @Test
    public void canGetValue(){
        assertEquals(1.0, coin.getCoinValue(), 0.01);
    }

}