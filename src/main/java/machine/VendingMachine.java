package machine;

import coin.Coin;
import coin.CoinType;
import machine.parts.CoinReturn;
import machine.parts.Drawer;

import java.util.ArrayList;

public class VendingMachine {


    private double credit;
    private ArrayList<Drawer> drawers;
    private CoinReturn coinReturn;

    public VendingMachine(ArrayList<Drawer> drawers, CoinReturn coinReturn) {
        this.drawers = drawers;
        this.coinReturn = coinReturn;
        this.credit = 0.0;
    }

    public boolean checkCoinValid(Coin coin){
        return coin.getCoinType() != CoinType.ONEPENCE && coin.getCoinType() != CoinType.TWOPENCE;

    }

    public void addCoin(Coin coin){
        if (checkCoinValid(coin)){
            this.credit += coin.getCoinValue();
        }else{
            this.coinReturn.addCoin(coin);
        }
    }

    public double getCredit() {
        return credit;
    }


    public CoinReturn getCoinReturn() {
        return coinReturn;
    }


}
