package receiver;

public class Main {

    
    public static void main(String[] args) {

        ReceiverFrame rf=new ReceiverFrame();
        rf.setVisible(true);
        rf.setTitle("Receiver");
        rf.setResizable(false);
        
        Receiver rr=new Receiver(rf);
        rr.start();
    }
}
