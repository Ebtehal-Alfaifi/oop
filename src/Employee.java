public class Employee {

    private String id;
    private String name;
    private int sallery;


    Employee() {

    }

    Employee(String id, String name, int sallery) {
        this.id = id;
        this.name = name;
        this.sallery = sallery;

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSallery(int sallery) {
        this.sallery = sallery;

    }

   public String getId(){
       return id;
   }

    public String getName(){

        return name;
    }
     public int getSallery(){

         return sallery;
     }





}
