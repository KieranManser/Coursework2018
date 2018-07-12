package generateoutandin;

import java.util.Random;



public class main_frame extends javax.swing.JFrame {

    public main_frame() {
        initComponents();
        setWord();
        setTheme();
        setRound();
    }
  
    private String temp = "";
    private int getLength = 2;
    private int letterCheck = 0;
    private final String[][] words = new String [9][6];
    private boolean success = false;
    public static int score = 0;
    public static int completeWords = 0;
    public static int lives = 3;
    public static String mistakes = "";
    
    private void setWord(){
        //two letter words
        words[0][0] = "as"; 
        words[0][1] = "if"; 
        words[0][2] = "hi";
        words[0][3] = "it"; 
        words[0][4] = "of"; 
        words[0][5] = "to"; 

        //three letter words
        words[1][0] = "has"; 
        words[1][1] = "can"; 
        words[1][2] = "man";
        words[1][3] = "and"; 
        words[1][4] = "but"; 
        words[1][5] = "the"; 

        //four letter words
        words[2][0] = "whom"; 
        words[2][1] = "hawk"; 
        words[2][2] = "four";
        words[2][3] = "hair"; 
        words[2][4] = "what"; 
        words[2][5] = "true"; 

        //five letter words
        words[3][0] = "blade"; 
        words[3][1] = "clout"; 
        words[3][2] = "seven";
        words[3][3] = "quake"; 
        words[3][4] = "arrow"; 
        words[3][5] = "rogue"; 

        //six letter words
        words[4][0] = "cheese"; 
        words[4][1] = "series"; 
        words[4][2] = "clouds";
        words[4][3] = "pulled"; 
        words[4][4] = "marvel"; 
        words[4][5] = "voodoo"; 

        //seven letter words
        words[5][0] = "crystal"; 
        words[5][1] = "sausage"; 
        words[5][2] = "contest";
        words[5][3] = "generic"; 
        words[5][4] = "premium"; 
        words[5][5] = "panther"; 

        //eight letter words
        words[6][0] = "champions"; 
        words[6][1] = "colossal"; 
        words[6][2] = "overtake";
        words[6][3] = "monopoly"; 
        words[6][4] = "featured"; 
        words[6][5] = "magician"; 

        //nine letter words
        words[7][0] = "memorials"; 
        words[7][1] = "daredevil"; 
        words[7][2] = "bumfuzzle";
        words[7][3] = "zugzwangs"; 
        words[7][4] = "labyrinth"; 
        words[7][5] = "muckamuck"; 

    }

    private void setTheme(){         
        if (menu_frame.theme ==0){
            jThemeMint.setVisible(false);
            jThemePurple.setVisible(false);
        }
        if(menu_frame.theme == 1){
           jThemeMint.setVisible(true);
           jThemePurple.setVisible(false);  
        }
        if(menu_frame.theme == 2){
           jThemePurple.setVisible(true);
           jThemeMint.setVisible(false);
        } 
    }
    private void setRound(){
        //declaration of all static varaibles incase user returns to menu 
        score = 0;
        completeWords = 0;
        lives = 3;
        mistakes = "";
        jPhraseOut.setText(words[getLength-2][getRandomNum()]);
        jLives.setText("Lives: " + Integer.toString(lives));
        jCompleteCheck.setText("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPhraseOut = new javax.swing.JLabel();
        jScoreLabel = new javax.swing.JLabel();
        jPhraseIn = new javax.swing.JTextField();
        jCompleteCheck = new javax.swing.JLabel();
        jNumDone = new javax.swing.JLabel();
        jMenu = new javax.swing.JButton();
        jLives = new javax.swing.JLabel();
        jEndRound = new javax.swing.JButton();
        jThemeMint = new javax.swing.JLabel();
        jThemePurple = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        jPhraseOut.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jPhraseOut.setText("Output");
        getContentPane().add(jPhraseOut);
        jPhraseOut.setBounds(36, 71, 430, 78);

        jScoreLabel.setText("Type here:");
        getContentPane().add(jScoreLabel);
        jScoreLabel.setBounds(36, 167, 100, 14);

        jPhraseIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPhraseInKeyReleased(evt);
            }
        });
        getContentPane().add(jPhraseIn);
        jPhraseIn.setBounds(36, 192, 182, 36);

        jCompleteCheck.setText("correct/fail");
        getContentPane().add(jCompleteCheck);
        jCompleteCheck.setBounds(36, 240, 105, 45);

        jNumDone.setText("Amount of successful words:");
        getContentPane().add(jNumDone);
        jNumDone.setBounds(36, 291, 182, 31);

        jMenu.setText("Menu");
        jMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jMenu);
        jMenu.setBounds(26, 11, 90, 23);

        jLives.setText("Lives:");
        getContentPane().add(jLives);
        jLives.setBounds(230, 190, 70, 40);

        jEndRound.setText("End round with current score");
        jEndRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEndRoundActionPerformed(evt);
            }
        });
        getContentPane().add(jEndRound);
        jEndRound.setBounds(26, 340, 300, 23);

        jThemeMint.setBackground(new java.awt.Color(153, 255, 204));
        jThemeMint.setOpaque(true);
        getContentPane().add(jThemeMint);
        jThemeMint.setBounds(0, 0, 500, 400);

        jThemePurple.setBackground(new java.awt.Color(102, 51, 255));
        jThemePurple.setOpaque(true);
        getContentPane().add(jThemePurple);
        jThemePurple.setBounds(0, 0, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //generates a random integer for the selection of the next word in the array
    private int getRandomNum() {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(6);
        return randomInt;
    }


    //menu button pressed
    private void jMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuActionPerformed
        new menu_frame().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jMenuActionPerformed
  
    private void jPhraseInKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPhraseInKeyReleased
        String userTry = jPhraseIn.getText();
        String word = jPhraseOut.getText();
        char checkChar = word.charAt(letterCheck); // sets the location 'x' of both the users and outputted strings
        char userChar = userTry.charAt(letterCheck);
        if (userTry.equals(word)){
            success =true;
            completeWords++;
            jNumDone.setText("Amount of successful words: " + Integer.toString(completeWords));
            jPhraseIn.setText("");
            //stops the word size from increasing over 9 letters
            if(getLength != 9){ 
            getLength++;
            }
        jPhraseOut.setText(words[getLength-2][getRandomNum()]);
        }
        // checks the users char input to the current character required
        // checks if the letter 'x' located at 'y' is the same as the users input at the same location
        if (userChar==checkChar) {
            letterCheck++;
        } else {
            jPhraseIn.setText("");
            temp = Character.toString(checkChar);
            mistakes = mistakes.concat(temp); 
            jLives.setText("Lives: " + Integer.toString(lives));
            score = score - (150 - (letterCheck *20)); //points lost based on how far into the word before failure
            letterCheck = 0;
            jScoreLabel.setText(Integer.toString(score));
            lives--; //lives list when wrong input scanned
            if (lives == 0){
                gameOver();
            }
        jPhraseOut.setText(words[getLength-2][getRandomNum()]);
        }
        //when the word is correct the success flag will be reset for the next word to be outputted and score increases
        if (success == true){
            jCompleteCheck.setText("Correct!");
            success = false;
            letterCheck = 0;
            score = score + (100 * (getLength/2)) ;
            jScoreLabel.setText(Integer.toString(score));
         }
        else {
            jCompleteCheck.setText(Integer.toString(letterCheck));
        }    
    }//GEN-LAST:event_jPhraseInKeyReleased
    //user optionally ends the round
    private void jEndRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEndRoundActionPerformed
        new stat_page().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jEndRoundActionPerformed
 
    // Opens the statistics page after the user has lost all lives
    private void gameOver(){
        new stat_page().setVisible(true);
        super.dispose();
    }
      
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCompleteCheck;
    private javax.swing.JButton jEndRound;
    private javax.swing.JLabel jLives;
    private javax.swing.JButton jMenu;
    private javax.swing.JLabel jNumDone;
    private javax.swing.JTextField jPhraseIn;
    private javax.swing.JLabel jPhraseOut;
    private javax.swing.JLabel jScoreLabel;
    private javax.swing.JLabel jThemeMint;
    private javax.swing.JLabel jThemePurple;
    // End of variables declaration//GEN-END:variables
}
