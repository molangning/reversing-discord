package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* renamed from: com.google.android.flexbox.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
interface InterfaceC4582a {
    /* renamed from: b */
    void mo28416b(View view, int i, int i2, C4584c c4584c);

    /* renamed from: c */
    int mo28415c(int i, int i2, int i3);

    /* renamed from: e */
    View mo28414e(int i);

    /* renamed from: f */
    int mo28413f(int i, int i2, int i3);

    /* renamed from: g */
    int mo28412g(View view);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<C4584c> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    /* renamed from: h */
    void mo28411h(C4584c c4584c);

    /* renamed from: i */
    View mo28410i(int i);

    /* renamed from: j */
    void mo28409j(int i, View view);

    /* renamed from: k */
    int mo28408k(View view, int i, int i2);

    /* renamed from: l */
    boolean mo28407l();

    void setFlexLines(List<C4584c> list);
}
