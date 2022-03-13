package pl.kocan.chain.of.responsibility.pattern;

import pl.kocan.chain.of.responsibility.pattern.message.Message;
import pl.kocan.chain.of.responsibility.pattern.officer.Officer;

public class Main {

    public static void main(String[] args) {

        final Message message = new Message("Atakować!");
        final Officer officer = new Officer();
//        officer.setCaptain(true);
//        officer.setSergeant(true);

        officer.receiveMessage(message);

    }
}
