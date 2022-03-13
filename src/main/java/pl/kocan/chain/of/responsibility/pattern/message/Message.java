package pl.kocan.chain.of.responsibility.pattern.message;

public class Message {

    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
