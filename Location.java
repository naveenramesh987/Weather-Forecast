public class Location {
    private String name;
    private double latitude;
    private double longitude;

    public Location(String name) {
        this.name = name;
        this.latitude = Math.random() * 180 - 90;
        this.longitude = Math.random() * 360 - 180;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}