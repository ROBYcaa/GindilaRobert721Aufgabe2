package Model;
import java.util.List;

public class Charaktere {
    int ID;
    String name;
    String Herkunftsort;
    List<Produkte> listProdukte;

    public Charaktere(int ID, String name, String herkunftsort, List<Produkte> listProdukte) {
        this.ID = ID;
        this.name = name;
        Herkunftsort = herkunftsort;
        this.listProdukte = listProdukte;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHerkunftsort() {
        return Herkunftsort;
    }

    public void setHerkunftsort(String herkunftsort) {
        Herkunftsort = herkunftsort;
    }

    public List<Produkte> getListProdukte() {
        return listProdukte;
    }

    public void setListProdukte(List<Produkte> listProdukte) {
        this.listProdukte = listProdukte;
    }

    @Override
    public String toString() {
        return "Charaktere{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", Herkunftsort='" + Herkunftsort + '\'' +
                ", listProdukte=" + listProdukte +
                '}';
    }
}
