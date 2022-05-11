import java.time.LocalDate;

public class Student extends Person{
    private Person studentPrivateInfo;
    private LocalDate dateOfEntering;
    private LocalDate dateOfGradution;
    private boolean isFullTime;
    private String universityName;
    private String universityAdress;
    private double averageSchoolGrade;
    private String faculty;
    private String specialty;
    private String nationality;
    private boolean isDisabled;
    private boolean stipend;
    private byte courseNumber;
    private int groupNumber;
    private boolean governmentOrder;
    private String studentCardId;
    private String bankCardNumber;
    private int skippedLessons;
    private boolean socialStipend;
    private String additionalProgs;
    private boolean additionalCourses;
    private boolean olympiadParticipant;
    private boolean olympiadWinner;
    private String phoneNumber;
    private String residenceAdress;

    public Student(String name, String lastName, String patronymic, LocalDate dateOFBirth, Person studentPrivateInfo) {
        super(name, lastName, patronymic, dateOFBirth);
        this.studentPrivateInfo = studentPrivateInfo;
    }

    public LocalDate getDateOfEntering() {
        return dateOfEntering;
    }

    public void setDateOfEntering(LocalDate dateOfEntering) {
        this.dateOfEntering = dateOfEntering;
    }

    public LocalDate getDateOfGradution() {
        return dateOfGradution;
    }

    public void setDateOfGradution(LocalDate dateOfGradution) {
        this.dateOfGradution = dateOfGradution;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityAdress() {
        return universityAdress;
    }

    public void setUniversityAdress(String universityAdress) {
        this.universityAdress = universityAdress;
    }

    public double getAverageSchoolGrade() {
        return averageSchoolGrade;
    }

    public void setAverageSchoolGrade(double averageSchoolGrade) {
        this.averageSchoolGrade = averageSchoolGrade;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean disabled) {
        isDisabled = disabled;
    }

    public boolean isStipend() {
        return stipend;
    }

    public void setStipend(boolean stipend) {
        this.stipend = stipend;
    }

    public byte getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(byte courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public boolean isGovernmentOrder() {
        return governmentOrder;
    }

    public void setGovernmentOrder(boolean governmentOrder) {
        this.governmentOrder = governmentOrder;
    }

    public String getStudentCardId() {
        return studentCardId;
    }

    public void setStudentCardId(String studentCardId) {
        this.studentCardId = studentCardId;
    }

    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    public int getSkippedLessons() {
        return skippedLessons;
    }

    public void setSkippedLessons(int skippedLessons) {
        this.skippedLessons = skippedLessons;
    }

    public boolean isSocialStipend() {
        return socialStipend;
    }

    public void setSocialStipend(boolean socialStipend) {
        this.socialStipend = socialStipend;
    }

    public String getAdditionalProgs() {
        return additionalProgs;
    }

    public void setAdditionalProgs(String additionalProgs) {
        this.additionalProgs = additionalProgs;
    }

    public boolean isAdditionalCourses() {
        return additionalCourses;
    }

    public void setAdditionalCourses(boolean additionalCourses) {
        this.additionalCourses = additionalCourses;
    }

    public boolean isOlympiadParticipant() {
        return olympiadParticipant;
    }

    public void setOlympiadParticipant(boolean olympiadParticipant) {
        this.olympiadParticipant = olympiadParticipant;
    }

    public boolean isOlympiadWinner() {
        return olympiadWinner;
    }

    public void setOlympiadWinner(boolean olympiadWinner) {
        this.olympiadWinner = olympiadWinner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getResidenceAdress() {
        return residenceAdress;
    }

    public void setResidenceAdress(String residenceAdress) {
        this.residenceAdress = residenceAdress;
    }

    public Person getStudentPrivateInfo() {
        return studentPrivateInfo;
    }

    public void setStudentPrivateInfo(Person studentPrivateInfo) {
        this.studentPrivateInfo = studentPrivateInfo;
    }
}
