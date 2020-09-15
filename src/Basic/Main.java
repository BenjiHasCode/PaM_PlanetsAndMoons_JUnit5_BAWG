package Basic;

public class Main {
    public static void main(String[] args) {
        Star sun = new Star(new Point(0,0,0), null, "Sun");
        //NOTE: Planets position are relatively random
        sun.createPlanet(new Point (46455123,45624321,48425654), "Mercury");
        sun.createPlanet(new Point (60145232,65212431,63245465), "Venus");
        sun.createPlanet(new Point (89601502,89600785,89600246), "Earth");
        sun.createPlanet(new Point (11452321,11956654,11953546), "Mars");
        sun.createPlanet(new Point (125401662,125416823,154286343), "Jupiter");
        sun.createPlanet(new Point (1413456683,1245654863,1473646545), "Saturn");
        sun.createPlanet(new Point (1663165452,1645633684,1665488635), "Uranus");
        sun.createPlanet(new Point (1836654142,1845638345,1845456545), "Neptune");
        sun.createPlanet(new Point (1990078621,1999028734,1992045754), "Pluto");

        Planet earth = sun.getPlanets().get(2);

        earth.createMoon(new Point(89801502,89860785,89800246), "Moon");

        System.out.printf("Sun's distance to Earth:      %15.2f KM%n", sun.calculateDistance(sun.getPlanets().get(2)));
        System.out.printf("Earth's distance to the moon: %15.2f KM%n", earth.calculateDistance(earth.getMoons().get(0)));
        System.out.printf("Moon's distance to the sun:   %15.2f KM%n", earth.getMoons().get(0).calculateDistance(sun));
    }
}
