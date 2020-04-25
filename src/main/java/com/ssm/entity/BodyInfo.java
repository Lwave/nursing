package com.ssm.entity;

public class BodyInfo {
    private Integer id;

    private Integer uid;

    private Integer weight;

    private String cold;

    private String bodyattent;

    private String chronic;

    private String urine;

    private String shit;

    private String symptom;

    private Integer tightness;

    private String medhistory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getCold() {
        return cold;
    }

    public void setCold(String cold) {
        this.cold = cold == null ? null : cold.trim();
    }

    public String getBodyattent() {
        return bodyattent;
    }

    public void setBodyattent(String bodyattent) {
        this.bodyattent = bodyattent == null ? null : bodyattent.trim();
    }

    public String getChronic() {
        return chronic;
    }

    public void setChronic(String chronic) {
        this.chronic = chronic == null ? null : chronic.trim();
    }

    public String getUrine() {
        return urine;
    }

    public void setUrine(String urine) {
        this.urine = urine == null ? null : urine.trim();
    }

    public String getShit() {
        return shit;
    }

    public void setShit(String shit) {
        this.shit = shit == null ? null : shit.trim();
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom == null ? null : symptom.trim();
    }

    public Integer getTightness() {
        return tightness;
    }

    public void setTightness(Integer tightness) {
        this.tightness = tightness;
    }

    public String getMedhistory() {
        return medhistory;
    }

    public void setMedhistory(String medhistory) {
        this.medhistory = medhistory == null ? null : medhistory.trim();
    }
}