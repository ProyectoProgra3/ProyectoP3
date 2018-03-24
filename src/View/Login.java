/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
//icompone_mario
//        Mario2018
import iComponents.iButton;
import iComponents.iClock;
import iComponents.iFrame;
import iComponents.iPanel;
import iComponents.iPasswordField;
import iComponents.iTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author crodas
 */
public class Login {
    //600, 400, 5, 5, 5
    public iPanel panel;
    public JLabel tri_lbl = new JLabel();
    public JLabel usr_lbl = new JLabel();
    public JLabel pass_lbl = new JLabel();
    public iTextField usr_txt = new iTextField("Digite su usuario", 6);
    public iPasswordField pass_txt = new iPasswordField("Digite su contraseña", 6);
    public iButton btn_ingresar = new iButton("ACCESAR", 6, new Color(106, 203, 214), Color.WHITE);
    public iFrame frm;

    public Login() {
        frm = new iFrame(600, 400, 5, 2, JFrame.EXIT_ON_CLOSE);
        panel = new iPanel(0, 0, 100.0f, 100.0f, 5, 5, frm);
        frm.setHeaderBackground(new Color(255, 255, 255));
        initcomponets();
    }

    public void initcomponets() {
        // TODO code application logic here

        ImageIcon logo = new ImageIcon("C:/Users/crodas/Pictures/ul.png");
        JLabel logo_label = new JLabel(logo);
        logo_label.setBounds(-40, -30, 400, 200);

        ImageIcon logo2 = new ImageIcon("C:/Users/crodas/Pictures/psi.jpeg");
        JLabel logo_label2 = new JLabel(logo2);
        logo_label2.setBounds(230, -30, 400, 200);

        //Panel       
        panel.setBounds(0, 0, 600, 400);
        panel.setBackground(new Color(255, 255, 255));

        //Campo Usuario       
        usr_lbl.setText("Usuario");
        usr_lbl.setForeground(new Color(156, 156, 156));
        usr_lbl.setBounds(200, 160, 50, 20);
        usr_txt.setBounds(200, 180, 140, 30);

        //Campo Password    
        pass_lbl.setText("Contraseña");
        pass_lbl.setForeground(new Color(156, 156, 156));
        pass_lbl.setBounds(200, 176, 80, 100);
        pass_txt.setBounds(200, 235, 140, 25);

        //Botón Ingresar
        btn_ingresar.setBounds(370, 180, 80, 80);

        //clock
        iClock clock = new iClock(80, 100, 100, 100);
        clock.setForeground(new Color(156, 156, 156));
        clock.setBounds(30, 290, 80, 100);

        panel.add(clock);
        panel.add(logo_label2);
        panel.add(logo_label);
        panel.add(pass_txt);
        panel.add(pass_lbl);
        panel.add(btn_ingresar);
        panel.add(usr_txt);
        panel.add(usr_lbl);
        logo_label.setVisible(true);
        frm.add(panel);
        frm.finalice();
    }

}
