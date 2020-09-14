package Basic;

public abstract class OrbitalObject {
    private String name;
    private Point point;
    private OrbitalObject orbits;
        //list of things that orbit this object?
    //size?


    public OrbitalObject(int x, int y, int z, OrbitalObject orbits, String name){
        point = new Point(x, y, z);
        this.orbits = orbits;
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
}
