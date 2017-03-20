package id.sch.smktelkom_mlg.project2.xirpl609101415.playchat;

import java.util.Date;

/**
 * Created by Mokleters on 20/03/2017.
 */

public class ChatMessage {
    private String messageUser;
    private String messageText;
    private long messageTime;

    public ChatMessage(String messageUser, String messageText) {
        this.messageUser = messageUser;
        this.messageText = messageText;

        messageTime = new Date().getTime();
    }

    public ChatMessage() {
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
