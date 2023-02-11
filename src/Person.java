public class Person {
    protected String name;
    protected String family;
    protected int tickets;

    public Person (String name, String family, int tickets){
        this.name =name;
        this.family=family;
        this.tickets=tickets;
    }

    public void ride(){
        tickets--;
    }

}
