package problem5.problem5before;

public class EmailSender{
    private final String server;

    public EmailSender(String server){
        this.server = server;
    }

    public void send(String to, String message){
        System.out.println("[EMAIL via " + server + " to " + to + "] " + message);
    }
}
