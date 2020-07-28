// ButtonItem.java
package devlab.commerce.list;

import android.view.View.OnClickListener;

import lombok.Data;

@Data
public final class ButtonItem implements IButtonItem {

    private String title;
    private String buttonText;
    private int id;
    private OnClickListener onClickListener;

    public ButtonItem(String title, String buttonText, int id, OnClickListener onClickListener) {
        super();
        this.title = title;
        this.buttonText = buttonText;
        this.id = id;
        this.onClickListener = onClickListener;
    }

    public OnClickListener getOnClickListener() {
        return this.onClickListener;
    }

    public void setOnClickListener(OnClickListener listener) {
        this.onClickListener = listener;
    }

    public String toString() {
        return "ButtonItem(title=" + this.getTitle() + ", buttonText=" + this.getButtonText() + ", id=" + this.getId() + ", onClickListener=" + this.getOnClickListener() + ")";
    }
}
