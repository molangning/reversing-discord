package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import p052d.C5706a;
import p052d.C5707b;
import p052d.C5709d;
import p052d.C5715j;

/* renamed from: androidx.appcompat.view.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0357a {

    /* renamed from: a */
    private Context f1139a;

    private C0357a(Context context) {
        this.f1139a = context;
    }

    /* renamed from: b */
    public static C0357a m40493b(Context context) {
        return new C0357a(context);
    }

    /* renamed from: a */
    public boolean m40494a() {
        return this.f1139a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int m40492c() {
        return this.f1139a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m40491d() {
        Configuration configuration = this.f1139a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i <= 600) {
            if (i <= 960 || i2 <= 720) {
                if (i <= 720 || i2 <= 960) {
                    if (i < 500) {
                        if (i <= 640 || i2 <= 480) {
                            if (i <= 480 || i2 <= 640) {
                                if (i >= 360) {
                                    return 3;
                                }
                                return 2;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 5;
            }
            return 5;
        }
        return 5;
    }

    /* renamed from: e */
    public int m40490e() {
        return this.f1139a.getResources().getDimensionPixelSize(C5709d.f16083b);
    }

    /* renamed from: f */
    public int m40489f() {
        TypedArray obtainStyledAttributes = this.f1139a.obtainStyledAttributes(null, C5715j.f16345a, C5706a.f16049c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C5715j.f16390j, 0);
        Resources resources = this.f1139a.getResources();
        if (!m40488g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C5709d.f16082a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean m40488g() {
        return this.f1139a.getResources().getBoolean(C5707b.f16073a);
    }

    /* renamed from: h */
    public boolean m40487h() {
        return true;
    }
}
