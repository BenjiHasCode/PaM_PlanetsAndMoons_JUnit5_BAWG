package Basic;

public abstract class OrbitalObject {
    private String name;
    private Point point;
    private OrbitalObject orbits;

    public OrbitalObject(Point point, OrbitalObject orbits, String name){
        this.point = point;
        this.orbits = orbits;
        this.name = name;
    }

    public OrbitalObject(Point point, String name){
        this.point = point;
        this.orbits = null;
        this.name = name;
    }

    public String toString(){
        return "Name: " + name + "Position: " + point + "Orbits: " + orbits.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public OrbitalObject getOrbits() {
        return orbits;
    }

    public void setOrbits(OrbitalObject orbits) {
        this.orbits = orbits;
    }

    public double calculateDistance(OrbitalObject object){
        int xDif = object.getPoint().getX() - this.getPoint().getX();
        int yDif = object.getPoint().getY() - this.getPoint().getY();
        int zDif = object.getPoint().getZ() - this.getPoint().getZ();
       // double xSquared = Math.pow(xDif, 2);
       // double ySquared = Math.pow(yDif, 2);
       // double zSquared = Math.pow(zDif, 2);
      //  double allTogether = xSquared + ySquared + zSquared;
        System.out.println(allTogether);
        System.out.println(Math.sqrt(xSquared + ySquared + zSquared));
        return Math.sqrt(xSquared + ySquared + zSquared);
        //d(P1, P2) = Square root of (x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2
    }
}
