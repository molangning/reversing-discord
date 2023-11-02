package p257o4;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.memory.C3726f;
import p094f3.InterfaceC6305a;
import p170j4.C8792b;
import p380v4.C13065e;
import p394w2.C13379j;
import p437y4.C13904y;
import p455z2.InterfaceC14078g;

/* renamed from: o4.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10984c implements InterfaceC6305a {

    /* renamed from: a */
    private final C10983b f28784a;

    /* renamed from: b */
    private final C3726f f28785b;

    public C10984c(C13904y c13904y) {
        this.f28785b = c13904y.m1233d();
        this.f28784a = new C10983b(c13904y.m1229h());
    }

    /* renamed from: b */
    private static BitmapFactory.Options m9410b(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        return options;
    }

    @Override // p094f3.InterfaceC6305a
    @TargetApi(12)
    /* renamed from: a */
    public Bitmap mo9411a(int i, int i2, Bitmap.Config config) {
        C13065e c13065e;
        CloseableReference<InterfaceC14078g> m9412a = this.f28784a.m9412a((short) i, (short) i2);
        CloseableReference<byte[]> closeableReference = null;
        try {
            c13065e = new C13065e(m9412a);
        } catch (Throwable th2) {
            th = th2;
            c13065e = null;
        }
        try {
            c13065e.m3351F0(C8792b.f23081a);
            BitmapFactory.Options m9410b = m9410b(c13065e.m3345Q(), config);
            int size = m9412a.m31730D().size();
            closeableReference = this.f28785b.m30983a(size + 2);
            byte[] m31730D = closeableReference.m31730D();
            m9412a.m31730D().mo725e(0, m31730D, 0, size);
            Bitmap bitmap = (Bitmap) C13379j.m2677g(BitmapFactory.decodeByteArray(m31730D, 0, size, m9410b));
            bitmap.setHasAlpha(true);
            bitmap.eraseColor(0);
            CloseableReference.m31715v(closeableReference);
            C13065e.m3335i(c13065e);
            CloseableReference.m31715v(m9412a);
            return bitmap;
        } catch (Throwable th3) {
            th = th3;
            CloseableReference.m31715v(closeableReference);
            C13065e.m3335i(c13065e);
            CloseableReference.m31715v(m9412a);
            throw th;
        }
    }
}