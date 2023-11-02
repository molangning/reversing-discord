package com.discord.react_fork_overrides.forks;

import android.graphics.Paint;
import com.discord.react_fork_overrides.forks.CustomLineHeightSpanOverride;
import com.facebook.react.bridge.Callback;
import com.facebook.react.views.text.CustomLineHeightSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p068dg.C5838c;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, m14357d2 = {"Lcom/discord/react_fork_overrides/forks/CustomLineHeightSpanOverride;", "", "()V", "override", "", "overrideLineHeight", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "mHeight", "", "react_fork_overrides_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class CustomLineHeightSpanOverride {
    public static final CustomLineHeightSpanOverride INSTANCE = new CustomLineHeightSpanOverride();

    private CustomLineHeightSpanOverride() {
    }

    public static final void override$lambda$0(Object[] objArr) {
        C9612q.m13918g(objArr, "(fm, mHeight)");
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        CustomLineHeightSpanOverride customLineHeightSpanOverride = INSTANCE;
        C9612q.m13919f(obj, "null cannot be cast to non-null type android.graphics.Paint.FontMetricsInt");
        C9612q.m13919f(obj2, "null cannot be cast to non-null type kotlin.Int");
        customLineHeightSpanOverride.overrideLineHeight((Paint.FontMetricsInt) obj, ((Integer) obj2).intValue());
    }

    private final void overrideLineHeight(Paint.FontMetricsInt fontMetricsInt, int i) {
        boolean z;
        int m24388b;
        int i2 = fontMetricsInt.bottom;
        int i3 = fontMetricsInt.top;
        if (i >= i2 - i3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            double d = (i - ((-i3) + i2)) / 2.0f;
            fontMetricsInt.top = i3 - ((int) Math.ceil(d));
            int floor = fontMetricsInt.bottom + ((int) Math.floor(d));
            fontMetricsInt.bottom = floor;
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = floor;
            return;
        }
        int i4 = fontMetricsInt.descent;
        int i5 = i4 - fontMetricsInt.ascent;
        if (i5 <= 0) {
            return;
        }
        m24388b = C5838c.m24388b(i4 * ((i * 0.75f) / i5));
        fontMetricsInt.descent = m24388b;
        fontMetricsInt.ascent = m24388b - i;
    }

    public final void override() {
        CustomLineHeightSpan.chooseHeightOverride = new Callback() { // from class: m2.a
            @Override // com.facebook.react.bridge.Callback
            public final void invoke(Object[] objArr) {
                CustomLineHeightSpanOverride.override$lambda$0(objArr);
            }
        };
    }
}