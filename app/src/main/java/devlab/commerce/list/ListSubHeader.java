package devlab.commerce.list;

import android.view.View;

import com.microsoft.officeuifabric.listitem.ListSubHeaderView;

import lombok.Data;

@Data
public final class ListSubHeader implements IListSubHeader {

   private ListSubHeaderView.TitleColor titleColor;
   private View customAccessoryView;
   private String title;

   public ListSubHeader(String title) {
      super();
      this.title = title;
      this.titleColor = ListSubHeaderView.Companion.getDEFAULT_TITLE_COLOR();
   }

   public String toString() {
      return "ListSubHeader(title=" + this.getTitle() + ")";
   }
}
