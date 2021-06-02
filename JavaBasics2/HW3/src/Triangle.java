public class Triangle implements ShapeInterface{
    /**
     * 
     * @param bas base length
     * @param hei height
     */
    Triangle(Double bas, Double hei){
        base  =bas;
        height = hei;
        area = null;
    }
    
    /**
     * calculates area
     */
    public void calculateArea(){
        area = .5 * base * height;
    }

    /**
     * displays area
     */
    public String display(){
        if(area == null)
            return "area unknown. please calculate area.";
        else
            return  "Area of the rectangle is " + area + ".";
    }

    private Double base;
    private Double height;
    private Double area;
}
