package pl.kocan.chain.of.responsibility.pattern.officer;

import pl.kocan.chain.of.responsibility.pattern.message.Message;

public class Sergeant extends Officer {

    private static final int CODE = 10;
    private static final String NAME = "Sierżant Kowalski";

    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.SERGEANT)
                && message.getCode() == CODE) {
            System.out.println(NAME + " otrzymał wiadomość: " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
