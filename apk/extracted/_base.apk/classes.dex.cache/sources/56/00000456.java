package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.C0971e;
import androidx.core.provider.C1090g;
import java.io.IOException;

/* renamed from: androidx.core.graphics.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0998b0 extends C1001c0 {
    /* JADX WARN: Incorrect condition in loop: B:33:0x0027 */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.fonts.Font m38174h(android.graphics.fonts.FontFamily r6, int r7) {
        /*
            r5 = this;
            android.graphics.fonts.FontStyle r0 = new android.graphics.fonts.FontStyle
            r1 = r7 & 1
            if (r1 == 0) goto L9
            r1 = 700(0x2bc, float:9.81E-43)
            goto Lb
        L9:
            r1 = 400(0x190, float:5.6E-43)
        Lb:
            r7 = r7 & 2
            r2 = 0
            r3 = 1
            if (r7 == 0) goto L13
            r7 = r3
            goto L14
        L13:
            r7 = r2
        L14:
            r0.<init>(r1, r7)
            android.graphics.fonts.Font r7 = androidx.core.graphics.C1035o.m38017a(r6, r2)
            android.graphics.fonts.FontStyle r1 = androidx.core.graphics.C1045y.m38007a(r7)
            int r1 = m38173i(r0, r1)
        L23:
            int r2 = androidx.core.graphics.C1036p.m38016a(r6)
            if (r3 >= r2) goto L3c
            android.graphics.fonts.Font r2 = androidx.core.graphics.C1035o.m38017a(r6, r3)
            android.graphics.fonts.FontStyle r4 = androidx.core.graphics.C1045y.m38007a(r2)
            int r4 = m38173i(r0, r4)
            if (r4 >= r1) goto L39
            r7 = r2
            r1 = r4
        L39:
            int r3 = r3 + 1
            goto L23
        L3c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C0998b0.m38174h(android.graphics.fonts.FontFamily, int):android.graphics.fonts.Font");
    }

    /* renamed from: i */
    private static int m38173i(FontStyle fontStyle, FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        int i;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        if (slant == slant2) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    @Override // androidx.core.graphics.C1001c0
    /* renamed from: a */
    public Typeface mo38035a(Context context, C0971e.C0974c c0974c, Resources resources, int i) {
        C0971e.C0975d[] m38264a;
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        Font.Builder weight;
        int i2;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font.Builder fontVariationSettings;
        Font build3;
        try {
            FontFamily.Builder builder = null;
            for (C0971e.C0975d c0975d : c0974c.m38264a()) {
                try {
                    weight = new Font.Builder(resources, c0975d.m38262b()).setWeight(c0975d.m38259e());
                    if (c0975d.m38258f()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    slant = weight.setSlant(i2);
                    ttcIndex = slant.setTtcIndex(c0975d.m38261c());
                    fontVariationSettings = ttcIndex.setFontVariationSettings(c0975d.m38260d());
                    build3 = fontVariationSettings.build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build3);
                    } else {
                        builder.addFont(build3);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build);
            style = m38174h(build, i).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C1001c0
    /* renamed from: b */
    public Typeface mo38034b(Context context, CancellationSignal cancellationSignal, C1090g.C1092b[] c1092bArr, int i) {
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        ParcelFileDescriptor openFileDescriptor;
        Font.Builder weight;
        int i2;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font build3;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C1090g.C1092b c1092b : c1092bArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c1092b.m37913d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        weight = new Font.Builder(openFileDescriptor).setWeight(c1092b.m37912e());
                        if (c1092b.m37911f()) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        slant = weight.setSlant(i2);
                        ttcIndex = slant.setTtcIndex(c1092b.m37914c());
                        build3 = ttcIndex.build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build3);
                        } else {
                            builder.addFont(build3);
                        }
                    } catch (Throwable th2) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build);
            style = m38174h(build, i).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C1001c0
    /* renamed from: d */
    public Typeface mo38033d(Context context, Resources resources, int i, String str, int i2) {
        Font build;
        FontFamily build2;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build3;
        try {
            build = new Font.Builder(resources, i).build();
            build2 = new FontFamily.Builder(build).build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
            style = build.getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build3 = style2.build();
            return build3;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C1001c0
    /* renamed from: g */
    public C1090g.C1092b mo38167g(C1090g.C1092b[] c1092bArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}