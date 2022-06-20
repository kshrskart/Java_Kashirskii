public class Deti extends Vakcina {
    String svidetelstvo;
    String pol;
    int vozrast;
    public Deti(String thePolik, String theAdres, String theSurnameP, String theDoljnost, String theSurnameV,String theDiagnoz, String theNomerPol, StringtheDataOsm, String theVid, int theGod, String thePeriod, String theRezyltat, String theNameVac, String theDataVac, String ThePeriodDo, String theSvidetelstvo, String thePol, int TheVozrast) {
        super(thePolik, theAdres, theSurnameP, theDiagnoz, theDoljnost, theSurnameV, theNomerPol, theDataOsm, theVid, theGod, thePeriod, theRezyltat, theNameVac, theDataVac, ThePeriodDo);
        this.svidetelstvo = theSvidetelstvo;
        this.pol = thePol;
        this.vozrast = TheVozrast;
    }
    public String getSvidetelstvo() {
        return svidetelstvo;
    }
    public String getPol() {
        return pol;
    }
    public int getVozrast() {
        return vozrast;
    }
    public void setSvidetelstvo(String theSvidetelstvo) {
        this.svidetelstvo = theSvidetelstvo;
    }
    public void setPol(String thePol) {
        this.pol = thePol;
    }
    public void setVozrast(int theVozrast) {
        this.vozrast = theVozrast;
    }
    @Override
    public String toString() {
        return "med.obsluzhivanie detey i podrostkov = " + getNamePolik() + '\n' +
                "svidetel'stvo o rozhdenii rebenka = " + svidetelstvo + '\n' + "pol = " + pol + '\n' + "vozrast = " + vozrast + '\n';
    }
}
