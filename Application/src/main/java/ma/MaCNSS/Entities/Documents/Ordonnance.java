package ma.MaCNSS.Entities.Documents;

import ma.MaCNSS.Entities.Organisme.Medcine;
import ma.MaCNSS.Entities.abstractClasses.Document;

public class Ordonnance extends Document {

    private Medcine medcine ;

    public Ordonnance(int id, float prix, float taux, String description, Medcine medcine) {
        super(id, prix, taux, description);
        this.medcine = medcine;
    }

    public Ordonnance() {
    }

    public Medcine getMedcine() {
        return medcine;
    }

    public void setMedcine(Medcine medcine) {
        this.medcine = medcine;
    }
}
