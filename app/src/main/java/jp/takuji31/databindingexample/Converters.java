package jp.takuji31.databindingexample;

import android.databinding.BindingConversion;
import android.text.Editable;
import android.text.TextWatcher;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

/**
 * @author Takuji Nishibayashi
 */
public class Converters {
    @BindingConversion
    public static String convertOffsetDateTime(OffsetDateTime dateTime) {
        return dateTime != null ? dateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME) : "";
    }

    private Converters() {}
}
