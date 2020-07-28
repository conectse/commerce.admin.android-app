// IButtonItem.java
package devlab.commerce.list;

import android.view.View.OnClickListener;

public interface IButtonItem extends IBaseListItem {

   String getButtonText();
   void setButtonText(String text);
   int getId();
   void setId(int var1);
   OnClickListener getOnClickListener();
   void setOnClickListener(OnClickListener var1);
}
