package Utils;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class PriceFormatter {

    public static String FormatValue(double value){
        Locale Brazil = new Locale("pt", "BR");
        NumberFormat ValueForReal = NumberFormat.getCurrencyInstance(Brazil);
        return ValueForReal.format(value);
    }
}
