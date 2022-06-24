/*
"ТехОбслуживание" (название станции, адрес станции, название автотранспорта на ремонте, вид ремонта, дата поступления, дата выдачи,
результат ремонта, фамилия персонала, сумма ремонта) и дочерние классы:
 -  "планово-предупредительный осмотр для легкового транспорта" (вид (плановый/капитальный),год проведения, пробег, период);
 -  "неисправности" (название неисправности, описание выполненных работ);
 -  "планово-предупредительный осмотр для грузового транспорта" (вид (ТО-1, ТО-2, ТО-3),год проведения, пробег, период, объем двигателя);
    Реализовать класс для хранения списка выполненых работ с методом добавления ремонта и методом печати списка ремонтов.
*/
package com.kashtogroup.intro;

public class plan_predOsmLegk extends TehObsl{
    private String vid;
    private int god;
    private int probeg;
    private String period;
    public plan_predOsmLegk(String name, String adress, String carname, String typerep, String dateIn, String dateOut, String result, String nameWork, double price, String vid, int god, int probeg, String period) {
        super(name, adress, carname, typerep, dateIn, dateOut, result, nameWork, price);
        this.vid = vid;
        this.god = god;
        this.probeg = probeg;
        this.period = period;
    }
    public String getVid() {
        return vid;
    }
    public void setVid(String vid) {
        this.vid = vid;
    }
    public int getGod() {
        return god;
    }
    public void setGod(int god) {
        this.god = god;
    }
    public int getProbeg() {
        return probeg;
    }
    public void setProbeg(int probeg) {
        this.probeg = probeg;
    }
    public String getPeriod() {
        return period;
    }
    public void setPeriod(String period) {
        this.period = period;
    }
    @Override
    public String toString()
    {
        return " Vid: " + vid + ";\n God provedeniya: " + god + ";\n Probeg: "+probeg+";\n Period: "+period+".";
    }
}
