package com.masai.stratergy;

public class Player1 extends Fighter{
    public Player1(JumpBehaviour jumpBehaviour, KickBehaviour kickBehaviour) {
        super(jumpBehaviour, kickBehaviour);
    }

    @Override
    public void play() {
        System.out.println("player1 playing started");

    }
}
