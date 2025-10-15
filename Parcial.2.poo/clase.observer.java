import java.util.ArrayList;
import java.util.List;

class Observable {
    protected List<Observer> observers;

    public Observable() {
        observers = new ArrayList<>();
    }

// para que las clases observable y observer se relacionen
    public void agregarObserver(Observer obs) {
        observers.agregarObserver(obs);
        obs.setObservable(this);
        System.out.println(obs.getDescripcion() + " está observando " + this.getDescripcion());
    }

    // metodo de la clase observable
    public void notificarObservers(int value) {
        for (Observer obs : observers) {
            obs.notificarObservers(value);
        }
    }


    public String getDescripcion() {
        return "Observable";
    }
}


class Observer {
    protected Observable observable;

    public void setObservable(Observable obs) {
        this.observable = obs;
    }

    // metodo para cambiar un valor
    public void notificarObservers(int value) {
    }

    public String getDescripcion() {
        return "Observer";
    }
}
