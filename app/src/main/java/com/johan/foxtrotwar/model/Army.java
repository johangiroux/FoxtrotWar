package com.johan.foxtrotwar.model;

import android.graphics.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by johan on 5/3/16.
 */
public class Army extends TurnedBase {

    private long id;
    private List<Point> possibleMoves;

    public Army(long id, List<Point> possibleMoves, int soldierCount) {
        this.id = id;
        this.possibleMoves = possibleMoves;
        List<Soldier> soldiers = new ArrayList<>(soldierCount);
        for (int i = 0; i < soldierCount; i++) {
            Soldier soldier = new Soldier(id);
            soldiers.add(soldier);
        }
        aliveObjects = soldiers;
    }

    public List<Point> getPossibleMoves() {
        return possibleMoves;
    }

    public Soldier getNextAndMove(Soldier[][] matrix) {
        Soldier soldier = (Soldier) getNext();
        Point move = soldier.getPosition();
        move.x += possibleMoves.get(0).x;

    }
}
