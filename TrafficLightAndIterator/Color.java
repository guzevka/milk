public class Color {
    public Color next;
    String color;
    public Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
