public class Wand {

    String woodType;
    String color;
    int length;

    Wand(String woodType, String color, int length) {
        this.woodType = woodType;
        this.color = color;
        this.length = length;
    }

    @Override

    public String toString(){
        return "woodType: " + woodType + ", color: " + color + ", length: " + length;
    }
}
