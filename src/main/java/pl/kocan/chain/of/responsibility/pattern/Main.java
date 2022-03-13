package pl.kocan.chain.of.responsibility.pattern;

import pl.kocan.chain.of.responsibility.pattern.message.Message;
import pl.kocan.chain.of.responsibility.pattern.officer.*;

public class Main {

    public static final String ATTACK = "Atakować!";

    public static void main(String[] args) {

        final Message message = new Message(ATTACK, 50, OfficerRank.CAPTAIN);

        final Officer sergeant = new Sergeant();
        final Officer captain = new Captain();
        final Officer general = new General();

        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sergeant.processMessage(message);

        final Message message2 = new Message(ATTACK, 100, OfficerRank.GENERAL);

        sergeant.processMessage(message2);

        final Message message3 = new Message(ATTACK, 2, OfficerRank.GENERAL);

        sergeant.processMessage(message3);
    }
}
