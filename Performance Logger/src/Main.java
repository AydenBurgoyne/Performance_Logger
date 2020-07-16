import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) throws IOException {
       //Inititalises a new KWIC object.
        KWIC temp = new KWIC();
        //creates a new logger object
        Logger log = new Logger();
        //calls the main method of kwic and passes the args in.
        temp.main(args);
        //stops the logger, and records the time taken.
        log.Stop();
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Kwic testing completed in:"+log.getFinished()+" nanoseconds"); //outputs the timetaken in nanosseconds.
    }

}

