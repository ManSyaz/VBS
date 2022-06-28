
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
*******************************************************/

public class Event
{
    private String eventName, venue, eventDate;
    
    /** default constructor */
    public Event()
    {
        this.eventName = " ";
        this.venue = " ";
        this.eventDate = " ";
    }
    
    /** normal constructor */
    public Event(String eventName, String venue, String eventDate)
    {
        this.eventName = eventName;
        this.venue = venue;
        this.eventDate = eventDate;
    }
    
    /** setter method */
    public void setEvent(String eventName, String venue, String eventDate)
    {
        this.eventName = eventName;
        this.venue = venue;
        this.eventDate = eventDate;
    }
    
    /** getter method */
    public String getEventName() {return eventName;}
    public String getVenue() {return venue;}
    public String getEventDate() {return eventDate;}
    
    /** display method */
    public String toString()
    {
        String details = " ";
        details = details+"\nEVENT NAME :........................... "+eventName;
        details = details+"\nDATE :................................. "+eventDate;
        return details;
    }
}
