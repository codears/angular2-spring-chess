package com.dynadrop.chess.model.piece;

import com.dynadrop.chess.model.Piece;
import com.dynadrop.chess.websocket.bean.Movement;
import com.dynadrop.chess.websocket.bean.Direction;
import java.util.ArrayList;


public class Queen implements Piece {
  private String htmlCode;
  private int color;

  public Queen(int color) {
    this.color = color;
    this.htmlCode = "&#9819;";
  }

  public int getColor() {
    return this.color;
  }

  public Direction[] getDirections() {
    ArrayList<Direction> directions = new ArrayList<Direction>();
    //directions.add(new Direction(0,1));
    return directions.toArray(new Direction[0]);
  }

}
