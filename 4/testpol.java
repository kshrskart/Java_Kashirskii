public class TestPol {
    public static void main (String[] args){
        MedObslyjivanie pol1 = new MedObslyjivanie("5 Poloklinika", "ul. Buchina 34", "Kashirskyy A.A.","Hirurg","Petrov I.A","Perelom nogi", "3223634513003109", "03.02.2015");
        System.out.println(pol1);
        MedObsl Pol11 = new MedObsl(pol1.getNamePolik(), pol1.getAdres(),pol1.getSurnameP(),pol1.getDoljnost(),pol1.getSurnameV(),pol1.getDiagnoz(),pol1.getNomerPol(),pol1.getDataOsm());
        System.out.println(Pol11);
        Osmotr pol12 = new Osmotr(pol1.getNamePolik(), pol1.getAdres(),pol1.getSurnameP(),pol1.getDoljnost(),pol1.getSurnameV(),pol1.getDiagnoz(),pol1.getNomerPol(),pol1.getDataOsm(),
                "stacionarnyy",2015,"7 mesyacev","zdorov");
        System.out.println(pol12);
        Vakcina vac1 = new Vakcina(pol1.getNamePolik(), pol1.getAdres(),pol1.getSurnameP(),pol1.getDoljnost(),pol1.getDiagnoz(),pol1.getSurnameV(),pol1.getNomerPol(),pol1.getDataOsm(),pol12.getVid(),pol12.getGod(),pol12.getPeriod(),pol12.getRezyltat(),
                "Sputnik-VI", "02.05.2021","polgoda");
        System.out.println(vac1);
        Deti pol13= new Deti(pol1.getNamePolik(), pol1.getAdres(),pol1.getSurnameP(),pol1.getDiagnoz(),pol1.getDoljnost(), pol1.getSurnameV(),pol1.getNomerPol(),pol1.getDataOsm(),pol12.getVid(),pol12.getGod(),pol12.getPeriod(),pol12.getRezyltat(),vac1.getNameVac(),vac1.getDataVac(),vac1.getPeriodDo(),
                "Fwo-843701","M",17);
        System.out.println(pol13);
        String newPacient = Pol11.add();
        Pol11.show();
    }
}
