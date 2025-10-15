/ clase hija de observable

class Adder extends Observer {
    private int value;

    public Adder(int value) {
        this.value = value;
    }

    public void notificarObservers(int newValue) {
        int result = value + newValue;
        System.out.println("Suma de " + observable.getDescripcion() + ": " + resultado);

    }

    public String getDescripcion() {
        return "Adder(" + value + ")";
    }
}
