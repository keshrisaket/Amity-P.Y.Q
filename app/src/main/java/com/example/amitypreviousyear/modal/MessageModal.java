package com.example.amitypreviousyear.modal;

public class MessageModal {

    public  static  final String SENT_BY_ME="ME";
    public  static  final String SENT_BY_GPT="GPT";

    String message,sent_by;

    public String getMessage() {
        return message;
    }

    public String getSent_by() {
        return sent_by;
    }

    public void setSent_by(String sent_by) {
        this.sent_by = sent_by;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public  MessageModal(String message, String sent_by){
       this.message=message;
       this.sent_by=sent_by;
   }


}
