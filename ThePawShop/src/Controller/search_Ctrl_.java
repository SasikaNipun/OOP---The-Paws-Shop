
package Controller;

import Model.search_Model_;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class search_Ctrl_ {
    
//    public search_Ctrl_(){
//    }
        
    public void searchData(String variable1, String fileDB, String[] Clmn, JTable searchTable) {
        String DBFileName = fileDB;
        String[] columnNames = Clmn;
        search_Model_ S1 = new search_Model_(variable1);
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
    try{

        File file = new File(DBFileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;


        while ((line = br.readLine()) != null) {

            String[] sData = line.split(",");


            if (sData.length == 5) {
                String C1 = sData[0].trim();
                String C2 = sData[1].trim();
                String C3 = sData[2].trim();
                String C4 = sData[3].trim();
                String C5 = sData[4].trim();
//                String C5 = sData[5].trim();
//                String C5 = sData[6].trim();
                
                if(S1.getsearchData().contains(C1)){
                    model.addRow(sData);
                }
//                else if(S1.getsearchData().contains(C2)){
////                    model.addRow(sData);
//                }
                else if(S1.getsearchData().equals(C3)){
                    model.addRow(sData);
                }


            }
        }

//        br.close();
    }catch (IOException e) {
            JOptionPane.showMessageDialog((Component)null, "Error: Can't find Data");
    }
    
    searchTable.setModel(model);
}
}
