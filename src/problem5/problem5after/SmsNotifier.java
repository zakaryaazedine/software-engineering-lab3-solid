package problem5.problem5after;

public class SmsNotifier implements Notifier{
    @Override
    public void notify(String to, String message){
        System.out.println("[SMS to " + to + "] " + message);
    }
}
