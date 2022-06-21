import com.sun.source.tree.WhileLoopTree;

import java.awt.event.InputEvent;
import java.io.InputStream;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.regex.Pattern;

public class main {
    private static int Tickets = 10000;

    static void getName(){
        // This Method Gets Users name and Lastname and brings it to the base
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UserName");
        String UserName= sc.nextLine();
        int i = 1;
        if (UserName.length() < 3) System.out.println("UserName should be more than 3 letter(s)");
        if(UserName.length()>3) System.out.println("Enter LastName");
        String LastName = sc.nextLine();
        System.out.println("Hello "+UserName + " " + LastName);
    }
    static void newArrayPlusString(){
        String[] YorN = new String[10];
        for (int i = 0; i < 1; i++) {
            YorN[i] = String.valueOf(i+10);
        }
        String[] NewArray = new String[20];
        System.arraycopy(YorN,0,NewArray,0,10);
        YorN = NewArray;
    }

    static <YorN> void codeToGetIfCustomerNeedsMoreTickets(){
        // This method Gets If Customer Needs more tickets and If he will Press Y He will Join to Sell tickets Method again.
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you need More tickets?");
        System.out.println("Print Y if you need more tickets OR N If you don't Need more");
        String ifAgree= sc.nextLine();

            switch (ifAgree) {

                case "Y":
                    while (ifAgree.equals("Y")) {
                        System.out.println("How much tickets you need?");
                        codeToSumTickets();
                    }
                case "N":
                    if (ifAgree.equals("N")) {
                        break;
                    }
            }

    }
    static void codeToSumTickets(){
        //This method sums how much ticket it is remaining and sells.
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much Tickets You Need");
        int SellTickets = sc.nextInt();
        Tickets = Tickets - SellTickets;
        System.out.println("We Have " + Tickets + " Tickets Left");

    }


    public static void main(String[] args) {
        getName();
        codeToSumTickets();
        codeToGetIfCustomerNeedsMoreTickets();
    }

}






































