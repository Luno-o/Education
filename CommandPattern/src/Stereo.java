public class Stereo {
String room;
    Stereo(String room){
        this.room = room;
    }
    public void on(){
        System.out.println("Stereo is on in " + room);
    }
    public void off(){
        System.out.println("Stereo is off in " + room);
    }
    public void setCD(){
        System.out.println("Stereo set CD in "+ room);
    }
    public void setDVD(){
        System.out.println("Stereo set DVD in " + room);
    }
    public void setRadio(){
        System.out.println("Stereo set Radio in " + room);
    }
    public void setVolume(int value){
        System.out.println("Volume set on " + value + " in " + room);
    }
}

