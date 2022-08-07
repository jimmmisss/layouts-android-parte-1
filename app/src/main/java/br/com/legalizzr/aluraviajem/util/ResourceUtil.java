package br.com.legalizzr.aluraviajem.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class ResourceUtil {

    public static final String DRAWABLE = "drawable";

    public static Drawable devolveDrawable(Context context, String drawableEmTexto) {
        Resources resources = context.getResources();
        int idDrawable = resources
                .getIdentifier(drawableEmTexto, DRAWABLE, context.getPackageName());
        return resources.getDrawable(idDrawable);
    }
}
