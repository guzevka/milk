import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class TrafficLight implements Iterable<String>{
    Color color;
    Color currColor;
    public static final Color RED = new Color("RED");
    public static final Color BLACK = new Color("BLACK");
    public static final Color GREEN = new Color("GREEN");

    static {
        BLACK.next = RED;
        RED.next = GREEN;
        GREEN.next = RED;
    }
    public TrafficLight() {
        this.color = BLACK;
    }
    public void off() {
        this.color = BLACK;
    }
    public void on() {
        this.color = GREEN;
    }
    public String next() {

        currColor = color.next;
        color=currColor;

        return currColor.toString();
    }

    @Override
    public String toString() {
        return color.toString();
    }

    @Override
    public Iterator<String> iterator() {
        return new TrafficLightIterator();
    }
    public class TrafficLightIterator implements Iterator<String> {
        @Override
        public boolean hasNext() {
            return true;
        }
        @Override
        public String next() {
            return TrafficLight.this.next();
        }
    }
}
