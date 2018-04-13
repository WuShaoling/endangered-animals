package cn.edu.sdust.wsl.bean;

public class Location {
    private Integer id;

    private Integer aid;

    private String name;

    private Integer longtitude;

    private Integer latitude;

    private String province;

    private String city;

    private Integer number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(Integer longtitude) {
        this.longtitude = longtitude;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Location(){
    }
    public Location(Integer id, String name){
        this.id = id;
        this.name = name;
    }
}