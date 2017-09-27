package com.project.java;
public class Customer {

    public Customer(String name,int sno){
        this.cname=name;
        this.sno=sno;
    }
public int sno;
public String cname;
public String feedback;

    public void setSno(int sno) {
        this.sno=sno;
    }

    public void setCname(String cname) {
        this.cname=cname;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getSno() {
        return sno;
    }

    public String getCname() {
        return cname;
    }

    public String getFeedback() {
        return feedback;
    }
}
