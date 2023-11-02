package com.henninghall.date_picker;

import p084ed.EnumC6205c;

/* renamed from: com.henninghall.date_picker.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5145e {

    /* renamed from: a */
    private final C5151j f14473a;

    public C5145e(C5151j c5151j) {
        this.f14473a = c5151j;
    }

    /* renamed from: a */
    private String m26080a(String str) {
        return " " + str + " ";
    }

    /* renamed from: c */
    private boolean m26078c(String str) {
        if (this.f14473a.m26060E() != EnumC6205c.nativeAndroid || str.length() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public String m26079b(String str) {
        if (!m26078c(str)) {
            return str;
        }
        return m26080a(str);
    }
}
