package devlab.commerce;

import android.content.Context;
import android.view.View;

import com.microsoft.officeuifabric.snackbar.Snackbar;
import com.microsoft.officeuifabric.snackbar.Snackbar.Style;

public class Toast {

    public static void show(View view, String text) {

        Snackbar.Companion.make(view, text, Snackbar.LENGTH_SHORT, Snackbar.Style.REGULAR).show();
    }

}
