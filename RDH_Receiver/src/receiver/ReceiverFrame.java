
package receiver;


import java.awt.Color;
import java.awt.Image;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorConvertOp;
import java.awt.image.PixelGrabber;
import javax.imageio.ImageIO;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ReceiverFrame extends javax.swing.JFrame {

   
    static int img1[][];
    static int img2[][];
    static String msg="";
    public ReceiverFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel1.setText("Reversible Data Hiding -- Receiver");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jButton1.setText("Extract Data and Recover Image");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1)
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try
        {
             BufferedImage bi1=new BufferedImage(img1.length,img1[0].length,BufferedImage.TYPE_INT_RGB);
             for(int i=0;i<img1.length;i++)
             {
                for(int j=0;j<img1[0].length;j++)
                {
                    
                    bi1.setRGB(i, j, img1[i][j]);
                    System.out.print(" "+img1[i][j]);
                }
                System.out.println();
             } 
             
             
            ImageIcon ic=new ImageIcon("enc.png");
          
            Image inImg=ic.getImage();
            int imgW=ic.getIconWidth();
            int imgH=ic.getIconHeight();
            
            int pel1[]=new int[imgW*imgH];
            int pel2[]=new int[imgW*imgH];
            
            PixelGrabber pg1 = new PixelGrabber(inImg,0,0,imgW,imgH,pel1,0,imgW);
            pg1.grabPixels();
            ArrayList perm=new ArrayList();
            Random rand=new Random();
            System.out.println("----------");
            for(int i=0;i<imgW*imgH;i++)
          
            {
                int rn=rand.nextInt(imgW*imgH);
                if(!(perm.contains(rn)))
                {
                    perm.add(rn);
                    System.out.println(rn);
                }
                else
                {
                    i--;
                }
            }
           
            System.out.println("per "+perm.size());
           for(int i=0;i<perm.size();i++)
                {
                    int p1=Integer.parseInt(perm.get(i).toString());
                    System.out.println(p1);

                     pel2[p1]=pel1[i];

                }

                System.out.println("----------");
                
             
             
             BufferedImageOp op1 = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
             BufferedImage gImg=op1.filter(bi1, null);
           
             ImageIO.write(bi1, "png",new File("org1.png"));
             ImageIO.write(gImg, "png",new File("gry1.png"));
             jLabel3.setIcon(new ImageIcon("gry1.png"));
             jTextField1.setText(msg);
             computePSNR();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void computePSNR()
    {
        
        BufferedImage image1 = getImage(new File("gry1.png"));
        BufferedImage image2 = getImage(new File("enc1.png"));
        if (image1.getWidth() != image2.getWidth()) 
        {
            System.err.println("Those two file do not have the same width");
            return;
        }
                if (image1.getHeight() != image2.getHeight()) {
                        System.err.println("Those two file do not have the same height");
                        return;
                }
                final int size = image1.getHeight() * image1.getWidth();
                int totalRed = 0;
                int totalGreen = 0;
                int totalBlue = 0;
                int maxRed = -1;
                int maxGreen = -1;
                int maxBlue = -1;
                int worstRedX = -1;
                int worstRedY = -1;
                int worstGreenX = -1;
                int worstGreenY = -1;
                int worstBlueX = -1;
                int worstBlueY = -1;
                double maxDistance = -1;
                int maxX = -1;
                int maxY = -1;
                double totalDistance = 0;

                for (int i = 0; i < image1.getWidth(); i++) {
                        for (int j = 0; j < image1.getHeight(); j++) {
                                final Color color1 = new Color(image1.getRGB(i, j));
                                final Color color2 = new Color(image2.getRGB(i, j));
                                final double distance = getColorDistance(color1, color2);
                                totalDistance += distance;
                                if (distance > maxDistance) {
                                        maxDistance = distance;
                                        maxX = i;
                                        maxY = j;
                                }
                                final int redDiff = color1.getRed() - color2.getRed();
                                if (redDiff > maxRed) {
                                        maxRed = redDiff;
                                        worstRedX = i;
                                        worstRedY = j;
                                }
                                final int greenDiff = color1.getGreen() - color2.getGreen();
                                if (greenDiff > maxGreen) {
                                        maxGreen = greenDiff;
                                        worstGreenX = i;
                                        worstGreenY = j;
                                }
                                final int blueDiff = color1.getBlue() - color2.getBlue();
                                if (blueDiff > maxBlue) {
                                        maxBlue = blueDiff;
                                        worstBlueX = i;
                                        worstBlueY = j;
                                }
                                totalRed += redDiff * redDiff;
                                totalGreen += greenDiff * greenDiff;
                                totalBlue += blueDiff * blueDiff;
                        }
                }
                System.out.print("maxDistance: " + maxDistance);
                System.out.println(" at: " + maxX + " " + maxY);
                System.out.println("averageDistance: " + (totalDistance / size));
                System.out.println("total red: " + totalRed);
                System.out.println("total green: " + totalGreen);
                System.out.println("total blue: " + totalBlue);
                System.out.println("Worst red at " + worstRedX + " " + worstRedY + " is " + maxRed);
                System.out.println("Worst green at " + worstGreenX + " " + worstGreenY + " is " + maxGreen);
                System.out.println("Worst blue at " + worstBlueX + " " + worstBlueY + " is " + maxBlue);
                float meanSquaredError = (totalRed + totalGreen + totalBlue) / (image1.getWidth() * image1.getHeight() * 3);            
                System.out.println("mean squarederror is " + meanSquaredError);
                if (meanSquaredError == 0) {
                        System.out.println("peak signal to noise ratio is 0");
                        return;
                }
                double peakSignalToNoiseRatio = 10 * StrictMath.log10((255 * 255) / meanSquaredError);
				
               double psnr=peakSignalToNoiseRatio;

                System.out.println("peak signal to noise ratio is " + peakSignalToNoiseRatio);
                DecimalFormat df=new DecimalFormat("#.##");
                String pr=df.format(psnr);
                JOptionPane.showMessageDialog(this, "PSNR "+pr);

        }

        private static BufferedImage getImage(File file) {
                try {
                        return ImageIO.read(file);
                } catch (Exception ioe) {
                        ioe.printStackTrace();
                }
                return null;
        }

        private static double getColorDistance(Color source, Color target) {
                if (source.equals(target)) {
                        return 0.0d;
                }
                final double red = source.getRed() - target.getRed();
                final double green = source.getGreen() - target.getGreen();
                final double blue = source.getBlue() - target.getBlue();
                return Math.sqrt(red * red + blue * blue + green * green);
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
            java.util.logging.Logger.getLogger(ReceiverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceiverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceiverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceiverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceiverFrame().setVisible(true);
            }
        });
    }

    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;

}
