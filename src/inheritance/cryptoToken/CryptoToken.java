package inheritance.cryptoToken;

public class CryptoToken {
    private double price, quantity, marketCap, volume, circulatingSupply;
    private boolean isMineable;

    public CryptoToken(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public double getVolume() {
        return volume;
    }

    public double getCirculatingSupply() {
        return circulatingSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setCirculatingSupply(double circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }
    public double totalCost(){
        return price * quantity;
    }


    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                ", total cost =" + totalCost() +
                '}';
    }


}
