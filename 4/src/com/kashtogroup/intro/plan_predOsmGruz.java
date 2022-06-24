/*
"ТехОбслуживание" (название станции, адрес станции, название автотранспорта на ремонте, вид ремонта, дата поступления, дата выдачи,
результат ремонта, фамилия персонала, сумма ремонта) и дочерние классы:
 -  "планово-предупредительный осмотр для легкового транспорта" (вид (плановый/капитальный),год проведения, пробег, период);
 -  "неисправности" (название неисправности, описание выполненных работ);
 -  "планово-предупредительный осмотр для грузового транспорта" (вид (ТО-1, ТО-2, ТО-3),год проведения, пробег, период, объем двигателя);
    Реализовать класс для хранения списка выполненых работ с методом добавления ремонта и методом печати списка ремонтов.
*/
package com.kashtogroup.intro;

public class plan_predOsmGruz extends neispr{
    private String vid1;
    private int god1;
    private int probeg1;
    private String period1;
    private double obemdvig;
    public plan_predOsmGruz(String name, String adress, String carname, String typerep, String dateIn, String dateOut, String result, String nameWork, double price, String vid, int god, int probeg, String period, String nameNeispr,String opisanie,String vid1, int god1, int probeg1, String period1, double obemdvig) {
        super(name, adress, carname, typerep, dateIn, dateOut, result, nameWork, price, vid, god, probeg, period,nameNeispr,opisanie);
        this.vid1 = vid1;
        this.god1 = god1;
        this.probeg1 = probeg1;
        this.period1 = period1;
        this.obemdvig = obemdvig;
    }
    public String getVid() {
        return vid1;
    }
    public void setVid(String vid1) {
        this.vid1 = vid1;
    }
    public int getGod() {
        return god1;
    }
    public void setGod(int god1) {
        this.god1 = god1;
    }
    public int getProbeg() {
        return probeg1;
    }
    public void setProbeg(int probeg1) {
        this.probeg1 = probeg1;
    }
    public String getPeriod() {
        return period1;
    }
    public void setPeriod(String period1) {
        this.period1 = period1;
    }
    public double getObemdvig() {
        return obemdvig;
    }
    public void setObemdvig(double period) {
        this.obemdvig = obemdvig;
    }
    @Override
    public String toString()
    {
        return "\n Vid: " + vid1 + ";\n God provedeniya: " + god1 + ";\n Probeg: "+probeg1+";\n Period: "+period1+";\n Ob'yom dvigatelya: "+obemdvig+".";
    }
}
