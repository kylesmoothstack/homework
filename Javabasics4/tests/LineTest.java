import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class LineTest {

    Line line = new Line(0, 1, 5, 6);


    @Test
    public void testGetSlope(){
        double slope = line.getSlope();
        assertEquals(slope, 1, .0001);
        assertNotEquals(slope, -1.5, .0001);
    }

    @Test
    public void testGetDistance(){
        double distance = line.getDistance();
        assertEquals(distance, 7.071068, .0001);
    }

    @Test
    public void testParallelTo(){
        Line line2 = new Line(0,0,1,1);
        Line line3 = new Line(1,2,0, 5);

        assertTrue(line.parallelTo(line2));
        assertFalse(line.parallelTo(line3));
    }
}
