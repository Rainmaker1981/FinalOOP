public class Trapezoid {
    // data attributes
    private double top;
    private double bottom;
    private double height;

    // constructors
    // default
    public Trapezoid() {
        this.setTop(-1);
        this.setBottom(-1);
        this.setHeight(-1);
    }

    // regular
    public Trapezoid(double top, double bottom, double height) {
        this.setTop(top);
        this.setBottom(bottom);
        this.setHeight(height);
    }

    // helpers
    // .5 * (b1 + b2) * h --> Must be greater than zero
    public double getArea() {
        double output = -1;
        if (this.getTop() > 0 && this.getBottom() > 0 && this.getHeight() > 0) {
            output = .5 * this.getHeight() * (this.getTop() + this.getBottom());
        } else if (this.getHeight() == 0) {
            System.out.println("Nice line, bro");
        } else if (this.getTop() == 0 || this.getBottom() == 0) {
            System.out.println("Nice triangle, Broski");
        }
        return output;
     }


    // getters
    public double getTop() {
        return this.top;
    }

    public double getBottom() {
        return this.bottom;
    }

    public double getHeight() {
        return this.height;
    }

    // setters
    public void setTop(double top) {
        this.top = top;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // to string
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Trapezoid\n\tTop: ").append(this.getTop());
        output.append("\n\tBottom: ").append(this.getBottom());
        output.append("\n\tHeight: ").append(this.getHeight());
        output.append("\n");
        return output.toString();
    }
}
