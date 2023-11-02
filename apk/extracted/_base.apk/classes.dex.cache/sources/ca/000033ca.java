package p119g9;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.IOException;

@Deprecated
/* renamed from: g9.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6586i {
    /* renamed from: a */
    public static void m22369a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m22368b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}