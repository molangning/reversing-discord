package net.time4j.calendar;

import java.text.ParsePosition;
import java.util.Locale;

/* renamed from: net.time4j.calendar.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10640c extends C10664o {
    private static final long serialVersionUID = 4908662352833192131L;

    /* renamed from: z */
    private static final C10640c[] f27739z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.calendar.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public class C10641a extends AbstractC10653j {

        /* renamed from: a */
        final /* synthetic */ int f27740a;

        C10641a(int i) {
            C10640c.this = r1;
            this.f27740a = i;
        }

        @Override // net.time4j.calendar.AbstractC10653j
        /* renamed from: d */
        public int mo10852d() {
            return (((this.f27740a - 1) * 60) + C10640c.this.getNumber()) - 1;
        }
    }

    static {
        C10640c[] c10640cArr = new C10640c[60];
        int i = 0;
        while (i < 60) {
            int i2 = i + 1;
            c10640cArr[i] = new C10640c(i2);
            i = i2;
        }
        f27739z = c10640cArr;
    }

    private C10640c(int i) {
        super(i);
    }

    /* renamed from: o */
    public static C10640c m10947o(int i) {
        if (i >= 1 && i <= 60) {
            return f27739z[i - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i);
    }

    /* renamed from: p */
    public static C10640c m10946p(CharSequence charSequence, ParsePosition parsePosition, Locale locale, boolean z) {
        C10664o m10807l = C10664o.m10807l(charSequence, parsePosition, locale, z);
        if (m10807l == null) {
            return null;
        }
        return m10947o(m10807l.getNumber());
    }

    /* renamed from: n */
    public AbstractC10653j m10948n(int i) {
        if (i >= 1) {
            return new C10641a(i);
        }
        throw new IllegalArgumentException("Cycle number must not be smaller than 1: " + i);
    }

    @Override // net.time4j.calendar.C10664o
    Object readResolve() {
        return m10947o(super.getNumber());
    }
}