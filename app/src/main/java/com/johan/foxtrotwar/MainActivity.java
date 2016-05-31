package com.johan.foxtrotwar;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.johan.foxtrotwar.model.Army;
import com.johan.foxtrotwar.model.Game;
import com.johan.foxtrotwar.model.Soldier;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final int GRID_SIZE_N = 5;
    private static final int GRID_SIZE_M = 5;
    private static final int SOLDIER_PER_TEAM = 5;

    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        game = new Game(initArmies(2), GRID_SIZE_N, GRID_SIZE_M);

    }

    private void play() {
        Army army = (Army) game.getNext();
        Soldier soldier = (Soldier) army.getNext();

    }


    private List<Army> initArmies(int numberArmies) {
        List<Army> armies = new ArrayList<>(numberArmies);

        for (int i = 0 ; i < numberArmies; i++) {
            armies.add(new Army(i, possibleMoves(i), SOLDIER_PER_TEAM));
        }
        return armies;
    }


    private List<Point> possibleMoves(int position) {
        List<Point> possibleMoves = new ArrayList<>(1);
        if (position % 2 == 0) {
            possibleMoves.add(new Point(1, 0));
        } else {
            possibleMoves.add(new Point(0, 1));
        }
        return possibleMoves;
    }
}
