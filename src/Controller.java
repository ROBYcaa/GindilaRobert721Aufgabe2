import Model.Charaktere;
import Model.Produkte;

import java.util.List;

public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public void addCharakter(String name, String herkunftsort) {
        service.addCharaktere(name, herkunftsort);
    }

    public void removeCharakter(int id) {
        service.removeCharaktere(id);
    }

    public Charaktere getCharakter(int id) {
        return service.getCharaktere(id);
    }


    public void updateCharakter(int id, String name, String herkunftsort) {
        Charaktere updatedCharakter = new Charaktere(id, name, herkunftsort, getCharakter(id).getProdukte());
        service.updateCharaktere(updatedCharakter);
    }

    public void addProdukt(String name, int preis, String herkunftsregion) {
        service.addProdukte(name, preis, herkunftsregion);
    }

    public void removeProdukt(String name) {
        service.removeProdukte(name);
    }

    public Produkte getProdukt(String name) {
        return service.getProdukte(name);
    }


    public void updateProdukt(String name, int preis, String herkunftsregion) {
        Produkte updatedProdukt = new Produkte(name, preis, herkunftsregion);
        service.updateProdukte(updatedProdukt);
    }

    public List<Charaktere> getCharaktereByHerkunftsort(String herkunftsort) {
        return service.getCharaktereByHerkunftsort(herkunftsort);
    }

    public List<Charaktere> getCharaktereByProduktRegion(String herkunftsregion) {
        return service.getCharaktereByProduktRegion(herkunftsregion);
    }

    public List<Produkte> getProdukteByCharakterSorted(int charakterId, boolean ascending) {
        return service.getProdukteByCharakterSorted(charakterId, ascending);
    }
}
