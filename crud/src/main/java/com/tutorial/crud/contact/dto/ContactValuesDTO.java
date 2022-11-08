
package com.tutorial.crud.contact.dto;


public class ContactValuesDTO {
    private String contactFrom;
    private String contactTo;
    private String contactName;
    private String contactsubject;
    private String contactText;

    public ContactValuesDTO() {
    }

    public ContactValuesDTO(String contactFrom, String contactTo, String contactName, String contactsubject, String contactText) {
        this.contactFrom = contactFrom;
        this.contactTo = contactTo;
        this.contactName = contactName;
        this.contactsubject = contactsubject;
        this.contactText = contactText;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactFrom() {
        return contactFrom;
    }

    public void setContactFrom(String contactFrom) {
        this.contactFrom = "adrj67@gmail.com";//contactFrom;
    }

    public String getContactTo() {
        return contactTo;
    }

    public void setContactTo(String contactTo) {
        this.contactTo = contactFrom;
    }

    public String getContactsubject() {
        return contactsubject;
    }

    public void setContactsubject(String contactsubject) {
        this.contactsubject = contactsubject;
    }

    public String getContactText() {
        return contactText;
    }

    public void setContactText(String contactText) {
        this.contactText = contactText;
    }
    
    
}
