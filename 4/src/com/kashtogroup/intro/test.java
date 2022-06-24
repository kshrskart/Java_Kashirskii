/*
"ТехОбслуживание" (название станции, адрес станции, название автотранспорта на ремонте, вид ремонта, дата поступления, дата выдачи,
результат ремонта, фамилия персонала, сумма ремонта) и дочерние классы:
 -  "планово-предупредительный осмотр для легкового транспорта" (вид (плановый/капитальный),год проведения, пробег, период);
 -  "неисправности" (название неисправности, описание выполненных работ);
 -  "планово-предупредительный осмотр для грузового транспорта" (вид (ТО-1, ТО-2, ТО-3),год проведения, пробег, период, объем двигателя);
    Реализовать класс для хранения списка выполненых работ с методом добавления ремонта и методом печати списка ремонтов.
*/
package com.kashtogroup.intro;

public class test {
    public static void main (String[] args){

        TehObsl teh1 = new TehObsl("1st New-Moscow AutoCenter","Workerss, 50","Hondss Civic III","2 tires","12/05/2000","15/05/2000","Completed","'Ternenko I.A'",1235);
        System.out.println(teh1);

        tehobsluzh teh11 = new tehobsluzh(teh1.getName(), teh1.getadress(),teh1.getcarname(),teh1.gettyperep(),teh1.getdateIn(),teh1.getdateOut(),teh1.getresult(),teh1.getnameWork(), teh1.getprice());
        System.out.println(teh11);

        plan_predOsmLegk teh12 = new plan_predOsmLegk(teh1.getName(), teh1.getadress(),teh1.getcarname(),teh1.gettyperep(),teh1.getdateIn(),teh1.getdateOut(),teh1.getresult(),teh1.getnameWork(), teh1.getprice(),
                "Planoviy",2003,2000,"2000-2003");
        System.out.println(teh12);

        neispr nei1 = new neispr(teh1.getName(), teh1.getadress(),teh1.getcarname(),teh1.gettyperep(),teh1.getdateIn(),teh1.getdateOut(),teh1.getresult(),teh1.getnameWork(), teh1.getprice(),teh12.getVid(),teh12.getGod(),teh12.getProbeg(),teh12.getPeriod(),
                "Dvigatel'","Protekayet maslo");
        System.out.println(nei1);

        plan_predOsmGruz teh13 = new plan_predOsmGruz(teh1.getName(), teh1.getadress(),teh1.getcarname(),teh1.gettyperep(),teh1.getdateIn(),teh1.getdateOut(),teh1.getresult(),teh1.getnameWork(), teh1.getprice(),teh12.getVid(),teh12.getGod(),teh12.getProbeg(),teh12.getPeriod(),nei1.getNameNeispr(),nei1.getOpisanie(),
                "TO-1",2005,15000,"2000-2005",3.5);
        System.out.println(teh13);

        String newRabot = teh11.add();
        teh11.show();

    }
}
