import coin.Coin;
import coin.CoinType;
import org.junit.Before;
import org.junit.Test;
import products.Product;
import products.Sweets;
import machine.parts.CoinReturn;
import machine.parts.Drawer;
import machine.parts.DrawerCodes;
import machine.VendingMachine;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class VendingMachineTest {



    private CoinReturn coinReturn;
    private Drawer drawerA1;
    private Sweets sweet;
    private Coin coin1p;
    private Coin coin2p;
    private Coin coin5p;
    private Coin coin10p;
    private Coin coin20p;
    private Coin coin50p;
    private Coin coin1pnd;
    private Coin coin2pnd;
    private ArrayList<Drawer> drawers;
    private VendingMachine vendingMachine;


    @Before
    public void before(){

        coin1p = new Coin(CoinType.ONEPENCE);
        coin2p = new Coin(CoinType.TWOPENCE);
        coin5p = new Coin(CoinType.FIVEPENCE);
        coin10p = new Coin(CoinType.TENPENCE);
        coin20p = new Coin(CoinType.TWENTYPENCE);
        coin50p = new Coin(CoinType.FIFTYPENCE);
        coin1pnd = new Coin(CoinType.ONEPOUND);
        coin2pnd = new Coin(CoinType.TWOPOUND);
        sweet = new Sweets("StarBar");
        drawerA1 = new Drawer(DrawerCodes.A1, 2.10);
        drawerA1.addProduct(sweet);
        drawers = new ArrayList<>();
        coinReturn = new CoinReturn();
        vendingMachine = new VendingMachine(drawers, coinReturn);

    }

    @Test
    public void canAddCoin(){
        vendingMachine.addCoin(coin1p);
        assertEquals(0.0, vendingMachine.getCredit(), 0.01);
        vendingMachine.addCoin(coin1pnd);
        vendingMachine.addCoin(coin1pnd);
        assertEquals(2.0, vendingMachine.getCredit(), 0.01);
        assertEquals(0.01, vendingMachine.getCoinReturn().getTotal());

    }

    @Test
    public void canSell() {
        vendingMachine.addCoin(coin2pnd);
        vendingMachine.addCoin(coin10p);
        vendingMachine.sellProduct(sweet);
        assertEquals(0, drawerA1.)
    }
}
