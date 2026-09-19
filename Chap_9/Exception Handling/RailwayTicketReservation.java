package Execption;

import java.util.InputMismatchException;
import java.util.Scanner;


// =====================================================
// CUSTOM EXCEPTION 1 - INVALID TRAIN
// =====================================================

class InvalidTrainException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidTrainException(String message) {
        super(message);
    }
}


// =====================================================
// CUSTOM EXCEPTION 2 - INVALID AGE
// =====================================================

class InvalidAgeException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidAgeException(String message) {
        super(message);
    }
}


// =====================================================
// CUSTOM EXCEPTION 3 - TICKET LIMIT
// =====================================================

class TicketLimitException extends Exception {

    private static final long serialVersionUID = 1L;

    public TicketLimitException(String message) {
        super(message);
    }
}


// =====================================================
// CUSTOM EXCEPTION 4 - INVALID TICKET (PNR)
// =====================================================

class InvalidTicketException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidTicketException(String message) {
        super(message);
    }
}


// =====================================================
// RAILWAY INTERFACE
// =====================================================

interface RailwayOperations {

    void bookTicket(String passengerName,
                    int age,
                    int trainNumber,
                    int numberOfTickets)
            throws InvalidAgeException,
                   InvalidTrainException,
                   TicketLimitException;

    void searchTicket(int pnr)
            throws InvalidTicketException;

    void cancelTicket(int pnr)
            throws InvalidTicketException;

    void displayTrains();
}


// =====================================================
// TRAIN CLASS
// =====================================================

class Train {

    public static final int MAX_TICKETS = 6;
    public static final int MIN_AGE = 5;

    private int trainNumber;
    private String trainName;
    private String source;
    private String destination;
    private double farePerTicket;
    private int availableSeats;

    protected int totalBookings;


    // Constructor
    public Train(int trainNumber,
                 String trainName,
                 String source,
                 String destination,
                 double farePerTicket,
                 int availableSeats) {

        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.farePerTicket = farePerTicket;
        this.availableSeats = availableSeats;

        this.totalBookings = 0;
    }


    // Getter methods

    public int getTrainNumber() {
        return trainNumber;
    }


    public String getTrainName() {
        return trainName;
    }


    public String getSource() {
        return source;
    }


    public String getDestination() {
        return destination;
    }


    public double getFarePerTicket() {
        return farePerTicket;
    }


    public int getAvailableSeats() {
        return availableSeats;
    }


    // Calculate fare
    public double calculateFare(int numberOfTickets) {

        return numberOfTickets * farePerTicket;
    }


    // Reserve seats
    public void reserveSeats(int numberOfTickets)
            throws TicketLimitException {


        // At least one ticket
        if (numberOfTickets < 1) {

            throw new TicketLimitException(
                    "At least 1 ticket must be booked."
            );
        }


        // Maximum 6 tickets per booking
        if (numberOfTickets > MAX_TICKETS) {

            throw new TicketLimitException(
                    "Maximum " + MAX_TICKETS
                    + " tickets allowed per booking."
            );
        }


        // Seats must be available
        if (numberOfTickets > availableSeats) {

            throw new TicketLimitException(
                    "Only " + availableSeats
                    + " seat(s) available on this train."
            );
        }


        availableSeats = availableSeats - numberOfTickets;

        totalBookings++;
    }


    // Release seats (used when a ticket is cancelled)
    public void releaseSeats(int numberOfTickets) {

        availableSeats = availableSeats + numberOfTickets;
    }


    // Display train details
    public void displayTrain() {

        System.out.println();
        System.out.println("Train Details");
        System.out.println("Train Number : " + trainNumber);
        System.out.println("Train Name   : " + trainName);
        System.out.println("Route        : " + source
                + " -> " + destination);
    }


    // Method overloading
    public void displayTrain(boolean showSeatsAndFare) {

        displayTrain();

        if (showSeatsAndFare) {

            System.out.println("Fare/Ticket  : ₹" + farePerTicket);
            System.out.println("Seats Left   : " + availableSeats);
        }
    }
}


// =====================================================
// EXPRESS TRAIN CLASS
// =====================================================

class ExpressTrain extends Train {

    private int stops;


    public ExpressTrain(int trainNumber,
                        String trainName,
                        String source,
                        String destination,
                        double farePerTicket,
                        int availableSeats,
                        int stops) {

        super(trainNumber, trainName, source,
                destination, farePerTicket, availableSeats);

        this.stops = stops;
    }


    public void expressDetails() {

        System.out.println();
        System.out.println("Train Type   : EXPRESS");
        System.out.println("Total Stops  : " + stops);
    }
}


// =====================================================
// SUPERFAST TRAIN CLASS
// =====================================================

class SuperfastTrain extends Train {

    private boolean pantryCar;


    public SuperfastTrain(int trainNumber,
                          String trainName,
                          String source,
                          String destination,
                          double farePerTicket,
                          int availableSeats,
                          boolean pantryCar) {

        super(trainNumber, trainName, source,
                destination, farePerTicket, availableSeats);

        this.pantryCar = pantryCar;
    }


    public void superfastDetails() {

        System.out.println();
        System.out.println("Train Type   : SUPERFAST");

        if (pantryCar) {

            System.out.println("Pantry Car   : Available");
        }

        else {

            System.out.println("Pantry Car   : Not available");
        }
    }
}


// =====================================================
// TICKET CLASS
// =====================================================

class Ticket {

    private int pnr;
    private String passengerName;
    private int age;
    private Train train;
    private int numberOfTickets;
    private double totalFare;

    protected boolean cancelled;


    // Constructor
    public Ticket(int pnr,
                  String passengerName,
                  int age,
                  Train train,
                  int numberOfTickets,
                  double totalFare) {

        this.pnr = pnr;
        this.passengerName = passengerName;
        this.age = age;
        this.train = train;
        this.numberOfTickets = numberOfTickets;
        this.totalFare = totalFare;

        this.cancelled = false;
    }


    // Getter methods

    public int getPnr() {
        return pnr;
    }


    public Train getTrain() {
        return train;
    }


    public int getNumberOfTickets() {
        return numberOfTickets;
    }


    public double getTotalFare() {
        return totalFare;
    }


    // Display ticket details
    public void displayTicket() {

        System.out.println();
        System.out.println("Ticket Details");
        System.out.println("PNR Number  : " + pnr);
        System.out.println("Passenger   : " + passengerName);
        System.out.println("Age         : " + age);
        System.out.println("Train       : " + train.getTrainNumber()
                + " - " + train.getTrainName());
        System.out.println("Route       : " + train.getSource()
                + " -> " + train.getDestination());
        System.out.println("Tickets     : " + numberOfTickets);

        if (cancelled) {

            System.out.println("Status      : CANCELLED");
        }

        else {

            System.out.println("Status      : CONFIRMED");
        }
    }


    // Method overloading
    public void displayTicket(boolean showFare) {

        displayTicket();

        if (showFare) {

            System.out.println("Total Fare  : ₹" + totalFare);
        }
    }
}


// =====================================================
// RAILWAY SYSTEM
// =====================================================

class RailwaySystem implements RailwayOperations {

    private Train[] trains;
    private int trainCount;

    private Ticket[] bookings;
    private int bookingCount;

    private int nextPnr;


    // Constructor
    public RailwaySystem(int trainSize, int bookingSize) {

        trains = new Train[trainSize];

        trainCount = 0;

        bookings = new Ticket[bookingSize];

        bookingCount = 0;

        nextPnr = 1001;
    }


    // =================================================
    // ADD TRAIN
    // =================================================

    public void addTrain(Train train) {

        if (trainCount < trains.length) {

            trains[trainCount] = train;

            trainCount++;

        } else {

            System.out.println(
                    "Train storage is full."
            );
        }
    }


    // =================================================
    // FIND TRAIN
    // =================================================

    private Train findTrain(int trainNumber)
            throws InvalidTrainException {

        for (int i = 0; i < trainCount; i++) {

            if (trains[i].getTrainNumber() == trainNumber) {

                return trains[i];
            }
        }


        throw new InvalidTrainException(
                "Train number " + trainNumber
                + " does not exist."
        );
    }


    // =================================================
    // FIND TICKET
    // =================================================

    private Ticket findTicket(int pnr)
            throws InvalidTicketException {

        for (int i = 0; i < bookingCount; i++) {

            if (bookings[i].getPnr() == pnr) {

                return bookings[i];
            }
        }


        throw new InvalidTicketException(
                "PNR " + pnr + " does not exist."
        );
    }


    // =================================================
    // BOOK TICKET
    // =================================================

    public void bookTicket(String passengerName,
                           int age,
                           int trainNumber,
                           int numberOfTickets)
            throws InvalidAgeException,
                   InvalidTrainException,
                   TicketLimitException {


        // Check null
        if (passengerName == null) {

            throw new NullPointerException(
                    "Passenger name cannot be null."
            );
        }


        // Check empty
        if (passengerName.trim().equals("")) {

            throw new NullPointerException(
                    "Passenger name cannot be empty."
            );
        }


        // Check age (minimum 5 years)
        if (age < Train.MIN_AGE) {

            throw new InvalidAgeException(
                    "Age must be at least " + Train.MIN_AGE
                    + " years. You entered " + age + "."
            );
        }


        // Check age (realistic upper limit)
        if (age > 120) {

            throw new InvalidAgeException(
                    "Please enter a valid age (maximum 120)."
            );
        }


        // Find train (throws InvalidTrainException)
        Train train = findTrain(trainNumber);


        // Check booking storage
        if (bookingCount >= bookings.length) {

            System.out.println(
                    "Booking storage is full."
            );

            return;
        }


        // Reserve seats (throws TicketLimitException)
        train.reserveSeats(numberOfTickets);


        // Create ticket
        double fare = train.calculateFare(numberOfTickets);

        Ticket ticket = new Ticket(
                nextPnr,
                passengerName.trim(),
                age,
                train,
                numberOfTickets,
                fare
        );


        bookings[bookingCount] = ticket;

        bookingCount++;

        nextPnr++;


        System.out.println();
        System.out.println("TICKET BOOKED SUCCESSFULLY");

        ticket.displayTicket(true);
    }


    // =================================================
    // SEARCH TICKET
    // =================================================

    public void searchTicket(int pnr)
            throws InvalidTicketException {

        Ticket ticket = findTicket(pnr);


        System.out.println();
        System.out.println("Ticket Found!");

        ticket.displayTicket(true);
    }


    // =================================================
    // CANCEL TICKET
    // =================================================

    public void cancelTicket(int pnr)
            throws InvalidTicketException {

        Ticket ticket = findTicket(pnr);


        // Already cancelled
        if (ticket.cancelled) {

            throw new InvalidTicketException(
                    "PNR " + pnr + " is already cancelled."
            );
        }


        // Cancel and give the seats back
        ticket.cancelled = true;

        ticket.getTrain().releaseSeats(
                ticket.getNumberOfTickets()
        );


        System.out.println();
        System.out.println(
                "Ticket cancelled successfully."
        );

        System.out.println(
                "Refund Amount : ₹" + ticket.getTotalFare()
        );
    }


    // =================================================
    // DISPLAY TRAINS
    // =================================================

    public void displayTrains() {

        System.out.println();
        System.out.println(
                "========== AVAILABLE TRAINS =========="
        );


        if (trainCount == 0) {

            System.out.println(
                    "No trains available."
            );

            return;
        }


        for (int i = 0; i < trainCount; i++) {

            trains[i].displayTrain(true);


            if (trains[i] instanceof ExpressTrain) {

                ExpressTrain express =
                        (ExpressTrain) trains[i];

                express.expressDetails();
            }


            else if (trains[i] instanceof SuperfastTrain) {

                SuperfastTrain superfast =
                        (SuperfastTrain) trains[i];

                superfast.superfastDetails();
            }
        }
    }


    // =================================================
    // DISPLAY ALL BOOKINGS
    // =================================================

    public void displayAllBookings() {

        System.out.println();
        System.out.println(
                "========== ALL BOOKINGS =========="
        );


        if (bookingCount == 0) {

            System.out.println(
                    "No bookings made yet."
            );

            return;
        }


        for (int i = 0; i < bookingCount; i++) {

            System.out.println();

            System.out.println(
                    "Booking " + (i + 1)
            );


            bookings[i].displayTicket(true);
        }
    }
}


// =====================================================
// MAIN CLASS
// =====================================================

public class RailwayTicketReservation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Create railway system
        RailwaySystem system = new RailwaySystem(10, 50);


        // =================================================
        // DEFAULT TRAIN 1
        // =================================================

        ExpressTrain train1 =
                new ExpressTrain(
                        12621,
                        "Tamil Nadu Express",
                        "Chennai",
                        "New Delhi",
                        1200,
                        40,
                        12
                );


        // =================================================
        // DEFAULT TRAIN 2
        // =================================================

        SuperfastTrain train2 =
                new SuperfastTrain(
                        12007,
                        "Shatabdi Express",
                        "Chennai",
                        "Mysuru",
                        900,
                        30,
                        true
                );


        // =================================================
        // DEFAULT TRAIN 3
        // =================================================

        ExpressTrain train3 =
                new ExpressTrain(
                        12631,
                        "Nellai Express",
                        "Chennai",
                        "Tirunelveli",
                        700,
                        35,
                        15
                );


        // Add default trains
        // No message will be printed here

        system.addTrain(train1);
        system.addTrain(train2);
        system.addTrain(train3);


        int choice = 0;


        // =================================================
        // MAIN MENU
        // =================================================

        do {

            System.out.println();

            System.out.println(
                    "========== RAILWAY TICKET RESERVATION =========="
            );

            System.out.println("1. Book Ticket");
            System.out.println("2. Display Trains");
            System.out.println("3. Search Ticket");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. Display All Bookings");
            System.out.println("6. Exit");


            System.out.print(
                    "\nEnter your choice: "
            );


            try {

                choice = Integer.parseInt(
                        sc.nextLine()
                );


                // =================================================
                // 1. BOOK TICKET
                // =================================================

                if (choice == 1) {

                    try {

                        System.out.print(
                                "Enter passenger name: "
                        );

                        String name = sc.nextLine();


                        System.out.print(
                                "Enter age: "
                        );

                        int age = sc.nextInt();


                        System.out.print(
                                "Enter train number: "
                        );

                        int trainNumber = sc.nextInt();


                        System.out.print(
                                "Enter number of tickets: "
                        );

                        int numberOfTickets = sc.nextInt();


                        // Clear the leftover new line
                        sc.nextLine();


                        system.bookTicket(
                                name,
                                age,
                                trainNumber,
                                numberOfTickets
                        );
                    }


                    catch (
                            InvalidAgeException |
                            InvalidTrainException |
                            TicketLimitException e) {

                        System.out.println(
                                "\nBOOKING ERROR: "
                                + e.getMessage()
                        );
                    }


                    catch (InputMismatchException e) {

                        // Discard the wrong input
                        sc.nextLine();

                        System.out.println(
                                "\nINPUT ERROR: Age, train number and "
                                + "number of tickets must be numbers."
                        );
                    }


                    catch (NullPointerException e) {

                        System.out.println(
                                "\nNULL ERROR: "
                                + e.getMessage()
                        );
                    }


                    finally {

                        System.out.println(
                                "Booking process completed."
                        );
                    }
                }


                // =================================================
                // 2. DISPLAY TRAINS
                // =================================================

                else if (choice == 2) {

                    system.displayTrains();
                }


                // =================================================
                // 3. SEARCH TICKET
                // =================================================

                else if (choice == 3) {

                    try {

                        System.out.print(
                                "Enter PNR number: "
                        );

                        int pnr = sc.nextInt();

                        sc.nextLine();


                        system.searchTicket(pnr);
                    }


                    catch (InvalidTicketException e) {

                        System.out.println(
                                "\nTICKET ERROR: "
                                + e.getMessage()
                        );
                    }


                    catch (InputMismatchException e) {

                        sc.nextLine();

                        System.out.println(
                                "\nINPUT ERROR: PNR must be a number."
                        );
                    }


                    finally {

                        System.out.println(
                                "Search process completed."
                        );
                    }
                }


                // =================================================
                // 4. CANCEL TICKET
                // =================================================

                else if (choice == 4) {

                    try {

                        System.out.print(
                                "Enter PNR number: "
                        );

                        int pnr = sc.nextInt();

                        sc.nextLine();


                        system.cancelTicket(pnr);
                    }


                    catch (InvalidTicketException e) {

                        System.out.println(
                                "\nTICKET ERROR: "
                                + e.getMessage()
                        );
                    }


                    catch (InputMismatchException e) {

                        sc.nextLine();

                        System.out.println(
                                "\nINPUT ERROR: PNR must be a number."
                        );
                    }


                    finally {

                        System.out.println(
                                "Cancellation process completed."
                        );
                    }
                }


                // =================================================
                // 5. DISPLAY ALL BOOKINGS
                // =================================================

                else if (choice == 5) {

                    system.displayAllBookings();
                }


                // =================================================
                // 6. EXIT
                // =================================================

                else if (choice == 6) {

                    System.out.println();
                    System.out.println(
                            "Thank you for using Railway Reservation."
                    );
                }


                else {

                    System.out.println(
                            "Invalid menu choice."
                    );
                }


            }


            catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid number."
                );
            }


        } while (choice != 6);


        sc.close();
    }
}
