package hello.core.singleton;

public class StatefulService {

    private int price;

    public void order(int price, String name) {
        System.out.println("price = " + price + "name =" + name);

        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
