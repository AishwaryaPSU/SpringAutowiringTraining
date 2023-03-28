package io.itsagm.autowiring;

public class Human {
    private Heart heart;
    private Brain brain;

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }

    public Human() {
        System.out.println("Default constructor being called");
    }

    //    public Human(Heart heart, Brain brain) {
//        this.heart = heart;
//        this.brain = brain;
//        System.out.println("Exhibiting autowiring using constructor");
//    }
//
//    public void startPumping(){
//        if(heart!=null){
//            heart.pump();
//        }else{
//            System.out.println("You are dead!");
//        }
//
//    }
//
    public void functioningBody(){
        if(heart!=null && brain!=null){
            heart.pump();
            brain.regulate();
        }else{
            if(heart==null){
                System.out.println("Heart Failure!!!");
            }else{
                System.out.println("Brain dead!!!");
            }
        }
    }
}
