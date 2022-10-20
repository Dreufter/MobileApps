package com.example.form;

public class Mail {

    //Atribs
    String name;
    String surname;
    String mail;
    String msg;
    boolean suscription;

    public Mail(String name, String surname, String mail, String msg, Boolean suscription){
        this.name=name;
        this.surname=surname;
        this.mail=mail;
        this.msg=msg;
        this.suscription=suscription;
    }

    public Mail(){
        this.name=name;
        this.surname=surname;
        this.mail=mail;
        this.msg=msg;
        this.suscription=false;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getSurname(){
        return this.name;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public String getMail(){
        return this.name;
    }

    public void setMail(String mail){
        this.mail=mail;
    }

    public String getMsg(){
        return this.name;
    }

    public void setMsg(String msg){
        this.msg=msg;
    }

    public boolean getSuscription(){
        return this.suscription;
    }

    public void setSuscription(boolean suscription){
        this.suscription=suscription;
    }

    public String toString(){
        String msg="Nombre: "+this.name+"\nApellidos: "+this.surname+"\nE-mail: "+this.mail+"\nMensaje: "+this.msg+"\nSuscripción: "+this.suscription;
        return msg;
    }

}
