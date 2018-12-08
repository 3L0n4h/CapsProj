package hci.com.tentativecapstoneui.model;

public class CompanyR {


    private String companyName;
    private String companyAddres;

    private boolean isSelected;

    public void setSelected(boolean selection){
        this.isSelected = selection;
    }

    public boolean isSelected(){
        return isSelected;
    }

    public CompanyR(String companyName, String companyAddres) {
        this.companyName = companyName;
        this.companyAddres = companyAddres;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddres() {
        return companyAddres;
    }

    public void setCompanyAddres(String companyAddres) {
        this.companyAddres = companyAddres;
    }



}
