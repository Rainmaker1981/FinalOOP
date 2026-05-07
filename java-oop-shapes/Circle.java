public class Circle {
    // Data attributes
    private double radius;

    // init/constructors
    // default constructor - NO PARAMETERS
    public Circle() {
        this.setRadius(-1);
    }

    // regular constructor - A parameter for each data attribute
    public Circle(double radius) {
        this.setRadius(radius);
    }

    // helpers
    public double getDiam() {
        double output = -1;
        if (this.getRadius() >= 0) {
            output = this.getRadius() * 2;
        }
        return output;
    }

    public double getCirc() {
        double output = -1;
        if (this.getRadius() >= 0) {
            output = this.getDiam() * Math.PI;
        }
        return output;
    }

    public double getArea() {
        double output = -1;
        if (this.getRadius() >= 0) {
            output = Math.PI * Math.pow(this.getRadius(), 2);
        }
        return output;
    }

    // getters
    public double getRadius() {
        return this.radius;
    }

    // setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // to string
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Circle\n\tRadius: ");
        output.append(this.getRadius());
        output.append("\n\tDiam: ");
        output.append(this.getDiam());
        output.append("\n\tCirc: ");
        output.append(this.getCirc());
        output.append("\n\tArea: ");
        output.append(this.getArea());
        output.append("\n");
        return output.toString();
    }
}
