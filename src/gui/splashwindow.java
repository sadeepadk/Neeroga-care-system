
package gui;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;


public class splashwindow extends javax.swing.JFrame {
    
    private static splashwindow splashwindow;

   
    public splashwindow() {
        initComponents();
        loadingAnimation();
        init();
    }
    
    private void init(){
    FlatSVGIcon icon = new FlatSVGIcon("gui//hospital.svg",jLabel1.getWidth(),jLabel1.getHeight());
    jLabel1.setIcon(icon);
    
    }
    
    private void loadingAnimation(){
        
        Thread t = new Thread(new Runnable(){
            @Override
            public void run() {
               for(int i = 0; i<=100; i++){
                   jProgressBar1.setValue(i);
                   if(i==20){
                       jLabel2.setText("Please wait");
                   }else if(i==30){
                       jLabel2.setText("Libraries loading....");
                   }else if(i==45){
                       jLabel2.setText("Create Database Connection");
                   }else if(i==70){
                       jLabel2.setText("UI genarated successfully");
                   }else if(i==88){
                       jLabel2.setText("Database connection successfully created");
                  }else if(i==98){
                      jLabel2.setText("Done");
                  }
                   
                  try{
                      Thread.sleep(50);
                  
                  }catch(InterruptedException e){
                      e.printStackTrace();
                  }
               
               }
               splashwindow.dispose();
               new signinwindow().setVisible(true);
            }
        });
        t.start();
    
    
    }

  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setForeground(new java.awt.Color(0, 255, 102));
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);

        jProgressBar1.setBackground(new java.awt.Color(102, 255, 255));
        jProgressBar1.setOpaque(true);
        jProgressBar1.setStringPainted(true);

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel2.setText("loading....");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 splashwindow = new splashwindow();
                 splashwindow.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
