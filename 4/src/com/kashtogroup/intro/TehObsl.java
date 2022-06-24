/*
"ТехОбслуживание" (название станции, адрес станции, название автотранспорта на ремонте, вид ремонта, дата поступления, дата выдачи,
результат ремонта, фамилия персонала, сумма ремонта) и дочерние классы:
 -  "планово-предупредительный осмотр для легкового транспорта" (вид (плановый/капитальный),год проведения, пробег, период);
 -  "неисправности" (название неисправности, описание выполненных работ);
 -  "планово-предупредительный осмотр для грузового транспорта" (вид (ТО-1, ТО-2, ТО-3),год проведения, пробег, период, объем двигателя);
    Реализовать класс для хранения списка выполненых работ с методом добавления ремонта и методом печати списка ремонтов.
*/
package com.kashtogroup.intro;

public class TehObsl {
    private String name;
    private String adress;
    private String carname;
    private String typerep;
    private String dateIn;
    private String dateOut;
    private String result;
    private String nameWork;
    private double price;
    public TehObsl(String name, String adress, String carname, String typerep, String dateIn, String dateOut, String result, String nameWork, double price) {
        this.name = name;
        this.adress = adress;
        this.carname = carname;
        this.typerep = typerep;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.result = result;
        this.nameWork = nameWork;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getadress() {
        return adress;
    }
    public void setadress(String adress) {
        this.adress = adress;
    }
    public String getcarname() {
        return carname;
    }
    public void setcarname(String carname) {
        this.carname = carname;
    }
    public String gettyperep() {
        return typerep;
    }
    public void settyperep(String typerep) {
        this.typerep = typerep;
    }
    public String getdateIn() {
        return dateIn;
    }
    public void setdateIn(String dateIn) {
        this.dateIn = dateIn;
    }
    public String getdateOut() {
        return dateOut;
    }
    public void setdateOut(String dateOut) {
        this.dateOut = dateOut;
    }
    public String getresult() {
        return result;
    }
    public void setresult(String result) {
        this.result = result;
    }
    public String getnameWork() {
        return nameWork;
    }
    public void setnameWork(String nameWork) {
        this.nameWork = nameWork;
    }
    public double getprice() {
        return price;
    }
    public void setprice(double price) {
        this.price = price;
    }
    @Override
    public String toString()
    {
        return " Name center: " + name + ";\n Adress: " + adress + ";\n Car name: "+carname+";\n Diff. of repare: "+typerep+";\n Date In: "+dateIn+";\n Date Out: "+dateOut+";\n Result: "+result+";\n Worker Surname: "+nameWork+";\n Price: "+price+" rub";
    }
}
