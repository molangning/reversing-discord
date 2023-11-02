package p383v7;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import p195k8.C9191p0;

/* renamed from: v7.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13126a {

    /* renamed from: g */
    public static final C13126a f34094g = new C13126a(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a */
    public final int f34095a;

    /* renamed from: b */
    public final int f34096b;

    /* renamed from: c */
    public final int f34097c;

    /* renamed from: d */
    public final int f34098d;

    /* renamed from: e */
    public final int f34099e;

    /* renamed from: f */
    public final Typeface f34100f;

    public C13126a(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f34095a = i;
        this.f34096b = i2;
        this.f34097c = i3;
        this.f34098d = i4;
        this.f34099e = i5;
        this.f34100f = typeface;
    }

    /* renamed from: a */
    public static C13126a m3159a(CaptioningManager.CaptionStyle captionStyle) {
        if (C9191p0.f24171a >= 21) {
            return m3157c(captionStyle);
        }
        return m3158b(captionStyle);
    }

    /* renamed from: b */
    private static C13126a m3158b(CaptioningManager.CaptionStyle captionStyle) {
        return new C13126a(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    /* renamed from: c */
    private static C13126a m3157c(CaptioningManager.CaptionStyle captionStyle) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (captionStyle.hasForegroundColor()) {
            i = captionStyle.foregroundColor;
        } else {
            i = f34094g.f34095a;
        }
        int i6 = i;
        if (captionStyle.hasBackgroundColor()) {
            i2 = captionStyle.backgroundColor;
        } else {
            i2 = f34094g.f34096b;
        }
        int i7 = i2;
        if (captionStyle.hasWindowColor()) {
            i3 = captionStyle.windowColor;
        } else {
            i3 = f34094g.f34097c;
        }
        int i8 = i3;
        if (captionStyle.hasEdgeType()) {
            i4 = captionStyle.edgeType;
        } else {
            i4 = f34094g.f34098d;
        }
        int i9 = i4;
        if (captionStyle.hasEdgeColor()) {
            i5 = captionStyle.edgeColor;
        } else {
            i5 = f34094g.f34099e;
        }
        return new C13126a(i6, i7, i8, i9, i5, captionStyle.getTypeface());
    }
}