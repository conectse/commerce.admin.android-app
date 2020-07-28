package devlab.commerce.list;

import android.text.TextUtils.TruncateAt;
import android.view.View;

import com.microsoft.officeuifabric.listitem.ListItemView;

import lombok.Data;

@Data
public final class ListItem implements IListItem {

    private String subtitle;
    private String footer;
    private int titleMaxLines;
    private int subtitleMaxLines;
    private int footerMaxLines;

    private TruncateAt titleTruncateAt;
    private TruncateAt subtitleTruncateAt;
    private TruncateAt footerTruncateAt;

    private View customView;
    private ListItemView.CustomViewSize customViewSize;
    private View customAccessoryView;
    private ListItemView.LayoutDensity layoutDensity;
    private String title;

    public ListItem(String title) {
        super();
        this.title = title;
        this.subtitle = "";
        this.footer = "";
        this.titleMaxLines = 1;
        this.subtitleMaxLines = 1;
        this.footerMaxLines = 1;
        this.titleTruncateAt = ListItemView.Companion.getDEFAULT_TRUNCATION();
        this.subtitleTruncateAt = ListItemView.Companion.getDEFAULT_TRUNCATION();
        this.footerTruncateAt = ListItemView.Companion.getDEFAULT_TRUNCATION();
        this.customViewSize = ListItemView.Companion.getDEFAULT_CUSTOM_VIEW_SIZE();
        this.layoutDensity = ListItemView.Companion.getDEFAULT_LAYOUT_DENSITY();
    }

    public String toString() {
        return "ListItem(title=" + this.getTitle() + ")";
    }
}
