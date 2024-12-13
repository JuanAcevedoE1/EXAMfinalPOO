
package edu.unicartagena.poo;

import edu.unicartagena.poo.gui.GuiPrincipal;

/**
 *
 * @author Carlos
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GuiPrincipal gui = new GuiPrincipal();
        //gui.setLocationRelativeTo(null);
    gui.setExtendedState(GuiPrincipal.MAXIMIZED_BOTH);
        gui.setVisible(true);
    }
    
}
