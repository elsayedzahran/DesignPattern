package Observer;
import sms.NewSMS;
import sms.Sms;
public class HomeOwner implements Observer {
    private String ownerName;
    private NewSMS newSms;
    public HomeOwner(String Message) {
        this.ownerName = ownerName;
        this.newSms = new NewSMS();
    }

    @Override
    public void update(String message) {
        newSms.sendSMS("SMS to homeowner " + ownerName + ": " + message);
    }

}
