import java.util.ArrayList;

public class Portfolio{
    // member variables here
    public static ArrayList<Project> projects;

    //constructor method
    public Portfolio(){
        this.projects = new ArrayList<Project>();
    }

    // methods
    public void showPortfolio(){
        // for(int i = 0; i < projects.size(); i++){
        //     System.out.println(projects.get(i));
        // }
        for(Project item:projects){
            System.out.println(item.elevatorPitch());
        }
    }
    // method to add to portfolio
    public void addToPortfolio(Project name){
        projects.add(name);
    }
    // method to get cost
    public double getPortfolioCost(){
        double totalCost = 0;
        for(Project item:projects){
            totalCost += item.getInitialCost();
        }
        return totalCost;
    }

    // get
    public ArrayList<Project> getProjects(){
        return projects;
    }
    // set
    public void setProjectsList(ArrayList<Project> projects){
        this.projects = projects;
    }


}