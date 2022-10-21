package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class FlowerStoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;
    private Store store;
    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
        store = new Store();

    }

    @Test
    public void testStore() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Tulip();
        FlowerPack pack = new FlowerPack(flower, quantity);
        flower.setPrice(price);
        store.addPack(pack);
        store.addBucket(flowerBucket);
        Assertions.assertTrue(store.search(FlowerType.TULIP));
        Assertions.assertFalse(store.search(FlowerType.ROSE));

    }
}
