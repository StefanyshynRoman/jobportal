package com.stefanyshyn.jobportal.entity;

public interface IRecruiterJobs {
    Long getTotalCandidates();
    int getJob_Post_id();
    String getJob_title();
    int getLocationId();
    String  getCity();
    String getState();
    String getCountry();
    int getCompanyId();
    String getName();
}
