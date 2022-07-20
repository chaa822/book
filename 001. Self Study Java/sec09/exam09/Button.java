package sec09.exam09;

public class Button {
	
	static interface OnClickListener {
		void onClick();
	}
	
	OnClickListener onClickListener;	

	void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}

	void touch() {
		this.onClickListener.onClick();
	}
}