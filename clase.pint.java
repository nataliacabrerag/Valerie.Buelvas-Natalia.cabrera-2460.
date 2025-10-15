//// clase point hija de Observable

class Point extends Observable {
    private int x;
    private int y;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    // se cambian los puntos x o y 
    public void setX(int x) {
        this.x = x;
        notificarObservers(x);
    }

    public void setY(int y) {
        this.y = y;
        notificarObservers(y);
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public String getDescripcion() {
        return "Point(" + x + ", " + y + ")";
    }
}