
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

import java.util.Scanner;
public class VBSapp
{
    public static void main(String args[])
    {
        Scanner inputNum = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        
        /** variable declaration */
        String name, NRIC, address, contactNum, eventName, venue, eventDate, eventTimeStart, eventTimeEnd;
        String choice; 
        
        double totalCharge = 0;
        double totalCollection = 0;
        
        int countBooking = 0;
        int totalBooking = 0;
        int dt = 0;
        int dk300 = 0;
        int dk200 = 0;
        int Hours = 0;
        
        /** array of object declaration with 20 booking */
        Person prsn[]=new Person[20];
        for(int i=0;i<prsn.length;i++)
        {
            System.out.print("\n********************************************************************************************");
            System.out.print("\n______________________________UITM VENUE BOOKING SYSTEM(VBS)________________________________");
            System.out.print("\n********************************************************************************************");
            System.out.print("\nMENU : ");
            System.out.print("\n(A) BOOKING");
            System.out.print("\n(B) EXIT");
            System.out.print("\n********************************************************************************************");
            /** user will input A or B for next process */
            System.out.print("\nPLEASE ENTER YOUR CHOICE (A/B): ");
            choice=inputText.nextLine();
            System.out.print("\n********************************************************************************************");
            char ch = choice.charAt(0); 
            
            /** if user input A, 
                program will ask user to input
                person details, if user input B,
                program will end */
            if(ch == 'A' || ch == 'a')
            {
                /** user will input all
                    the information below*/
                System.out.print("\n\nPLEASE ENTER ALL THE INFORMATION BELOW");
                System.out.print("\n\nFULL NAME :............................ ");
                name=inputText.nextLine();
                System.out.print("IC/ID NUMBER (WITHOUT DASH(-)) :....... ");
                NRIC=inputText.nextLine();
                System.out.print("ADDRESS :.............................. ");
                address=inputText.nextLine();
                System.out.print("CONTACT NUMBER :....................... ");
                contactNum=inputText.nextLine();
                System.out.print("EVENT NAME :........................... ");
                eventName=inputText.nextLine();
                System.out.print("DATE (dd/mm/yy) :...................... ");
                eventDate=inputText.nextLine();
                System.out.print("\nVENUE CODE : DT | DK300 | DK200");
                System.out.print("\nVENUE :................................ ");
                venue=inputText.nextLine();
                System.out.print("BOOKING TIME (START-24H):.............. ");
                eventTimeStart=inputText.nextLine();
                System.out.print("BOKING TIME (END-24H):................. ");
                eventTimeEnd=inputText.nextLine();
                
                /** new object declaration
                    and set the object based on
                    Person, Event, and Time attribute*/
                prsn[i]=new Person();
                prsn[i].setPerson(name, NRIC, address, contactNum, new Event(eventName, venue, eventDate),new Time(eventTimeStart, eventTimeEnd)); 
                
                /** it will trace the IC OR ID
                    based on user input */
                if (NRIC.length() == 7){ 
                    totalCharge = 0 * prsn[i].getTime().calcFullHour();      //if IC or ID have 7 length, totalCharge is 0
                }
                else if (NRIC.length() == 11){
                    totalCharge = 0 * prsn[i].getTime().calcFullHour();      //if IC or ID have 11 length, totalCharge is 0
                }
                else if (NRIC.length() == 12){
                    totalCharge = prsn[i].findCharge() * (prsn[i].getTime().calcFullHour());    //if IC or ID have 12 length, totalCharge is calculate based on hour and charge venue
                }
                
                /** it will count the loop
                    of booking */
                countBooking++;
                
                System.out.print("\n********************************************************************************************");
                System.out.print("\n______________________________UITM VENUE BOOKING SYSTEM(VBS)________________________________");
                System.out.print("\n********************************************************************************************");
                System.out.print("\n\nBOOKING "+countBooking); //it will display the number of loop
                System.out.print("\nPERSON IN CHARGE DETAIL : ");
                System.out.println(prsn[i].toString()); //it will display all the person detail output and event detail
                System.out.print("VENUE :................................ "+prsn[i].findVenue());
                System.out.print(prsn[i].toStringTime()); //it will display all time detail output
                System.out.print("\nBOOKING CHARGE :....................... RM"+String.format("%.2f",totalCharge)); //it will display the booking charge with two precision only
                System.out.print("\n");
                
                /** it will count the loop
                    of total booking */
                totalBooking++;
                
                /** it will count the loop
                    of venue based on user input */
                if(venue.equalsIgnoreCase("DT")){
                    dt++; //if user input "DT", it will count as 1
                }
                else if(venue.equalsIgnoreCase("DK300")){
                    dk300++; //if user input "DK300", it will count as 1
                }
                else if(venue.equalsIgnoreCase("DK200")){
                    dk200++; //if user input "DK200", it will count as 1
                }
                
                /** the totalCharge will increase
                    and will set in new variable */
                totalCollection += totalCharge;
            } 
            else
                break; /** used to ask user if they want to exit the loop or not */
        }
        
        /** will display all the total number
            of booking, venue, and total collection */
        System.out.print("\n\nTOTAL BOOKING :........................ "+totalBooking);
        System.out.print("\nDEWAN TITIWANGSA :..................... "+dt);
        System.out.print("\nDEWAN KULIAH 200 :..................... "+dk200);
        System.out.print("\nDEWAN KULIAH 300 :..................... "+dk300);
        System.out.print("\nTOTAL COLLECTION :..................... RM"+String.format("%.2f",totalCollection)); //it will set the totalCollection with 2 precision only
    }   
}
