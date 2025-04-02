package cleancode.minesweeper.tobe.io;

import cleancode.minesweeper.tobe.positon.CellPosition;
import cleancode.minesweeper.tobe.user.UserAction;

public interface InputHandler {

    CellPosition getCellPositionFromUser();

    UserAction getUserActionFromUser();
}
