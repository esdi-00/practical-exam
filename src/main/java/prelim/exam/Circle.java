package prelim.exam;

public class Circle {

    private int circumference;
    private int area;


    Circle(int circumference, int area){
        this.circumference = circumference;
        this.area = area;
    }
    public int getCircumference(){
        return circumference;
    }

    public int getArea() {
        return area;
    }


    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }

    public void setArea(int area) {
        this.area = area;
    }


}


