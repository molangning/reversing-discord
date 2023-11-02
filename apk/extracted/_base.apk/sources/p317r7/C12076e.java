package p317r7;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import p195k8.C9149a;

/* renamed from: r7.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12076e {

    /* renamed from: a */
    private final LinkedHashMap<Uri, byte[]> f31252a;

    /* renamed from: r7.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C12077a extends LinkedHashMap<Uri, byte[]> {

        /* renamed from: j */
        final /* synthetic */ int f31253j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12077a(int i, float f, boolean z, int i2) {
            super(i, f, z);
            this.f31253j = i2;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f31253j;
        }
    }

    public C12076e(int i) {
        this.f31252a = new C12077a(i + 1, 1.0f, false, i);
    }

    /* renamed from: a */
    public byte[] m6310a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f31252a.get(uri);
    }

    /* renamed from: b */
    public byte[] m6309b(Uri uri, byte[] bArr) {
        return this.f31252a.put((Uri) C9149a.m16448e(uri), (byte[]) C9149a.m16448e(bArr));
    }

    /* renamed from: c */
    public byte[] m6308c(Uri uri) {
        return this.f31252a.remove(C9149a.m16448e(uri));
    }
}
