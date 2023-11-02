package p425xd;

import android.media.ImageReader;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p425xd.C13788d;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, m14357d2 = {"Lxd/c;", "Ljava/io/Closeable;", "Lxd/d;", "", "close", "", "toString", "Landroid/media/ImageReader;", "p", "Landroid/media/ImageReader;", "imageReader", "Lxd/d$b;", "outputType", "", "dynamicRangeProfile", "<init>", "(Landroid/media/ImageReader;Lxd/d$b;Ljava/lang/Long;)V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: xd.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13787c extends C13788d {

    /* renamed from: p */
    private final ImageReader f35547p;

    public /* synthetic */ C13787c(ImageReader imageReader, C13788d.EnumC13790b enumC13790b, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageReader, enumC13790b, (i & 4) != 0 ? null : l);
    }

    @Override // p425xd.C13788d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Log.i("SurfaceOutput", "Closing " + this.f35547p.getWidth() + 'x' + this.f35547p.getHeight() + ' ' + m1531a() + " ImageReader..");
        this.f35547p.close();
    }

    @Override // p425xd.C13788d
    public String toString() {
        return m1531a() + " (" + this.f35547p.getWidth() + " x " + this.f35547p.getHeight() + " in format #" + this.f35547p.getImageFormat() + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C13787c(android.media.ImageReader r10, p425xd.C13788d.EnumC13790b r11, java.lang.Long r12) {
        /*
            r9 = this;
            java.lang.String r0 = "imageReader"
            kotlin.jvm.internal.C9612q.m13917h(r10, r0)
            java.lang.String r0 = "outputType"
            kotlin.jvm.internal.C9612q.m13917h(r11, r0)
            android.view.Surface r2 = r10.getSurface()
            java.lang.String r0 = "imageReader.surface"
            kotlin.jvm.internal.C9612q.m13918g(r2, r0)
            android.util.Size r3 = new android.util.Size
            int r0 = r10.getWidth()
            int r1 = r10.getHeight()
            r3.<init>(r0, r1)
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.f35547p = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p425xd.C13787c.<init>(android.media.ImageReader, xd.d$b, java.lang.Long):void");
    }
}