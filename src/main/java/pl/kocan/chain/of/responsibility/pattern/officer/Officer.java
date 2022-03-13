package pl.kocan.chain.of.responsibility.pattern.officer;

import pl.kocan.chain.of.responsibility.pattern.message.Message;

public class Officer {

    // jako ze są to zmienne typu prymitywnego
    // to tutaj domyślnie będzie ustawiona wartość false
    private boolean sergeant;
    private boolean captain;
    private boolean general;

    // strasznie brzydka "ifologia"
    // z rozwiązaniem problemu ifologii pomoże Nam
    // dobrze znany pattern - Chain of Responsibility
    public void receiveMessage(Message message) {
        if (sergeant) {
            System.out.println("Sierżant otrzymał wiadomość: " + message.getContent());
        } else if (captain) {
            System.out.println("Kapitan otrzymał wiadomość: " + message.getContent());
        } else if (general) {
            System.out.println("Generał otrzymał wiadomość: " + message.getContent());
        } else {
            System.out.println("Zły adresta wiadomości!");
        }
    }

    public void setSergeant(boolean sergeant) {
        this.sergeant = sergeant;
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }

    public void setGeneral(boolean general) {
        this.general = general;
    }
}
