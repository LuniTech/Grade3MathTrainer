/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Area.java
 *
 * Created on 05 May 2012, 3:04:03 PM
 */

package Grade3;

/**
 *
 * @author ZIPHO LUNIKA
 */
public class Area extends javax.swing.JFrame {

    /** Creates new form Area */
    public Area() {
        initComponents();
    }

    int num1=0;
        int num2=0;
    int num3=0;
    int num4=0;
int generate=0;
int total=0;
int score=0;
   public void clearShape1()
    {
    jLabel2.setText("");
        jLabel3.setText("");
    jLabel4.setText("");
    jLabel5.setText("");
    jLabel6.setText("");
    jLabel7.setText("");
    jLabel8.setText("");
    jLabel9.setText("");
    jLabel10.setText("");
    jLabel11.setText("");
    jLabel12.setText("");
    jLabel13.setText("");
    jLabel14.setText("");
    jLabel15.setText("");

   }
   public void SetShape1()
    {
        num1=(int)(Math.random()*20)+1;
        num2=(int)(Math.random()*20)+1;
        num3=(int)(Math.random()*20)+1;
        num4=(int)(Math.random()*20)+1;
      while(num1<=num2)
      {

          num1=(int)(Math.random()*20)+1;
          num2=(int)(Math.random()*20)+1;
    
          }
    
if(num4>num3)
{
    int i=0;
    i=num4;
    num4=num3;
    num3=i;
}
               jLabel8.setText(String.valueOf(num1));
       jLabel2.setText(String.valueOf(num1));
       jLabel3.setText(String.valueOf(num2));
       jLabel5.setText(String.valueOf(num2));
       jLabel4.setText(String.valueOf(num3));
       jLabel9.setText(String.valueOf(num3));
       jLabel7.setText(String.valueOf(num4));
       jLabel6.setText(String.valueOf(num4));

   }
   public void SetShape2()
    {
        num1=(int)(Math.random()*20)+1;
        num2=(int)(Math.random()*20)+1;
        num3=(int)(Math.random()*20)+1;
        num4=(int)(Math.random()*20)+1;
       jLabel8.setText(String.valueOf(num1));//
       jLabel2.setText(String.valueOf(num1));//
       jLabel3.setText(String.valueOf(num2));//
       jLabel4.setText(String.valueOf(num3));//
       jLabel9.setText(String.valueOf(num3));//
       jLabel7.setText(String.valueOf(num4));//
   }
   public void Setshape3()
    {

        num1=(int)(Math.random()*20)+1;
        num2=(int)(Math.random()*20)+1;
       jLabel13.setText(String.valueOf(num1));
              jLabel14.setText(String.valueOf(num2));
       jLabel4.setText(String.valueOf(num2));
       jLabel15.setText(String.valueOf(num1));
   }
   public void SetShape4()
    {
        num1=(int)(Math.random()*20)+1;
        num2=(int)(Math.random()*20)+1;
       jLabel12.setText(String.valueOf(num1));
              jLabel12.setText(String.valueOf(num2));

   }
   public void generateQ()
    {
      generate=(int)(Math.random()*3);
      if(generate==0)
      {
                  Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/1QR.png"))); // NOI18N
 SetShape1();
 jTextArea1.setText("Calculate The area of the \n shape in the orange colour:");

      }
       if(generate==1)
      {
                            Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/2QR.png"))); // NOI18N
SetShape2();
jTextArea1.setText("Calculate The area of the \n shape in the orange colour:");

      }
       if(generate==2)
      {
                  Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/3QS.png"))); // NOI18N
Setshape3();
jTextArea1.setText("Calculate The area of the following shape:");

      }
       if(generate==3)
      {
                  Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/4QS.png"))); // NOI18N
SetShape4();
jTextArea1.setText("Calculate The area of the following shape:");
      }
   }


    public void  Mark()
    {
     if(generate==0)
      {
int step1=num1*num3;
int step2=num2*num4;
int ans=step1-step2;
int userAns=Integer.parseInt(Answer.getText());
if(ans==userAns)
{
                   jPanel1.setBackground(new java.awt.Color(102, 255, 0));

    eish.setText("√");
       int pic2=(int)(Math.random()*3)+1;
score++;
S.setText(String.valueOf(score));
total++;
T.setText(String.valueOf(total));
     jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/DontKnow!.jpg")));

        //Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/P"+pic2+".gif"))); // NOI18N
}
 else
{
       eish.setText("X");
                   jPanel1.setBackground(new java.awt.Color(255, 51, 51));
int pic=(int)(Math.random()*4)+1;
     jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/oops.jpg")));
//score++;
//S.setText(String.valueOf(score));
total++;
T.setText(String.valueOf(total));
 }
      }
      if(generate==1)
      {
       int step1=num1*num3;
     double step2=(double)(0.5*num2*num4);
     double ans=step1-step2;
int userAns=Integer.parseInt(Answer.getText());
if(ans==userAns)
{
                   jPanel1.setBackground(new java.awt.Color(102, 255, 0));
int pic2=(int)(Math.random()*3)+1;

//        Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/P"+pic2+".gif")));
    eish.setText("√");
score++;
S.setText(String.valueOf(score));
total++;
T.setText(String.valueOf(total));
     jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/DontKnow!.jpg")));

}
 else
{
    int pic=(int)(Math.random()*4)+1;
//jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/N"+pic+".jpg")));
       eish.setText("X");
                   jPanel1.setBackground(new java.awt.Color(255, 51, 51));
                    jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/oops.jpg")));

//score++;
//S.setText(String.valueOf(score));
total++;
T.setText(String.valueOf(total));
 }
      }
      if(generate==2)
      {
       int step1=num1*num2;
    // double step2=(double)(0.5*num2*num4);
     double ans=step1;
int userAns=Integer.parseInt(Answer.getText());
if(ans==userAns)
{
    int pic2=(int)(Math.random()*3)+1;

    eish.setText("√");
         jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/DontKnow!.jpg")));

                   jPanel1.setBackground(new java.awt.Color(102, 255, 0));
score++;
S.setText(String.valueOf(score));
total++;
T.setText(String.valueOf(total));
}
 else
{
    int pic=(int)(Math.random()*4)+1;
jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/N"+pic+".jpg")));
       eish.setText("X");
                   jPanel1.setBackground(new java.awt.Color(255, 51, 51));
                    jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/oops.jpg")));

//score++;
//S.setText(String.valueOf(score));
total++;
T.setText(String.valueOf(total));
 }
      }
      if(generate==3)
      {
   //   int step1=num1*num2;
     double step2=(double)(0.5*num1*num2);
     double ans=step2;
int userAns=Integer.parseInt(Answer.getText());
if(ans==userAns)
{
    int pic2=(int)(Math.random()*3)+1;
jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/DontKnow.jpg")));

    eish.setText("√");
                   jPanel1.setBackground(new java.awt.Color(102, 255, 0));
score++;
S.setText(String.valueOf(score));
total++;
T.setText(String.valueOf(total));
}
 else
{
 int pic=(int)(Math.random()*4)+1;
jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/N"+pic+".jpg")));
    jPanel1.setBackground(new java.awt.Color(102, 255, 0));
     eish.setText("X");
     jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/oops.jpg")));

//score++;
//S.setText(String.valueOf(score));
total++;
T.setText(String.valueOf(total));
 }
      }
    }








    public void ShowAnswer()
    {
            if(generate==0)
      {
int step1=num1*num3;
int step2=num2*num4;
int ans=step1-step2;
//int userAns=Integer.parseInt(Answer.getText());
CAnswer.setText(String.valueOf(ans));
score--;
S.setText(String.valueOf(score));
total++;
T.setText(String.valueOf(total));

      }
      if(generate==1)
      {
       int step1=num1*num3;
     double step2=(double)(0.5*num2*num4);
     double ans=step1-step2;
//int userAns=Integer.parseInt(Answer.getText());
CAnswer.setText(String.valueOf(ans));
score--;
S.setText(String.valueOf(score));
total++;
T.setText(String.valueOf(total));
      }
      if(generate==2)
      {
       int step1=num1*num2;
    // double step2=(double)(0.5*num2*num4);
     double ans=step1;
//int userAns=Integer.parseInt(Answer.getText());
CAnswer.setText(String.valueOf(ans));
score--;
S.setText(String.valueOf(score));
total++;
T.setText(String.valueOf(total));
      }
      if(generate==3)
      {
   //   int step1=num1*num2;
     double step2=(double)(0.5*num1*num2);
     double ans=step2;
//int userAns=Integer.parseInt(Answer.getText());
CAnswer.setText(String.valueOf(ans));
jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/DontKnow.jpg")));

score--;
S.setText(String.valueOf(score));
total++;
T.setText(String.valueOf(total));
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Answer = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CAnswer = new javax.swing.JLabel();
        eish = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Pic = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        S = new javax.swing.JLabel();
        T = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Area -Easy", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Snap ITC", 0, 36))); // NOI18N
        jPanel1.setLayout(null);

        jTextArea1.setBackground(new java.awt.Color(51, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(16, 53, 394, 150);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setText("Answer Below please:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(16, 322, 371, 50);

        Answer.setBackground(new java.awt.Color(255, 255, 51));
        Answer.setFont(new java.awt.Font("Chiller", 1, 24));
        jPanel1.add(Answer);
        Answer.setBounds(16, 444, 496, 50);

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(610, 350, 210, 23);

        jButton2.setText("Mark");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(610, 390, 210, 23);

        jButton3.setText("Don't Know");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(610, 440, 210, 23);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        CAnswer.setFont(new java.awt.Font("Snap ITC", 3, 36)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(610, 490, 310, 100);

        eish.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jPanel1.add(eish);
        eish.setBounds(434, 384, 70, 50);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(null);
        jPanel3.add(jLabel2);
        jLabel2.setBounds(250, 240, 120, 20);
        jPanel3.add(jLabel4);
        jLabel4.setBounds(100, 120, 60, 30);
        jPanel3.add(jLabel3);
        jLabel3.setBounds(260, 160, 70, 30);
        jPanel3.add(jLabel5);
        jLabel5.setBounds(234, 60, 70, 20);
        jPanel3.add(jLabel6);
        jLabel6.setBounds(314, 94, 80, 30);
        jPanel3.add(jLabel7);
        jLabel7.setBounds(190, 104, 70, 30);
        jPanel3.add(jLabel8);
        jLabel8.setBounds(240, 20, 80, 20);
        jPanel3.add(jLabel9);
        jLabel9.setBounds(424, 130, 80, 30);
        jPanel3.add(jLabel10);
        jLabel10.setBounds(230, 0, 120, 30);
        jPanel3.add(jLabel11);
        jLabel11.setBounds(250, 260, 100, 20);
        jPanel3.add(jLabel12);
        jLabel12.setBounds(130, 150, 60, 30);
        jPanel3.add(jLabel13);
        jLabel13.setBounds(210, 220, 120, 20);
        jPanel3.add(jLabel14);
        jLabel14.setBounds(360, 120, 70, 20);
        jPanel3.add(jLabel15);
        jLabel15.setBounds(220, 40, 90, 20);

        Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/3QS.png"))); // NOI18N
        jPanel3.add(Pic);
        Pic.setBounds(80, 0, 570, 280);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(530, 50, 580, 290);

        jLabel16.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel16.setText("SCORE:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(30, 510, 130, 30);

        jLabel17.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel17.setText("TOTAL:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(30, 560, 140, 40);

        S.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        S.setText("S");
        jPanel1.add(S);
        S.setBounds(190, 510, 90, 30);

        T.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        T.setText("T");
        jPanel1.add(T);
        T.setBounds(200, 564, 100, 30);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grade3/DontKnow!.jpg"))); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(30, 40, 780, 580);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1314, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
clearShape1();
generateQ();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Mark();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ShowAnswer();
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        new WelcomePage().setVisible(true);

        // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.dispose();
        new AreaMenu().setVisible(true);
        // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
        new AreaM().setVisible(true);
        // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.dispose();
        new AreaH().setVisible(true);
        // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Area().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Answer;
    private javax.swing.JLabel CAnswer;
    private javax.swing.JLabel Pic;
    private javax.swing.JLabel S;
    private javax.swing.JLabel T;
    private javax.swing.JLabel eish;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
