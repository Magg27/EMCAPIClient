package au.lupine.emcapiclient.object.wrapper;

/**
 * Represents an EarthMC server as in Terra Nova, Terra Aurora, etc.
 */
public class Server {

    private final String name;

    public static final Server NOSTRA = new Server("nostra");

    public Server(String name) {
        this.name = name;
    }

    public static Server of(String name) {
        return new Server(name);
    }

    public String getName() {
        return name;
    }
}
