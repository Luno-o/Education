public class CeilingFan {
    public static final int HIGHT = 3;
    public static final int MEDIUM = 2;
    public static final int LOW  = 1;
    public static final int OFF = 0;
    String room;
    int speed;
    public CeilingFan(String room){
        this.room = room;
        speed = OFF;
    }
    public void hight(){
        speed = HIGHT;
        System.out.println("Fan speed " + speed + " in " + room );

    }
    public void medium(){
        speed = MEDIUM;
        System.out.println("Fan speed " + speed + " in " + room );
    }
    public void low(){
        speed = LOW;
        System.out.println("Fan speed " + speed + " in " + room );
    }
    public void off(){
        speed = OFF;
        System.out.println("Fan speed " + speed + " in " + room );
    }
    public int getSpeed(){
        return speed;
    }
}
