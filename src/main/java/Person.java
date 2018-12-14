public class Person {
    private String forename;
    private String surname;
    static private int instancesCouner = 0;
    //region Getter und Setter
    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static String getInstancesCouner() {
        return "Dieses Klasse hat " + instancesCouner + " Objekte";
    }
    //endregion

    public Person(String forename, String surname) {
        this.forename = forename;
        this.surname = surname;
        instancesCouner++;
    }
}
