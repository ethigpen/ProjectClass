public class Project{
    // member variables here
    private String name;
    private String description;
    private Double initialCost;


    // constructor methods
    public Project(){
        this.name = "A Sample Project";
        this.description = "Ipsum aute fugiat mollit do dolor elit. Ipsum aute fugiat mollit do dolor elit. Ipsum aute fugiat mollit do dolor elit.";
        this.initialCost = 30.25;
    }

    public Project(String name){
        this.name = name;
        this.description = "Veniam ex velit culpa reprehenderit commodo. Veniam ex velit culpa reprehenderit commodo.";
        this.initialCost = 50.77;
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
        this.initialCost = 20.18 ;
    }

    // methods
    public String elevatorPitch(){
        String pitch = String.format("%s(%s): %s", this.name, this.initialCost, this.description);
        return pitch;
    }

    // getters
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public Double getInitialCost(){
        return initialCost;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setInitialCost(Double cost){
        this.initialCost = cost;
    }
}