import java.util.ArrayList;
import java.util.List;

import Observer.Observer;

public class Controlador {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o){
        this.observers.add(o);
    }

    public void notificar(){
        for(Observer o :observers){
            o.update();
        }
    }

}
