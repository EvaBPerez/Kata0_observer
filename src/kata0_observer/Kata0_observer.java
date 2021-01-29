package kata0_observer;

public class Kata0_observer {

    public static void main(String[] args) throws InterruptedException {
        Clock clockMadrid = new Clock(0, 0, 0);
        Clock clockBerlin = new Clock(1, 0, 0);
        
        ClockDisplay analogClockDisplayMandrid = new AnalogClockDisplay("ANALOG CLOCK MADRID");
        ClockDisplay digitalClockDisplayMandrid = new DigitalClockDisplay("DIGITAL CLOCK MADRID");
        
        ClockDisplay analogClockDisplayBerlin = new AnalogClockDisplay("ANALOG CLOCK BERLIN");
        ClockDisplay digitalClockDisplayBerlin = new DigitalClockDisplay("DIGITAL CLOCK BERLIN");
        
        clockMadrid.addObserver(analogClockDisplayMandrid);
        clockMadrid.addObserver(digitalClockDisplayMandrid);
        
        clockBerlin.addObserver(analogClockDisplayBerlin);
        clockBerlin.addObserver(digitalClockDisplayBerlin);
        
        while (true) {
            clockMadrid.updateStatusSubject();
            clockBerlin.updateStatusSubject();
            Thread.sleep(10);
        }
    }
    
}
