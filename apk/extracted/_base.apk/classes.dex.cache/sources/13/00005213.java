package p426xe;

import android.graphics.Bitmap;
import id.zelory.compressor.constraint.Compression;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a2\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0001¨\u0006\t"}, m14357d2 = {"Lid/zelory/compressor/constraint/Compression;", "", "width", "height", "Landroid/graphics/Bitmap$CompressFormat;", "format", "quality", "", "a", "compressor_release"}, m14356k = 2, m14355mv = {1, 4, 0})
/* renamed from: xe.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13795c {
    /* renamed from: a */
    public static final void m1522a(Compression compression, int i, int i2, Bitmap.CompressFormat format, int i3) {
        C9612q.m13916i(compression, "$this$default");
        C9612q.m13916i(format, "format");
        compression.m20558a(new C13794b(i, i2, format, i3));
    }

    /* renamed from: b */
    public static /* synthetic */ void m1521b(Compression compression, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = 612;
        }
        if ((i4 & 2) != 0) {
            i2 = 816;
        }
        if ((i4 & 4) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if ((i4 & 8) != 0) {
            i3 = 80;
        }
        m1522a(compression, i, i2, compressFormat, i3);
    }
}