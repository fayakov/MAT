package communication;

public class BlockParentRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int pid;
	
	public BlockParentRequest(int pid) {
		// TODO Auto-generated constructor stub
		this.pid = pid;
		
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}	
	
}
