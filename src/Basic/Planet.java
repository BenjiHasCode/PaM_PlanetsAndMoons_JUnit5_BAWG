package Basic;

import java.util.ArrayList;

public class Planet extends OrbitalObject {
    private ArrayList<Moon> moons = new ArrayList<>();

    public Planet(Point point, OrbitalObject orbits, String name) {
        super(point, orbits, name);
    }

    public void createMoon(Point point, String name){
        moons.add(new Moon(point, this, name));
    }

    public ArrayList<Moon> getMoons(){
        return moons;
    }

    public int getAmountOfMoons(){
        return moons.size();
    }
}
