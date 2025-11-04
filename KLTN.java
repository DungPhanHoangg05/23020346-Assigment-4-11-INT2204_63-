class KLTN<T extends Student, V> {
    private T student;
    private V supervisor;
    private String thesisTitle;

    public KLTN(T student, V supervisor, String thesisTitle) {
        this.student = student;
        this.supervisor = supervisor;
        this.thesisTitle = thesisTitle;
    }

    public T getStudent() {
        return student;
    }

    public void setStudent(T student) {
        this.student = student;
    }

    public V getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(V supervisor) {
        this.supervisor = supervisor;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public String toString() {
        String supervisorName = "";
        if (supervisor instanceof Teacher) {
            supervisorName = ((Teacher) supervisor).getFullName();
        } else {
            supervisorName = ((Advisor) supervisor).getFullName();
        }

        return "KLTN: Tiêu đề: " + thesisTitle
                + ", Sinh viên: " + student.getFullName()
                + ", Người hướng dẫn: " + supervisorName;
    }
}