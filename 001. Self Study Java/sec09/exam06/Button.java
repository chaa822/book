package sec09.exam06;

public class Button {
	
	OnclickListener listener;

	static interface OnclickListener {
		void onClick();
	}

	void setOnClickListener(OnclickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}
}