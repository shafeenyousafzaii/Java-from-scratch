package com.scratch;

public  class Person {
    private  String name;
    private int age;
    private float slaray;
    private float height;
    private String Education;
    private String Job_address;
    private String address;
    Person(){
        
    }
    Person(String name,int age,float  slaray,float height,String address,String Education,String Job_address) {
        this.name = name;
        this.age=age;
        this.slaray=slaray;
        this.height=height;
        this.address=address;
        this.Education=Education;
        this.Job_address=Job_address;   
    }
    void setname(String name) {
        this.name=name;
    }
    void setage(int age) {
        this.age=age;
    }
    void setSalary(float slaray) {
        this.slaray=slaray;
    }
    void setHeight(float height) {
        this.height=height;
    }
    void setaddress(String address) {
        this.address=address;
    }
    void setEducation(String Education) {
        this.Education=Education;
    }
    void setJob_address(String Job_address) {
        this.Job_address=Job_address;
    }
    String getname() {
        return this.name;
    }
    int getage() {
        return this.age;
    }
    float getsalary() {
        return this.slaray;
    }
    float getheight() {
        return this.height;
    }
    String getaddress() {
        return this.address;
    }
    String getEducation() {
        return this.Education;
    }
    String getJob_address() {
        return this.Job_address;
    }
    void setjobaddress(String jobaddress) {
        this.Job_address=jobaddress;
    }
    
}