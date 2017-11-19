import javax.print.event.PrintJobListener;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class FliSim implements Runnable {

  public String inp;
  volatile boolean keepRunning = true;


  public void setInp(String inp) {
    this.inp = inp;
  }

  @Override
  public void run() {
    System.out.println("-----------");
    Flight timerTask = new Flight("AAA", "BBB");
    while (timerTask.getCounter() != 3) {
      System.out.println("Running loop...");
      if (this.inp == "stop") {
        timerTask.selectNextState(this.inp);
      } else {
        timerTask.moveToNextState();
      }
    }
    System.out.println("Done looping.");
  }

  public static void main(String[] args) {
    FliSim test = new FliSim();
    Thread t = new Thread(test);
    t.start();

    Scanner s = new Scanner(System.in);
    while (!s.next().equals("stop"));

    test.keepRunning= false;
    t.interrupt();  // cancel current sleep.

  }
}
