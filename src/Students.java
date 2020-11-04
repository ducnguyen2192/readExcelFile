public class Students {
    private String studentName;
    private double studentId;
    private String studentAddress;

    public Students(){}

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getStudentId() {
        return studentId;
    }

    public void setStudentId(double studentId) {
        this.studentId = studentId;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
