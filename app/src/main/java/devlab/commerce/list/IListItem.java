// IListItem.java
package devlab.commerce.list;

import android.text.TextUtils.TruncateAt;
import android.view.View;
import com.microsoft.officeuifabric.listitem.ListItemView.CustomViewSize;
import com.microsoft.officeuifabric.listitem.ListItemView.LayoutDensity;

public interface IListItem extends IBaseListItem {

   String getSubtitle();
   void setSubtitle(String var1);
   String getFooter();
   void setFooter(String var1);
   int getTitleMaxLines();
   void setTitleMaxLines(int var1);
   int getSubtitleMaxLines();
   void setSubtitleMaxLines(int var1);
   int getFooterMaxLines();
   void setFooterMaxLines(int var1);
   TruncateAt getTitleTruncateAt();
   void setTitleTruncateAt(TruncateAt var1);
   TruncateAt getSubtitleTruncateAt();
   void setSubtitleTruncateAt(TruncateAt var1);
   TruncateAt getFooterTruncateAt();
   void setFooterTruncateAt(TruncateAt var1);
   View getCustomView();
   void setCustomView(View var1);
   CustomViewSize getCustomViewSize();
   void setCustomViewSize(CustomViewSize var1);
   View getCustomAccessoryView();
   void setCustomAccessoryView(View var1);
   LayoutDensity getLayoutDensity();
   void setLayoutDensity(LayoutDensity var1);
}
