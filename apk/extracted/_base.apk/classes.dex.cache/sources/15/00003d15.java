package p176ja;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: ja.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8882e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f23267b = new C8882e();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f23268a;

    private C8882e() {
        super(Integer.class, "drawableAlphaCompat");
        this.f23268a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}