package devlab.commerce.list;

import android.view.View;

import com.microsoft.officeuifabric.listitem.ListSubHeaderView;

public interface IListSubHeader extends IBaseListItem {

   ListSubHeaderView.TitleColor getTitleColor();
   void setTitleColor(ListSubHeaderView.TitleColor color);
   View getCustomAccessoryView();
   void setCustomAccessoryView(View var1);

}
