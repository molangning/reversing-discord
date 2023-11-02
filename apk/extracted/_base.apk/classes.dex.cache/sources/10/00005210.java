package p425xd;

import android.util.Log;
import android.util.Size;
import com.mrousavy.camera.core.VideoPipeline;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p425xd.C13788d;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m14357d2 = {"Lxd/e;", "Ljava/io/Closeable;", "Lxd/d;", "", "close", "", "toString", "Lcom/mrousavy/camera/core/VideoPipeline;", "p", "Lcom/mrousavy/camera/core/VideoPipeline;", "m", "()Lcom/mrousavy/camera/core/VideoPipeline;", "videoPipeline", "Lxd/d$b;", "outputType", "", "dynamicRangeProfile", "<init>", "(Lcom/mrousavy/camera/core/VideoPipeline;Lxd/d$b;Ljava/lang/Long;)V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: xd.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13792e extends C13788d {

    /* renamed from: p */
    private final VideoPipeline f35560p;

    public /* synthetic */ C13792e(VideoPipeline videoPipeline, C13788d.EnumC13790b enumC13790b, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoPipeline, enumC13790b, (i & 4) != 0 ? null : l);
    }

    @Override // p425xd.C13788d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Log.i("SurfaceOutput", "Closing " + this.f35560p.m25526q() + 'x' + this.f35560p.m25530i() + " Video Pipeline..");
        this.f35560p.close();
    }

    /* renamed from: m */
    public final VideoPipeline m1523m() {
        return this.f35560p;
    }

    @Override // p425xd.C13788d
    public String toString() {
        return m1531a() + " (" + this.f35560p.m25526q() + " x " + this.f35560p.m25530i() + " in format #" + this.f35560p.m25531h() + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13792e(VideoPipeline videoPipeline, C13788d.EnumC13790b outputType, Long l) {
        super(videoPipeline.m25527o(), new Size(videoPipeline.m25526q(), videoPipeline.m25530i()), outputType, l, false, 16, null);
        C9612q.m13917h(videoPipeline, "videoPipeline");
        C9612q.m13917h(outputType, "outputType");
        this.f35560p = videoPipeline;
    }
}