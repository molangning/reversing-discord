package com.henninghall.date_picker.pickers;

import android.graphics.Paint;
import android.view.View;

/* renamed from: com.henninghall.date_picker.pickers.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC5161a {

    /* renamed from: com.henninghall.date_picker.pickers.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC5162a {
        /* renamed from: a */
        void mo21450a();
    }

    /* renamed from: com.henninghall.date_picker.pickers.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC5163b {
        /* renamed from: a */
        void mo21961a(InterfaceC5161a interfaceC5161a, int i, int i2);
    }

    /* renamed from: a */
    void mo26003a(int i, boolean z);

    /* renamed from: b */
    void mo26002b(int i);

    /* renamed from: c */
    boolean mo26001c();

    String[] getDisplayedValues();

    int getMaxValue();

    int getValue();

    View getView();

    boolean getWrapSelectorWheel();

    void setDisplayedValues(String[] strArr);

    void setDividerHeight(int i);

    void setItemPaddingHorizontal(int i);

    void setMaxValue(int i);

    void setMinValue(int i);

    void setOnValueChangeListenerInScrolling(InterfaceC5163b interfaceC5163b);

    void setOnValueChangedListener(InterfaceC5162a interfaceC5162a);

    void setShownCount(int i);

    void setTextAlign(Paint.Align align);

    void setTextColor(String str);

    void setValue(int i);

    void setVisibility(int i);

    void setWrapSelectorWheel(boolean z);
}