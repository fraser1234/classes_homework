import java.util.ArrayList;

public class Shop {

    int capacity;
    ArrayList<Item> stock;

    public Shop(int inputCapacity) {
        this.capacity = inputCapacity;
        this.stock = new ArrayList<>();
    }

    public int getStockCount() {
        return this.stock.size();
    }


    public void addStock(Item item) {
        if (this.stock.size() < this.capacity) {
            this.stock.add(item);
        }
    }

    public boolean ifFull() {
        if (this.stock.size() > this.capacity) return true;
        return false;
    }

}
