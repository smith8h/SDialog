package smith.lib.alerts.dialog;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;

import kotlin.Suppress;
import smith.lib.alerts.dialog.callbacks.OnBindCustomViewCallBack;

/**
 * The fully customized SDialog, this SDialog type will only handle the view the dialog that you
 * desire to design it you way.
 * <ul>
 *     <li>Pass {@link View} as dialog view.</li>
 *     <li>Pass layout resource as dialog layout.</li>
 * </ul>
 */
@Suppress(names = {"Unused"})
public class CustomSDialog extends SDialog {

    public CustomSDialog(Context context) {
        this.context = context;
    }

    public void setView(View view, @NonNull OnBindCustomViewCallBack callback) {
        dialogView = view;
        callback.onBindCustomView(view);
        init();
    }

    public void setView(int layout, @NonNull OnBindCustomViewCallBack callback) {
        View view = ((Activity) context).getLayoutInflater().inflate(layout, null);
        dialogView = view;
        callback.onBindCustomView(view);
        init();
    }

    @Override
    public void setIconResource(int icon) {}

    @Override
    public void setIconDrawable(Drawable icon) {}

    @Override
    public void setIconBitmap(Bitmap icon) {}

    @Override
    public void setTitle(String title) {}

    @Override
    public void setTitle(int resTitle) {}

    @Override
    public void setText(CharSequence text) {}

    @Override
    public void setText(int text) {}

    @Override
    public void setTheme(int theme) {}

    @Override
    public int getBackgroundColor() {
        return -1;
    }

    @Override
    public int getTitleColor() {
        return -1;
    }

    @Override
    public int getAccentColor() {
        return -1;
    }
}
