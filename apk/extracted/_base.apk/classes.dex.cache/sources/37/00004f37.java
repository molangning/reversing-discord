package p380v4;

import com.facebook.imagepipeline.image.ImageInfo;
import java.io.Closeable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p414x2.C13677a;

/* renamed from: v4.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13063c implements Closeable, ImageInfo {

    /* renamed from: k */
    private static final Set<String> f33843k = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded"));

    /* renamed from: j */
    private Map<String, Object> f33844j = new HashMap();

    /* renamed from: a */
    public InterfaceC13069i mo3365a() {
        return C13068h.f33869d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    protected void finalize() {
        if (isClosed()) {
            return;
        }
        C13677a.m1868J("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // p380v4.InterfaceC13067g
    public Map<String, Object> getExtras() {
        return this.f33844j;
    }

    /* renamed from: h */
    public abstract int mo3364h();

    /* renamed from: i */
    public boolean mo3370i() {
        return false;
    }

    public abstract boolean isClosed();

    /* renamed from: j */
    public void m3369j(String str, Object obj) {
        if (f33843k.contains(str)) {
            this.f33844j.put(str, obj);
        }
    }

    /* renamed from: m */
    public void m3368m(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        for (String str : f33843k) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f33844j.put(str, obj);
            }
        }
    }
}