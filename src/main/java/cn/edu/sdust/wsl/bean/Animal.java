package cn.edu.sdust.wsl.bean;

import java.util.Date;

public class Animal {
    private Integer aid;

    private String aname;

    private Integer degree;

    private Date atime;

    private String image;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public Date getAtime() {
        return atime;
    }

    public Animal(String aname, Integer degree, Date atime, String image) {
        this.aname = aname;
        this.degree = degree;
        this.atime = atime;
        this.image = image;
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }


}