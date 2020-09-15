package Basic;

import java.util.ArrayList;

public class Star extends OrbitalObject {
    private ArrayList<Planet> planets = new ArrayList<>();

    public Star(Point point, OrbitalObject orbits, String name){
        super(point, orbits, name);
    }

    public void createPlanet(Point point, String name){
        planets.add(new Planet(point, this, name));
    }

    public ArrayList<Planet> getPlanets(){
        return planets;
    }
}
