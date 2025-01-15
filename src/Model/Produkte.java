package Model;

public class Produkte {
    String name;
    int preis;
    String herkunftsregion;

    public Produkte(String name, int preis, String herkunftsregion) {
        this.name = name;
        this.preis = preis;
        herkunftsregion = herkunftsregion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getHerkunftsregion() {
        return herkunftsregion;
    }

    public void setHerkunftsregion(String herkunftsregion) {
        herkunftsregion = herkunftsregion;
    }

    @Override
    public String toString() {
        return "Produkte{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                ", Herkunftsregion='" + herkunftsregion + '\'' +
                '}';
    }
}
