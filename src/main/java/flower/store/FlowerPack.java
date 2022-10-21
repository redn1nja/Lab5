package flower.store;

import lombok.Getter;
import lombok.Setter;

public class FlowerPack {
    @Getter @Setter
    private Flower flower;
    @Getter @Setter
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public double getPrice() {
        return quantity * flower.getPrice();
    }

}
