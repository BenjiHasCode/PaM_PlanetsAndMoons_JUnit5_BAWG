package Basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StarTest {
    @Test
    void constructorTest(){
        Point point = new Point(1, 2, 3);
        Star sun = new Star(point, null, "Sun");

        assertNotNull(sun);
        assertEquals(point, sun.getPoint());
        assertEquals("Sun", sun.getName());
    }

    @Test
    void createPlanetTest(){
        Star sun = new Star(new Point(1,2,3), null, "Sun");
        sun.createPlanet(new Point(2,3,4), "Earth");

        assertEquals(sun.getPlanets().size(), 1);
        assertEquals("Earth", sun.getPlanets().get(0).getName());
        assertEquals(sun, sun.getPlanets().get(0).getOrbits());
    }

    @Test
    void getPlanetsTest(){
        Star sun = new Star(new Point(1,2,3), null, "Sun");

        assertNotNull(sun.getPlanets());
    }
}