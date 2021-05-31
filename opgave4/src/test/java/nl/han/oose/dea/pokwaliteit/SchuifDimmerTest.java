package nl.han.oose.dea.pokwaliteit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchuifDimmerTest {
    private SchuifDimmer dimmer;

    @BeforeEach
    public void setUp() {
        dimmer = new SchuifDimmer();
    }

    @Test
    public void linksNaRechtsIsNul() {
        assertEquals(1, dimmer.rechts());
        assertEquals(0, dimmer.links());
    }

    @Test
    public void eenKeerLinksIsNul() {
        assertEquals(0, dimmer.links());
    }

    @Test
    public void vijfKeerRechtsIsVijf() {
        dimmer.rechts();
        dimmer.rechts();
        dimmer.rechts();
        dimmer.rechts();

        assertEquals(5, dimmer.rechts());
    }

    @Test
    public void zesKeerRechtsIsVijf() {
        dimmer.rechts();
        dimmer.rechts();
        dimmer.rechts();
        dimmer.rechts();
        dimmer.rechts();

        assertEquals(5, dimmer.rechts());
    }
}
