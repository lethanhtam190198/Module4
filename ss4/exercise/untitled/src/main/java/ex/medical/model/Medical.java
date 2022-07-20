package ex.medical.model;

public class Medical {
    private int id;
    private String name;
    private int birthDay;
    private String travelInformation;
    private int departureDay;
    private int endDay;
    private String info;

    public Medical() {
    }

    public Medical(int id, String name, int birthDay, String travelInformation, int departureDay, int endDay, String info) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.travelInformation = travelInformation;
        this.departureDay = departureDay;
        this.endDay = endDay;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getTravelInformation() {
        return travelInformation;
    }

    public void setTravelInformation(String travelInformation) {
        this.travelInformation = travelInformation;
    }

    public int getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(int departureDay) {
        this.departureDay = departureDay;
    }

    public int getEndDay() {
        return endDay;
    }

    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
