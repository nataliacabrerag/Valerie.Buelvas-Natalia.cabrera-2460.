import java.util.ArrayList;
import java.util.List;

class Observable {
    protected List<Observer> observers;

    public Observable() {
        observers = new ArrayList<>();
    }


    public void addObserver(Observer obs) {
        observers.add(obs);
        obs.setObservable(this);
        System.out.println(obs.getDescripcion() + " está observando " + this.getDescripcion());
    }

    // metodo de la clase observable
    public void notifyAllObservers(int value) {
        for (Observer obs : observers) {
            obs.notify(value);
        }
    }


    public String getDescripcion() {
        return "Observable";
    }
}

    