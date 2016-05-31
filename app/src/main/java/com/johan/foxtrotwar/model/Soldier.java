package com.johan.foxtrotwar.model;

import android.graphics.Point;

/**
 * Created by johan on 5/3/16.
 */
public class Soldier extends TurnedBase {

    public Soldier(long armyId) {
        this.armyId = armyId;
    }

    private long id; // autoincrement
    private long armyId;
    private int health; // 0 dead -> 100%
    private Point position;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

}
