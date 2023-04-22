package sugangsincheong;

import java.util.Vector;

import javax.swing.JPanel;

import valueObject.VGangjwa;

public abstract class GangjwaContainer extends JPanel {


	private static final long serialVersionUID = 1L;

	abstract public void addGangjwas(Vector<VGangjwa> vSelectedGangjwas);
	abstract public Vector<VGangjwa> removeSelectedGangjwas();
	


}
