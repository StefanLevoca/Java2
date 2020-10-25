package domaceUlohy;

import java.util.Date;

abstract class Media {

    public abstract String getNazov();

    public abstract void setNazov(String nazov);

    public abstract Date getDatumVydania();

    public abstract void setDatumVydania(Date datumVydania);
}