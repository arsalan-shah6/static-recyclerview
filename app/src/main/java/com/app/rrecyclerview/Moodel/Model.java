package com.app.rrecyclerview.Moodel;

public class Model {
    String name;
    String semester;
    String fee;
    String slipno;
    String email;

    public Model(String name, String semester, String fee, String slipno, String email) {
        this.name = name;
        this.semester = semester;
        this.fee = fee;
        this.slipno = slipno;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getSlipno() {
        return slipno;
    }

    public void setSlipno(String slipno) {
        this.slipno = slipno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
