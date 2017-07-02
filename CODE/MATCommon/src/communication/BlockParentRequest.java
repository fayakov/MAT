package communication;


/**
 * The Class BlockParentRequest.
 */
public class BlockParentRequest extends Message {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The pid. */
	private int pid;
	
	/** The to block. */
	private boolean toBlock;
	
	/**
	 * Instantiates a new block parent request.
	 *
	 * @param pid the pid
	 * @param toBlock the to block
	 */
	public BlockParentRequest(int pid, boolean toBlock) {
		// TODO Auto-generated constructor stub
		this.pid = pid;
		this.toBlock = toBlock;
	}
	
	/**
	 * To block.
	 *
	 * @return true, if successful
	 */
	public boolean toBlock() {
		return toBlock;
	}

	/**
	 * Sets the to block.
	 *
	 * @param toBlock the new to block
	 */
	public void setToBlock(boolean toBlock) {
		this.toBlock = toBlock;
	}

	/**
	 * Gets the pid.
	 *
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * Sets the pid.
	 *
	 * @param pid the new pid
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}		
}
