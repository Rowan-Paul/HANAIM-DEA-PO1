package nl.han.oose.dea.pokwaliteit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DraaiDimmerTest {
    private DraaiDimmer dimmer;

    @BeforeEach
    void setup() {
        dimmer = new DraaiDimmer();
    }

    @Test
    void eenKeerDraaienIsEen() {

        assertEquals(1, dimmer.draai());
    }

    @Test
    void vierKeerDraaienIsNul() {
        dimmer.draai();
        dimmer.draai();
        dimmer.draai();

        assertEquals(0, dimmer.draai());
    }

    @Test
    void vijfKeerDraaienIsEen() {
        dimmer.draai();
        dimmer.draai();
        dimmer.draai();
        dimmer.draai();

        assertEquals(1, dimmer.draai());
    }
}
