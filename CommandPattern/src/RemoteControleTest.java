public class RemoteControleTest {
/*
Инкапсулирует запрос в ввиде объекта, делая возможной параметризацию
клиентских объектов с другими запросами, организацию очереди или регистрацию запросов,
а так же поддержку отмены операций.
Отделяет объект отдающий запросы от объекта умеющего их выполнять.
Объект инкапсулирует получателя с операцией.
Инициатор  вызывает метод execute() объекта команды, что приводит к выполнению соответсвующих оперций с получателем
Возможна параметризация инициаторов командами, в том числе и динамически.

 */
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light kitchenLight = new Light("Kitchen");
        Light livingRoomLight = new Light("LivingRoom");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living room");


        Command stereoOnWithCDCommand = ()->{stereo.on();stereo.setCD();stereo.setVolume(11);};

        remoteControl.setCommand(0, kitchenLight::on, livingRoomLight::off);
        remoteControl.setCommand(1,livingRoomLight::on,livingRoomLight::off);
        remoteControl.setCommand(2,garageDoor::up,garageDoor::down);
        remoteControl.setCommand(3,stereoOnWithCDCommand,stereo::off);


        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);


        System.out.println("\n\n\n\n\n\n\n\n\n\n");


CeilingFan ceilingFan = new CeilingFan("Living room");


remoteControl.setCommand(4,ceilingFan::low,ceilingFan::off);
remoteControl.setCommand(5,ceilingFan::medium,ceilingFan::off);

remoteControl.onButtonWasPushed(4);
remoteControl.offButtonWasPushed(4);

remoteControl.onButtonWasPushed(5);
remoteControl.offButtonWasPushed(5);


    }
}