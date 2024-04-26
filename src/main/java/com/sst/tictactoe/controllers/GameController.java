package com.sst.tictactoe.controllers;

import com.sst.tictactoe.Exceptions.InvalidMoveException;
import com.sst.tictactoe.Exceptions.NoHumanException;
import com.sst.tictactoe.Exceptions.SameSymbolException;
import com.sst.tictactoe.Models.GameState;
import com.sst.tictactoe.Models.Player;
import com.sst.tictactoe.Strategies.CheckValidity;
import com.sst.tictactoe.Models.Game;

import java.util.List;


public class GameController {

    private CheckValidity checkValidity;
    public GameController(){
        this.checkValidity= new CheckValidity();
    }

    public Game createGame(int size , List<Player> players) throws SameSymbolException, NoHumanException {

        if(!checkValidity.symbolsValidity(players)){
            throw new SameSymbolException();
        }

        if(!checkValidity.noHumanCheck(players)){
            throw new NoHumanException();
        }

        return new Game(size,players);
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState checkGameState(Game game){
        return game.getGameState();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public void printBoard(Game game){
        game.getBoard().printBoard();
    }

}