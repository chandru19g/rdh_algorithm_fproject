
package datahider;


public class Main {

    public static void main(String[] args) {
        
        DataHiderFrame df=new DataHiderFrame();
        df.setVisible(true);
        df.setResizable(false);
        df.setTitle("Data Hider");
        
        DataHider dh=new DataHider(df);
        dh.start();
    }
}
