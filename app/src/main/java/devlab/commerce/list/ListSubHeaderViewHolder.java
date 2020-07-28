package devlab.commerce.list;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.microsoft.officeuifabric.listitem.ListSubHeaderView;

public final class ListSubHeaderViewHolder extends RecyclerView.ViewHolder {

    private final ListSubHeaderView listSubHeaderView;

    public final void setListSubHeader(IListSubHeader listSubHeader) {

        listSubHeaderView.setTitle(listSubHeader.getTitle());
        listSubHeaderView.setTitleColor(listSubHeader.getTitleColor());
        listSubHeaderView.setCustomAccessoryView(listSubHeader.getCustomAccessoryView());
    }

    public ListSubHeaderViewHolder(ListSubHeaderView view) {
        super((View) view);
        this.listSubHeaderView = view;
    }
}

