package Basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {
    @Test
    void constructorTest(){
        Point point = new Point(1, 2, 3);
        Star sun = new Star(point, null, "Sun");
        Planet earth = new Planet(point, sun, "Earth");

        assertNotNull(earth);
        assertEquals(point, earth.getPoint());
        assertEquals(sun, earth.getOrbits());
        assertEquals("Earth", earth.getName());
    }

    @Test
    void createMoonTest(){
        Planet earth = new Planet(new Point(1,2,3), null, "Earth");
        earth.createMoon(new Point(2,3,4), "Moon");

        assertEquals(earth.getMoons().size(), 1);
        assertEquals("Moon", earth.getMoons().get(0).getName());
        assertEquals(earth, earth.getMoons().get(0).getOrbits());
    }

    @Test
    void getAmountOfMoonsTest(){
        Planet earth = new Planet(new Point(1,2,3), null, "Earth");
        earth.createMoon(new Point(1,2,3), "Moon");
        earth.createMoon(new Point(1,2,3), "Moon");
        earth.createMoon(new Point(1,2,3), "Moon");
        earth.createMoon(new Point(1,2,3), "Moon");

        assertEquals(4, earth.getAmountOfMoons());
    }

    @Test
    void calculateDistanceTest(){
        Planet earth = new Planet(new Point(1,2,3), null, "Earth");
        Planet mars = new Planet(new Point(100,223,341), null, "Mars");

        assertEquals(481.17, earth.calculateDistance(mars));
       // assertEquals(-1, mars.calculateDistance(earth));
    }
}