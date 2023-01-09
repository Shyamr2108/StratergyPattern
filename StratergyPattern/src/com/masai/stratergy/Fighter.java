package com.masai.stratergy;

public abstract class Fighter {

   protected JumpBehaviour jumpBehaviour;
   protected KickBehaviour kickBehaviour;

    public Fighter(JumpBehaviour jumpBehaviour, KickBehaviour kickBehaviour) {
        this.jumpBehaviour = jumpBehaviour;
        this.kickBehaviour = kickBehaviour;
    }

    public JumpBehaviour getJumpBehaviour() {
        return jumpBehaviour;
    }

    public void setJumpBehaviour(JumpBehaviour jumpBehaviour) {
        this.jumpBehaviour = jumpBehaviour;
    }

    public KickBehaviour getKickBehaviour() {
        return kickBehaviour;
    }

    public void setKickBehaviour(KickBehaviour kickBehaviour) {
        this.kickBehaviour = kickBehaviour;
    }

    public void punch(){
        System.out.println("Default punch on face");
    }
    public void roll(){
        System.out.print("Default roll on ground");
    }
    public void jump(){
        jumpBehaviour.jump();
    }
    public void kick(){
        kickBehaviour.kick();
    }
    public abstract void play();
}
