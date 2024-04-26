package com.sst.tictactoe.Exceptions;

public class NoHumanException extends Exception{
    public NoHumanException(){
        super("There is No human Player in this Game");
    }
}