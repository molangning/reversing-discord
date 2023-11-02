package p184jj;

import java.lang.Comparable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p162ij.AbstractC7635e;

/* renamed from: jj.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public abstract class AbstractC8978d<V extends Comparable<V>> extends AbstractC7635e<V> {

    /* renamed from: j */
    private static final Map<String, String> f23607j;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("YEAR_OF_DISPLAY", "L_year");
        hashMap.put("MONTH_AS_NUMBER", "L_month");
        hashMap.put("HOUR_FROM_0_TO_24", "L_hour");
        hashMap.put("DAY_OF_MONTH", "L_day");
        hashMap.put("DAY_OF_DIVISION", "L_day");
        f23607j = Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8978d(String str) {
        super(str);
    }
}
