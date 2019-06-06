public class Fan {
    public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius=5;
    private String color="blue";

    Fan(){

    }
    public int getSpeed(){
        return speed;
    }
    public boolean getOn(){
        return on;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setOn(boolean on){
        this.on=on;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String toString(){
        if(on) return "speed= "+speed+","+"color= "+color+","+"radius= "+radius+" fan is on";
        else return "color= "+color+","+"radius= "+radius+" fan is off";
    }
}
