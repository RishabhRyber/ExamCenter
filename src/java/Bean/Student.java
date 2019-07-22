/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import javax.persistence.*;

/**
 *
 * @author Rishabh
 */

@Entity
public class Student {
    @Id
    @GeneratedValue
    private long s_id;
    private String name,address,contact,cource,fee,admission_date,password;
    @Column(unique= true,nullable=false)
    String username;
    public Student(String name, String username, String address, String contact, String cource, String fee, String admission_date, String password) {
        this.name = name;
        this.username = username;
        this.address = address;
        this.contact = contact;
        this.cource = cource;
        this.fee = fee;
        this.admission_date = admission_date;
        this.password = password;
    }

    public Student() {
    }

    
    
    
    public long getS_id() {
        return s_id;
    }

    public void setS_id(long s_id) {
        this.s_id = s_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCource() {
        return cource;
    }

    public void setCource(String cource) {
        this.cource = cource;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getAdmission_date() {
        return admission_date;
    }

    public void setAdmission_date(String admission_date) {
        this.admission_date = admission_date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

}
