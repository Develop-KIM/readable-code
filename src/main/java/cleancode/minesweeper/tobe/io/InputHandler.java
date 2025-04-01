package cleancode.minesweeper.tobe.io;

import cleancode.minesweeper.tobe.positon.CellPosition;

public interface InputHandler {

    CellPosition getCellPositionFromUser();

    String getUserInput();
}
