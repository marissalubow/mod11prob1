package org.example;

/**
 * American plugin class implements American plug interface
 */
public class AmericanPlugin implements AmericanPlug
{
    /**
     * overriding implemntation of plug in from interface
     */
    @Override
    public void plugIn()
    {
        System.out.println("Plugging in an American plug");
    }

}
