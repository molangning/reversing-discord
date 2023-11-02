package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.material.internal.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4909n {

    /* renamed from: a */
    private static final Comparator<View> f13779a = new C4910a();

    /* renamed from: com.google.android.material.internal.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4910a implements Comparator<View> {
        C4910a() {
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    /* renamed from: a */
    private static ImageView m26943a(Toolbar toolbar, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ImageView m26942b(Toolbar toolbar) {
        return m26943a(toolbar, toolbar.getLogo());
    }

    /* renamed from: c */
    public static TextView m26941c(Toolbar toolbar) {
        List<TextView> m26940d = m26940d(toolbar, toolbar.getSubtitle());
        if (m26940d.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(m26940d, f13779a);
    }

    /* renamed from: d */
    private static List<TextView> m26940d(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static TextView m26939e(Toolbar toolbar) {
        List<TextView> m26940d = m26940d(toolbar, toolbar.getTitle());
        if (m26940d.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(m26940d, f13779a);
    }
}
