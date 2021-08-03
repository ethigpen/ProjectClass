public class ProjectTest{
    public static void main (String[] args){
        // Do the stuff here
        Project thing1 = new Project();
        Project thing2 = new Project("Belle");
        Project thing3 = new Project("Emile","I am something");
        Portfolio idk = new Portfolio();
        // System.out.println(thing1.getName());
        // System.out.println(thing1.getDescription());
        // thing1.setName("Pancakes");
        // System.out.println(thing1.getName());
        // System.out.println(thing1.getDescription());
        // System.out.println(thing3.getName());
        // System.out.println(thing3.getDescription());
        // System.out.println(thing3.getInitialCost());
        // thing3.setInitialCost(10.22);
        // System.out.println(thing3.getInitialCost());
        // System.out.println(thing3.elevatorPitch());
        idk.addToPortfolio(thing1);
        idk.addToPortfolio(thing2);
        idk.addToPortfolio(thing3);
        // System.out.println(idk.getProjects());
        idk.showPortfolio();
        System.out.println(idk.getPortfolioCost());
    }
}