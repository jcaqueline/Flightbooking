package prog2.exercise6.flight.booking.system;



import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;















public class FlightBooking {
    static String flightCompany ="Flights-of-Fancy";
    static String flightID = " FOF0345IN";
    public static TripSource tripSource;
    public static SourceAirport sourceAirport;
    static TripDestination tripDestination;
    public static DestinationAirport destinationAirport;
    static LocalDate departureDate;
    static LocalDate returnDate;
    public static int childPassengers ;
    public static int adultPassengers ;
    public static int totalPassengers;
    public static double departingTicketPrice;
    public static double returnTicketPrice;
    private static BookingClass bookingClass;
    public static double totalTicketPrice;
    private static String[] passengerFullName = new String[3];
    private static String[] passengerGender = new String[3];
    private static int[] passengerAge = new int[3];
    public static String[] ticketNumber = new String[3];
    public static TripType tripType;
    public static Object getBookingClass;
    public static double price;
    public static double price2;
    public static double price3;
    public static int po;
    public static String yy;
    public static String x;
    public static String y;
    public static int asd;
    public static String[] flightSeats = new String[410];
    public static String flightseats;
    public String gety(){
        return FlightBooking.y;
    }
   public void sety(String kk){
    FlightBooking.y = kk;
   }
    
    public String getyy(){
        return FlightBooking.yy;
    }
    public void setyy(String z){
        FlightBooking.yy = z;
    }
    public double getprice(){
        return FlightBooking.price;
    }
    public void setprice(double q){
       FlightBooking.price = q;
        
    }
    public double getprice2(){
        return FlightBooking.price2;
    }
    public void setprice2(double p){
       FlightBooking.price2 = p; 
    }
    public int getpo(){
        return FlightBooking.po;
    }
    public void setpo(int g){
        FlightBooking.po = g;
    }
    enum BookingClass{
    FIRST,Business,Economy;
    String BookingClass;
    }
    public void setBookingClass(String str){
    {
       if(str.equals("1"))
       FlightBooking.bookingClass = BookingClass.FIRST;
       if(str.equals("2"))
       FlightBooking.bookingClass = BookingClass.Business;
       if(str.equals("3"))
       FlightBooking.bookingClass = BookingClass.Economy;
    }
    }
    public BookingClass getBookingClass(){
        return bookingClass;
    }

    enum TripSource{
    NANJING, BEIJING, SHANGHAI, Oulu, Helsinki, Paris;
    }
    public void setTripSource(String str3){
       if(str3.equals("1"))
       FlightBooking.tripSource = TripSource.NANJING;
       if(str3.equals("2"))
       FlightBooking.tripSource = TripSource.BEIJING;
       if(str3.equals("3"))
       FlightBooking.tripSource = TripSource.Oulu;
       if(str3.equals("4"))
       FlightBooking.tripSource = TripSource.Helsinki;
    }
    public TripSource getTripSource(){
        return tripSource;
    }
    enum SourceAirport{
        Nanjing_Lukou_International_Airport,
         Beijing_Capital_International_Airport,
          Shanghai_Pudong_International_Airport,
           Oulu_Airport, Helsinki_Airport,Paris_Charles_de_Gaulle_Airport
    }
    public void setSourceAirport(String str3){
        if(str3.equals("1"))
        FlightBooking.sourceAirport = SourceAirport.Nanjing_Lukou_International_Airport;
        if(str3.equals("2"))
        FlightBooking.sourceAirport = SourceAirport.Beijing_Capital_International_Airport;
        if(str3.equals("3"))
        FlightBooking.sourceAirport = SourceAirport.Oulu_Airport;
        if(str3.equals("4"))
        FlightBooking.sourceAirport = SourceAirport.Helsinki_Airport;
    }
    public SourceAirport getsourceAirport(){
        return sourceAirport;
    }
    enum DestinationAirport{
        Nanjing_Lukou_International_Airport,
         Beijing_Capital_International_Airport,
          Shanghai_Pudong_International_Airport,
           Oulu_Airport, Helsinki_Airport,Paris_Charles_de_Gaulle_Airport
    }
    public void setDestinationAirport(String str2, String str3){
        if(str3.equals("1"))
        FlightBooking.destinationAirport = DestinationAirport.Nanjing_Lukou_International_Airport;
        if(str3.equals("2"))
        FlightBooking.destinationAirport = DestinationAirport.Beijing_Capital_International_Airport;
        if(str3.equals("3"))
        FlightBooking.destinationAirport = DestinationAirport.Oulu_Airport;
        if(str3.equals("4"))
        FlightBooking.destinationAirport = DestinationAirport.Helsinki_Airport;
    }
    public DestinationAirport getDestinationAirport(){
        return destinationAirport;
    }


    enum TripType {
        ONE_WAY,RETURN
    }
    public void setTripType(String str2){
       if(str2.equals("1"))
       FlightBooking.tripType = TripType.ONE_WAY;
       if(str2.equals("2")){
        FlightBooking.tripType = TripType.RETURN;
       }
    }
    public TripType getTripType(){
        return tripType;
    }
    enum TripDestination{
        Nanjing, BEIJING, Shanghai, Oulu, Helsinki, Paris
    }
    public void setTripDestination(String str2, String str3){
        if(str3.equals("1"))
        FlightBooking.tripDestination = TripDestination.Nanjing;
        if(str3.equals("2"))
        FlightBooking.tripDestination = TripDestination.BEIJING;
        if(str3.equals("3"))
        FlightBooking.tripDestination = TripDestination.Oulu;
        if(str3.equals("4"))
        FlightBooking.tripDestination = TripDestination.Helsinki;
     }
     public TripDestination getTripDestination(){
         return tripDestination;
     }
  

    public FlightBooking(int size) {
        FlightBooking.asd = size;
    }
    

    public void setPassengerFullName(int i, String name){
       passengerFullName[i] = name;
    }

    public String getPassengerFullName(int j){
         return passengerFullName[j];
    }
    public void setPassengerGender(int i, String Gender){
        passengerGender[i] = Gender;
     }
 
     public String getPassengerGender(int j){
          return passengerGender[j];
     }
     public void setPassengerAge(int i, int Age){
        passengerAge[i] = Age;
     }
 
     public int getPassengerAge(int j){
          return passengerAge[j];
     }

    public String getFlightCompany(){
        return flightCompany;
    } 
  
    public LocalDate getDepartingDate(){
        return FlightBooking.departureDate;
    }
    public void setDepartureDate(LocalDate sskk1){
        FlightBooking.departureDate = sskk1;
    }

    public LocalDate getReturnDate(){
        return FlightBooking.returnDate;
    }
    public void setReturnDate(LocalDate b){
        Period next = Period.between(departureDate,b);
        LocalDate sskk5 = b.plusDays(1);
        LocalDate sskk6 = b.plusDays(2);
        if(next.getDays() == 0){
            FlightBooking.returnDate = sskk6;
        }
        
        if(0< next.getDays() && next.getDays() <2){
            FlightBooking.returnDate = sskk5;
        }
        if(next.getDays() >2){
            FlightBooking.returnDate = b;
        }
    }

    public int getAdultPassengers(){
        return adultPassengers;
    }

    public int getChildrenPassengers(){
        return childPassengers;
    }

    public int getTotalPassengers(){
        return totalPassengers;
    }
    public void setTotalPassengers(int childPassengers,int adultPassengers){
       FlightBooking.totalPassengers = childPassengers+adultPassengers;
    }

    public void setTotalTicketPrice( ){
       
            if(tripType.equals(TripType.RETURN)){
                FlightBooking.totalTicketPrice = departingTicketPrice+returnTicketPrice;}
                if(tripType.equals(TripType.ONE_WAY)){
                    FlightBooking.totalTicketPrice = departingTicketPrice;  
                    }
    }
    public double getTotalTicketPrice(){
        
        return totalTicketPrice;
    }

    public double getDepartingTicketPrice(){
        return departingTicketPrice;
    }
    public void setDepartingTicketPrice(int childPassengers, int adultPassengers){
        if(tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Nanjing)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.Helsinki)){
           double price = 345; if(bookingClass.equals(BookingClass.FIRST)){
            double price2 = 250; FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+price2);
         }
         if(bookingClass.equals(BookingClass.Business)){
            double price2 = 150; FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+price2);
         }
         if(bookingClass.equals(BookingClass.Economy)){
            double price2 = 50;FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+price2);  }
          }
          if(tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.Helsinki)||tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Helsinki)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.Nanjing)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.Nanjing)){
           double price = 375;if(bookingClass.equals(BookingClass.FIRST)){
            double price2 = 250; FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+price2);
         }
         if(bookingClass.equals(BookingClass.Business)){
            double price2 = 150; FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+price2);
         }
         if(bookingClass.equals(BookingClass.Economy)){
            double price2 = 50;FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * (price+price2);  }
          }
      
    }

    public double getReturnTicketPrice(){
        return returnTicketPrice;
    }
    public void setReturnTicketPrice(){
    FlightBooking.returnTicketPrice = departingTicketPrice;
       
    }
    public String getTicketNumber(int a){
        
        return FlightBooking.ticketNumber[a];
    }
    public void setTicketNumber(int a){
        if(tripType.equals(TripType.ONE_WAY)&&bookingClass.equals(BookingClass.FIRST)){
            x = "11F";
        }
        if(tripType.equals(TripType.ONE_WAY)&&bookingClass.equals(BookingClass.Business)){
            x = "11B";
        }
        if(tripType.equals(TripType.ONE_WAY)&&bookingClass.equals(BookingClass.Economy)){
            x = "11E";
        }
        if(tripType.equals(TripType.RETURN)&&bookingClass.equals(BookingClass.FIRST)){
            x = "22F";
        }
        if(tripType.equals(TripType.RETURN)&&bookingClass.equals(BookingClass.Business)){
            x = "22B";
        }
        if(tripType.equals(TripType.RETURN)&&bookingClass.equals(BookingClass.Economy)){
            x = "22E";
        }
        if(tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Nanjing)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.Helsinki)){
            y = "DOM";
          }
          if(tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.Helsinki)||tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Helsinki)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.Nanjing)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.Nanjing)){
             y = "INT";
          }


        String kk =creatTnumber(4);
        FlightBooking.ticketNumber[a] = x + kk + y ;
    }
    
   
    public String toString(){
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        flightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " +  ticketNumber + "\n" + 
        "From " + tripSource + " to " + tripDestination + "\n" +
        "Date of departure: " + departureDate + "\n" +
        "Date of return: " + returnDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice;
       }


    public void gety(String kk) {
    }
    public static String creatTnumber(int n){
        String codes="";
        Random r=new Random();
        for(int i=0;i<4;i++){
            int num=r.nextInt(3);
			switch(num) {
			case 0:
            codes+=r.nextInt(10);
			break;
			case 1:
            char ch1=(char)(r.nextInt(26)+65);
				codes+=ch1;
				break;
			case 2:
            char ch2=(char)(r.nextInt(26)+97);
				codes+=ch2;
				break;
			}
		}
		return codes;
	}
    public void reserveTickets(int size){
        String[] Name = new String[size];
        String[] Gender = new String[size];
        int[] Age = new int[3];
        Scanner input1 = new Scanner(System.in);
        for(int a = 0;a<size;a++){
        System.out.println("Give your full name:");
        Name[a] = input1.nextLine();
        setPassengerFullName(a, Name[a]);}
        for(int a = 0;a<size;a++){
        System.out.println("Give your Gender:");
        Gender[a] = input1.nextLine();
        setPassengerGender(a,Gender[a]);}
        for(int a = 0;a<size;a++){
        System.out.println("Give your age");
        Age[a] = input1.nextInt();
        setPassengerAge(a, Age[a]);
        }
        Scanner sc1 =new Scanner(System.in);
        System.out.println("请选择想要的机票类型：");
        System.out.println("1.	First");
        System.out.println("2.	Business");
        System.out.println("3.	Economy");
        int m = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请选择单向还是返回：");
        System.out.println("1.	One way");
        System.out.println("2.	Return");
        int n = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("请选择想去的地方：");
        System.out.println("1.	Nanjing");
        System.out.println("2.	Beijing");
        System.out.println("3.	Oulu");
        System.out.println("4.	Helsinki");
        int k = sc3.nextInt();
        Scanner sc4 = new Scanner(System.in);
        System.out.println("请选择想回去的地方：");
        System.out.println("1.	Nanjing");
        System.out.println("2.	Beijing");
        System.out.println("3.	Oulu");
        System.out.println("4.	Helsinki");
        int h = sc4.nextInt();
        String str ;
        switch(m){
        case 1:
        str = "1";setBookingClass(str);getBookingClass();break;
        case 2:
        str = "2";setBookingClass(str);getBookingClass();break;
        case 3:
        str = "3";setBookingClass(str);getBookingClass();break;
        }
        
        String str2;
        switch(n){
        case 1:
        str2 = "1";setTripType(str2);getTripType();break;
        case 2:
        str2 = "2";setTripType(str2);getTripType();break;
        }
        setpo(n);
        
        String str3;
        switch(k){
        case 1:
        str3 = "1";setTripSource(str3);setyy(str3);getTripSource();setSourceAirport(str3);getsourceAirport();break;
        case 2:
        str3 = "2";setTripSource(str3);setyy(str3);getTripSource();setSourceAirport(str3);getsourceAirport();break;
        case 3:
        str3 = "3";setTripSource(str3);setyy(str3);getTripSource();setSourceAirport(str3);getsourceAirport();break;
        case 4:
        str3 = "4";setTripSource(str3);setyy(str3);getTripSource();setSourceAirport(str3);getsourceAirport();break;
        }
       
        
        
        String bh = getyy();
        String str4;
        switch(h){
            case 1:
            str4 = "1";setTripDestination(bh,str4);getTripDestination();setDestinationAirport(bh, str4);getDestinationAirport();break;
            case 2:
            str4 = "2";setTripDestination(bh,str4);getTripDestination();setDestinationAirport(bh, str4);getDestinationAirport();break;
            case 3:
            str4 = "3";setTripDestination(bh,str4);getTripDestination();setDestinationAirport(bh, str4);getDestinationAirport();break;
            case 4:
            str4 = "4";setTripDestination(bh,str4);getTripDestination();setDestinationAirport(bh, str4);getDestinationAirport();break;
    
            }
        
        Scanner aa = new Scanner(System.in);
        System.out.println("请选择去的日期");
        String Date = aa.nextLine();
        LocalDate sskk3 = LocalDate.parse(Date);
        setDepartureDate(sskk3);
    
        Scanner aa1 =new Scanner(System.in);
        System.out.println("请选择返回的日期");
        String Date1 = aa1.nextLine();
        LocalDate sskk4 = LocalDate.parse(Date1);
        setReturnDate(sskk4);
        Scanner number = new Scanner(System.in);
        System.out.println("请输入是几号乘客：");
        int a = number.nextInt();
        String passengerFullName = getPassengerFullName(a);
        int passengerAge = getPassengerAge(a);
        String passengerGender = getPassengerGender(a);
        setTicketNumber(a);
        setFlightSeats(a);
        Scanner dfg = new Scanner(System.in);
        System.out.println("请输入要选择的座位 :");
        int xx = dfg.nextInt();
        int xx1 = xx-1;
        String fs1 = getFlightSeats(xx1);
        String ticketNumber = getTicketNumber(a);
        String company = getFlightCompany();
        TripSource Source = getTripSource();
        SourceAirport sourceAirport = getsourceAirport();
        TripDestination destination = getTripDestination();
        DestinationAirport destinationAirport = getDestinationAirport(); 
        LocalDate departureDate = getDepartingDate();
        LocalDate returningDate = getReturnDate();
        setTotalPassengers(2,1);
        int totalPassengers = getTotalPassengers();
        setDepartingTicketPrice(2,1);
       
        setReturnTicketPrice();
        
       
        setTotalTicketPrice();
        
        double totalTicketPrice = getTotalTicketPrice();
       
        System.out.println("Thank you for booking your flight with " + 
          company + "\n" + "You reserved a total of " + size + "\n" +"Here are the trip details for " + a + " passenger");
          System.out.println(
          "Ticket Number: " + ticketNumber + "\n" + "passenger full name:" + passengerFullName + "\n" + "passenger age:" +
          passengerAge + "\n" + "passenger gender:" + passengerGender + "\n" +
          "From " + Source +"\n" + sourceAirport + "\n" + "To: " + destination + destinationAirport +"\n" +
          "Date of departure: " + departureDate + "\n" +
          "Date of return: " + returningDate + "\n" +
          "Total passengers: " + totalPassengers + "\n" +
          "Total ticket price in Euros: " + totalTicketPrice + "\n" + "The seat is :" + fs1);
         
        input1.close();
        sc1.close();
        sc2.close();
        sc3.close();
        sc4.close();
        aa.close();
        aa1.close();
        number.close();
        dfg.close();
        
        
    }
    public void setFlightSeats(int l){
        List<Object> list  = new ArrayList<>();
      
        for(int i=1;i<=410;i++){
           if(i<=32){
            list.add(i +"F-Booked");
           }
           if(32<i&&i<=100){
            list.add(i +"F");
           }
           if(100<i&&i<=118){
            list.add(i+"B-Booked");
           }
           if(118<i&&i<=150){
            list.add(i+"B");
           }
           if(i==151){
            for(int p = 1;p<=10;p++){
            list.add("A" + p + "EC-Booked");
            }
        }
            if(i==161){
                for(int p = 1;p<=10;p++){
                    list.add("B" + p + "EC-Booked");
                    }
        }
        if(i==171){
            for(int p = 1;p<=10;p++){
                list.add("C" + p + "EC-Booked");
                }
        }
        if(i==181){
            for(int p = 1;p<=10;p++){
                list.add("D" + p + "EC-Booked");
                }
        }
        if(i==191){
            for(int p = 1;p<=10;p++){
                list.add("E" + p + "EC-Booked");
                }
        }
        if(i==201){
            for(int p = 1;p<=10;p++){
                list.add("F" + p + "EC-Booked");
                }
        }
        if(i==211){
            for(int p = 1;p<=10;p++){
                list.add("G" + p + "EC-Booked");
                }
        }
        if(i==221){
            for(int p = 1;p<=10;p++){
                list.add("H" + p + "EC-Booked");
                }
        }
        if(i==231){
            for(int p = 1;p<=10;p++){
                list.add("I" + p + "EC-Booked");
                }
        }
        if(i==241){
            for(int p = 1;p<=10;p++){
                list.add("J" + p + "EC-Booked");
                }
        }
        if(i==251){
            for(int p = 1;p<=10;p++){
                list.add("K" + p + "EC-Booked");
                }
        }
        if(i==261){
            for(int p = 1;p<=10;p++){
                list.add("L" + p + "EC-Booked");
                }
        }
        if(i==271){
            for(int p = 1;p<=9;p++){
                list.add("M" + p + "EC-Booked");
                }
        }
       if(i==280){
        int p=10;
        list.add("M" + p + "EC");
       }

        if(i==281){
            for(int p = 1;p<=10;p++){
                list.add("N" + p + "EC");
                }
        }
        if(i==291){
            for(int p = 1;p<=10;p++){
                list.add("O" + p + "EC");
                }
        }
        if(i==301){
            for(int p = 1;p<=10;p++){
                list.add("p" + p + "EC");
                }
        }
        if(i==311){
            for(int p = 1;p<=10;p++){
                list.add("Q" + p + "EC");
                }
        }
        if(i==321){
            for(int p = 1;p<=10;p++){
                list.add("R" + p + "EC");
                }
        }
        if(i==331){
            for(int p = 1;p<=10;p++){
                list.add("S" + p + "EC");
                }
        }
        if(i==341){
            for(int p = 1;p<=10;p++){
                list.add("T" + p + "EC");
                }
        }
        if(i==351){
            for(int p = 1;p<=10;p++){
                list.add("U" + p + "EC");
                }
        }
        if(i==361){
            for(int p = 1;p<=10;p++){
                list.add("V" + p + "EC");
                }
        }
        if(i==371){
            for(int p = 1;p<=10;p++){
                list.add("W" + p + "EC");
                }
        }
        if(i==381){
            for(int p = 1;p<=10;p++){
                list.add("X" + p + "EC");
                }
        }
        if(i==391){
            for(int p = 1;p<=10;p++){
                list.add("Y" + p + "EC");
                }
        }
        if(i==401){
            for(int p = 1;p<=10;p++){
                list.add("z" + p + "EC");
                }
        }

        
        }  
       

       
        int size=list.size();  
        flightSeats = (String[])list.toArray(new String[size]);  
       




    }
    public String getFlightSeats(int k){
        bookSeats(k);
        return flightSeats[k];
      
    }
    public void  bookSeats(int kk){
       
      if(kk<=32||100<kk&&kk<=118||150<kk&&kk<279){
       flightSeats[kk] = null;
      }
      else{
        flightSeats[kk] = flightSeats[kk] + "-Booked";
      }


    }

    
   
       
}


