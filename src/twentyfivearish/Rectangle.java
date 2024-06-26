package twentyfivearish;

public class Rectangle {


    int width = 0;
    int height = 0;


    // constructor
    Rectangle(){ //paramterless

    }

    Rectangle(int width_, int height_){  // parmaterized
        this.width = width_;
        this.height = height_;
    }

    int calculateArea(){
        return this.width * this.height;
    }
}