
package Model;

public class viewTable_Model {
    private String Column1;
    private String Column2;
    private String Column3;
    private String Column4;
    
    public viewTable_Model( String Clmn1, String Clmn2, String Clmn3, String Clmn4){
        this.Column1 = Clmn1;
        this.Column2 = Clmn2;
        this.Column3 = Clmn3;
        this.Column4 = Clmn4;
    }
    
    public String getColumn1(){
        return Column1;
    }
    public String getColumn2(){
        return Column2;
    }
    public String getColumn3(){
        return Column3;
    }
    public String getColumn4(){
        return Column4;
    }
}
