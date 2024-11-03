//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
account ac1=new account();

ac1.setId("7675940435");
ac1.setName(" sara");
ac1.setBalence(200);

System.out.println(" your id is "+ac1.getId());
System.out.println("your name is"+ac1.getName() );
System.out.println(" your balence are "+ac1.getBalence());
System.out.println("**********************************");

//ميثود  السحب

   ac1.depit(50);
    System.out.println(" the balence after debit " +" " +ac1.getBalence());
    ac1.toString();

    // ميثود الايداع
ac1.cred(500);
        System.out.println(" the balence after credit " +" " +ac1.getBalence());
        ac1.toString();

        System.out.println("******************************************");







account ac2=new account("1234567890","ebtehal",10000);

        System.out.println(" your id is " +ac2.getId());
        System.out.println(" your name is " +ac2.getName());
        System.out.println("your balence is  "+ ac2.getBalence());
        System.out.println("*************************************");



        ac2.depit(50);
        System.out.println(" the balence after debit " +" " +ac2.getBalence());
        ac2.toString();

        // ميثود الايداع
        ac2.cred(500);
        System.out.println(" the balence after credit " +" " +ac2.getBalence());
        ac2.toString();




// عملية التحويل بين الحسابات
        System.out.println("*****************************************");

        System.out.println( " transfer from account 2 "+ac2.trans(ac1,100));



        System.out.println(" transfer from account 1" + ac1.trans(ac2,20000));



    }}