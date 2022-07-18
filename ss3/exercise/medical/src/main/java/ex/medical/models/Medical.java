package ex.medical.models;

public class Medical {
    private String id;
    private String name;
    private String birthYear;
    private String gender;
    private String national;
    private String idCard;
    private String transportType;
    private String transportId;
    private String seat;
    private String inputDay;
    private String inputMonth;
    private String inputYear;
    private String outDay;
    private String outMonth;
    private String outYear;
    private String other;

    public Medical() {
    }

    public Medical(String id, String name, String birthYear, String gender, String national, String idCard, String transportType, String transportId, String seat, String inputDay, String inputMonth, String inputYear, String outDay, String outMonth, String outYear, String other) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.national = national;
        this.idCard = idCard;
        this.transportType = transportType;
        this.transportId = transportId;
        this.seat = seat;
        this.inputDay = inputDay;
        this.inputMonth = inputMonth;
        this.inputYear = inputYear;
        this.outDay = outDay;
        this.outMonth = outMonth;
        this.outYear = outYear;
        this.other = other;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getTransportId() {
        return transportId;
    }

    public void setTransportId(String transportId) {
        this.transportId = transportId;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getInputDay() {
        return inputDay;
    }

    public void setInputDay(String inputDay) {
        this.inputDay = inputDay;
    }

    public String getInputMonth() {
        return inputMonth;
    }

    public void setInputMonth(String inputMonth) {
        this.inputMonth = inputMonth;
    }

    public String getInputYear() {
        return inputYear;
    }

    public void setInputYear(String inputYear) {
        this.inputYear = inputYear;
    }

    public String getOutDay() {
        return outDay;
    }

    public void setOutDay(String outDay) {
        this.outDay = outDay;
    }

    public String getOutMonth() {
        return outMonth;
    }

    public void setOutMonth(String outMonth) {
        this.outMonth = outMonth;
    }

    public String getOutYear() {
        return outYear;
    }

    public void setOutYear(String outYear) {
        this.outYear = outYear;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
