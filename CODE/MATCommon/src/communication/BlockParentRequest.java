package communication;

public class BlockParentRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	public boolean toBlock() {
		return toBlock;
	}

	public void setToBlock(boolean toBlock) {
		this.toBlock = toBlock;
	}

	public int getChildId() {
		return childId;
	}

	public void setChildId(int childId) {
		this.childId = childId;
	}

	private int pid;
	private boolean toBlock;
	private int childId;
	
	public BlockParentRequest(int pid, int childId, boolean toBlock) {
		// TODO Auto-generated constructor stub
		this.pid = pid;
		this.childId = childId;
		this.toBlock = toBlock;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}	
	
}
