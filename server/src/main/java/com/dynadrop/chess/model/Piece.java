package com.dynadrop.chess.model;

import com.dynadrop.chess.model.Board;
import com.dynadrop.chess.model.Position;
import com.dynadrop.chess.model.Direction;

public interface Piece {
  public final int WHITE = 0;
  public final int BLACK = 1;

  int getColor();
  Direction[] getDirections(Board board, Position position);
  boolean hasMoved();
  void setMoved(boolean moved);

}
