package com.corporate.talent.hub.models;

public final class ExternalConsultant extends Person{

    private String company;
    private String jobPosition;

    public ExternalConsultant(String fullName, String identification, char gender, String company, String jobPosition) {
        super(fullName, identification, gender);
        this.company = company;
        this.jobPosition = jobPosition;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

}
