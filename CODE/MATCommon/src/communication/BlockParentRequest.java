package communication;

public class BlockParentRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int pid;
	private boolean toBlock;
	
	public BlockParentRequest(int pid, boolean toBlock) {
		// TODO Auto-generated constructor stub
		this.pid = pid;
		this.toBlock = toBlock;
	}
	
	public boolean toBlock() {
		return toBlock;
	}

	public void setToBlock(boolean toBlock) {
		this.toBlock = toBlock;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}		
}
