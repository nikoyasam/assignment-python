import java.util.ArrayList;

public class Manager {
    private String name;
    private ArrayList<Club> clubList = new ArrayList<>();

    public Manager(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Club> getClubList() {
        return clubList;
    }

    public void setClubList(ArrayList<Club> clubList) {
        this.clubList = clubList;
    }

    public void addClub(Club c){
        c.setManager(this);
        this.clubList.add(c);
    }
}
