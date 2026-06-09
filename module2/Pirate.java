import java.util.ArrayList;

public class Pirate {

    private int crewID;
    private String crewName;
    private String shipName;
    private String captainName;
    private ArrayList<String> crewMembers = new ArrayList<>();
    private int totalBounty;

    // setters

    public void setCrewID(int crewID) {
        this.crewID = crewID;
    }

    public void setCrewName(String crewName)
    {
        this.crewName= crewName;
    }

    public void setShipName(String shipName)
    {
        this.shipName = shipName;
    }

    public void setCaptainName(String captainName)
    {
        this.captainName = captainName;
    }

    public void setCrewMembers(ArrayList<String> crewMembers)
    {
        this.crewMembers = crewMembers;
    }

    public void setTotalBounty(int totalBounty)
    {
        this.totalBounty = totalBounty;
    }
    
    // getters

    public int getCrewID()
    {
        return this.crewID;
    }

    public String getCrewName()
    {
        return this.crewName;
    }

    public String getShipName()
    {
        return this.shipName;
    }

    public String getCaptainName()
    {
        return this.captainName;
    }

    public ArrayList<String> getCrewMembers()
    {
        return this.crewMembers;
    }

    public int getTotalBounty()
    {
        return this.totalBounty;
    }
    
    public void viewPirateGroup()
    {
        System.out.println("Pirate Crew: " + this.crewName);
        System.out.println("Ship Name: " + this.shipName);
        System.out.println("Captain: " + this.captainName);
        System.out.println("Total Bounty: " + this.totalBounty);
        System.out.println("Crew Members:");
        for (int i= 0; i< crewMembers.size(); i++)
        {
            System.out.println("["+ (i +1) + "] " + crewMembers.get(i));
        }
    }

    // add a public void viewMemberProfile() for individual members


    public void recruitCrewMember(String newMember)
    {
        crewMembers.add(newMember);
        System.out.println("Welcome to the Crew, " + newMember + "!");

    }


    public void removeCrewMember(String member)
    {
        crewMembers.remove(member);
        System.out.println(member + " is no longer a Pirate.");
    }




    




}