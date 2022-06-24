/*
"ТехОбслуживание" (название станции, адрес станции, название автотранспорта на ремонте, вид ремонта, дата поступления, дата выдачи,
результат ремонта, фамилия персонала, сумма ремонта) и дочерние классы:
 -  "планово-предупредительный осмотр для легкового транспорта" (вид (плановый/капитальный),год проведения, пробег, период);
 -  "неисправности" (название неисправности, описание выполненных работ);
 -  "планово-предупредительный осмотр для грузового транспорта" (вид (ТО-1, ТО-2, ТО-3),год проведения, пробег, период, объем двигателя);
    Реализовать класс для хранения списка выполненых работ с методом добавления ремонта и методом печати списка ремонтов.
*/
package com.kashtogroup.intro;

import java.io.*;
import java.util.Scanner;

public class tehobsluzh extends TehObsl{
    public tehobsluzh(String name, String adress, String carname, String typerep, String dateIn, String dateOut, String result, String nameWork, double price) {
        super(name, adress, carname, typerep, dateIn, dateOut, result, nameWork, price);
    }
    @Override
    public String toString() {
            return "\n Teh. obsluzhivanie: " + getName()+"\n";
        }
        public void show(){
            try {
                File file = new File("TehObsl.txt");
                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);
                String line = reader.readLine();
                System.out.println("spisok vipolnennih rabot: ");
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
            System.out.println("vvedite vipolnennuyu rabotu: ");
            String newRabot = in.nextLine();
            try (FileWriter writer = new FileWriter("TehObsl.txt", true)) {
                writer.write(newRabot);
                writer.append('\n');
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            return newRabot;
    }
}
