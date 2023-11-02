package p426xe;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p406we.C13534c;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0018"}, m14357d2 = {"Lxe/b;", "Lxe/a;", "Ljava/io/File;", "imageFile", "", "isSatisfied", "satisfy", "a", "Z", "isResolved", "", "b", "I", "width", "c", "height", "Landroid/graphics/Bitmap$CompressFormat;", "d", "Landroid/graphics/Bitmap$CompressFormat;", "format", "e", "quality", "<init>", "(IILandroid/graphics/Bitmap$CompressFormat;I)V", "compressor_release"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: xe.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13794b implements InterfaceC13793a {

    /* renamed from: a */
    private boolean f35561a;

    /* renamed from: b */
    private final int f35562b;

    /* renamed from: c */
    private final int f35563c;

    /* renamed from: d */
    private final Bitmap.CompressFormat f35564d;

    /* renamed from: e */
    private final int f35565e;

    public C13794b(int i, int i2, Bitmap.CompressFormat format, int i3) {
        C9612q.m13916i(format, "format");
        this.f35562b = i;
        this.f35563c = i2;
        this.f35564d = format;
        this.f35565e = i3;
    }

    @Override // p426xe.InterfaceC13793a
    public boolean isSatisfied(File imageFile) {
        C9612q.m13916i(imageFile, "imageFile");
        return this.f35561a;
    }

    @Override // p426xe.InterfaceC13793a
    public File satisfy(File imageFile) {
        C9612q.m13916i(imageFile, "imageFile");
        File m2282j = C13534c.m2282j(imageFile, C13534c.m2286f(imageFile, C13534c.m2287e(imageFile, this.f35562b, this.f35563c)), this.f35564d, this.f35565e);
        this.f35561a = true;
        return m2282j;
    }
}