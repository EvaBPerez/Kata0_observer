package kata0_observer;

import javax.swing.JTextArea;

public class DigitalClockDisplay extends ClockDisplay {

    public DigitalClockDisplay(String title) {
        super(title);
    }

    @Override
    public void refreshClockDisplay(JTextArea clockDisplay, String hour, String minute, String second) {
        clockDisplay.setText("DISPLAY CLOCK: " + hour + ":" + minute + ":" + second);
    }
    
}
