package lab9;

import lab9.mooc.logic.ApplicationLogic;
import lab9.mooc.ui.TextUserInterface;
import lab9.mooc.ui.UserInterface;

public class Ex1 {
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
