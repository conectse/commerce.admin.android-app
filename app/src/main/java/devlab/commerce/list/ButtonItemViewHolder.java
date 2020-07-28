package devlab.commerce.list;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

public class ButtonItemViewHolder extends RecyclerView.ViewHolder {

    private Button button;

    public final void setButtonItem(IButtonItem buttonItem) {

        Button var10000 = this.button;
        if (var10000 != null) {
            var10000.setText((CharSequence) buttonItem.getButtonText());
        }

        var10000 = this.button;
        if (var10000 != null) {
            var10000.setId(buttonItem.getId());
        }

        var10000 = this.button;
        if (var10000 != null) {
            var10000.setOnClickListener(buttonItem.getOnClickListener());
        }

    }

    public ButtonItemViewHolder(FrameLayout view) {

        super((View) view);

        View var10001 = view.getChildAt(0);
        if (!(var10001 instanceof AppCompatButton)) {
            var10001 = null;
        }

        AppCompatButton var3 = (AppCompatButton) var10001;
        if (var3 != null) {
            this.button = (Button) var3;
        }
    }
}
