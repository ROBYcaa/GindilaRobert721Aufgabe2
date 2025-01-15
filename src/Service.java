import Model.Charaktere;
import Model.Produkte;
import java.util.ArrayList;

public class Service {
    private Repository<Charaktere> charaktereRepository;
    private Repository<Produkte> produkteRepository;

    public Service(Repository<Charaktere> charaktereRepository) {
        this.charaktereRepository = charaktereRepository;
        this.produkteRepository = produkteRepository;
    }

    public void addCharaktere(String name, String herkunftsort) {
        int ID = -1;
        for(Charaktere c : charaktereRepository.getAllElements()){
            if (ID < c.getID())
                ID = c.getID();
        }
        ID+=1;
        charaktereRepository.addElement(new Charaktere(ID,name,herkunftsort,new ArrayList<>()));
    }

    public void removeCharaktere(int ID) {
        for(Charaktere c : charaktereRepository.getAllElements()){
            if (c.getID() == ID){
                charaktereRepository.remove(c);
                break;
            }
        }
    }

    public Charaktere getCharaktere(int ID) {
        for(Charaktere c : charaktereRepository.getAllElements()){
            if (c.getID() == ID){
                return c;
            }
        }
        throw new RuntimeException("Kunde nicht gefunden");
    }

    public void updateCharaktere(Charaktere charaktere) {
        for(Charaktere c : charaktereRepository.getAllElements()){
            if (c.getID() == charaktere.getID()){
                int index = charaktereRepository.getAllElements().indexOf(c);
                c.setName(charaktere.getName());
                c.setHerkunftsort(charaktere.getHerkunftsort());
                charaktereRepository.updateElement(index, charaktere);
                break;
            }
        }
    }

    public void addProdukte(String name, int preis , String herkunftsregion) {
        produkteRepository.addElement(new Produkte(name,preis,herkunftsregion));
    }

    public void removeProdukte(String name) {
        for(Produkte p : produkteRepository.getAllElements()){
            if (p.getName().equals(name)){
                produkteRepository.remove(p);
                break;
            }
        }
    }
    public Produkte getProdukte(String name) {
        int ID = -1;
        for(Produkte p : produkteRepository.getAllElements()){
            if (p.getName().equals(name)){
                ID = produkteRepository.getAllElements().indexOf(p);
                break;
            }
        }
        return produkteRepository.getElement(ID);
    }

    public void updateProdukte(Produkte produkte) {
        for(Produkte p : produkteRepository.getAllElements()){
            if (p.getName().equals(produkte.getName())){
                int index = produkteRepository.getAllElements().indexOf(p);
                p.setName(produkte.getName());
                p.setPreis(produkte.getPreis());
                produkteRepository.updateElement(index, p);
                break;
            }
        }
    }



}
