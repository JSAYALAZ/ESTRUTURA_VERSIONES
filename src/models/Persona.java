package models;

public class Persona {
    String name;
    int ages;
    public Persona(){
        
    }
    public Persona(String name, int ages){
        this.name=name;
        this.ages=ages;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAges() {
        return ages;
    }
    public void setAges(int ages) {
        this.ages = ages;
    }
    
}
