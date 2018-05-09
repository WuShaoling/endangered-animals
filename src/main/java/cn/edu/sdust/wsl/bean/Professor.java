package cn.edu.sdust.wsl.bean;

public class Professor {
    private Integer pid;

    private String panme;

    private String paccount;

    private String pcode;

    private String pphone;

    private String pemail;

    public Professor() {

    }

    public Professor(String account,
                     String username,
                     String password,
                     String phone,
                     String email) {
        this.paccount = account;
        this.pcode = password;
        this.panme = username;
        this.pphone = phone;
        this.pemail = email;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPanme() {
        return panme;
    }

    public void setPanme(String panme) {
        this.panme = panme == null ? null : panme.trim();
    }

    public String getPaccount() {
        return paccount;
    }

    public void setPaccount(String paccount) {
        this.paccount = paccount == null ? null : paccount.trim();
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode == null ? null : pcode.trim();
    }

    public String getPphone() {
        return pphone;
    }

    public void setPphone(String pphone) {
        this.pphone = pphone == null ? null : pphone.trim();
    }

    public String getPemail() {
        return pemail;
    }

    public void setPemail(String pemail) {
        this.pemail = pemail == null ? null : pemail.trim();
    }
}