/*
Станция техобслуживания:
ServiceCenter:
Свойства:
 - название станции;
 - адресс станции;
 - название автотранспорта на ремонте;
 - вид ремонта;
 - дата поступления;
 - день выдачи;
 - результат ремонта;
 - фамилия персонала;
 - сумма ремонта;*/
package com.makotogroup.intro;

public class TestCenter {
    public static void main(String[] args) {
        ServiceCenter servicecenter = new ServiceCenter("1st New-Moscow AutoCenter","Workerss, 50","Hondss Civic III","2 tires","12/05/2000","15/05/2000","Completed","'Ternenko I.A'",1235);
        System.out.println(servicecenter);
    }
}
