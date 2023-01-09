package com.masai.stratergy;

public class Player2 extends Fighter{
    public Player2(JumpBehaviour jumpBehaviour, KickBehaviour kickBehaviour) {
        super(jumpBehaviour, kickBehaviour);
    }

    @Override
    public void play() {
        System.out.println("player2 playing started");
    }
}
