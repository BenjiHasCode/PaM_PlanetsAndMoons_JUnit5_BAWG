package Basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoonTest {
    @Test
    void constructorTest(){
        Point point = new Point(1, 2, 3);
        Planet earth = new Planet(point, null, "Earth");
        Moon moon = new Moon(point, earth, "Moon");

        assertNotNull(moon);
        assertEquals(point, moon.getPoint());
        assertEquals(earth, moon.getOrbits());
        assertEquals("Moon", moon.getName());
    }
}