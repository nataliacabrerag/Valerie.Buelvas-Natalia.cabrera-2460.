// clase hija de observer

class Multiplier extends Observer {
    private int value;

    public Multiplier(int value) {
        this.value = value;
    }

    public void notificarObservers(int newValue) {
        int result = value * newValue;
        System.out.println(" Multiplicación de " + observable.getDescripcion() + ": " + resultado);

    }

    public String getDescripcion() {
        return "Multiplier(" + value + ")";
    }
}