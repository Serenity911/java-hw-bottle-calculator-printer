import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    public WaterBottle bottle;

    @Before
    public void before() {
    bottle = new WaterBottle();
    }

    @Test
    public void volume_starts_at_100() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drinks_remove_10_from_volume() {
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void cannot_remove_10_from_volume_if_less_than_10() {
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.drink();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void bottle_can_be_empty() {
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void bottle_can_be_refilled_to_volume_100() {
        bottle.refill();
        assertEquals(100, bottle.getVolume());
    }

}
