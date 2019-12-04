package madlibs;

public class version1 extends fillThisIn {
    public version1(String[] words){
        this.name = words[0];
        this.color = words[1];
        this.randomObject = words[2];
        this.location = words[3];
    }

    public String greeting(){
        return "Hello friend!";
    }

    public String goToLocation(){
        return "He went to the " + location;
    }

    public String pickUpObject(){
        return "He picked up a " + randomObject;
    }

}
