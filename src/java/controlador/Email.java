package controlador;


import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wendy
 */
public class Email {
      /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        String mail = JOptionPane.showInputDialog("Digite el correo al cual  desea Enviar");
        int x = JOptionPane.showConfirmDialog(null,"Desaea Enviar un Correo","Enviando correo..",JOptionPane.PLAIN_MESSAGE);
        
        if (x==0) {
          new controlador.Email().transfer_to_email(mail,"5324" );
            
            JOptionPane.showMessageDialog(null,"Que tenga un buen dia....");
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Gracias por utilizar esta app...");
        }
    }
    
    public void transfer_to_email(String Correo, String Mensaje) {
    
        
        String correoEnvia = "safp.3802@gmail.com";
                //ES EL CORREO MODIFICADO DE GOOGLE QUE SE UTILIZA PARA LOGRAR ENVIAR A TERCEROS
        String contrasena = "imtytysmoilzuudh";
            //CONTRASEÑA GENERADA POR GOOGLE, DE AUTENTICACION EN 2 PASOS
        String mensaje = "Gracias por iniciar el proceso de creación de la nueva cuenta de SGAFP.\n"
                + "Queremos asegurarnos de que es realmente usted.\n"
                + "Ingrese el siguente codigo de verificación cuando se lo solicite.\n"
                + "Si no desea crear una cuenta, puede omitir este mensaje.\n"
                + "\t\t"+Mensaje+"";


        Properties objetoPEC  = new Properties();

        objetoPEC.put ("mail.smtp.host", "smtp.gmail.com");
        objetoPEC.setProperty("mail.smtp.starttls.enable", "true");
        objetoPEC.put ("mail.smtp.port", "587");
        objetoPEC.setProperty("mail.smtp.port", "587");
        objetoPEC.put ("mail.smtp.user", correoEnvia);
        objetoPEC.setProperty("mail.smtp.auth" , "true");

        Session sesion = Session.getDefaultInstance(objetoPEC);
        MimeMessage mail = new MimeMessage(sesion); 


        try{
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(Correo));
            mail.setSubject("Codigo de Verificacion");
            mail.setText(mensaje);

                try (Transport transporte = sesion.getTransport("smtp")) {
                    transporte.connect(correoEnvia, contrasena);
                    transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
                }

            System.out.println("EL TRANSPORTE SE LLEVO EXITOSAMENTE");



        }catch (MessagingException ex){

            System.out.println("ERRRO DE ENVIO EN CORREO"+ex);
        }

    }
}
