package p146i1;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Map;
import p073e1.C6063k0;
import p073e1.InterfaceC6039c;
import p291q1.C11674f;
import p291q1.C11680l;

/* renamed from: i1.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C7377b {

    /* renamed from: d */
    private static final Object f19855d = new Object();

    /* renamed from: a */
    private final Context f19856a;

    /* renamed from: b */
    private final String f19857b;

    /* renamed from: c */
    private final Map<String, C6063k0> f19858c;

    public C7377b(Drawable.Callback callback, String str, InterfaceC6039c interfaceC6039c, Map<String, C6063k0> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f19857b = str + '/';
        } else {
            this.f19857b = str;
        }
        this.f19858c = map;
        m20818d(interfaceC6039c);
        if (!(callback instanceof View)) {
            this.f19856a = null;
        } else {
            this.f19856a = ((View) callback).getContext().getApplicationContext();
        }
    }

    /* renamed from: c */
    private Bitmap m20819c(String str, Bitmap bitmap) {
        synchronized (f19855d) {
            this.f19858c.get(str).m23649f(bitmap);
        }
        return bitmap;
    }

    /* renamed from: a */
    public Bitmap m20821a(String str) {
        C6063k0 c6063k0 = this.f19858c.get(str);
        if (c6063k0 == null) {
            return null;
        }
        Bitmap m23654a = c6063k0.m23654a();
        if (m23654a != null) {
            return m23654a;
        }
        Context context = this.f19856a;
        if (context == null) {
            return null;
        }
        String m23653b = c6063k0.m23653b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (m23653b.startsWith("data:") && m23653b.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(m23653b.substring(m23653b.indexOf(44) + 1), 0);
                return m20819c(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e) {
                C11674f.m7232d("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.f19857b)) {
                AssetManager assets = context.getAssets();
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(assets.open(this.f19857b + m23653b), null, options);
                    if (decodeStream == null) {
                        C11674f.m7233c("Decoded image `" + str + "` is null.");
                        return null;
                    }
                    return m20819c(str, C11680l.m7181l(decodeStream, c6063k0.m23650e(), c6063k0.m23652c()));
                } catch (IllegalArgumentException e2) {
                    C11674f.m7232d("Unable to decode image `" + str + "`.", e2);
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException e3) {
            C11674f.m7232d("Unable to open asset.", e3);
            return null;
        }
    }

    /* renamed from: b */
    public boolean m20820b(Context context) {
        if (this.f19856a instanceof Application) {
            context = context.getApplicationContext();
        }
        if (context == this.f19856a) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void m20818d(InterfaceC6039c interfaceC6039c) {
    }
}