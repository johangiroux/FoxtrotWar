package com.johan.foxtrotwar.model;

import java.util.List;

/**
 * Created by johan on 5/3/16.
 */
public class TurnedBase {

    private int index = -1;
    protected List<? extends TurnedBase> aliveObjects;
    protected List<? extends TurnedBase> deadObjects;


    public TurnedBase getNext() {
        index++;
        if (index >= aliveObjects.size()) {
            index = 0;
            return aliveObjects.get(0);
        } else {
            return aliveObjects.get(index);
        }
    }

    public int aliveObjectsCount() {
        return aliveObjects.size();
    }
}
