package com.facebook.hermes.intl;

import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import com.facebook.hermes.intl.InterfaceC3649b;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Date;
import p128h4.C6935j;
import p128h4.C6947l;
import p128h4.C6971p3;
import p128h4.InterfaceC6895b;

/* renamed from: com.facebook.hermes.intl.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3691o implements InterfaceC3649b {

    /* renamed from: a */
    private DateFormat f10251a = null;

    /* renamed from: com.facebook.hermes.intl.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3692a {
        /* renamed from: a */
        public static String m31238a(String str) {
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

    /* renamed from: i */
    private static String m31239i(InterfaceC3649b.EnumC3660k enumC3660k, InterfaceC3649b.EnumC3652c enumC3652c, InterfaceC3649b.EnumC3661l enumC3661l, InterfaceC3649b.EnumC3657h enumC3657h, InterfaceC3649b.EnumC3651b enumC3651b, InterfaceC3649b.EnumC3654e enumC3654e, InterfaceC3649b.EnumC3656g enumC3656g, InterfaceC3649b.EnumC3658i enumC3658i, InterfaceC3649b.EnumC3659j enumC3659j, boolean z) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(enumC3660k.m31312a());
        sb2.append(enumC3652c.m31319a());
        sb2.append(enumC3661l.m31311a());
        sb2.append(enumC3657h.m31315a());
        sb2.append(enumC3651b.m31320a());
        if (z) {
            sb2.append(enumC3654e.m31318a());
        } else {
            sb2.append(enumC3654e.m31317b());
        }
        sb2.append(enumC3656g.m31316a());
        sb2.append(enumC3658i.m31314a());
        sb2.append(enumC3659j.m31313a());
        return sb2.toString();
    }

    @Override // com.facebook.hermes.intl.InterfaceC3649b
    /* renamed from: a */
    public AttributedCharacterIterator mo31247a(double d) {
        AttributedCharacterIterator formatToCharacterIterator;
        formatToCharacterIterator = this.f10251a.formatToCharacterIterator(Double.valueOf(d));
        return formatToCharacterIterator;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3649b
    /* renamed from: b */
    public String mo31246b(double d) {
        String format;
        format = this.f10251a.format(new Date((long) d));
        return format;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3649b
    /* renamed from: c */
    public String mo31245c(InterfaceC6895b<?> interfaceC6895b) {
        NumberingSystem numberingSystem;
        String name;
        numberingSystem = NumberingSystem.getInstance((ULocale) interfaceC6895b.mo21544h());
        name = numberingSystem.getName();
        return name;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3649b
    /* renamed from: d */
    public String mo31244d(InterfaceC6895b<?> interfaceC6895b) {
        DateFormat dateInstance;
        Calendar calendar;
        String type;
        dateInstance = DateFormat.getDateInstance(3, (ULocale) interfaceC6895b.mo21544h());
        calendar = dateInstance.getCalendar();
        type = calendar.getType();
        return C6971p3.m21591d(type);
    }

    @Override // com.facebook.hermes.intl.InterfaceC3649b
    /* renamed from: e */
    public InterfaceC3649b.EnumC3655f mo31243e(InterfaceC6895b<?> interfaceC6895b) {
        DateFormat timeInstance;
        String pattern;
        InterfaceC3649b.EnumC3655f enumC3655f;
        try {
            timeInstance = DateFormat.getTimeInstance(0, (ULocale) interfaceC6895b.mo21544h());
            pattern = ((SimpleDateFormat) timeInstance).toPattern();
            String m31238a = C3692a.m31238a(pattern);
            if (m31238a.contains(String.valueOf('h'))) {
                enumC3655f = InterfaceC3649b.EnumC3655f.H12;
            } else if (m31238a.contains(String.valueOf('K'))) {
                enumC3655f = InterfaceC3649b.EnumC3655f.H11;
            } else if (m31238a.contains(String.valueOf('H'))) {
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
        Calendar calendar;
        NumberingSystem instanceByName;
        DateFormat patternInstance;
        TimeZone timeZone;
        DateFormat patternInstance2;
        if (enumC3655f != InterfaceC3649b.EnumC3655f.H11 && enumC3655f != InterfaceC3649b.EnumC3655f.H12) {
            z = false;
        } else {
            z = true;
        }
        String m31239i = m31239i(enumC3660k, enumC3652c, enumC3661l, enumC3657h, enumC3651b, enumC3654e, enumC3656g, enumC3658i, enumC3659j, z);
        if (!str.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(C6935j.m21637h(str));
            InterfaceC6895b<?> mo21548d = interfaceC6895b.mo21548d();
            mo21548d.mo21546f("ca", arrayList);
            calendar = Calendar.getInstance((ULocale) mo21548d.mo21544h());
        } else {
            calendar = null;
        }
        if (!str2.isEmpty()) {
            try {
                instanceByName = NumberingSystem.getInstanceByName(C6935j.m21637h(str2));
                if (instanceByName != null) {
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    arrayList2.add(C6935j.m21637h(str2));
                    interfaceC6895b.mo21546f("nu", arrayList2);
                } else {
                    throw new C6947l("Invalid numbering system: " + str2);
                }
            } catch (RuntimeException unused) {
                throw new C6947l("Invalid numbering system: " + str2);
            }
        }
        if (calendar != null) {
            patternInstance2 = DateFormat.getPatternInstance(calendar, m31239i, (ULocale) interfaceC6895b.mo21544h());
            this.f10251a = patternInstance2;
        } else {
            patternInstance = DateFormat.getPatternInstance(m31239i, (ULocale) interfaceC6895b.mo21544h());
            this.f10251a = patternInstance;
        }
        if (!C6935j.m21631n(obj) && !C6935j.m21635j(obj)) {
            timeZone = TimeZone.getTimeZone(C6935j.m21637h(obj));
            this.f10251a.setTimeZone(timeZone);
        }
    }

    @Override // com.facebook.hermes.intl.InterfaceC3649b
    /* renamed from: g */
    public String mo31241g(AttributedCharacterIterator.Attribute attribute, String str) {
        DateFormat.Field field;
        DateFormat.Field field2;
        DateFormat.Field field3;
        DateFormat.Field field4;
        DateFormat.Field field5;
        DateFormat.Field field6;
        DateFormat.Field field7;
        DateFormat.Field field8;
        DateFormat.Field field9;
        DateFormat.Field field10;
        DateFormat.Field field11;
        DateFormat.Field field12;
        DateFormat.Field field13;
        field = DateFormat.Field.DAY_OF_WEEK;
        if (attribute == field) {
            return "weekday";
        }
        field2 = DateFormat.Field.ERA;
        if (attribute == field2) {
            return "era";
        }
        field3 = DateFormat.Field.YEAR;
        if (attribute == field3) {
            try {
                Double.parseDouble(str);
                return "year";
            } catch (NumberFormatException unused) {
                return "yearName";
            }
        }
        field4 = DateFormat.Field.MONTH;
        if (attribute == field4) {
            return "month";
        }
        field5 = DateFormat.Field.DAY_OF_MONTH;
        if (attribute == field5) {
            return "day";
        }
        field6 = DateFormat.Field.HOUR0;
        if (attribute == field6) {
            return "hour";
        }
        field7 = DateFormat.Field.HOUR1;
        if (attribute == field7) {
            return "hour";
        }
        field8 = DateFormat.Field.HOUR_OF_DAY0;
        if (attribute == field8) {
            return "hour";
        }
        field9 = DateFormat.Field.HOUR_OF_DAY1;
        if (attribute == field9) {
            return "hour";
        }
        field10 = DateFormat.Field.MINUTE;
        if (attribute == field10) {
            return "minute";
        }
        field11 = DateFormat.Field.SECOND;
        if (attribute == field11) {
            return "second";
        }
        field12 = DateFormat.Field.TIME_ZONE;
        if (attribute == field12) {
            return "timeZoneName";
        }
        field13 = DateFormat.Field.AM_PM;
        if (attribute == field13) {
            return "dayPeriod";
        }
        if (attribute.toString().equals("android.icu.text.DateFormat$Field(related year)")) {
            return "relatedYear";
        }
        return "literal";
    }

    @Override // com.facebook.hermes.intl.InterfaceC3649b
    /* renamed from: h */
    public String mo31240h(InterfaceC6895b<?> interfaceC6895b) {
        Calendar calendar;
        TimeZone timeZone;
        String id2;
        calendar = Calendar.getInstance((ULocale) interfaceC6895b.mo21544h());
        timeZone = calendar.getTimeZone();
        id2 = timeZone.getID();
        return id2;
    }
}