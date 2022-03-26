
package owner;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorConvertOp;
import java.awt.image.ImageObserver;
import static java.awt.image.ImageObserver.ALLBITS;
import java.awt.image.ImageProducer;
import java.awt.image.MemoryImageSource;
import java.awt.image.PixelGrabber;
import java.awt.image.VolatileImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.swing.JOptionPane;

public class OwnerFrame extends javax.swing.JFrame {

   
    ArrayList alt=new ArrayList();
    int w;
    int h;
    int data[][];
    public OwnerFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); 
        jLabel1.setText("Reversible Data Hiding -- Owner");

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 15)); 
        jLabel2.setText("Choose Gray Image");

        jButton1.setFont(new java.awt.Font("Century Schoolbook", 0, 15)); 
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Century Schoolbook", 0, 15)); 
        jButton2.setText("Encrypt Image");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 0, 15)); 
        jLabel5.setText("Original Image");

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 0, 15)); 
        jLabel6.setText("Encrypted Image");

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 0, 15)); 
        jLabel7.setText("Encrypt Image and Send to Data Hider");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jButton1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(213, 213, 213))))
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        try
        {
            JFileChooser fc=new JFileChooser();
            int v=fc.showOpenDialog(this);
            if(v==JFileChooser.APPROVE_OPTION)
            {
                String pp=fc.getSelectedFile().getAbsolutePath();
                jTextField1.setText(pp);
                
                jLabel3.setIcon(new ImageIcon(pp));                
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        try
        {
            
            String path=jTextField1.getText();
            BufferedImage bi=ImageIO.read(new File(path));
           
            BufferedImageOp op = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
            BufferedImage grayImg=op.filter(bi, null);
            ImageIO.write(grayImg, "png", new File("gray1.png"));
             int type=grayImg.getType();
             System.out.println("Type "+type+" : "+bi.getType());
             
            w=grayImg.getWidth();
            h=grayImg.getHeight();
             data=new int[w][h];
             
             
             
            for(int i=0;i<w;i++)
            {
                for(int j=0;j<h;j++)
                {
                    int gg=grayImg.getRGB(i, j);
                    int r = (gg >> 16) & 0xFF;
                    int g = (gg >> 8) & 0xFF;
                    int b = (gg & 0xFF);
                    
                    int k=gg & 0xFF;
                    
                    int g1=(r+g+b)/3;
                    System.out.print(" "+k);
                    data[i][j]=k;
                }
                System.out.println("");
            }
            
            System.out.println("----------------------");
            double f=0;
            int ft[][]=new int[w][2];
            
            for(int i=1;i<w-1;i++)
            {
                int k1=0;
                for(int j=1;j<h-1;j++)
                {
                    int k2=(data[i-1][j]+data[i+1][j]+data[i][j-1]+data[i][j+1])/4;
                    k1=k1+(data[i][j]-k2);                 
                    
                }
                f=f+k1;
                ft[i][0]=i;
                ft[i][1]=k1;
                System.out.print(" "+k1);
            }
            
            System.out.println("ff "+f);
            for(int i=1;i<ft.length-1;i++)
            {
                for(int j=i+1;j<ft.length;j++)    
                {
                    if(ft[i][1]<ft[j][1])
                    {
                        int t1=ft[i][0];
                        ft[i][0]=ft[j][0];
                        ft[j][0]=t1;
                        
                        int t2=ft[i][1];
                        ft[i][1]=ft[j][1];
                        ft[j][1]=t2;
                    }
                }
            }

            for(int i=1;i<6;i++)
            {

                alt.add(ft[i][0]);
            }
            System.out.println("A "+alt);

            ArrayList A=alt;
            ArrayList B=new ArrayList();
            for(int i=0;i<w;i++)
            {
                if(!A.contains(i))
                    B.add(i);
            }
            System.out.println("B "+B);
            int d1[][]=new int[B.size()-1][h-1];
            for(int i=1;i<B.size()-1;i++)
            {
                int a1=Integer.parseInt(B.get(i).toString());
                for(int j=1;j<h-1;j++)
                {
                    
                    if(((i+j)%2)==0)
                        d1[i][j]=0;
                    else
                        d1[i][j]=1;
                }
            }
            for(int i=1;i<B.size()-1;i++)
            {
                int a1=Integer.parseInt(B.get(i).toString());
                for(int j=1;j<h-1;j++)
                {
                    System.out.print(" "+d1[i][j]);
                }
                System.out.println();
            }
            
            int E[][][]=new int[w][h][7];
            
            for(int i=0;i<w;i++)
            {

                for(int j=0;j<h;j++)
                {
                    for(int k=0;k<7;k++)
                    {
                        E[i][j][k]=(int)(Math.floor((double)data[i][j]/Math.pow(2, k)))%2;
                    }
                }
            }
            
            ArrayList at1=new ArrayList();
            for(int i=0;i<w;i++)
            {
                int f1=0;
                for(int j=0;j<h;j++)
                {
                    int kk=0;
                    for(int k=0;k<7;k++)
                    {
                       // System.out.print(" "+E[i][j][k]);
                        kk=kk+(int)(E[i][j][k]*Math.pow(2, k));
                    }
                    System.out.print("  "+kk+" : "+data[i][j]);
                   
                }
               System.out.println("--------");
            }
           
             System.out.println("----------------------------");

            BufferedImage bi1=new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
            Random rn=new Random();
            int dt[][]=new int[w][h];
            for(int i=0;i<w;i++)
            {
                for(int j=0;j<h;j++)
                {
                    int r=rn.nextInt(255);
                    int kk=(data[i][j]^r);
                    
                    int h1=(kk & 0xFF)<< 8;
                    bi1.setRGB(i, j, h1);
                    dt[i][j]=h1;
                    System.out.print(" "+kk+" : "+h1);
                }
                System.out.println();
            }
            
            BufferedImageOp op1 = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
            BufferedImage gImg=op1.filter(bi1, null);
            
            ImageIO.write(gImg, "png",new File("enc.png"));
            jLabel4.setIcon(new ImageIcon("enc.png"));
            
            String ms="Data#";
            String ms1="Data1#";
            for(int i=0;i<w;i++)
            {
                for(int j=0;j<h;j++)
                {
                    ms=ms+((data[i][j]& 0xFF) << 8)+"@";
                    ms1=ms1+dt[i][j]+"@";
                }
                ms=ms+"#";
                ms1=ms1+"#";
            }
            System.out.println("ms "+ms.length()+" : "+ms1.length());

            byte bt[]=ms.getBytes();
            DatagramSocket ds=new DatagramSocket();
            DatagramPacket dp1=new DatagramPacket(bt,0,bt.length,InetAddress.getByName("127.0.0.1"),8000);
            ds.send(dp1);
            
            byte bt2[]=ms1.getBytes();
            DatagramPacket dp2=new DatagramPacket(bt2,0,bt2.length,InetAddress.getByName("127.0.0.1"),8000);
            ds.send(dp2);
            JOptionPane.showMessageDialog(this, "Encrypted Image Send");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

   
    
    
    
     public BufferedImage toBufferedImage(final Image image, final int type)
    {
        if (image instanceof BufferedImage)
            return (BufferedImage) image;
        if (image instanceof VolatileImage)
            return ((VolatileImage) image).getSnapshot();
        loadImage(image);
        final BufferedImage buffImg = new BufferedImage(image.getWidth(null), image.getHeight(null), type);
        final Graphics2D g2 = buffImg.createGraphics();
        g2.drawImage(image, null, null);
        g2.dispose();
      return buffImg;
    }

    private void loadImage(final Image image)
    {
        class StatusObserver implements ImageObserver
        {
            boolean imageLoaded = false;
            public boolean imageUpdate(final Image img, final int infoflags,
          final int x, final int y, final int width, final int height)
            {
                if (infoflags == ALLBITS)
                {
                    synchronized (this)
                    {
                        imageLoaded = true;
                        notify();
                    }
                    return true;
                }
                return false;
            }
        }
        final StatusObserver imageStatus = new StatusObserver();
        synchronized (imageStatus) {
        if (image.getWidth(imageStatus) == -1 || image.getHeight(imageStatus) == -1)
        {
            while (!imageStatus.imageLoaded)
            {
                try
                {
                    imageStatus.wait();
                } catch (InterruptedException ex) {}
            }
        }
     }
    }
   
    
    
  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OwnerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OwnerFrame().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField jTextField1;

}
