public class Main {
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();

        System.out.println(trafficLight);
        trafficLight.on();

        for(String s: trafficLight) {
            System.out.println(s);
        }

        trafficLight.off();
    }
}