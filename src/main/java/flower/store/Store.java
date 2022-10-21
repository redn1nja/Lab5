package flower.store;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Store {
    @Getter @Setter
    private List<FlowerBucket> buckets = new ArrayList<>();
    @Getter @Setter
    private List<FlowerPack> packs = new ArrayList<>();
    public Store(){

    }
    public void addPack(FlowerPack pack){
        packs.add(pack);
    }

    public void addBucket(FlowerBucket bucket){
        buckets.add(bucket);
    }

    public boolean search(FlowerType flower) {
        for (FlowerPack pack : packs) {
            if (pack.getFlower().getFlowerType()==flower) {
                return true;
            }
        }
        for (FlowerBucket bucket: buckets) {
            for (FlowerPack pack : bucket.getPacks()) {
                if (pack.getFlower().getFlowerType()==flower) {
                    return true;
                }
            }
        }
        return false;
    }
}
