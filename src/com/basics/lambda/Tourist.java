package com.basics.lambda;

import java.util.List;

public class Tourist {
    int tourist_id;
    int batch;
    String location;

    public int getTourist_id() {
        return tourist_id;
    }

    public Tourist(int tourist_id, int batch, String location, int age, String packageType, boolean id_proof, List<String> touristSpots) {
        this.tourist_id = tourist_id;
        this.batch = batch;
        this.location = location;
        this.age = age;
        this.packageType = packageType;
        this.id_proof = id_proof;
        this.touristSpots = touristSpots;
    }

    public void setTourist_id(int tourist_id) {
        this.tourist_id = tourist_id;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public boolean isId_proof() {
        return id_proof;
    }

    public void setId_proof(boolean id_proof) {
        this.id_proof = id_proof;
    }

    public List<String> getTouristSpots() {
        return touristSpots;
    }

    public void setTouristSpots(List<String> touristSpots) {
        this.touristSpots = touristSpots;
    }

    int age;
    String packageType;
    boolean id_proof;
    List<String> touristSpots;

}
