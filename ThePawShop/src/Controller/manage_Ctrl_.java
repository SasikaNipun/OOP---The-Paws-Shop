
package Controller;

import Model.manageProduct_Model_;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class manage_Ctrl_ {
    public void manage(String PID, String PName, String PCategory, String PPrice){
        manageProduct_Model_ mngP = new manageProduct_Model_(PID, PName, PCategory, PPrice);
        
        String file = "ProductDetailsDB.txt";
        try{
            File F1 = new File(file);
            if(!F1.exists()){
                F1.createNewFile();
            }
            
            try(FileWriter Add = new FileWriter(file,true)){
                Add.write(mngP.getProductID() + "," + mngP.getProductName() + "," + mngP.getProductCategory() + "," + mngP.getProductPrice() + "\n");
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error Writing File!");
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error Creating File!");
        }
    }
    
    public void manage(){
        //obj --> cashier model
        String file = " ";
        try{
            File F1 = new File(file);
            if(!F1.exists()){
                F1.createNewFile();
            }
            
            try(FileWriter Add = new FileWriter(file,true)){
                //Add.write(); ---------------------------------------------------------->
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error Writing File!");
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error Creating File!");
        }
    }    
    
    
}
