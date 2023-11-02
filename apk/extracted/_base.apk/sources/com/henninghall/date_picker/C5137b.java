package com.henninghall.date_picker;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import p084ed.EnumC6203a;
import p084ed.EnumC6204b;
import p084ed.EnumC6205c;
import p084ed.EnumC6206d;

/* renamed from: com.henninghall.date_picker.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5137b {

    /* renamed from: a */
    private final C5151j f14461a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.henninghall.date_picker.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C5138a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14462a;

        /* renamed from: b */
        static final /* synthetic */ int[] f14463b;

        static {
            int[] iArr = new int[EnumC6205c.values().length];
            f14463b = iArr;
            try {
                iArr[EnumC6205c.nativeAndroid.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14463b[EnumC6205c.iosClone.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC6204b.values().length];
            f14462a = iArr2;
            try {
                iArr2[EnumC6204b.datetime.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14462a[EnumC6204b.time.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14462a[EnumC6204b.date.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5137b(C5151j c5151j) {
        this.f14461a = c5151j;
    }

    /* renamed from: c */
    private ArrayList<EnumC6206d> m26092c() {
        String replaceAll = C5146f.m26075c(this.f14461a.m26037u()).replaceAll("\\('(.+?)'\\)", "\\${$1}").replaceAll("'.+?'", "").replaceAll("\\$\\{(.+?)\\}", "('$1')");
        ArrayList arrayList = new ArrayList(Arrays.asList(EnumC6206d.values()));
        ArrayList<EnumC6206d> arrayList2 = new ArrayList<>();
        EnumC6206d enumC6206d = EnumC6206d.DAY;
        arrayList.remove(enumC6206d);
        arrayList2.add(enumC6206d);
        for (char c : replaceAll.toCharArray()) {
            try {
                EnumC6206d m26023i = C5153k.m26023i(c);
                if (arrayList.contains(m26023i)) {
                    arrayList.remove(m26023i);
                    arrayList2.add(m26023i);
                }
            } catch (Exception unused) {
            }
        }
        EnumC6206d enumC6206d2 = EnumC6206d.AM_PM;
        if (arrayList.contains(enumC6206d2)) {
            arrayList.remove(enumC6206d2);
            arrayList2.add(enumC6206d2);
        }
        if (!arrayList.isEmpty()) {
            Log.e("RNDatePicker", arrayList.size() + " wheel types cannot be ordered. Wheel type 0: " + arrayList.get(0));
        }
        return arrayList2;
    }

    /* renamed from: a */
    public String m26094a() {
        Calendar m26038t = this.f14461a.m26038t();
        String m26039s = this.f14461a.m26039s();
        if (m26038t != null) {
            return C5153k.m26030b(m26038t);
        }
        return m26039s;
    }

    /* renamed from: b */
    public ArrayList<EnumC6206d> m26093b() {
        ArrayList<EnumC6206d> m26092c = m26092c();
        ArrayList<EnumC6206d> m26089f = m26089f();
        ArrayList<EnumC6206d> arrayList = new ArrayList<>();
        Iterator<EnumC6206d> it = m26092c.iterator();
        while (it.hasNext()) {
            EnumC6206d next = it.next();
            if (m26089f.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public int m26091d() {
        int i = C5138a.f14463b[this.f14461a.m26060E().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return C5150i.f14492a;
            }
            return C5150i.f14492a;
        }
        return C5150i.f14493b;
    }

    /* renamed from: e */
    public int m26090e() {
        int intValue = this.f14461a.m26041q().intValue() / 35;
        if (intValue % 2 == 0) {
            return intValue + 1;
        }
        return intValue;
    }

    /* renamed from: f */
    public ArrayList<EnumC6206d> m26089f() {
        ArrayList<EnumC6206d> arrayList = new ArrayList<>();
        EnumC6204b m26032z = this.f14461a.m26032z();
        int i = C5138a.f14462a[m26032z.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    arrayList.add(EnumC6206d.YEAR);
                    arrayList.add(EnumC6206d.MONTH);
                    arrayList.add(EnumC6206d.DATE);
                }
            } else {
                arrayList.add(EnumC6206d.HOUR);
                arrayList.add(EnumC6206d.MINUTE);
            }
        } else {
            arrayList.add(EnumC6206d.DAY);
            arrayList.add(EnumC6206d.HOUR);
            arrayList.add(EnumC6206d.MINUTE);
        }
        if ((m26032z == EnumC6204b.time || m26032z == EnumC6204b.datetime) && this.f14461a.f14509p.m26086i()) {
            arrayList.add(EnumC6206d.AM_PM);
        }
        return arrayList;
    }

    /* renamed from: g */
    public boolean m26088g() {
        return this.f14461a.m26060E() == EnumC6205c.nativeAndroid;
    }

    /* renamed from: h */
    public boolean m26087h() {
        return this.f14461a.m26032z() == EnumC6204b.time && !m26086i();
    }

    /* renamed from: i */
    public boolean m26086i() {
        if (this.f14461a.m26040r() == EnumC6203a.locale) {
            return C5146f.m26069i(this.f14461a.m26037u());
        }
        return C5153k.m26029c();
    }
}
