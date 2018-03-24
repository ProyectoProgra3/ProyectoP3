/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static iComponents.ComponentInterfaz.LEFT;
import iComponents.iButton;
import iComponents.iButtonFake;
import iComponents.iClock;
import iComponents.iComboCheckBox;
import iComponents.iFrame;
import iComponents.iPanel;
import iComponents.iTable;
import iComponents.iTextField;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.SwingUtilities;
import jiconfont.icons.FontAwesome;

/**
 *
 * @author crodas
 */
public class MainDashboard {

    public iFrame dash_frm;
    public iPanel info_panel = new iPanel(600, 400, 5, 5, 5, 40);
    public iPanel menu_panel = new iPanel(0, 30, 200, 600, 0, 80);
    public iPanel search_panel = new iPanel(200, 30, 600, 60, 0, 0);
    public iButtonFake btn_agregar = new iButtonFake("Agregar Solicitud", "", new Color(247, 247, 247), new Color(106, 203, 214), new Color(247, 247, 247).darker(), new Color(106, 203, 214), FontAwesome.ADDRESS_CARD_O);
    public iButtonFake btn_citas = new iButtonFake("Citas            ", "", new Color(247, 247, 247), new Color(106, 203, 214), new Color(247, 247, 247).darker(), new Color(106, 203, 214), FontAwesome.CALENDAR_PLUS_O);
    public iButtonFake btn_expd = new iButtonFake("Expedientes", "", new Color(247, 247, 247), new Color(106, 203, 214), new Color(247, 247, 247).darker(), new Color(106, 203, 214), FontAwesome.FOLDER_OPEN);
    public iButtonFake btn_psico = new iButtonFake("Psicólogos", "", new Color(247, 247, 247), new Color(106, 203, 214), new Color(247, 247, 247).darker(), new Color(106, 203, 214), FontAwesome.HOSPITAL_O);
    public iButtonFake btn_just = new iButtonFake("Justificación", "", new Color(247, 247, 247), new Color(106, 203, 214), new Color(247, 247, 247).darker(), new Color(106, 203, 214), FontAwesome.ADDRESS_CARD_O);
    public iButtonFake btn_report = new iButtonFake("Reportes", "", new Color(247, 247, 247), new Color(106, 203, 214), new Color(247, 247, 247).darker(), new Color(106, 203, 214), FontAwesome.PAPERCLIP);
    public iButtonFake btn_curso = new iButtonFake("Cursos", "", new Color(247, 247, 247), new Color(106, 203, 214), new Color(247, 247, 247).darker(), new Color(106, 203, 214), FontAwesome.INDENT);
    
    
    
    //Botones PANEL SUPERIOR
    public iButtonFake btn_niño = new iButtonFake("Niño", " Tipo Paciente", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.CHILD);
    public iButtonFake btn_adol = new iButtonFake("Adolescente", " Tipo Paciente", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.USER);
    public iButtonFake btn_pareja = new iButtonFake("Pareja", " Tipo Paciente", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.VENUS_MARS);
    public iButtonFake btn_fam = new iButtonFake("Familia", " Tipo Paciente", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.USERS);

    //Botónes asociados a CITA
    public iButtonFake btn_ced = new iButtonFake("Cédula", "Tipo Búsqueda", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.ID_CARD_O);
    public iButtonFake btn_type = new iButtonFake("Tipo Paciente", " Tipo Búsqueda", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.GENDERLESS);
    // Botones  Expedientes 
    public iButtonFake btn_solicitudes = new iButtonFake("Solicitud", "Expediente", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.INFO);
    public iButtonFake btn_clinica = new iButtonFake("Clínica", " Expediente", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.BUILDING);
    public iButtonFake btn_Lnegra = new iButtonFake("Lista Negra", " Expedientes", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.LIST);
    // BOTONES Psicologis 
    public iButtonFake btn_mosPsico = new iButtonFake("Mostar Psicólogos", "Psicólogos", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.USER);
    public iButtonFake btn_agrePsico = new iButtonFake("Agregar Psicólogos", "Psicólogos", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.USER_PLUS);
    public iButtonFake btn_eliPsico = new iButtonFake("Eliminar Psicólogos", "Psicólogos", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.TRASH);
    public iButtonFake btn_eliTodos = new iButtonFake("Eliminar Todos ", "Psicólogos", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.TRASH);

    //Botones Cursos
    public iButtonFake btn_eliminar = new iButtonFake("Eliminar", "Curso", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.TRASH);
    public iButtonFake btn_agrcurso = new iButtonFake("Agregar", "Curso", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.PLUS_SQUARE_O);
 
    
    
    //Botones justificacion
    public iButtonFake btn_justi = new iButtonFake("Generar Justificación", "", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.FILE_TEXT_O);
    public iButtonFake btn_justi_print = new iButtonFake("Imprimir", "Imprimir justificación", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.PRINT);

    //Boton Reportes
    public iButtonFake btn_report_diario = new iButtonFake("Diario", "Reporte Diario", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.CALENDAR_CHECK_O);
    public iButtonFake btn_report_semanal = new iButtonFake("Semanal", "Reporte Semanal", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.CALENDAR_CHECK_O);
    public iButtonFake btn_report_mensual = new iButtonFake("Mensual", "Reporte Mensual", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.CALENDAR_CHECK_O);

    ///////////////////////////////////////////////////////////////////////////
    //// CONTENIDO DEL PANEL DE INFORMACIÓN////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    ///NIÑO///
    public iTextField nid_txt = new iTextField("Digite ID", 6);
    public iTextField nnombre_txt = new iTextField("Digite Nombre", 6);
    public iTextField napellido_txt = new iTextField("Digite Apellido", 6);
    public iTextField nedad_txt = new iTextField("Digite Edad", 6);
    public iTextField nreferencia_txt = new iTextField("Digite Referencia", 6);
    public iTextField nocupacion_txt = new iTextField("Digite Ocupación", 6);
    public iTextField ndireccion_txt = new iTextField("Digite Dirección", 6);
    public iTextField ntelefono_txt = new iTextField("Digite Teléfono", 6);
    public iTextField nemail_txt = new iTextField("Digite Correo", 6);
    public iTextField nmotivo_txt = new iTextField("Digite Motivo", 6);
    public iTextField nhorario_txt = new iTextField("Digite Horario", 6);
    public iTextField ndetalle_txt = new iTextField("Digite Detalle de Horario", 6);
    public iTextField nsolicitante_txt = new iTextField("Digite Nombre de Solicitante", 6);
    public iButtonFake btn_agr = new iButtonFake("Agregar Solicitante", " Tipo Paciente", new Color(255, 255, 255), new Color(137, 185, 185), new Color(247, 247, 247), new Color(106, 203, 214).darker(), FontAwesome.CHILD);
    public iComboCheckBox tipo_cbm = new iComboCheckBox();
    
    public MainDashboard() {

        dash_frm = new iFrame(800, 630, 5, 2, JFrame.EXIT_ON_CLOSE);
        dash_frm.addUndecoredStyle(new Color(106, 203, 214));
        initComponents();
    }

    public void initComponents() {

        //Panel del Menú   
        JLabel triage_lbl = new JLabel();
        triage_lbl.setBounds(60, -40, 150, 150);
        triage_lbl.setFont(new Font("Broadway", 1, 20));
        triage_lbl.setForeground(new Color(247, 247, 247));
        triage_lbl.setText("INICIO");

        menu_panel.setBackground(new Color(106, 203, 214));

        //*** Aquí agregamos los FAKE BUTTONS al panel, (Nombre, largo, ancho, posición)
        menu_panel.AddSingleObject(btn_agregar, 180, 40, LEFT);
        menu_panel.AddSingleObject(btn_citas, 100, 40, LEFT);
        menu_panel.AddSingleObject(btn_expd, 140, 40, LEFT);
        menu_panel.AddSingleObject(btn_psico, 135, 40, LEFT);
        menu_panel.AddSingleObject(btn_curso, 105, 40, LEFT);
        menu_panel.AddSingleObject(btn_just, 140, 40, LEFT);
        menu_panel.AddSingleObject(btn_report, 120, 40, LEFT);
        menu_panel.newLine();

        
        search_panel.setBackground(new Color(137, 185, 185));


        //Panel de información (Aqui se desplegaría toda la información)
        info_panel.setBounds(200, 90, 600, 540);
        info_panel.setBackground(new Color(255, 255, 255));
        
 ///////////////////////////////////////////////////////////////////////////////       
        JLabel id_lbl = new JLabel();
        id_lbl.setText("ID: ");
        id_lbl.setForeground(new Color(156, 156, 156));
        id_lbl.setBounds(10, 10, 50, 20);
        nid_txt.setBounds(90, 10, 140, 20);
        
        JLabel nombre_lbl = new JLabel();
        nombre_lbl.setText("Nombre: ");
        nombre_lbl.setForeground(new Color(156, 156, 156));
        nombre_lbl.setBounds(10, 50, 60, 20);
        nnombre_txt.setBounds(90, 50, 140, 20);
        
        JLabel apellido_lbl = new JLabel();
        apellido_lbl.setText("Apellido: ");
        apellido_lbl.setForeground(new Color(156, 156, 156));
        apellido_lbl.setBounds(260, 50, 60, 20);
        napellido_txt.setBounds(320, 50, 140, 20);
        
        JLabel edad_lbl = new JLabel();
        edad_lbl.setText("Edad: ");
        edad_lbl.setForeground(new Color(156, 156, 156));
        edad_lbl.setBounds(10, 90, 50, 20);
        nedad_txt.setBounds(90, 90, 140, 20);
        
        JLabel referencia_lbl = new JLabel();
        referencia_lbl.setText("Referencia: ");
        referencia_lbl.setForeground(new Color(156, 156, 156));
        referencia_lbl.setBounds(10, 130, 70, 20);
        nreferencia_txt.setBounds(90, 130, 140, 20);
        
        JLabel ocupacion_lbl = new JLabel();
        ocupacion_lbl.setText("Ocupación: ");
        ocupacion_lbl.setForeground(new Color(156, 156, 156));
        ocupacion_lbl.setBounds(10, 170, 70, 20);
        nocupacion_txt.setBounds(90, 170, 140, 20);
        
        JLabel direccion_lbl = new JLabel();
        direccion_lbl.setText("Dirección: ");
        direccion_lbl.setForeground(new Color(156, 156, 156));
        direccion_lbl.setBounds(10, 210, 70, 20);
        ndireccion_txt.setBounds(90, 210, 440, 20);
        
        JLabel telefono_lbl = new JLabel();
        telefono_lbl.setText("Teléfono: ");
        telefono_lbl.setForeground(new Color(156, 156, 156));
        telefono_lbl.setBounds(10, 250, 70, 20);
        ntelefono_txt.setBounds(90, 250, 140, 20);
        
        JLabel email_lbl = new JLabel();
        email_lbl.setText("Correo: ");
        email_lbl.setForeground(new Color(156, 156, 156));
        email_lbl.setBounds(260, 250, 70, 20);
        nemail_txt.setBounds(320, 250, 140, 20);
        
        JLabel motivo_lbl = new JLabel();
        motivo_lbl.setText("Motivo: ");
        motivo_lbl.setForeground(new Color(156, 156, 156));
        motivo_lbl.setBounds(10, 290, 70, 20);
        nmotivo_txt.setBounds(90, 290, 220, 60);
        
        JLabel horario_lbl = new JLabel();
        horario_lbl.setText("Horario: ");
        horario_lbl.setForeground(new Color(156, 156, 156));
        horario_lbl.setBounds(10, 370, 70, 20);
        nhorario_txt.setBounds(90, 370, 140, 20);
        
        JLabel detalle_lbl = new JLabel();
        detalle_lbl.setText("Detalle: ");
        detalle_lbl.setForeground(new Color(156, 156, 156));
        detalle_lbl.setBounds(10, 410, 70, 20);
        ndetalle_txt.setBounds(90, 410, 140, 20);
        
        JLabel solicitante_lbl = new JLabel();
        solicitante_lbl.setText("Solicitante: ");
        solicitante_lbl.setForeground(new Color(156, 156, 156));
        solicitante_lbl.setBounds(10, 450, 70, 20);
        nsolicitante_txt.setBounds(90, 450, 140, 20);
        
        tipo_cbm.setBounds(90, 500, 70, 20);
        btn_agr.setBounds(430, 415, 100, 60);
  //////////////////////////////////////////////////////////////////////////////      

        //clock
        iClock clock = new iClock(80, 100, 100, 100);
        clock.setForeground(new Color(247, 247, 247));
        clock.setFont(new Font("Rockwell", 1, 12));
        clock.setBounds(65, 500, 80, 100);

        ImageIcon fondo = new ImageIcon("C:/Users/crodas/Pictures/fondo.png");
        JLabel fondo_label = new JLabel(fondo);
        fondo_label.setBounds(100, 60, 400, 400);

        menu_panel.add(triage_lbl);
        menu_panel.add(clock);
        
        
        info_panel.add(id_lbl);
        info_panel.add(nid_txt);
        info_panel.add(nombre_lbl);
        info_panel.add(nnombre_txt);
        info_panel.add(apellido_lbl);
        info_panel.add(napellido_txt);
        info_panel.add(edad_lbl);
        info_panel.add(nedad_txt);
        info_panel.add(referencia_lbl);
        info_panel.add(nreferencia_txt);
        info_panel.add(ocupacion_lbl);
        info_panel.add(nocupacion_txt);
        info_panel.add(direccion_lbl);
        info_panel.add(ndireccion_txt);
        info_panel.add(telefono_lbl);
        info_panel.add(ntelefono_txt);
        info_panel.add(email_lbl);
        info_panel.add(nemail_txt);
        info_panel.add(motivo_lbl);
        info_panel.add(nmotivo_txt);
        info_panel.add(horario_lbl);
        info_panel.add(nhorario_txt);
        info_panel.add(detalle_lbl);
        info_panel.add(ndetalle_txt);
        info_panel.add(solicitante_lbl);
        info_panel.add(nsolicitante_txt);
        info_panel.add(btn_agr);
      //info_panel.add(tipo_cbm);
                
        info_panel.add(fondo_label);
        dash_frm.add(info_panel);
        dash_frm.add(search_panel);
        dash_frm.add(menu_panel);
        dash_frm.finalice();
    }

    //Metódos para cargar botones al panel
    public void BtnAregarSolic() {
        //Metodo para cargar botones al clickear "AGREGAR SOLICITUD"    
        search_panel.dispose();
        search_panel.repaint();
        search_panel.AddObject(btn_fam, 100, 60, 345);
        search_panel.AddObject(btn_pareja, 100, 60, 245);
        search_panel.AddObject(btn_adol, 125, 60, 110);
        search_panel.AddObject(btn_niño, 100, 60, 5);
        search_panel.newLine();
        search_panel.finalice();

    }

    public void Btn_Cita() {
        //Metodo para cargar botones al clickear "CITAS"
        search_panel.dispose();
        search_panel.repaint();
        search_panel.AddObject(btn_type, 150, 60, 105);
        search_panel.AddObject(btn_ced, 100, 60, 5);
        search_panel.newLine();
        //hola
        //holaMario
    }

    public void BtnExpedientes() {
        //Panel de busquedas      
        search_panel.dispose();
        search_panel.repaint();
        search_panel.AddObject(btn_solicitudes, 120, 60, 245);
        search_panel.AddObject(btn_clinica, 120, 60, 125);
        search_panel.AddObject(btn_Lnegra, 120, 60, 5);
        search_panel.newLine();
    }

    public void BtnPsicologos() {
        //Panel de busquedas        
        search_panel.dispose();
        search_panel.repaint();
        search_panel.AddObject(btn_mosPsico, 135, 60, 410);
        search_panel.AddObject(btn_agrePsico, 135, 60, 275);
        search_panel.AddObject(btn_eliPsico, 135, 60, 140);
        search_panel.AddObject(btn_eliTodos, 135, 60, 5);
        search_panel.newLine();
    }
    
    public void BtnCurso(){
        //Metodo para cargar botones al clickear "CURSOS"
        search_panel.dispose();
        search_panel.repaint();                
        search_panel.AddObject(btn_eliminar, 120, 60, 125);
        btn_eliminar.setBorder(0, 0, 0, 1, new Color(162, 202, 202));
        search_panel.AddObject(btn_agrcurso, 120, 60, 5);
        btn_agrcurso.setBorder(0, 0, 0, 1, new Color(162, 202, 202));
        search_panel.newLine();
    }

    public void BtnJustificacion() {
        search_panel.dispose();
        search_panel.repaint();
        search_panel.AddObject(btn_justi, 140, 60, 131);
        btn_justi.setBorder(0, 0, 0, 1, new Color(162, 202, 202));
        search_panel.AddObject(btn_justi_print, 130, 60, 2);
        btn_justi_print.setBorder(0, 0, 0, 1, new Color(162, 202, 202));
        search_panel.newLine();
    }

    public void BtnReportes() {
        search_panel.dispose();
        search_panel.repaint();
        search_panel.AddObject(btn_report_diario, 120, 60, 242);
        btn_report_diario.setBorder(0, 0, 0, 1, new Color(162, 202, 202));
        search_panel.AddObject(btn_report_semanal, 120, 60, 122);
        btn_report_semanal.setBorder(0, 0, 0, 1, new Color(162, 202, 202));
        search_panel.AddObject(btn_report_mensual, 120, 60, 2);
        btn_report_mensual.setBorder(0, 0, 0, 1, new Color(162, 202, 202));
        search_panel.newLine();
    }

}
