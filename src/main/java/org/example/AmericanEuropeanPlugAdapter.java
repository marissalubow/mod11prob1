package org.example;

/**
 * Adapter class implements american plug interface and modifies it to fit European socket
 */
public class AmericanEuropeanPlugAdapter implements AmericanPlug
{
    //declaring europea socet object
    private EuropeanSocket europeanSocket;

    //paramaterized constructor
    public AmericanEuropeanPlugAdapter(EuropeanSocket europeanSocket) {
        this.europeanSocket = europeanSocket;
    }

    /**
     *Overrides plugIn method from AmericanPlug and modifies it to fit for the european socket
     */
    @Override
    public void plugIn() {
        System.out.println("Use an adapter so that American plug can fit within European socket");
        europeanSocket.inserted();
    }
}
