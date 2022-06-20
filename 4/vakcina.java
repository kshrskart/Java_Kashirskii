public class Vakcina extends Osmotr {
    private String nameVac;
    private String datavac;
    private String periodDo;
    public Vakcina(String thePolik, String theAdres, String theSurnameP, String theDoljnost, String theSurnameV, String theDiagnoz, String theNomerPol, String theDataOsm, String theVid, int theGod, String thePeriod, String theRezyltat, String theNameVac, String theDataVac, String ThePeriodDo){
        super(thePolik, theAdres, theSurnameP, theDoljnost, theSurnameV, theDiagnoz, thePeriod, theDataOsm, theVid, theGod, theNomerPol, theRezyltat);
        this.nameVac = theNameVac;
        this.datavac = theDataVac;
        this.periodDo = ThePeriodDo;
    }
    public String getNameVac() {
        return nameVac;
    }
    public String getDataVac() {
        return datavac;
    }
    public String getPeriodDo() {
        return periodDo;
    }
    public void setNameVac(String theNameVac) {
        this.nameVac = theNameVac;
    }
    public void setDatavac(String theDataVac) {
        this.datavac = theDataVac;
    }
    public void setPeriodDo(String thePeriodDo) {
        this.periodDo = thePeriodDo;
    }
    @Override
    public String toString() {
        return "vakcinaciya v poliklinike = " + getNamePolik() + '\n' + "nazvanue vakciny = " + nameVac + '\n' + "data vakcinaciyy = " + datavac + '\n' + "period deystviya = " + periodDo + '\n';
    }
}
