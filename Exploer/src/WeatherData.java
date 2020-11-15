import java.util.ArrayList;
import java.util.Observable;

// Собственная реализация Observer при изменении состояния одного объекта происходит автоматическое оповещение
// и обновление всех зависимых объектов
// субьект оповещаяет наблюдателей через единый интерфейс
//субьект ничего не знает о наблюдателях, кроме того, что они реализуют интерфейс Observer
//Возможен как запрос, так и доставка(Запрос считается более правильным)
// public class WeatherData implements Subject {
// стремимся к слабосвязанности. На базе слабосвязанных архитектур строятся гибкие ОО системы
//    private ArrayList observers;
public class WeatherData extends Observable{

    private float temperature;
    private float humidity;
    private float pressure;
//
    public WeatherData() {
    }

    public void measurementChanged() {
setChanged();
notifyObservers();
    }

    public void setMesurement(float temperature,float humidity,float pressure){

       this.temperature = temperature;
       this.humidity = humidity;
       this.pressure = pressure;
measurementChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }
}
