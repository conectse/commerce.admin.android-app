package devlab.commerce.list;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.microsoft.officeuifabric.listitem.ListItemView;

import devlab.commerce.Toast;

public class ListItemViewHolder extends RecyclerView.ViewHolder {

    private final ListItemView listItemView;

    public ListItemViewHolder(ListItemView view) {

        super((View) view);

        listItemView = view;
        listItemView.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
            public final void onClick(View it) {
                Toast.show(listItemView, "list_item_click");
            }
        }));
    }

    public final void setListItem(IListItem listItem) {

        listItemView.setTitle(listItem.getTitle());
        listItemView.setSubtitle(listItem.getSubtitle());
        listItemView.setFooter(listItem.getFooter());
        listItemView.setTitleMaxLines(listItem.getTitleMaxLines());
        listItemView.setSubtitleMaxLines(listItem.getSubtitleMaxLines());
        listItemView.setFooterMaxLines(listItem.getFooterMaxLines());
        listItemView.setTitleTruncateAt(listItem.getTitleTruncateAt());
        listItemView.setSubtitleTruncateAt(listItem.getSubtitleTruncateAt());
        listItemView.setFooterTruncateAt(listItem.getFooterTruncateAt());
        listItemView.setCustomView(listItem.getCustomView());
        listItemView.setCustomViewSize(listItem.getCustomViewSize());
        listItemView.setCustomAccessoryView(listItem.getCustomAccessoryView());
        listItemView.setLayoutDensity(listItem.getLayoutDensity());
    }

    public final void clearCustomViews() {
        this.listItemView.setCustomView((View) null);
        this.listItemView.setCustomAccessoryView((View) null);
    }

}
