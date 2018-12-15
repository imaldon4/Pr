
public class OwnCell extends AbstractCell {

	public OwnCell(int r, int c, ConwayWorld w) {
		super(r, c, w);
	}

	@Override
	public AbstractCell cellForNextGeneration() {
		BlinkerCell next = new BlinkerCell(getRow(), getColumn(), world);
		next.setIsAlive(willBeAliveInNextGeneration());
		return next;
	}

	@Override
	public boolean willBeAliveInNextGeneration() {
		return world.Counter();
	}

}