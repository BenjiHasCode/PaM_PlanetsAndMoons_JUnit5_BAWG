package Basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void constructorTest(){
        Point point = new Point(1, 2,3);

        assertNotNull(point);
        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
        assertEquals(3, point.getY());
    }

}