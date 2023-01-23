package Day03scanner;

public class Runner {
    public static void main(String[] args) {

       //Obect nasil olusturulur?
       //Class Ismi    Obect Ismi  Atama Operatoru  "new" keyword   Construction
        Car              myCar            =            new            Car();
        System.out.println(myCar.fiyat);
        System.out.println(myCar.model);
        myCar.hareket();
        myCar.dur();

        Student tomHanks = new Student();
        System.out.println(tomHanks.address);
        System.out.println(tomHanks.grade);
        System.out.println(tomHanks.name);
        tomHanks.feed();
        tomHanks.study();


    }
}
