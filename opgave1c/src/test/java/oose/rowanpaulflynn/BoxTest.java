package oose.rowanpaulflynn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoxTest {
    private final String item = "cookies";
    private final int quantity = 2;
    private final int itemWeight = 5;
    
    @Test
    public void getTotalWeightTest() {
        // Arrange
        Box box = new Box(item, quantity, itemWeight);
        int expected = 10;

        // Act
        int result = box.getTotalWeight();

        // Assert
        Assertions.assertEquals(expected, result);
    }
}
