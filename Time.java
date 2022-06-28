
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

public class Time
{
    private String eventTimeStart, eventTimeEnd;
    
    /** default constructor */
    public Time()
    {
        String eventTimeStart = " ";
        String eventTimeEnd = " ";
    }
    
    /** normal constructor */
    public  Time(String eventTimeStart, String eventTimeEnd)
    {
        this.eventTimeStart = eventTimeStart;
        this.eventTimeEnd = eventTimeEnd;
    }
    
    /** setter method */
    public void setTime(String eventTimeStart, String eventTimeEnd)
    {
        this.eventTimeStart = eventTimeStart;
        this.eventTimeEnd = eventTimeEnd;
    }
    
    /** getter method */
    public String getEventTimeStart() {return eventTimeStart;}
    public String getEventTimeEnd() {return eventTimeEnd;}
    
    /** processor method :
        will calculate the usage
        of time hour based on
        getter method from Event class */
    public int calcUsageHour()
    {
        int timeHourStart, timeHourEnd;
        timeHourStart=Integer.parseInt(getEventTimeStart().substring(0,2));
        timeHourEnd=Integer.parseInt(getEventTimeEnd().substring(0,2));
    
        int usageHour = timeHourEnd - timeHourStart;
        return usageHour;
    }
    
    /** processor method :
        will calculate the usage
        of time minute based on
        getter method from Event class */
    public double calcUsageMin()
    {
        int timeMinStart, timeMinEnd;
        timeMinStart=Integer.parseInt(getEventTimeStart().substring(2,4));
        timeMinEnd=Integer.parseInt(getEventTimeEnd().substring(2,4));
        
        double usageMin = timeMinEnd - timeMinStart;
        if(usageMin < 0){
            usageMin = usageMin + 60;
        }
        return usageMin;
    }
    
    /** processor method :
        will calculate the new time hour
        using processor methor from
        method usage hour and minute */
    public double calcFullHour()
    { 
        double fullHour = (calcUsageHour() + (calcUsageMin() / 60));
        return fullHour;
    }

    /** display method */
    public String toString()
    {
        String details = " ";
        details = details+"\nBOOKING TIME (STARTING) :.............. "+eventTimeStart;
        details = details+"\nBOOKING TIME (ENDING) :................ "+eventTimeEnd;
        details = details+"\nUSAGE HOUR :........................... "+calcUsageHour()+" hour(s) "+String.format("%.0f",calcUsageMin())+" minute(s)";
        return details;
    }
}
