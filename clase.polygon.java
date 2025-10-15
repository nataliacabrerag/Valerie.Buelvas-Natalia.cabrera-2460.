// clase del poligono 

class Polygon {
    private List<Point> points;

    public Polygon() {
        points = new ArrayList<>();
        System.out.println("Poligono creado");
        System.out.println();
    }

    public void agregarPoint(Point p) {
        points.agregarPoint(p);
        System.out.println(p.getDescripcion() + " añadido al poligono");
    }

    public Point getPoint(int index) {
        return points.get(index);
    }

    // 
    public double getPerimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.size(); i++) {
            Point p1 = points.get(i);
            Point p2 = points.get((i + 1) % points.size());  
            double dx = p2.getX() - p1.getX();
            double dy = p2.getY() - p1.getY();
            perimeter += Math.sqrt(dx * dx + dy * dy);
        }
        return perimeter;
    }

    // 
    public void summary() {
        System.out.println();
        System.out.println("resumen de poligono:");
        System.out.println("- Numero de puntos: " + points.size());
        System.out.println("- puntos finales:");
        for (Point p : points) {
            System.out.println("  - " + p.getDescripcion());
        }
        System.out.println();
    }
}