package io.itsagm.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
    private Heart heart;

    public Human(){};

    public Human(Heart heart) {
        this.heart = heart;
        System.out.println("Human constructor is called.");
    }

    /*
    * How @Autowired works:
    * 1. first it tries to resolves with autowire = "byType" in the beans.xml
    * 2. if byType fails it falls back to resolve using autowire="byName"
    * 3. but if there are 2 Heart class beans present in the beans.xml: it wil then check if the names of any of those objects match with variable name
    * 4. if not then there will be NoUniqueBeanDefinitionException
    * */
    @Autowired
    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void startPumping(){
        if(heart!=null){
            heart.pump();
        }else{
            System.out.println("You are dead!");
        }

    }
}
