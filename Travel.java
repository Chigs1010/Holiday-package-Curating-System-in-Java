import java.util.*;
import java.io.*;
import java.io.IOException;

interface Display {
    void show();

}

interface Enter {
    void enter();
}

public class Travel implements Display {

    public int choice;
    public static double Total_amount;

    public void show() {
        System.out.println("*******************************************");
        System.out.println("Welcom to C.A.S.h Travel Package Curating System ");
        System.out.println("*******************************************");
        System.out.println("Enter Your Details :: ");
        EnterPassDetails ep = new EnterPassDetails();
        ep.enter();
        System.out.println(" Basic Details Entered   ");
        System.out.println("*******************************************");

        System.out.println("Press 1 for USA trip ");
        System.out.println("Press 2 for UK trip");
        System.out.print("Enter your choice :: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("USA");
                USA u = new USA();
                u.show();

                break;
            case 2:
                System.out.println("UK");
                UK k = new UK();
                k.show();

                break;
            default:
                System.out.println("You have entered the wrong value.");
                System.out.println("Please exit and start again.");
                break;
        }

    }

    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Travel t = new Travel();
        t.show();
        sc.close();

    }

}

class PassDetails {
    String Name;
    int Age;
    String Gender;
    String DOB;

    PassDetails(String Name, int Age, String Gender, String DOB) {
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
        this.DOB = DOB;
    }

    PassDetails() {
    }

}

class EnterPassDetails extends PassDetails implements Enter {

    EnterPassDetails(String Name, int Age, String Gender, String DOB) {
        super(Name, Age, Gender, DOB);

    }

    EnterPassDetails() {

    }

    public void enter() {
        Scanner sc = Travel.sc;
        System.out.println("Enter Your Name::");
        Name = sc.nextLine();
        System.out.println("Enter Your Age::");
        Age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Gender::");
        Gender = sc.nextLine();
        System.out.println("Enter Your DOB::");
        DOB = sc.nextLine();

        try {
            FileWriter fw2 = new FileWriter("Bill.txt");
            fw2.write("*******************************************\n");
            fw2.write("Welcom to C.A.S.h Travel curating System \n");
            fw2.write("*******************************************\n");
            fw2.write("***YOUR SPECIAL PACKAGE**** \n ");
            fw2.write("Name of customer :: " + Name + " \n");
            fw2.write("Gender :: " + Gender + "\n");
            fw2.write("Age :: " + String.valueOf(Age) + "\n");
            fw2.write("DOB :: " + DOB + "\n");

            fw2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }

}

class USA extends Travel {

    public void show() {
        System.out.println("****YOU HAVE SELECTED USA****");
        System.out.println("Enter the City :");
        System.out.println("Press(1)-NEW YORK");
        System.out.println("Press(2)-LOS ANGELES");
        System.out.println("Press(3)-SAN FRANCISCO");
        Scanner sc = Travel.sc;
        int choice = sc.nextInt();
        String City;
        switch (choice) {
            case 1:
                City = "NEW YORK";
                break;
            case 2:
                City = "LOS ANGELES";
                break;
            case 3:
                City = "SAN FRANCISCO";
                break;
            default:
                City = "Please choose the correct option";
                break;
        }
        System.out.println("****YOU HAVE SELECTED " + City + "****");
        System.out.println("************DETAILS ENTERED************");

        try {
            FileWriter fw2 = new FileWriter("Bill.txt", true);
            fw2.write("Country :: USA " + " \n");
            fw2.write("City :: " + City + "\n");

            fw2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        hotels(City);
    }

    static void hotels(String City) {
        int date = 0;
        switch (City) {
            case "NEW YORK":
                NEW_YORK(date);
                break;
            case "LOS ANGELES":
                LOS_ANGELES(date);
                break;
            case "SAN_FRANCISCO":
                SAN_FRANCISCO(date);
                break;
            default:

        }
    }

    static void NEW_YORK(int date) {
        String hotel = null;
        int choice;
        Scanner sc = Travel.sc;
        System.out.println("Choose the hotel you want to stay");
        System.out.println("press(1)-3 star hotel");
        System.out.println("press(2)-5 star hotel");

        choice = sc.nextInt();
        switch (choice) {
            case 1:
                hotel = "3 star hotel";
                Travel.Total_amount = 2000.0;
                
                break;
            case 2:
                hotel = "5 star hotel";
                Travel.Total_amount = 5000.0;
                
                break;
            default:
                System.out.println("hotel is not selected");
        }

        System.out.println("****YOU HAVE SELECTED " + hotel + "****");
        System.out.println("************DETAILS ENTERED************");

        try {
            FileWriter fw2 = new FileWriter("Bill.txt", true);
            fw2.write("Hotel ::  " + hotel);
            fw2.write("\n");

            fw2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        taxiService t = new taxiService();
        t.show();
    }

    static void LOS_ANGELES(int date) {
        String hotel = null;

        int choice;
        Scanner sc = Travel.sc;
        System.out.println("Choose the hotel you want to stay");
        System.out.println("press(1)-3 star hotel");
        System.out.println("press(2)-5 star hotel");

        choice = sc.nextInt();
        switch (choice) {
            case 1:
                hotel = "3 star hotel";
                Travel.Total_amount = 2000.0;
                
                break;
            case 2:
                hotel = "5 star hotel";
                Travel.Total_amount = 6000.0;
                
                break;
            default:
                System.out.println("hotel is not selected");
        }

        System.out.println("****YOU HAVE SELECTED " + hotel + "****");
        System.out.println("************DETAILS ENTERED************");

        try {
            FileWriter fw2 = new FileWriter("Bill.txt", true);
            fw2.write("Hotel ::  " + hotel);
            fw2.write("\n");

            fw2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        taxiService t = new taxiService();
        t.show();
    }

    static void SAN_FRANCISCO(int date) {
        String hotel = null;

        int choice;
        Scanner sc = Travel.sc;
        System.out.println("Choose the hotel you want to stay");
        System.out.println("press(1)-3 star hotel");
        System.out.println("press(2)-5 star hotel");

        choice = sc.nextInt();
        switch (choice) {
            case 1:
                hotel = "3-star hotel";
                Travel.Total_amount = 2500.0;
                
                break;
            case 2:
                hotel = "5 star hotel";
                Travel.Total_amount = 2000.0;
                
                break;
            default:
                System.out.println("hotel is not selected");
        }

        System.out.println("****YOU HAVE SELECTED " + hotel + "****");
        System.out.println("************DETAILS ENTERED************");

        try {
            FileWriter fw2 = new FileWriter("Bill.txt", true);
            fw2.write("Hotel ::  " + hotel);
            fw2.write("\n");

            fw2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

        taxiService t = new taxiService();
        t.show();
    }

}

class UK extends Travel {
    public void show() {
        System.out.println("****YOU HAVE SELECTED UK****");
        System.out.println("Enter the City :");
        System.out.println("Press(1)-London");
        System.out.println("Press(2)-Manchester");
        System.out.println("Press(3)- Liverpool");
        Scanner sc = Travel.sc;
        int choice = sc.nextInt();
        String City;

        switch (choice) {
            case 1:
                City = "London";
                break;
            case 2:
                City = "Manchester";
                break;
            case 3:
                City = "Liverpool";
                break;
            default:
                City = "Not choosen";
                break;
        }
        System.out.println("****YOU HAVE SELECTED " + City + "****");
        System.out.println("************DETAILS ENTERED************");
        try {
            FileWriter fw2 = new FileWriter("Bill.txt", true);
            fw2.write("Country :: UK " + " \n");
            fw2.write("City :: " + City + "\n");

            fw2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

        hotels(City);

    }

    static void Manchester(int date) {
        String hotel = null;
        int choice;
        Scanner sc = Travel.sc;
        System.out.println("Choose the hotel you want to stay");
        System.out.println("press(1)-3 star hotel");
        System.out.println("press(2)-5 star hotel");

        choice = sc.nextInt();
        switch (choice) {
            case 1:
                hotel = "3 star hotel";
                Travel.Total_amount = 1000.0;
               
                break;
            case 2:
                hotel = "5 star hotel";
                Travel.Total_amount = 4000.0;
                
                break;
            default:
                System.out.println("hotel is not selected");
        }

        System.out.println("****YOU HAVE SELECTED " + hotel + "****");
        System.out.println("************DETAILS ENTERED************");

        try {
            FileWriter fw2 = new FileWriter("Bill.txt", true);
            fw2.write("Hotel ::  " + hotel);
            fw2.write("\n");

            fw2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        taxiService t = new taxiService();
        t.show();
    }

    static void Liverpool(int date) {
        String hotel = null;
        int choice;
        Scanner sc = Travel.sc;
        System.out.println("Choose the hotel you want to stay");
        System.out.println("press(1)-3 star hotel");
        System.out.println("press(2)-5 star hotel");

        choice = sc.nextInt();
        switch (choice) {
            case 1:
                hotel = "3 star hotel";
                Travel.Total_amount = 2000.0;
               
                break;
            case 2:
                hotel = "5 star hotel";
                Travel.Total_amount = 3500.0;
                
                break;
            default:
                System.out.println("hotel is not selected");
        }

        System.out.println("****YOU HAVE SELECTED " + hotel + "****");
        System.out.println("************DETAILS ENTERED************");

        try {
            FileWriter fw2 = new FileWriter("Bill.txt", true);
            fw2.write("Hotel ::  " + hotel);
            fw2.write("\n");

            fw2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        taxiService t = new taxiService();
        t.show();
    }

    static void London(int date) {
        String hotel = null;
        int choice;
        Scanner sc = Travel.sc;
        System.out.println("Choose the hotel you want to stay");
        System.out.println("press(1)-3 star hotel");
        System.out.println("press(2)-5 star hotel");

        choice = sc.nextInt();
        switch (choice) {
            case 1:
                hotel = "3 star hotel";
                Travel.Total_amount = 2000.0;
                
                break;
            case 2:
                hotel = "5 star hotel";
                Travel.Total_amount = 4000.0;
                
                break;
            default:
                System.out.println("hotel is not selected");
        }

        System.out.println("****YOU HAVE SELECTED " + hotel + "****");
        System.out.println("************DETAILS ENTERED************");

        try {
            FileWriter fw2 = new FileWriter("Bill.txt", true);
            fw2.write("Hotel ::  " + hotel);
            fw2.write("\n");

            fw2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        taxiService t = new taxiService();
        t.show();
    }

    static void hotels(String City) {
        int date = 0;
        switch (City) {
            case "London":
                London(date);
                break;
            case "Manchester":
                Manchester(date);
                break;
            case "Liverpool":
                Liverpool(date);
                break;
            default:

        }

    }
}

class taxiService extends Travel {
    public void show() {
        System.out.println("--------------------------------------------------");
        System.out.println("Do you want to opt-in for the taxi service :");
        System.out.println("press(1)-YES");
        System.out.println("press(2)-NO");
        Scanner sc = Travel.sc;
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                Travel.Total_amount = Travel.Total_amount + 2000.0;
                try {
                    FileWriter fw2 = new FileWriter("Bill.txt", true);

                    fw2.write(" TAXI services :: YES \n");

                    fw2.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());

                }
                break;
            case 2:
                Travel.Total_amount = Travel.Total_amount + 0.0;
                try {
                    FileWriter fw2 = new FileWriter("Bill.txt", true);

                    fw2.write(" TAXI services :: NO \n");

                    fw2.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());

                }
                break;
            default:
                System.out.println("incorrect choice");
        }
        food f = new food();
        f.show();
    }
}

class food extends Travel {
    public void show() {
        System.out.println("--------------------------------------------------");
        System.out.println("Do you want to include food and dine-services in your tour package: ");
        System.out.println("press(1)-YES");
        System.out.println("press(2)-NO");
        Scanner sc = Travel.sc;
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                Travel.Total_amount = Travel.Total_amount + 4000.0;
                try {
                    FileWriter fw2 = new FileWriter("Bill.txt", true);

                    fw2.write(" food and dine-services :: YES \n");

                    fw2.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());

                }
                break;
            case 2:
                Travel.Total_amount = Travel.Total_amount + 0.0;
                try {
                    FileWriter fw2 = new FileWriter("Bill.txt", true);

                    fw2.write(" food and dine-services :: NO \n");

                    fw2.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());

                }
                break;
            default:
                System.out.println("incorrect choice");
        }
        Bills b = new Bills();
        b.Bill_amt(Total_amount);
    }
}

class Bills extends Travel {

    static int Adult;
    static int Child;
    static int Days;

    void Bill_amt(double Total_amount) {
        Scanner sc = Travel.sc;
        System.out.println("Enter total number of Adults (Above 12 years of age )");
        int Adult = sc.nextInt();
        System.out.println("Enter total number of Children (Below 12 years of age )");
        int Child = sc.nextInt();
        System.out.println("Enter total number of Days of the trip");
        int Days = sc.nextInt();

        Travel.Total_amount = (Days * ((Travel.Total_amount * Adult) + (Travel.Total_amount / 2) * Child));
        System.out.println("Toatal amount of trip in USD $ ::  " + Travel.Total_amount);
        try {
            FileWriter fw2 = new FileWriter("Bill.txt", true);

            fw2.write("Total number of Adults (Above 12 years of age ) :: " + Adult + "\n");
            fw2.write("Total number of Children (Below 12 years of age ) :: " + Child + "\n");
            fw2.write("Total number of Days of the trip :: " + Days + "\n");
            fw2.write("Total Amount in USD $ :: " + Travel.Total_amount + "\n");

            fw2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

        System.out.println("**********Your Special Package looks like this********** ");
        try {
            FileReader fr = new FileReader("Bill.txt");
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();
            System.out.println("----------------------------------------------");
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        System.out.println("THANKS FOR CHOOSING C.A.Sh TRAVEL CURATING SYSTEM");
        Company_record cr = new Company_record();
        cr.record();

    }
}

class Company_record {
    void record() {
        try {

            FileWriter fw2 = new FileWriter("CompanyRecord.txt", true);
            BufferedReader br = new BufferedReader(new FileReader("Bill.txt"));
            String line = br.readLine();
            while (line != null) {
                fw2.write(line);
                fw2.write("\n");
                line = br.readLine();

            }
            fw2.close();
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
