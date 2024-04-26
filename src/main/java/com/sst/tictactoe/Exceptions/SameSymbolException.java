package com.sst.tictactoe.Exceptions;

public class SameSymbolException extends Exception{
    public SameSymbolException(){
        super(" Multiple Players have the same Symbol");
    }
}