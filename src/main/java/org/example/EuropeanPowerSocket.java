package org.example;

/**
 * European socket class implements European socket interface
 */
public class EuropeanPowerSocket implements EuropeanSocket
{

    /**
     * overriding implemntation of inserted from interface
     */
    @Override
    public void inserted()
    {
        System.out.println("plug inserted into a European socket");
    }
}
