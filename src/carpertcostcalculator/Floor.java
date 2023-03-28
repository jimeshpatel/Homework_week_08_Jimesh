package carpertcostcalculator;

/**
 * Write a class with the name Floor. The class needs two fields (instance variables) with name
 * width and length of type double.
 */
public class Floor {
    double width;
    double length;

    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {

            this.length = 0;
        } else {

            this.length = length;
        }
    }
    public double getArea() {
        return this.width * this.length;
    }
}