package com.example.attendanceapp;

public class ClassItem {
    private long cid;

    public ClassItem(long cid, String SemName, String subjectName) {
        this.cid = cid;
        this.SemName = SemName;
        this.subjectName = subjectName;
    }

    private String SemName;

    public String getSemName() {
        return SemName;
    }

    public void setSemName(String semName) {
        this.SemName = semName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

   private String subjectName;

    public ClassItem(String semName, String subjectName) {
        this.SemName = SemName;
        this.subjectName = subjectName;

    }

    public long getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
