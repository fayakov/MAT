package communication;

public class BlockParentResponse extends Message {

	private static final long serialVersionUID = 1L;
	
	private boolean requestSecceded;
	private String errText;
	private Integer blockReqNum;
	
	
	public BlockParentResponse(boolean requestSecceded, String errText, Integer blockReqNum) {
		super();
		this.requestSecceded = requestSecceded;
		this.errText = errText;
		this.blockReqNum = blockReqNum;
	}


	public boolean isRequestSecceded() {
		return requestSecceded;
	}

	public void setRequestSecceded(boolean requestSecceded) {
		this.requestSecceded = requestSecceded;
	}

	public String getErrText() {
		return errText;
	}

	public void setErrText(String errText) {
		this.errText = errText;
	}


	public Integer getBlockReqNum() {
		return blockReqNum;
	}


	public void setBlockReqNum(Integer blockReqNum) {
		this.blockReqNum = blockReqNum;
	}
	
}
