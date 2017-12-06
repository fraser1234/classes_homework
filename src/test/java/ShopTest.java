import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop myShop;
    Item shirt;
    Item bottoms;
    Item shoes;
    Item extras;
    Item socks;
    Item pants;

    @Before
    public void before(){
        myShop = new Shop(4);
        shirt = new Item("Tommy Hilfiger");
        bottoms = new Item("Levi's");
        shoes = new Item("Dune");
        extras = new Item("Wash Bag");
        socks = new Item("White");
        pants = new Item("Ted Baker");

    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, myShop.getStockCount());
    }

    @Test
    public void canAddStock(){
        myShop.addStock(shirt);
        assertEquals(1, myShop.getStockCount());
    }

    @Test
    public void cantAddWhenCapacity() {
        myShop.addStock(shirt);
        myShop.addStock(extras);
        myShop.addStock(bottoms);
        myShop.addStock(shoes);
        myShop.addStock(pants);
        assertEquals(4, myShop.getStockCount());
    }

    @Test
    public void overCapacity(){
        myShop.addStock(shirt);
        myShop.addStock(extras);
        myShop.addStock(bottoms);
        myShop.addStock(shoes);
        myShop.addStock(pants);
        assertEquals(false, myShop.ifFull());
    }

    @Test
    public void underCapacity(){
        myShop.addStock(shirt);
        myShop.addStock(extras);
        myShop.addStock(bottoms);
        myShop.addStock(shoes);
        myShop.addStock(pants);
        assertEquals(false, myShop.ifFull());
    }


}
