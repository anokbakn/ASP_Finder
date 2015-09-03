/**
 * @author Armand Nokbak Nyembe
 * In this project, we check first use via the presence or absence of the trash.bin file.
 */

package foreign.language.territory.management.kit;
import com.ArmandNokbak.ForeignLanguageTerritory.DataSaver;
import com.ArmandNokbak.ForeignLanguageTerritory.HouseHold;
import com.ArmandNokbak.ForeignLanguageTerritory.LogIn;
import com.ArmandNokbak.ForeignLanguageTerritory.NewUserAccount;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.awt.Dimension;
import java.awt.Frame;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author anokbakn
 */
public class ForeignLanguageTerritoryManagementKit {
    public static NewUserAccount user;
    public static LinkedList<HouseHold> dataList;
    public static DataSaver engageDataSaving;
    private static boolean emailValid;
    private static String userEmail;
    private static String ipAddress;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("trash.bin"));
            
        } catch (IOException ex) { //This conditions describe first use.
            //get user email
            emailValid  = false;
            do{
            userEmail = JOptionPane.showInputDialog("Please enter a VALID email address!");
            try{
                InternetAddress emailAddress = new InternetAddress(userEmail);
                emailAddress.validate();
                emailValid  = true;
            }catch(AddressException e4)
            {
                emailValid = false;
            }
            }while(emailValid==false);
            //get username
            String userName = JOptionPane.showInputDialog("Please enter your username!");
           // JOptionPane.showMessageDialog(null, userName);
            if(userName.equals("")){
                System.exit(0);
            }
            
             //get congregation
            String congregation = JOptionPane.showInputDialog("Please enter your Congregation!");
            
            //get language
            String language = JOptionPane.showInputDialog("Please enter your congregation's language");
            // Get IP address
            try {
                InetAddress thisIp = InetAddress.getLocalHost();
                ipAddress = thisIp.getHostAddress();
                System.out.println("IP:" + ipAddress);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            //JOptionPane.showMessageDialog(null, congregation);
            if(congregation.equals("")){
               System.exit(0);
            }
            
            JPasswordField pf = new JPasswordField();
            JPasswordField pf2 = new JPasswordField();
            String pwd = "";
            String pwd2 = "";
            //get password
            int okCxl = JOptionPane.showConfirmDialog(null, pf, "Please Enter Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (okCxl == JOptionPane.OK_OPTION) 
            {
                pwd = new String(pf.getPassword());
                //JOptionPane.showMessageDialog(null, pwd);
            }
            else{
                JOptionPane.showMessageDialog(null, "Access denied!!!");
                return;
            }
            //get confirmed password
            int okCxl2 = JOptionPane.showConfirmDialog(null, pf2, "Please Confirm Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (okCxl2 == JOptionPane.OK_OPTION) 
            {
                pwd2 = new String(pf2.getPassword());
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Access denied!!!");
                return;
            }
            //checking password match
            if(pwd.equals(pwd2)){
                JOptionPane.showMessageDialog(null, "Welcome "+userName+". We hope you enjoy this tool!");
                
                //Terms of use Pane.
                JEditorPane terms = new JEditorPane();
                terms.setEditable(false);
                terms.setPreferredSize(new Dimension(650, 200));
                
                
               NewUserAccount newUser = new NewUserAccount(userName, pwd, congregation, userEmail, language);
               
               ///////////////////////////////////////////////////////////////////////////////////////
               //// Alerting about new user
               Properties props = new Properties();
				props.put("mail.smtp.auth", "true");
				props.put("mail.smtp.host", "smtp.gmail.com");
				props.put("mail.smtp.socketFactory.port", "465");
				props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
				props.put("mail.smtp.port", "465");
				
				Session session = Session.getDefaultInstance(props,
						new javax.mail.Authenticator(){
					protected PasswordAuthentication getPasswordAuthentication(){
						return new PasswordAuthentication("youremail@gmail.com", "pwd");
					}
				}
						);
				try{
					
					                               Message message = new MimeMessage(session);
                                    message.setFrom(new InternetAddress(userEmail, userName + " from " + congregation));
                                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("youremail@gmail.com"));
                                    message.setSubject("New ASP Finder user");
                                    message.setText("We have a brand new user!!!\n" + userName 
                                            + " from " + congregation 
                                            + ". \nLanguage : " + language
                                            + "\n Email : " + userEmail
                                            + "\n IP Addess : " + ipAddress);
                                    Transport.send(message);
					//JOptionPane.showMessageDialog(null, "Message sent");
					
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Start Over when connected to the internet please!\n Shutting down...");
                                        System.exit(0);
				}
                  /// End of Email Alert
		///////////////////////////////////////////////////////////////////////////////
               
               
               String fileName = "trash.bin";
                    try {
                        // Write newUser info to the "trash.bin" file
                        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName));
                        output.writeObject(newUser);
                        output.close();
                        
                        dataList = new LinkedList<HouseHold>(); //This is the list that will hold ALL data
                        
                        //NOw LET'S write the list to a file call "care.bin"
                        ObjectOutputStream output1 = new ObjectOutputStream(new FileOutputStream("care.bin"));
                        output1.writeObject(dataList);
                        output1.close();
                        
                    } catch (IOException ex1) {
                        JOptionPane.showMessageDialog(null, "Login output stream not created.\n Contact developer.");
                    }
            
                
            }//end of if password match
            else{ // if passwords don't match
                JOptionPane.showMessageDialog(null, "Password mismatch! \n You will have to start over. "
                        + "\n Sorry.");
                return;
            }
        }//end of if first use
        
        
                try {
                    //read credentials file
                    ObjectInputStream input = new ObjectInputStream(new FileInputStream("trash.bin"));
                    user = (NewUserAccount) input.readObject();
                    //input.close();
                    
                    //reading data file
                    ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("care.bin"));
                    dataList =  (LinkedList) input1.readObject();
                   // input1.close();
                    
                   
                    
            
                   engageDataSaving = new DataSaver();
                    engageDataSaving.start(); 
                    
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Missing credentials file!!!");
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Credentials couldn't be read!");
                }
                
                 
                    //Sorting the list now////////////////////////////////////////////////
                    Collections.sort(dataList);
                    //End of sorting algorytm////////////////////////////////////
                    
                    System.out.println(dataList);
                    
        
        LogIn logIn = new LogIn();
        logIn.setVisible(true);
        logIn.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
}
