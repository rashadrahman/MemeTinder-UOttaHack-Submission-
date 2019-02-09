import java.util.Date;

public class Idea {
    String name;
    String description;
    String technology;
    Date date;

    public String getTechnology(){
        return technology;
    }
    public String getDate() {
        return date.toString();
    }
    public String getName(){
        return name;
    }
    public String getDescription() {
        return description;
    }

}
