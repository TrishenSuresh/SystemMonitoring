package systemmonitoring;

import oshi.util.FormatUtil;
import java.util.Scanner;



public class SystemMonitoring {

    static boolean server;
    
    public static void main(String[] args) 
    {
        start();
        SystemInformation info = new SystemInformation();
        info.getComputerMemory().print();
    }
    
    public static void start()
    {
        loopDeLoop:
        while (true) 
        {
            int option;
            Scanner in = new Scanner(System.in);

            System.out.println("===================================");
            System.out.println("|        System Monitoring        |");
            System.out.println("===================================");
            System.out.println("Is this a client or a server :  ");
            System.out.println("        1. Server                ");
            System.out.println("        2. Client                ");
            System.out.println("===================================");
            System.out.println();
            System.out.print("Select option: ");

            option = in.nextInt();

            System.out.println();

            switch (option) 
            {
                case 1:
                    server = true;
                    break loopDeLoop;
                case 2:
                    break loopDeLoop;
                default:
                    System.out.println("Invalid Selection, Please try again.");
                    System.out.println();
            }

        }
            
    }
}