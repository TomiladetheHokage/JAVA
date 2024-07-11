import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeopoliticalZonesTest {
    @Test
    public void testGeopoliticalZones() {
        GeopoliticalZones state = GeopoliticalZones.NORTH_CENTAL;
        String statee = "Lagos";
        String geoZone = state.findGeoPoliticalZone("Lagos");
        assertEquals("SOUTH_WEST", geoZone);
    }


}