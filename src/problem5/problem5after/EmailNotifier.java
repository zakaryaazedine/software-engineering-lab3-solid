package problem5.problem5after;

public class EmailNotifier implements Notifier{
    private final String server;

    public EmailNotifier(String server){
        this.server = server;
    }

    @Override
    public void notify(String to, String message){
        System.out.println("[EMAIL via " + server + " to " + to + "] " + message);
    }
}
