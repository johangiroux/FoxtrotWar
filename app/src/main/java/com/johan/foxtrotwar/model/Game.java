package com.johan.foxtrotwar.model;

import java.util.List;

/**
 * Created by johan on 5/3/16.
 */
public class Game extends TurnedBase {

    private Soldier[][] matrix;


    public Game(List<Army> armies, int matrixN, int matrixM) {
        this.matrix = new Soldier[matrixN][matrixM];
        this.aliveObjects = armies;
    }
}
