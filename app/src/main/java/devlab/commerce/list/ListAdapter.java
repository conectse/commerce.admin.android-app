package devlab.commerce.list;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import com.microsoft.officeuifabric.listitem.ListItemView;
import com.microsoft.officeuifabric.listitem.ListSubHeaderView;

import java.util.ArrayList;

import lombok.Data;

@Data
public final class ListAdapter extends RecyclerView.Adapter {

    enum ViewType {
        SUB_HEADER, ITEM, BUTTON_ITEM
    }

    ArrayList listItems;
    final Context context;

    public ListAdapter(Context context) {
        this.context = context;
        listItems = new ArrayList();
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewTypeOrdinal) {

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        switch (ViewType.values()[viewTypeOrdinal]) {

            case SUB_HEADER:
                ListSubHeaderView subHeaderView = new ListSubHeaderView(context);
                subHeaderView.setLayoutParams(lp);
                return new ListSubHeaderViewHolder(subHeaderView);

            case ITEM:
                ListItemView listItemView = new ListItemView(context);
                listItemView.setLayoutParams(lp);
                return new ListItemViewHolder(listItemView);

            case BUTTON_ITEM:

                FrameLayout buttonItemView = new FrameLayout(context);
                buttonItemView.setLayoutParams(lp);

                AppCompatButton button = new AppCompatButton(context);

                //int dim = (int) context.getResources().getDimension(R.dimen.uifabric_button_min_height);
                FrameLayout.LayoutParams flp = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, 36);
                button.setLayoutParams(flp);

                buttonItemView.addView(button);

                int paddingHorizontal = 16;
                int paddingVertical = 8;
                buttonItemView.setPaddingRelative(paddingHorizontal, paddingVertical, paddingHorizontal, paddingVertical);

                return new ButtonItemViewHolder(buttonItemView);
        }
        throw new RuntimeException("Invalid view type");
    }

    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        IBaseListItem listItem = (IBaseListItem) listItems.get(position);

        if (listItem instanceof IListSubHeader)
            ((ListSubHeaderViewHolder) holder).setListSubHeader((IListSubHeader) listItem);

        else if (listItem instanceof IListItem)
            ((ListItemViewHolder) holder).setListItem((IListItem) listItem);

        else if (listItem instanceof IButtonItem)
            ((ButtonItemViewHolder) holder).setButtonItem((IButtonItem) listItem);
    }

    public void onViewRecycled(RecyclerView.ViewHolder holder) {
        super.onViewRecycled(holder);
        if (holder instanceof ListItemViewHolder)
            ((ListItemViewHolder) holder).clearCustomViews();
    }

    public int getItemCount() {
        return this.listItems.size();
    }

    public int getItemViewType(int position) {
        return this.listItems.get(position) instanceof ListSubHeader ? ViewType.SUB_HEADER.ordinal() : (this.listItems.get(position) instanceof ButtonItem ? ViewType.BUTTON_ITEM.ordinal() : ViewType.ITEM.ordinal());
    }
}
