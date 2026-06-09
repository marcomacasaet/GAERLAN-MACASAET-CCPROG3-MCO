import java.util.ArrayList;

public class Marine
{

    private int corpsID;
    private String baseLocation;
    private String corpsCommander;
    private String marineName;
    private ArrayList<String> marineMembers = new ArrayList<>();
    private int operationalFunds;

    // setters

    public void setCorpsID(int corpsID)
    {
        this.corpsID = corpsID;        
    }

    public void setBaseLocation(String baseLocation)
    {
        this.baseLocation = baseLocation;
    }

    public void setCorpsCommander(String corpsCommander)
    {
        this.corpsCommander = corpsCommander;
    }

    public void setMarineName(String marineName)
    {
        this.marineName = marineName;
    }
    public void setMarineMembers(ArrayList<String> marineMembers)
    {
        this.marineMembers = marineMembers;
    }

    public void setOperationalFunds (int operationalFunds)
    {
        this.operationalFunds = operationalFunds;
    }

    // getters

    public int getCorpsID()
    {
        return this.corpsID;
    }

   public String getBaseLocation()
    {
        return this.baseLocation;
    }

    public String getCorpsCommander()
    {
        return this.corpsCommander;
    }

    public String getMarineName()
    {
        return this.marineName;
    }

    public ArrayList<String> getMarineMembers()
    {
        return this.marineMembers;
    }

    public int getOperationalFunds()
    {
        return this.operationalFunds;
    }

    public void viewMarineGroup()
    {
        System.out.println("Marine Corps: " + this.marineName);
        System.out.println("Base Location: " + this.baseLocation);
        System.out.println("Corps Commander: " + this.corpsCommander);
        System.out.println("Operational Funds: " + this.operationalFunds);
        System.out.println("Marine Members:");
        for (int i= 0; i< marineMembers.size(); i++)
        {
            System.out.println("["+ (i +1) + "] " + marineMembers.get(i));
        }
    }

    // add a public void viewMemberProfile() for individual members

    public void recruitMarineMember(String newMember)
    {
        marineMembers.add(newMember);
        System.out.println("Welcome to the Corps, " + newMember + "!");

    }


    public void removeMarineMember(String marineName)
    {
        marineMembers.remove(marineName);
        System.out.println(marineName + " is no longer a Marine.");
    }

}