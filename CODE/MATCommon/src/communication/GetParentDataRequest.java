package communication;

public class GetParentDataRequest extends Message {
	private static final long serialVersionUID = 1L;
	
	private int parentId;

	public GetParentDataRequest(int parentId) {
		super();
		this.parentId = parentId;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
}
	