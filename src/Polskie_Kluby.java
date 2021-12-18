public class Polskie_Kluby {
    protected String fullName;
    protected String founded;
    private boolean orTeam;


    public Polskie_Kluby(String fullName, String founded) {
        this.fullName = fullName;
        this.founded = founded;
        orTeam = true;
    }

    public Polskie_Kluby(String cracovia, String founded, int i, int i1) {
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }
}
