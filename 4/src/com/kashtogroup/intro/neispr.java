/*
"ТехОбслуживание" (название станции, адрес станции, название автотранспорта на ремонте, вид ремонта, дата поступления, дата выдачи,
результат ремонта, фамилия персонала, сумма ремонта) и дочерние классы:
 -  "планово-предупредительный осмотр для легкового транспорта" (вид (плановый/капитальный),год проведения, пробег, период);
 -  "неисправности" (название неисправности, описание выполненных работ);
 -  "планово-предупредительный осмотр для грузового транспорта" (вид (ТО-1, ТО-2, ТО-3),год проведения, пробег, период, объем двигателя);
    Реализовать класс для хранения списка выполненых работ с методом добавления ремонта и методом печати списка ремонтов.
*/
package com.kashtogroup.intro;

public class neispr extends plan_predOsmLegk{
    private String nameNeispr;
    private String opisanie;
    public neispr(String name, String adress, String carname, String typerep, String dateIn, String dateOut, String result, String nameWork, double price, String vid, int god, int probeg, String period, String nameNeispr,String opisanie) {
        super(name, adress, carname, typerep, dateIn, dateOut, result, nameWork, price, vid, god, probeg, period);
        this.nameNeispr = nameNeispr;
        this.opisanie = opisanie;
    }
    public String getNameNeispr() {
        return nameNeispr;
    }
    public void setNameNeispr(String nameNeispr) {
        this.nameNeispr = nameNeispr;
    }
    public String getOpisanie() {
        return opisanie;
    }
    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }
    @Override
    public String toString()
    {
        return "\n Nazvanie nesipr.: " + nameNeispr + ";\n Opisanie vipolnennih rabot: " + opisanie + ".";
    }
}
