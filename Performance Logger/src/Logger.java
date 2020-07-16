//The logger simply stores the time it is intitalised and works out how much time has elapsed since that time and when the stop method has been called.
public class Logger {
    long Start =0;
    long Finish =0;

    public Logger() {
        Start = System.nanoTime();
    }
    public void Reset(){
        Start = System.nanoTime();
        Finish = 0;
    }
    public void Stop() {
        Finish = System.nanoTime()-Start;
    }

    public long getFinished(){
        return Finish;
    }

}
