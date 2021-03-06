package AppPackage;

import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhamad Dio
 */
public class Main extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    int d=1;
    int Language=1;
    int s=1;
        
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        BackgroundBtn = new javax.swing.JLabel();
        Menu4 = new javax.swing.JLabel();
        Eng = new javax.swing.JLabel();
        Ina = new javax.swing.JLabel();
        Menu3 = new javax.swing.JLabel();
        Menu2 = new javax.swing.JLabel();
        Menu1 = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        FrameDrag = new javax.swing.JLabel();
        Start = new javax.swing.JLabel();
        Bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(216, 226, 220));
        Background.setLayout(null);

        BackgroundBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/BtnMenu.png"))); // NOI18N
        BackgroundBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackgroundBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackgroundBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackgroundBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackgroundBtnMouseExited(evt);
            }
        });
        Background.add(BackgroundBtn);
        BackgroundBtn.setBounds(490, 10, 50, 40);

        Menu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Exit.png"))); // NOI18N
        Menu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu4MouseExited(evt);
            }
        });
        Background.add(Menu4);
        Menu4.setBounds(0, -768, 1024, 180);

        Eng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ENG1.png"))); // NOI18N
        Eng.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EngMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EngMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EngMouseExited(evt);
            }
        });
        Background.add(Eng);
        Eng.setBounds(390, -100, 90, 80);

        Ina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/INA1.png"))); // NOI18N
        Ina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InaMouseExited(evt);
            }
        });
        Background.add(Ina);
        Ina.setBounds(550, -100, 90, 70);

        Menu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Setting.png"))); // NOI18N
        Menu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu3MouseExited(evt);
            }
        });
        Background.add(Menu3);
        Menu3.setBounds(0, -768, 1024, 300);

        Menu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/About.png"))); // NOI18N
        Menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu2MouseExited(evt);
            }
        });
        Background.add(Menu2);
        Menu2.setBounds(0, -768, 1024, 420);

        Menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Contact.png"))); // NOI18N
        Menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu1MouseExited(evt);
            }
        });
        Background.add(Menu1);
        Menu1.setBounds(0, -768, 1024, 540);

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Help.png"))); // NOI18N
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuMouseExited(evt);
            }
        });
        Background.add(Menu);
        Menu.setBounds(0, -768, 1024, 768);

        FrameDrag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MenuButton.png"))); // NOI18N
        FrameDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FrameDragMouseDragged(evt);
            }
        });
        FrameDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FrameDragMousePressed(evt);
            }
        });
        Background.add(FrameDrag);
        FrameDrag.setBounds(0, 0, 1024, 60);

        Start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/Play.png"))); // NOI18N
        Start.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StartMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                StartMouseReleased(evt);
            }
        });
        Background.add(Start);
        Start.setBounds(390, 580, 254, 125);

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Utama.png"))); // NOI18N
        Bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BgMouseClicked(evt);
            }
        });
        Background.add(Bg);
        Bg.setBounds(0, 0, 1024, 768);

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BgMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BgMouseClicked

    private void FrameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_FrameDragMouseDragged

    private void FrameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_FrameDragMousePressed

    private void StartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Button/Play2.png"));
        Start.setIcon(II);
    }//GEN-LAST:event_StartMouseEntered

    private void StartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Button/Play.png"));
        Start.setIcon(II);
    }//GEN-LAST:event_StartMouseExited

    private void StartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartMouseClicked
       new Choose().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_StartMouseClicked

    private void StartMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartMouseReleased
        
    }//GEN-LAST:event_StartMouseReleased

    private void BackgroundBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundBtnMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/MenuButton2.png"));
        FrameDrag.setIcon(II);
    }//GEN-LAST:event_BackgroundBtnMouseEntered

    private void BackgroundBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundBtnMouseExited
       ImageIcon II = new ImageIcon(getClass().getResource("/Image/MenuButton.png"));
        FrameDrag.setIcon(II);
    }//GEN-LAST:event_BackgroundBtnMouseExited

    private void BackgroundBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundBtnMouseClicked
        AnimationClass move = new AnimationClass();
        if(d==1){
            d=2;
            
            move.jLabelYDown(Menu.getY(), 0, 1, 20, Menu);
            move.jLabelYDown(Menu1.getY(), 0, 1, 15, Menu1);
            move.jLabelYDown(Menu2.getY(), 0, 1, 10, Menu2);
            move.jLabelYDown(Menu3.getY(), 0, 1, 5, Menu3);
            move.jLabelYDown(Menu4.getY(), 0, 1, 5, Menu4);
            BackgroundBtn.setLocation(480, 725);
        
        }
        else if(d==2){
            d=1;
           Menu.setLocation(0, -768);
           Menu1.setLocation(0, -768);
           Menu2.setLocation(0, -768);
           Menu3.setLocation(0, -768);
           Menu4.setLocation(0, -768);
           BackgroundBtn.setLocation(490, 10);
        }
    }//GEN-LAST:event_BackgroundBtnMouseClicked

    private void Menu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_Menu4MouseClicked

    private void Menu4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu4MouseEntered
        if(Language==1){
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Exit2.png"));
        Menu4.setIcon(II);
        }
        else{
        ImageIcon I2 = new ImageIcon(getClass().getResource("/Image/Exit1.2.png"));
        Menu4.setIcon(I2);
        }
    }//GEN-LAST:event_Menu4MouseEntered

    private void Menu4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu4MouseExited
        if(Language==1){
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Exit.png"));
        Menu4.setIcon(II);
        }
        else{
        ImageIcon I2 = new ImageIcon(getClass().getResource("/Image/Exit1.png"));
        Menu4.setIcon(I2);
}
    }//GEN-LAST:event_Menu4MouseExited

    private void Menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu3MouseClicked
        AnimationClass move = new AnimationClass();
        if(s==1){
            s=2;
            
            move.jLabelYDown(Menu.getY(), 100, 1, 20, Menu);
            move.jLabelYDown(Menu1.getY(), 100, 1, 15, Menu1);
            move.jLabelYDown(Menu2.getY(), 100, 1, 10, Menu2);
            move.jLabelYDown(Menu3.getY(), 100, 1, 10, Menu3);
            move.jLabelYDown(Eng.getY(), 200, 1, 10, Eng);
            move.jLabelYDown(Ina.getY(), 200, 1, 10, Ina);
            BackgroundBtn.setLocation(480, 825);
        
        }
        else if(s==2){
            s=1;
           Menu.setLocation(0, 0);
           Menu1.setLocation(0, 0);
           Menu2.setLocation(0, 0);
           Menu3.setLocation(0, 0);
           Eng.setLocation(390, -100);
           Ina.setLocation(550, -100);
           BackgroundBtn.setLocation(480, 725);
        }
    }//GEN-LAST:event_Menu3MouseClicked

    private void EngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EngMouseClicked
        Language=1;
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Help.png"));
        Menu.setIcon(II);
        ImageIcon I1 = new ImageIcon(getClass().getResource("/Image/Contact.png"));
        Menu1.setIcon(I1);
        ImageIcon I2 = new ImageIcon(getClass().getResource("/Image/About.png"));
        Menu2.setIcon(I2);
        ImageIcon I3 = new ImageIcon(getClass().getResource("/Image/Setting.png"));
        Menu3.setIcon(I3);
        ImageIcon I4 = new ImageIcon(getClass().getResource("/Image/Exit.png"));
        Menu4.setIcon(I4);
    }//GEN-LAST:event_EngMouseClicked

    private void EngMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EngMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/ENG1.2.png"));
        Eng.setIcon(II);
    }//GEN-LAST:event_EngMouseEntered

    private void EngMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EngMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/ENG1.png"));
        Eng.setIcon(II);
    }//GEN-LAST:event_EngMouseExited

    private void InaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InaMouseClicked
        Language=2;
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Help1.png"));
        Menu.setIcon(II);
        ImageIcon I1 = new ImageIcon(getClass().getResource("/Image/Contact1.png"));
        Menu1.setIcon(I1);
        ImageIcon I2 = new ImageIcon(getClass().getResource("/Image/About1.png"));
        Menu2.setIcon(I2);
        ImageIcon I3 = new ImageIcon(getClass().getResource("/Image/Setting1.png"));
        Menu3.setIcon(I3);
        ImageIcon I4 = new ImageIcon(getClass().getResource("/Image/Exit1.png"));
        Menu4.setIcon(I4);
    }//GEN-LAST:event_InaMouseClicked

    private void InaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InaMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/INA1.2.png"));
        Ina.setIcon(II);
    }//GEN-LAST:event_InaMouseEntered

    private void InaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InaMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/INA1.png"));
        Ina.setIcon(II);
    }//GEN-LAST:event_InaMouseExited

    private void Menu3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu3MouseEntered
        if(Language==1){
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Setting2.png"));
        Menu3.setIcon(II);
        }
        else{
        ImageIcon I2 = new ImageIcon(getClass().getResource("/Image/Setting1.2.png"));
        Menu3.setIcon(I2);
    }
    }//GEN-LAST:event_Menu3MouseEntered

    private void Menu3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu3MouseExited
        if(Language==1){
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Setting.png"));
        Menu3.setIcon(II);
        }
        else{
        ImageIcon I2 = new ImageIcon(getClass().getResource("/Image/Setting1.png"));
        Menu3.setIcon(I2);
    }
    }//GEN-LAST:event_Menu3MouseExited

    private void Menu2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MouseEntered
        if(Language==1){
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/About2.png"));
        Menu2.setIcon(II);
        }
        else{
        ImageIcon I2 = new ImageIcon(getClass().getResource("/Image/About1.2.png"));
        Menu2.setIcon(I2);
    }
    }//GEN-LAST:event_Menu2MouseEntered

    private void Menu2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MouseExited
        if(Language==1){
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/About.png"));
        Menu2.setIcon(II);
        }
        else{
        ImageIcon I2 = new ImageIcon(getClass().getResource("/Image/About1.png"));
        Menu2.setIcon(I2);
        }
    }//GEN-LAST:event_Menu2MouseExited

    private void Menu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu1MouseEntered
        if(Language==1){
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Contact2.png"));
        Menu1.setIcon(II);
        }
        else{
        ImageIcon I2 = new ImageIcon(getClass().getResource("/Image/Contact1.2.png"));
        Menu1.setIcon(I2);
        }
    }//GEN-LAST:event_Menu1MouseEntered

    private void Menu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu1MouseExited
        if(Language==1){
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Contact.png"));
        Menu1.setIcon(II);
        }
        else{
        ImageIcon I2 = new ImageIcon(getClass().getResource("/Image/Contact1.png"));
        Menu1.setIcon(I2);
        }
    }//GEN-LAST:event_Menu1MouseExited

    private void MenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseEntered
        if(Language==1){
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Help2.png"));
        Menu.setIcon(II);
        }
        else{
        ImageIcon I2 = new ImageIcon(getClass().getResource("/Image/Help1.2.png"));
        Menu.setIcon(I2);
        }
    }//GEN-LAST:event_MenuMouseEntered

    private void MenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseExited
        if(Language==1){
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Help.png"));
        Menu.setIcon(II);
        }
        else{
        ImageIcon I2 = new ImageIcon(getClass().getResource("/Image/Help1.png"));
        Menu.setIcon(I2);
        }
    }//GEN-LAST:event_MenuMouseExited

    private void Menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MouseClicked
        new About().setVisible(true);
    }//GEN-LAST:event_Menu2MouseClicked

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        new Help().setVisible(true);
    }//GEN-LAST:event_MenuMouseClicked

    private void Menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu1MouseClicked
        new Contact().setVisible(true);
    }//GEN-LAST:event_Menu1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel BackgroundBtn;
    private javax.swing.JLabel Bg;
    private javax.swing.JLabel Eng;
    private javax.swing.JLabel FrameDrag;
    private javax.swing.JLabel Ina;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel Menu1;
    private javax.swing.JLabel Menu2;
    private javax.swing.JLabel Menu3;
    private javax.swing.JLabel Menu4;
    private javax.swing.JLabel Start;
    // End of variables declaration//GEN-END:variables
}
