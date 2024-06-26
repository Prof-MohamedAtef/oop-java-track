package twentyfivearish;

public class ConstructorIllustration {
    // constructor
    // this

    // fields - properties - attributes
    int x = 0, y = 0;

    public ConstructorIllustration(int x_, int y_) { // paramterized constructor
        this.x = x_;
        this.y = y_;
    }

    public ConstructorIllustration() { // parameterless constructor

    }

    int draw() {
        return 0;
    }

    int addNumbers(int x, int y) {
        return x + y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
}
