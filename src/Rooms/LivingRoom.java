package Rooms;

import People.Person;

public class LivingRoom extends Room {
    Person occupant;
    int XLoc, YLoc;

    public LivingRoom (int v, int w)
    {
        super(v,w);

        XLoc= v;
        YLoc= w;
        System.out.println(""+ this.XLoc + this.YLoc);
    }

    public void enterRoom (Person x)
    {
        System.out.println("You are in the living room");
        occupant=x;
        x.setxLoc(this.XLoc);
        x.setyLoc(this.YLoc);

    }
    public void leaveRoom(Person x)
    {
        occupant = null;
    }
}
