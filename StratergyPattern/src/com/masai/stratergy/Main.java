package com.masai.stratergy;

public class Main {
    public static void main(String args[]){
        JumpBehaviour shortjump=new SortJump();
        KickBehaviour tornadokick=new TornadoKick();
        JumpBehaviour longjump=new LongJump();

        Fighter player1 = new Player1(shortjump,tornadokick);
        player1.play();

        player1.punch();
        player1.kick();
        player1.jump();

    }
}
