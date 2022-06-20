import java.io.*;
import java.util.Scanner;
public class MedObsl extends MedObslyjivanie{
    public MedObsl(String thePolik,String theAdres,String theSurnameP,String theDiagnoz,String theDoljnost,String theSurnameV,String theNomerPol,String theDataOsm) {
        super(thePolik, theAdres, theSurnameP, theDiagnoz, theDoljnost, theSurnameV, theNomerPol, theDataOsm);
    }
    @Override
    public String toString() {
        return "med. obsluzhivanie pacientov " + getNamePolik()+"\n";
    }
    public void show(){
        try {
            File file = new File("MedObsl.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            System.out.println("spisok med.obsluzhivaniya pacientov: ");
            while (line != null) {
                System.out.println(line+"\n");
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String add() {
        Scanner in = new Scanner(System.in);
        System.out.println("vvedite FIO pacienta: ");
        String newPacient = in.nextLine();
        try (FileWriter writer = new FileWriter("MedObsl.txt", true)) {
            writer.write(newPacient);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return newPacient;
    }
}
