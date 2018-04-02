package devmob.ftce.usjt.br.paises.model;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.lang.reflect.Field;

import devmob.ftce.usjt.br.paises.R;

/**
 * Created by Roger Campos de Oliveira 816117932 on 21/03/2018.
 */

public class Util {
    public static Drawable getDrawableDinamic(Context contexto, String nomeBandeira) {
        Class<?> c = R.drawable.class;

        try {
            Field idField = c.getDeclaredField(nomeBandeira);
            int id = idField.getInt(idField);
            return contexto.getResources().getDrawable(id, null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
