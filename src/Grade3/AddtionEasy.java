/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddtionEasy.java
 *
 * Created on 03 May 2012, 5:52:47 PM
 */

package Grade3;



/**
 *j * @author ZIPHO LUNIKA
 */
public class AddtionEasy extends javax.swing.JFrame {

    /** Creates new form AddtionEasy */
    public AddtionEasy() {
        initComponents();
    }
    int score=0;
    int total=0;
    public void generate()
    {
    int n1=(int)(Math.random()*89)+11;
        int n2=(int)(Math.random()*89)+11;
num1.setText(String.valueOf(n1));
num2.setText(String.valueOf(n2));
    }
    public void mark()
    {
        int ans1=Integer.parseInt(num1.getText());
        int ans2=Integer.parseInt(num2.getText());
        int ans=ans1+ans2;
        int UserAns=Integer.parseInt(Answer.getText());
if(UserAns==ans)
{
    int pic2=(int)(Math.random()*3)+1;

    TickBox.setText("√");
            jPanel1.setBackground(new java.awt.Color(102, 255, 0));

               jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/P"+pic2+".gif"))); // NOI18N
               score++;
               total++;
               s.setText(String.valueOf(score));
               t.setText(String.valueOf(total));

        }
 else
{
int pic=(int)(Math.random()*4)+1;
            TickBox.setText("x");
           jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/N"+pic+".jpg"))); // NOI18N
         //   jPanel1.setBackground(new java.awt.Color(102, 255, 0));
                   jPanel1.setBackground(new java.awt.Color(255, 51, 51));

total++;
t.setText(String.valueOf(total));

 }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        num1 = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Answer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TickBox = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Easy Mode", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 3, 18))); // NOI18N
        jPanel1.setLayout(null);

        num1.setFont(new java.awt.Font("Chiller", 1, 48));
        num1.setText("X");
        jPanel1.add(num1);
        num1.setBounds(187, 110, 228, 39);

        num2.setFont(new java.awt.Font("Chiller", 1, 48));
        num2.setText("Y");
        jPanel1.add(num2);
        num2.setBounds(187, 225, 162, 56);

        jLabel3.setFont(new java.awt.Font("Chiller", 1, 48));
        jLabel3.setText("____________");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(109, 287, 332, 43);

        Answer.setFont(new java.awt.Font("One Stroke Script LET", 1, 36));
        jPanel1.add(Answer);
        Answer.setBounds(109, 350, 302, 55);

        jLabel4.setFont(new java.awt.Font("Chiller", 1, 48));
        jLabel4.setText("+");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(109, 225, 47, 56);

        TickBox.setFont(new java.awt.Font("Tahoma", 1, 24));
        jPanel1.add(TickBox);
        TickBox.setBounds(438, 336, 84, 69);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(551, 107, 380, 330);

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(551, 450, 180, 23);

        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(551, 486, 77, 23);

        jLabel8.setFont(new java.awt.Font("Chiller", 1, 36));
        jLabel8.setText("Total:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 574, 140, 60);

        jLabel7.setFont(new java.awt.Font("Chiller", 1, 36));
        jLabel7.setText("Score:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(109, 448, 129, 60);

        t.setFont(new java.awt.Font("Chiller", 1, 36));
        t.setText("t");
        jPanel1.add(t);
        t.setBounds(250, 580, 110, 42);

        s.setFont(new java.awt.Font("Chiller", 1, 36));
        s.setText("S");
        jPanel1.add(s);
        s.setBounds(250, 460, 20, 30);

        jMenu1.setText("File");

        jMenuItem1.setText("Main Menu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setText("Menu");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem3.setText("Medium Mode");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Hard Mode");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
generate();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
mark();
generate();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
this.dispose();
new WelcomePage().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
this.dispose();
new ADDITIONMENU().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
this.dispose();
new AddtionMedium().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
this.dispose();
new Addtionh().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddtionEasy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Answer;
    private javax.swing.JLabel TickBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel s;
    private javax.swing.JLabel t;
    // End of variables declaration//GEN-END:variables

}
