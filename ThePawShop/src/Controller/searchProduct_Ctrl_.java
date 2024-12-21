
package Controller;


import javax.swing.JTable;

public class searchProduct_Ctrl_ extends search_Ctrl_{
    
//    public searchProduct_Ctrl_(){}
    
    public void searchProduct(String Category, JTable TableName){
        String DBFileName = "ProductDetailsDB.txt";
        String[] columnNames = new String[]{"Product ID", "Product Name", "Product Category", "Product Price"};
        super.searchData(Category, DBFileName, columnNames, TableName);
    }
}
