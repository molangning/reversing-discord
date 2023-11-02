package com.facebook.hermes.intl;

import com.facebook.hermes.intl.InterfaceC3649b;
import java.text.AttributedCharacterIterator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import p128h4.C6935j;
import p128h4.InterfaceC6895b;
import p164j$.util.DesugarTimeZone;

/* renamed from: com.facebook.hermes.intl.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3689n implements InterfaceC3649b {

    /* renamed from: a */
    private DateFormat f10250a = null;

    /* renamed from: com.facebook.hermes.intl.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3690a {
        /* renamed from: a */
        public static String m31248a(String str) {
            StringBuilder sb2 = new StringBuilder();
            boolean z = false;
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '\'') {
                    z = !z;
                } else if (!z && ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z'))) {
                    sb2.append(str.charAt(i));
                }
            }
            return sb2.toString();
        }
    }

    @Override // com.facebook.hermes.intl.InterfaceC3649b
    /* renamed from: a */
    public AttributedCharacterIterator mo31247a(double d) {
        return this.f10250a.formatToCharacterIterator(Double.valueOf(d));
    }

    @Override // com.facebook.hermes.intl.InterfaceC3649b
    /* renamed from: b */
    public String mo31246b(double d) {
        return this.f10250a.format(new Date((long) d));
    }

    @Override // com.facebook.hermes.intl.InterfaceC3649b
    /* renamed from: c */
    public String mo31245c(InterfaceC6895b<?> interfaceC6895b) {
        return "latn";
    }

    @Override // com.facebook.hermes.intl.InterfaceC3649b
    /* renamed from: d */
    public String mo31244d(InterfaceC6895b<?> interfaceC6895b) {
        return DateFormat.getDateInstance(3, (Locale) interfaceC6895b.mo21544h()).getCalendar().toString();
    }

    @Override // com.facebook.hermes.intl.InterfaceC3649b
    /* renamed from: e */
    public InterfaceC3649b.EnumC3655f mo31243e(InterfaceC6895b<?> interfaceC6895b) {
        InterfaceC3649b.EnumC3655f enumC3655f;
        try {
            String m31248a = C3690a.m31248a(((SimpleDateFormat) DateFormat.getTimeInstance(0, (Locale) interfaceC6895b.mo21544h())).toPattern());
            if (m31248a.contains(String.valueOf('h'))) {
                enumC3655f = InterfaceC3649b.EnumC3655f.H12;
            } else if (m31248a.contains(String.valueOf('K'))) {
                enumC3655f = InterfaceC3649b.EnumC3655f.H11;
            } else if (m31248a.contains(String.valueOf('H'))) {
                enumC3655f = InterfaceC3649b.EnumC3655f.H23;
            } else {
                enumC3655f = InterfaceC3649b.EnumC3655f.H24;
            }
            return enumC3655f;
        } catch (ClassCastException unused) {
            return InterfaceC3649b.EnumC3655f.H24;
        }
    }

    @Override // com.facebook.hermes.intl.InterfaceC3649b
    /* renamed from: f */
    public void mo31242f(InterfaceC6895b<?> interfaceC6895b, String str, String str2, InterfaceC3649b.EnumC3653d enumC3653d, InterfaceC3649b.EnumC3660k enumC3660k, InterfaceC3649b.EnumC3652c enumC3652c, InterfaceC3649b.EnumC3661l enumC3661l, InterfaceC3649b.EnumC3657h enumC3657h, InterfaceC3649b.EnumC3651b enumC3651b, InterfaceC3649b.EnumC3654e enumC3654e, InterfaceC3649b.EnumC3656g enumC3656g, InterfaceC3649b.EnumC3658i enumC3658i, InterfaceC3649b.EnumC3659j enumC3659j, InterfaceC3649b.EnumC3655f enumC3655f, Object obj) {
        boolean z;
        if (!str.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(C6935j.m21637h(str));
            interfaceC6895b.mo21546f("ca", arrayList);
        }
        if (!str2.isEmpty()) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            arrayList2.add(C6935j.m21637h(str2));
            interfaceC6895b.mo21546f("nu", arrayList2);
        }
        boolean z2 = true;
        if (enumC3661l == null && enumC3657h == null && enumC3651b == null) {
            z = false;
        } else {
            z = true;
        }
        if (enumC3654e == null && enumC3656g == null && enumC3658i == null) {
            z2 = false;
        }
        if (z && z2) {
            this.f10250a = DateFormat.getDateTimeInstance(0, 0, (Locale) interfaceC6895b.mo21544h());
        } else if (z) {
            this.f10250a = DateFormat.getDateInstance(0, (Locale) interfaceC6895b.mo21544h());
        } else if (z2) {
            this.f10250a = DateFormat.getTimeInstance(0, (Locale) interfaceC6895b.mo21544h());
        }
        if (!C6935j.m21631n(obj) && !C6935j.m21635j(obj)) {
            this.f10250a.setTimeZone(DesugarTimeZone.getTimeZone(C6935j.m21637h(obj)));
        }
    }

    @Override // com.facebook.hermes.intl.InterfaceC3649b
    /* renamed from: g */
    public String mo31241g(AttributedCharacterIterator.Attribute attribute, String str) {
        if (attribute == DateFormat.Field.DAY_OF_WEEK) {
            return "weekday";
        }
        if (attribute == DateFormat.Field.ERA) {
            return "era";
        }
        if (attribute == DateFormat.Field.YEAR) {
            try {
                Double.parseDouble(str);
                return "year";
            } catch (NumberFormatException unused) {
                return "yearName";
            }
        } else if (attribute == DateFormat.Field.MONTH) {
            return "month";
        } else {
            if (attribute == DateFormat.Field.DAY_OF_MONTH) {
                return "day";
            }
            if (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) {
                return "hour";
            }
            if (attribute == DateFormat.Field.MINUTE) {
                return "minute";
            }
            if (attribute == DateFormat.Field.SECOND) {
                return "second";
            }
            if (attribute == DateFormat.Field.TIME_ZONE) {
                return "timeZoneName";
            }
            if (attribute == DateFormat.Field.AM_PM) {
                return "dayPeriod";
            }
            if (attribute.toString().equals("android.icu.text.DateFormat$Field(related year)")) {
                return "relatedYear";
            }
            return "literal";
        }
    }

    @Override // com.facebook.hermes.intl.InterfaceC3649b
    /* renamed from: h */
    public String mo31240h(InterfaceC6895b<?> interfaceC6895b) {
        return Calendar.getInstance((Locale) interfaceC6895b.mo21544h()).getTimeZone().getID();
    }
}