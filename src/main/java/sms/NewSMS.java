package sms;

// Concrete SMS Format
public class NewSMS implements SmsAdapter {
    private Sms oldServiceSMS;
    public NewSMS(){
        oldServiceSMS = new Sms();
    }
    @Override
    public void sendSMS(String message) {
        oldServiceSMS.sendSmsMessage(message);
    }
}
