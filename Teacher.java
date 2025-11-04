public class Teacher {
    private String fullName;
    private String ID;
    private String email;
    private String title;

    public Teacher(String fullName, String ID, String email, String title) {
        this.fullName = fullName;
        this.ID = ID;
        this.email = email;
        this.title = title;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
