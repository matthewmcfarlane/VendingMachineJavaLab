package machine.parts;

import coin.Coin;

import java.util.ArrayList;

public class CoinReturn {

    public ArrayList<Coin> coins;

    public CoinReturn() {
        this.coins = new ArrayList<>();

    }

    public void addCoin(Coin coin){
        this.coins.add(coin);
    }

    public double getTotal(){
        double total = 0.0;
        for(Coin coin : this.coins){
            total += coin.getCoinValue();
        }
        return total;
    }

}
