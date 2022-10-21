package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    public List<FlowerPack> packs = new ArrayList<>();

    public void add(FlowerPack pack){
        packs.add(pack);
    }
    public double getPrice() {
        double result = 0;
        for (FlowerPack pack : packs) {
            result += pack.getPrice();
        }

        return result;
    }
}
