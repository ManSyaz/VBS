
/******************************************************
 PROGRAMMER #1
 NAME : MUHAMMAD AIMAN SYAZWAN BIN MOHD ZALIZAMAN
 STUDENT ID : 2020870684
 GROUP : CS1102F
 PHONE NUMBER : 0196081247
 
 PROGRAMMER #2
 NAME : NORSHAZLIANA BINTI ABDUL MOHEE
 STUDENT ID : 2020607144
 GROUP : CS1102F
 PHONE NUMBER : 01114828100
 
 PROGRAMMER #3
 NAME : MUHAMMAD SYAZRIEN BIN SARI
 STUDENT ID : 2020478078
 GROUP : CS1102F
 PHONE NUMBER : 0165284782
 
 PROGRAMMER #4
 NAME : NURUL ANIS ATHIRAH BINTI ZULKIFLY
 STUDENT ID : 2020848168
 GROUP : CS1102F
 PHONE NUMBER : 0134808782
 ******************************************************/

public class Person
{
    private String name, NRIC, address, contactNum;
    private Event evnt;
    private Time tm;
    
    /** default constructor */
    public Person()
    {
        this.name = " ";
        this.NRIC = " ";
        this.address = " ";
        this.contactNum = " ";
        this.evnt = new Event();
        this.tm = new Time();
    }
    
    /** normal constructor */
    public Person(String name, String NRIC, String address, String contactNum, Event evnt, Time tm)
    {
        this.name = name;
        this.NRIC = NRIC;
        this.address = address;
        this.contactNum = contactNum;
        this.evnt = evnt;
        this.tm = tm;
    }
    
    /** setter method */
    public void setPerson(String name, String NRIC, String address, String contactNum, Event evnt, Time tm)
    {
        this.name = name;
        this.NRIC = NRIC;
        this.address = address;
        this.contactNum = contactNum;
        this.evnt = evnt;
        this.tm = tm;
    }
    
    /** getter method */
    public String getName() {return name;}
    public String getNRIC() {return NRIC;}
    public String getAddress() {return address;}
    public String getContactNum() {return contactNum;}
    public Event getEvent() {return evnt;}
    public Time getTime() {return tm;}
    
    /** default constructor */
    public double findCharge()
    {
        double charge = 0;
        if (getEvent().getVenue().equalsIgnoreCase("DT")){
            charge = 300;
        }
        else if (getEvent().getVenue().equalsIgnoreCase("DK300")){
            charge = 150;
        }
        else if (getEvent().getVenue().equalsIgnoreCase("DK200")){
            charge = 100;
        }
        return charge;
    }
    
    /** processor method :
        to find venue based on user input */
    public String findVenue()
    {
        String venueDewan = " ";
        if (getEvent().getVenue().equalsIgnoreCase("DT")){
            venueDewan = "DEWAN TITIWANGSA";      //if user input DT, it will display "DEWAN TITIWANGSA"
        }
        else if (getEvent().getVenue().equalsIgnoreCase("DK300")){
            venueDewan = "DEWAN KULIAH 300";      //if user input DK300, it will display "DEWAN KULIAH 300"
        }
        else if (getEvent().getVenue().equalsIgnoreCase("DK200")){
            venueDewan = "DEWAN KULIAH 200";      //if user input DK200, it will display "DEWAN KULIAH 200"
        }
        else
            venueDewan = "INVALID CODE";          //if user input wrong code, it will display "INVALID CODE"
        return venueDewan;
    }
    
    /** display method :
        will display all the output about
        person details and event details*/
    public String toString()
    {
        String details = " ";
        details = details+"\nNAME :................................. "+name;
        details = details+"\nIC/ID NUMBER :......................... "+NRIC;
        details = details+"\nADDRESS :.............................. "+address;
        details = details+"\nCONTACT NUMBER :....................... "+contactNum;
        details = details+"\n\nEVENT DETAIL : "+evnt.toString();
        return details;
    }
    
    /** display  method :
        will display all the output from Time object*/
    public String toStringTime()
    {
        String details = " ";
        details = details+tm.toString();
        return details;
    }
}
