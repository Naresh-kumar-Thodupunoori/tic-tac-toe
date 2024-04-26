package com.sst.tictactoe.Strategies.WinningAlgorithms;

import com.sst.tictactoe.Models.Move;
import com.sst.tictactoe.Models.Game;

public interface WinningAlgorithm {

    boolean checkWinner(Game game , Move move);
}