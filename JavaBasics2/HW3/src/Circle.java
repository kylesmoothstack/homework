public class Circle implements ShapeInterface{
    /**
     * 
     * @param rad radius of circle
     */
    Circle(Double rad){
        radius = rad;
        area = null;
    }

    /**
     * calculates area of circle
     */
    public void calculateArea(){
        area = 3.14 * radius * radius;
    }

    /**
     * displays area of circle
     */
    public String display(){
        if(area == null)
            return "area unknown. please calculate area.";
        else
            return "Area of the circle is " + area + ".";
    }

    private Double radius;
    private Double area;
}
