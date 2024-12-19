
package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class manageCashierDetails_Ctrl_ extends manageProductDetails_Ctrl_{

    @Override
    public void manageTable_(JTable tblMngCashierPage_M_) {
    String[] columnNames = {"Name", "NIC", "DOB", "Gender"};


    DefaultTableModel model = new DefaultTableModel(columnNames, 0);

    try {

        File file = new File("CashierDetailsDB.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;


        while ((line = br.readLine()) != null) {

            String[] CashierData = line.split(",");


            if (CashierData.length == 7) {
                String FirstName = CashierData[0].trim();
                String LastName = CashierData[1].trim();
                String NIC = CashierData[2].trim();
                String DOB = CashierData[3].trim();
                String Gender = CashierData[4].trim();


                model.addRow(new Object[]{FirstName + " " + LastName, NIC, DOB, Gender});
            }
        }

        br.close();
    } catch (IOException e) {

        e.printStackTrace();
    }


    tblMngCashierPage_M_.setModel(model);
}
 
}
