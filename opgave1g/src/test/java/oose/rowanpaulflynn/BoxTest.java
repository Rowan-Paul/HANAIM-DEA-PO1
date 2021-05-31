package oose.rowanpaulflynn;

import oose.rowanpaulflynn.exceptions.BoxTooHeavyException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoxTest {
    private final String item = "cookies";
    private final int quantity = 2;
    private final int itemWeight = 5;
    private final int illegalItemWeight = 4200;
    private final int illegalQuantity = 500;

    @Test
    public void getTotalWeightTest() throws BoxTooHeavyException {
        // Arrange
        Box box = new Box(item, quantity, itemWeight);
        int expected = 10;

        // Act
        int result = box.getTotalWeight();

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void createBoxTooHeavyTest() throws BoxTooHeavyException {
        Assertions.assertThrows(BoxTooHeavyException.class, () -> {
            new Box("dog", quantity, illegalItemWeight);
        });
    }

    @Test
    public void createBoxTooHeavyAfterInitializationTest() throws BoxTooHeavyException {
        Assertions.assertThrows(BoxTooHeavyException.class, () -> {
            Box box = new Box("dog", quantity, itemWeight);

            box.setQuantity(illegalQuantity);
        });
    }

    @Test
    public void createBoxTooHeavyItemTest() throws BoxTooHeavyException {
        Assertions.assertThrows(BoxTooHeavyException.class, () -> {
            Box box = new Box("dog", quantity, itemWeight);

            box.setItemWeight(illegalItemWeight);
        });
    }
}
