public class account {
   private String id;
   private String name;
   private int balence;

// set methode
   public void  setId(String id){
      this.id=id;}

   public void setName(String name){
      this.name=name;}


   public void setBalence(int balence){
      this.balence=balence;}

   account(){}

   account (String id,String name,int balence) {
      this.id=id;
      this.name=name;
      this.balence=balence;}


 public String getId(){

       return id;
 }
   public String getName(){

       return name;
   }
   public int getBalence(){

       return balence;
   }


    public int depit(int amount){
       if (amount<=this.balence){
           amount=getBalence()-amount;
           setBalence(amount);
           return amount;}

else
        return 0;
    }

    public int cred(int amount){
        if (amount>=this.balence){
            amount=getBalence()+amount;
            setBalence(amount);
            return amount;}


        return amount;
    }

public String trans(account a,int amount){

       if (amount<=this.balence){

           a.setBalence(a.getBalence()+amount);
           this.setBalence(this.getBalence()-amount);
           return " successful transfer";
       }
    return " unsuccessful transfer";
}









}
