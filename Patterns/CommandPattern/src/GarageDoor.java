public class GarageDoor {
    GarageDoor(){}
    public void up(){
        System.out.println("Open garage door");
    }
    public void down(){
        System.out.println("Close garage door");
    }
    public void stop(){
        System.out.println("Stop garage door");
    }
    public void lightOn(){
        Light light = new Light("Garage");
        System.out.println("Garage"  );
    }
    public void lightOff(){}
}
