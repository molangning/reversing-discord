package p146i1;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import p073e1.C6037b;
import p167j1.C8782c;
import p167j1.C8788i;
import p291q1.C11674f;

/* renamed from: i1.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C7376a {

    /* renamed from: d */
    private final AssetManager f19853d;

    /* renamed from: a */
    private final C8788i<String> f19850a = new C8788i<>();

    /* renamed from: b */
    private final Map<C8788i<String>, Typeface> f19851b = new HashMap();

    /* renamed from: c */
    private final Map<String, Typeface> f19852c = new HashMap();

    /* renamed from: e */
    private String f19854e = ".ttf";

    public C7376a(Drawable.Callback callback, C6037b c6037b) {
        if (!(callback instanceof View)) {
            C11674f.m7233c("LottieDrawable must be inside of a view for images to work.");
            this.f19853d = null;
            return;
        }
        this.f19853d = ((View) callback).getContext().getAssets();
    }

    /* renamed from: a */
    private Typeface m20826a(C8782c c8782c) {
        String m17267a = c8782c.m17267a();
        Typeface typeface = this.f19852c.get(m17267a);
        if (typeface != null) {
            return typeface;
        }
        c8782c.m17265c();
        c8782c.m17266b();
        if (c8782c.m17264d() != null) {
            return c8782c.m17264d();
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f19853d, "fonts/" + m17267a + this.f19854e);
        this.f19852c.put(m17267a, createFromAsset);
        return createFromAsset;
    }

    /* renamed from: e */
    private Typeface m20822e(Typeface typeface, String str) {
        int i;
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        if (contains && contains2) {
            i = 3;
        } else if (contains) {
            i = 2;
        } else if (contains2) {
            i = 1;
        } else {
            i = 0;
        }
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }

    /* renamed from: b */
    public Typeface m20825b(C8782c c8782c) {
        this.f19850a.m17245b(c8782c.m17267a(), c8782c.m17265c());
        Typeface typeface = this.f19851b.get(this.f19850a);
        if (typeface != null) {
            return typeface;
        }
        Typeface m20822e = m20822e(m20826a(c8782c), c8782c.m17265c());
        this.f19851b.put(this.f19850a, m20822e);
        return m20822e;
    }

    /* renamed from: c */
    public void m20824c(String str) {
        this.f19854e = str;
    }

    /* renamed from: d */
    public void m20823d(C6037b c6037b) {
    }
}
