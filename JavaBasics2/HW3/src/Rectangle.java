public class Rectangle implements ShapeInterface{
    /**
     * 
     * @param len length of rectangle
     * @param hei height of rectangle
     */
    Rectangle(Double len, Double hei){
        length = len;
        height = hei;
        area = null;
    }

    /**
     * calculates area
     */
    public void calculateArea(){
        area = length * height;
    }

    /**
     * displays area
     */
    public String display(){
        if(area == null)
            return "area unknown. please calculate area.";
        else
            return "Area of the rectangle is " + area + ".";
    }

    private Double length;
    private Double height;
    private Double area;
}
