
package owner;

public class Main {


    public static void main(String[] args) {

        OwnerFrame of=new OwnerFrame();
        of.setVisible(true);
        of.setTitle("Data Owner");
        of.setResizable(false);
        
        OwnerReceiver or=new OwnerReceiver(of);
        or.start();
    }
}
