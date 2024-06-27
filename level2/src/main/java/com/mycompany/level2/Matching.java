/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.level2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author Piyush Jain
 */
public class Matching {

    public String picl2[] = {"pics/level2/l21.png", "pics/level2/l22.png", "pics/level2/l23.png"};
    public String picl1[] = {"pics/level1/l1.png", "pics/level1/l2.png"};
    public String picl3[] = {"pics/level3/l31.png", "pics/level3/l32.png", "pics/level3/l33.png", "pics/level3/l34.png"};
    public String picl4[] = {"pics/level4/l41.png", "pics/level4/l42.png", "pics/level4/l43.png", "pics/level4/l44.png", "pics/level4/l45.png"};
    public String picl5[] = {"pics/level5/l51.png", "pics/level5/l52.png", "pics/level5/l53.png", "pics/level5/l54.png", "pics/level5/l55.png", "pics/level5/l56.png"};
    public String picl6[] = {"pics/level6/l61.png", "pics/level6/l62.png", "pics/level6/l63.png", "pics/level6/l64.png", "pics/level6/l65.png", "pics/level6/l66.png", "pics/level6/l67.png"};
    public String picl7[] = {"pics/level7/l71.png", "pics/level7/l72.png", "pics/level7/l73.png", "pics/level7/l74.png", "pics/level7/l75.png", "pics/level7/l76.png", "pics/level7/l77.png", "pics/level7/l78.png"};
    public String picl8[] = {"pics/level8/l81.png", "pics/level8/l82.png", "pics/level8/l83.png", "pics/level8/l84.png", "pics/level8/l85.png", "pics/level8/l86.png", "pics/level8/l87.png", "pics/level8/l88.png", "pics/level8/l89.png"};
    public String picl9[] = {"pics/level9/l91.png", "pics/level9/l92.png", "pics/level9/l93.png", "pics/level9/l94.png", "pics/level9/l95.png", "pics/level9/l96.png", "pics/level9/l97.png", "pics/level9/l98.png", "pics/level9/l99.png", "pics/level9/l910.png"};
    public String path = "";
    public JButton obj;
    public int score;

    /*public void tym()
    {
        try {
                        TimeUnit.MILLISECONDS.sleep(4000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Matching.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }*/
    public void gameWork(JButton ob, JTextField tf, JButton next, String ms) {
        if (path.equals("")) {
            path = ob.getIcon().toString();
            obj = ob;
        } else if (obj.equals(ob)) {
            ob.setIcon(new javax.swing.ImageIcon(getClass().getResource("cardupper.jpg")));
            path = "";
        } else {
              
                if (ob.getIcon().toString().equals(path)) {
                //tym();
                ob.setVisible(false);
                obj.setVisible(false);
                path = "";
                score = score + 10;
                tf.setText("" + score);
                if (tf.getText().equalsIgnoreCase(ms)) {
                    next.setEnabled(true);
                }
            } else {
                ob.setIcon(new javax.swing.ImageIcon(getClass().getResource("cardupper.jpg")));
                obj.setIcon(new javax.swing.ImageIcon(getClass().getResource("cardupper.jpg")));
                path = "";
            }
        }
    }
}
