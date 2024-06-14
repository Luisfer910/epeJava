
package Epe2;

import javax.swing.*;
import java.awt.*;
import java. awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class Epe2 extends JFrame{//LA CLASE HEREDA LA FUNCIONALIDAD DE JFrame
    
     private DefaultListModel<String> tasklistmodel;//DEFINO VARIABLES
     private JList<String> tasklist;
     private JTextField taskinput;
     private JPanel Panel1,Panel2, Panel3,Panel4, Panel5,Panel6,Panel7;
     private JLabel Etiqueta,Etiqueta1,Etiqueta2,Etiqueta3;
     
    
     
 public Epe2(){
     setSize(700, 600);//Definimos el tamaño de la ventana
     setTitle("Sala de Ventas");//El titulo de la ventana
     setLocationRelativeTo(null);//centramos la ventana
     setLayout(new BorderLayout());//Establecemos el diseño de la ventana
       
     //Llamamos el metodo desde el constructor de ventana
     Componentes();
     Cajasdetexto();
     Listaymodelodetareas();
     Botones();
     Listadesplegable();
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Lo Usamos para cerrar la ventana al hacer clic
 }
 private void Componentes(){  
     //INSTANCIO LOS PANELES
     
     //EL PANEL 1 SE UBICA EN EL NORTE DE LA VENTANA
     //EL PANEL 1 ES EL PANEL DE LOS BOTONES DE PEDIDOS
     Panel1 = new JPanel(new GridLayout(2, 5));//LE DOY UN GridLAYOUT AL PANEL PARA QUE LOS BOTONES SE ORGANICEN TIPO REJILLA.
     this.getContentPane().add(Panel1, BorderLayout.NORTH);//AGREGO EL PANEL A LA VENTANA Y UBICO EL PANEL EN EL NORTE DEL DISEÑO DE LA VENTANA
     Panel1.setPreferredSize(new Dimension(700, 70));//DIMENSIONO EL GRUESO DE LA PESTAÑA
     Panel1.setBackground(Color.ORANGE);//AGREGO COLOR AL PANEL
     
     //EL PANEL 2 ESTA UBICADO EN EL CENTRO DE LA VENTANA Y ESTÁ DIVIDIDO EN 3 FILAS con GridLayout
     //EN LA FILA NORTE Y CENTRO ESTÁN LAS IMAGENES CON EL PANEL 4 Y 5
     //EN LA FILA SUR ESTA LA CAJA DE TEXTO Y LA LISTA DE TAREA
     Panel2 = new JPanel(new GridLayout(3, 1));
     this.getContentPane().add(Panel2,BorderLayout.CENTER);//UBICO EL PANEL EN EL CENTRO DEL DISEÑO DE LA VENTANA
     
     //PANEL 4,5,6 PERTENECEN AL PANEL2
     Panel4 = new JPanel(new BorderLayout());//SUBPANEL PARA LA PRIMERA FILA DEL DEL PANEL1 DIVIDIDO POR GRIDLAYOUT
     Panel2.add(Panel4);
    
     Panel5 = new JPanel(new BorderLayout());//SUBPANEL PARA LA SEGUNDA FILA DEL DEL PANEL1
     Panel2.add(Panel5);
     
     Panel6 = new JPanel(new BorderLayout());//SUBPANEL PARA LA TERCERA FILA DEL DEL PANEL
     Panel2.add(Panel6);
     
     //EL PANEL3 SE UBICA EN EL SUR DE LA VENTANA PRINCIPAL
     Panel3 = new JPanel(new BorderLayout());//PANEL QUE SE UBICA EN EL SUR DEL DISEÑO DE LA VENTANA
     add(Panel3,BorderLayout.SOUTH);
     
     Panel7 = new JPanel(new FlowLayout());//SUBPANEL PARA ORGANIZAR EL PANEL UBICADO EN EL SUR DEL DISEÑO DE LA VENTANA
     Panel3.add(Panel7);
     
     //ETIQUETA DE TEXTO
     Etiqueta = new JLabel("SELECCIONE EMPLEADO");
     Panel7.add(Etiqueta);
     
     Etiqueta1 = new JLabel("  INGRESE SU NOTA AQUÍ: ");
     Panel5.add(Etiqueta1,BorderLayout.PAGE_END);
     
     //ETIQUETA DE IMAGEN
     Etiqueta2 = new JLabel(new ImageIcon("SÁNDWICH.jpg"));
     Panel4.add(Etiqueta2,BorderLayout.CENTER);
     
     Etiqueta3 = new JLabel(new ImageIcon("completo-italiano.jpg"));
     Panel5.add(Etiqueta3,BorderLayout.CENTER);//AGREGO LA ETIQUETA AL PANEL Y LO UBICO EN LA REGION CENTRO DEL PANEL5
 }
 private void Cajasdetexto(){
    
     taskinput = new JTextField(); //Crear campo de texto para ingresar las tareas
     taskinput.setBounds(30, 30, 30, 30);
     Panel6.add(taskinput,BorderLayout.PAGE_START);//agregamos la caja de texto al panel
 }
 private void Listaymodelodetareas(){
     
     tasklistmodel = new DefaultListModel<>(); //Crear el modelo de datos
     tasklist = new JList(tasklistmodel);// Creamos la lista de tareas 
     Panel6.add(new JScrollPane(tasklist),BorderLayout.CENTER);//agregamos la lista a la ventana
 }
 private void Botones(){ //METODO PARA CONFIGURAR Y AGREGAR BOTONES A LA INTERFAZ GRAFICA
   
             
     JButton Button1 = new JButton("Agregar Observaciones");//creo boton
     Panel6.add( Button1,BorderLayout.EAST);
       
        //Agrego Evento
        Button1.addActionListener(new ActionListener() {
        @Override
        
        public void actionPerformed(ActionEvent e) {
           String task = taskinput.getText();
               if (!task.isEmpty())  {// Verificamos si el texto no está vacío
               tasklistmodel.addElement(task);// Si no está vacío, agregamos el texto a la lista de tareas (tasklistmodel)
               taskinput.setText(""); //limpiamos la caja de texto taskinput
         }    }    });  
        
     JButton Button2 = new JButton("Eliminar");//creo boton
     Panel3.add(Button2,BorderLayout.NORTH);
             
         Button2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {   
              int selectedIndex = tasklist.getSelectedIndex();
              if (selectedIndex != -1) { // Verifica si se ha seleccionado un índice válido
              tasklistmodel.remove(selectedIndex); // Elimina el elemento en el índice seleccionado
        }     else {
             JOptionPane.showMessageDialog(null, JOptionPane.WARNING_MESSAGE);
        } } } );
         
         
         //creo botones de pedidos
     String [] nombredelboton = {"SÁNDWICH","COMPLETOS","CHORRILLANAS","TACOS","COLACIONES","BEBIDAS","JUGOS NATURALES","HELADOS","PAPAS FRITAS","EMPANADAS"};
     for (String nombre : nombredelboton ) {
        JButton Button = new JButton(nombre);
        Panel1.add(Button);
            
         Button.addActionListener(new ActionListener(){  //AGREGO EVENTO A LOS BOTONES DE PEDIDOS
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Se ha seleccionado " + nombre);//MUESTRO EL MENSAJES 
            
             }
           }
        );
     }           
 }
 
 private void Listadesplegable(){
     String [] Paises = {"FERNANDO","DANIELA","DAYANNA","LUIS","ANGEL"};
             
     JComboBox desplegable = new JComboBox(Paises);//CREO UNA LISTA DESPLEGABLE
     Panel7.add(desplegable);
     desplegable.addItem("LAURA");//Añadir objetos al combobox
 }
 public static void main(String[] args) { //METODO PARA INICIAR LA CLASE Epe1
     SwingUtilities.invokeLater(() ->  {
         Epe2 V1=new Epe2(); // CreO una instancia de la clase Epe1
         V1.setVisible(true);//HACER VISIBLE LA VENTANA
         });
    }     
}
