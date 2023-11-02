package p425xd;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.media.Image;
import android.media.ImageReader;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.mrousavy.camera.C5308g;
import com.mrousavy.camera.core.VideoPipeline;
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.MediaStreamTrack;
import p425xd.C13788d;
import p446yd.C13990f;
import p446yd.C14006q;

@Metadata(m14358d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 02\u00020\u0001:\u0005DEFGHBO\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010A\u001a\u00020@\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010+\u001a\u00020&¢\u0006\u0004\bB\u0010CJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010%\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\f\u0010$R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R(\u00102\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R(\u00106\u001a\u0004\u0018\u0001032\b\u0010-\u001a\u0004\u0018\u0001038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b'\u00105R(\u0010<\u001a\u0004\u0018\u0001072\b\u0010-\u001a\u0004\u0018\u0001078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0011\u0010?\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006I"}, m14357d2 = {"Lxd/b;", "Ljava/io/Closeable;", "", "other", "", "equals", "", "hashCode", "", "close", "", "toString", "j", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "cameraId", "Lxd/b$d;", "k", "Lxd/b$d;", "q", "()Lxd/b$d;", "preview", "Lxd/b$c;", "l", "Lxd/b$c;", "m", "()Lxd/b$c;", "photo", "Lxd/b$e;", "Lxd/b$e;", "v", "()Lxd/b$e;", MediaStreamTrack.VIDEO_TRACK_KIND, "n", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "enableHdr", "Lxd/b$a;", "o", "Lxd/b$a;", "getCallback", "()Lxd/b$a;", "callback", "Lxd/d;", "<set-?>", "p", "Lxd/d;", "s", "()Lxd/d;", "previewOutput", "Lxd/c;", "Lxd/c;", "()Lxd/c;", "photoOutput", "Lxd/e;", "r", "Lxd/e;", "A", "()Lxd/e;", "videoOutput", "t", "()I", "size", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "<init>", "(Ljava/lang/String;Landroid/hardware/camera2/CameraManager;Lxd/b$d;Lxd/b$c;Lxd/b$e;Ljava/lang/Boolean;Lxd/b$a;)V", "a", "b", "c", "d", "e", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: xd.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13781b implements Closeable {

    /* renamed from: s */
    public static final C13783b f35530s = new C13783b(null);

    /* renamed from: j */
    private final String f35531j;

    /* renamed from: k */
    private final C13785d f35532k;

    /* renamed from: l */
    private final C13784c f35533l;

    /* renamed from: m */
    private final C13786e f35534m;

    /* renamed from: n */
    private final Boolean f35535n;

    /* renamed from: o */
    private final InterfaceC13782a f35536o;

    /* renamed from: p */
    private C13788d f35537p;

    /* renamed from: q */
    private C13787c f35538q;

    /* renamed from: r */
    private C13792e f35539r;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m14357d2 = {"Lxd/b$a;", "", "Landroid/media/Image;", "image", "", "a", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: xd.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC13782a {
        /* renamed from: a */
        void mo1538a(Image image);
    }

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m14357d2 = {"Lxd/b$b;", "", "", "PHOTO_OUTPUT_BUFFER_SIZE", "I", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: xd.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13783b {
        private C13783b() {
        }

        public /* synthetic */ C13783b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lxd/b$d;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroid/view/Surface;", "a", "Landroid/view/Surface;", "()Landroid/view/Surface;", "surface", "<init>", "(Landroid/view/Surface;)V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: xd.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13785d {

        /* renamed from: a */
        private final Surface f35542a;

        public C13785d(Surface surface) {
            C9612q.m13917h(surface, "surface");
            this.f35542a = surface;
        }

        /* renamed from: a */
        public final Surface m1535a() {
            return this.f35542a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13785d) && C9612q.m13922c(this.f35542a, ((C13785d) obj).f35542a);
        }

        public int hashCode() {
            return this.f35542a.hashCode();
        }

        public String toString() {
            return "PreviewOutput(surface=" + this.f35542a + ')';
        }
    }

    public C13781b(String cameraId, CameraManager cameraManager, C13785d c13785d, C13784c c13784c, C13786e c13786e, Boolean bool, InterfaceC13782a callback) {
        boolean z;
        C9612q.m13917h(cameraId, "cameraId");
        C9612q.m13917h(cameraManager, "cameraManager");
        C9612q.m13917h(callback, "callback");
        this.f35531j = cameraId;
        this.f35532k = c13785d;
        this.f35533l = c13784c;
        this.f35534m = c13786e;
        this.f35535n = bool;
        this.f35536o = callback;
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraId);
        C9612q.m13918g(cameraCharacteristics, "cameraManager.getCameraCharacteristics(cameraId)");
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        if (num != null && num.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        Log.i("CameraOutputs", "Preparing Outputs for Camera " + cameraId + "...");
        if (c13785d != null) {
            Log.i("CameraOutputs", "Adding native preview view output.");
            this.f35537p = new C13788d(c13785d.m1535a(), C13990f.m951d(cameraCharacteristics), C13788d.EnumC13790b.PREVIEW, null, false, 24, null);
        }
        if (c13784c != null) {
            Size m933a = C14006q.m933a(C13990f.m952c(cameraCharacteristics, c13784c.m1537a()), c13784c.m1536b());
            ImageReader newInstance = ImageReader.newInstance(m933a.getWidth(), m933a.getHeight(), c13784c.m1537a(), 3);
            C9612q.m13918g(newInstance, "newInstance(size.width, …PHOTO_OUTPUT_BUFFER_SIZE)");
            newInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: xd.a
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    C13781b.m1547h(C13781b.this, imageReader);
                }
            }, C5308g.f15086a.m25511a().m25512c());
            Log.i("CameraOutputs", "Adding " + m933a.getWidth() + 'x' + m933a.getHeight() + " photo output. (Format: " + c13784c.m1537a() + ')');
            this.f35538q = new C13787c(newInstance, C13788d.EnumC13790b.PHOTO, null, 4, null);
        }
        if (c13786e != null) {
            Size m933a2 = C14006q.m933a(C13990f.m950e(cameraCharacteristics, cameraId, c13786e.m1533b()), c13786e.m1532c());
            VideoPipeline videoPipeline = new VideoPipeline(m933a2.getWidth(), m933a2.getHeight(), c13786e.m1533b(), z);
            Log.i("CameraOutputs", "Adding " + m933a2.getWidth() + 'x' + m933a2.getHeight() + " video output. (Format: " + c13786e.m1533b() + ')');
            this.f35539r = new C13792e(videoPipeline, C13788d.EnumC13790b.VIDEO, null, 4, null);
        }
        Log.i("CameraOutputs", "Prepared " + m1540t() + " Outputs for Camera " + cameraId + '!');
    }

    /* renamed from: h */
    public static final void m1547h(C13781b this$0, ImageReader imageReader) {
        C9612q.m13917h(this$0, "this$0");
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage == null) {
            return;
        }
        this$0.f35536o.mo1538a(acquireLatestImage);
    }

    /* renamed from: A */
    public final C13792e m1549A() {
        return this.f35539r;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C13787c c13787c = this.f35538q;
        if (c13787c != null) {
            c13787c.close();
        }
        C13792e c13792e = this.f35539r;
        if (c13792e != null) {
            c13792e.close();
        }
    }

    public boolean equals(Object obj) {
        Surface surface;
        Surface surface2;
        Size size;
        Size size2;
        Integer num;
        Integer num2;
        Boolean bool;
        Boolean bool2;
        Size size3;
        Size size4;
        Integer num3;
        if (!(obj instanceof C13781b)) {
            return false;
        }
        C13781b c13781b = (C13781b) obj;
        if (!C9612q.m13922c(this.f35531j, c13781b.f35531j)) {
            return false;
        }
        C13785d c13785d = this.f35532k;
        Integer num4 = null;
        if (c13785d != null) {
            surface = c13785d.m1535a();
        } else {
            surface = null;
        }
        C13785d c13785d2 = c13781b.f35532k;
        if (c13785d2 != null) {
            surface2 = c13785d2.m1535a();
        } else {
            surface2 = null;
        }
        if (!C9612q.m13922c(surface, surface2)) {
            return false;
        }
        C13784c c13784c = this.f35533l;
        if (c13784c != null) {
            size = c13784c.m1536b();
        } else {
            size = null;
        }
        C13784c c13784c2 = c13781b.f35533l;
        if (c13784c2 != null) {
            size2 = c13784c2.m1536b();
        } else {
            size2 = null;
        }
        if (!C9612q.m13922c(size, size2)) {
            return false;
        }
        C13784c c13784c3 = this.f35533l;
        if (c13784c3 != null) {
            num = Integer.valueOf(c13784c3.m1537a());
        } else {
            num = null;
        }
        C13784c c13784c4 = c13781b.f35533l;
        if (c13784c4 != null) {
            num2 = Integer.valueOf(c13784c4.m1537a());
        } else {
            num2 = null;
        }
        if (!C9612q.m13922c(num, num2)) {
            return false;
        }
        C13786e c13786e = this.f35534m;
        if (c13786e != null) {
            bool = Boolean.valueOf(c13786e.m1534a());
        } else {
            bool = null;
        }
        C13786e c13786e2 = c13781b.f35534m;
        if (c13786e2 != null) {
            bool2 = Boolean.valueOf(c13786e2.m1534a());
        } else {
            bool2 = null;
        }
        if (!C9612q.m13922c(bool, bool2)) {
            return false;
        }
        C13786e c13786e3 = this.f35534m;
        if (c13786e3 != null) {
            size3 = c13786e3.m1532c();
        } else {
            size3 = null;
        }
        C13786e c13786e4 = c13781b.f35534m;
        if (c13786e4 != null) {
            size4 = c13786e4.m1532c();
        } else {
            size4 = null;
        }
        if (!C9612q.m13922c(size3, size4)) {
            return false;
        }
        C13786e c13786e5 = this.f35534m;
        if (c13786e5 != null) {
            num3 = Integer.valueOf(c13786e5.m1533b());
        } else {
            num3 = null;
        }
        C13786e c13786e6 = c13781b.f35534m;
        if (c13786e6 != null) {
            num4 = Integer.valueOf(c13786e6.m1533b());
        }
        if (!C9612q.m13922c(num3, num4) || !C9612q.m13922c(this.f35535n, c13781b.f35535n)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.f35531j.hashCode();
        C13785d c13785d = this.f35532k;
        int i3 = 0;
        if (c13785d != null) {
            i = c13785d.hashCode();
        } else {
            i = 0;
        }
        int i4 = hashCode + i;
        C13784c c13784c = this.f35533l;
        if (c13784c != null) {
            i2 = c13784c.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = i4 + i2;
        C13786e c13786e = this.f35534m;
        if (c13786e != null) {
            i3 = c13786e.hashCode();
        }
        return i5 + i3;
    }

    /* renamed from: i */
    public final String m1546i() {
        return this.f35531j;
    }

    /* renamed from: j */
    public final Boolean m1545j() {
        return this.f35535n;
    }

    /* renamed from: m */
    public final C13784c m1544m() {
        return this.f35533l;
    }

    /* renamed from: o */
    public final C13787c m1543o() {
        return this.f35538q;
    }

    /* renamed from: q */
    public final C13785d m1542q() {
        return this.f35532k;
    }

    /* renamed from: s */
    public final C13788d m1541s() {
        return this.f35537p;
    }

    /* renamed from: t */
    public final int m1540t() {
        int i;
        if (this.f35537p != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f35538q != null) {
            i++;
        }
        if (this.f35539r != null) {
            return i + 1;
        }
        return i;
    }

    public String toString() {
        String m14046d0;
        ArrayList arrayList = new ArrayList();
        C13788d c13788d = this.f35537p;
        if (c13788d != null) {
            arrayList.add(c13788d.toString());
        }
        C13787c c13787c = this.f35538q;
        if (c13787c != null) {
            arrayList.add(c13787c.toString());
        }
        C13792e c13792e = this.f35539r;
        if (c13792e != null) {
            arrayList.add(c13792e.toString());
        }
        m14046d0 = C9553r.m14046d0(arrayList, ", ", "[", "]", 0, null, null, 56, null);
        return m14046d0;
    }

    /* renamed from: v */
    public final C13786e m1539v() {
        return this.f35534m;
    }

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, m14357d2 = {"Lxd/b$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroid/util/Size;", "a", "Landroid/util/Size;", "b", "()Landroid/util/Size;", "targetSize", "I", "()I", "format", "<init>", "(Landroid/util/Size;I)V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: xd.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13784c {

        /* renamed from: a */
        private final Size f35540a;

        /* renamed from: b */
        private final int f35541b;

        public C13784c() {
            this(null, 0, 3, null);
        }

        public C13784c(Size size, int i) {
            this.f35540a = size;
            this.f35541b = i;
        }

        /* renamed from: a */
        public final int m1537a() {
            return this.f35541b;
        }

        /* renamed from: b */
        public final Size m1536b() {
            return this.f35540a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13784c) {
                C13784c c13784c = (C13784c) obj;
                return C9612q.m13922c(this.f35540a, c13784c.f35540a) && this.f35541b == c13784c.f35541b;
            }
            return false;
        }

        public int hashCode() {
            Size size = this.f35540a;
            return ((size == null ? 0 : size.hashCode()) * 31) + this.f35541b;
        }

        public String toString() {
            return "PhotoOutput(targetSize=" + this.f35540a + ", format=" + this.f35541b + ')';
        }

        public /* synthetic */ C13784c(Size size, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : size, (i2 & 2) != 0 ? 256 : i);
        }
    }

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u000f\u0010\u0019¨\u0006\u001d"}, m14357d2 = {"Lxd/b$e;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroid/util/Size;", "a", "Landroid/util/Size;", "c", "()Landroid/util/Size;", "targetSize", "b", "Z", "()Z", "enableRecording", "Ljava/lang/Boolean;", "getEnableFrameProcessor", "()Ljava/lang/Boolean;", "enableFrameProcessor", "d", "I", "()I", "format", "<init>", "(Landroid/util/Size;ZLjava/lang/Boolean;I)V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: xd.b$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13786e {

        /* renamed from: a */
        private final Size f35543a;

        /* renamed from: b */
        private final boolean f35544b;

        /* renamed from: c */
        private final Boolean f35545c;

        /* renamed from: d */
        private final int f35546d;

        public C13786e() {
            this(null, false, null, 0, 15, null);
        }

        public C13786e(Size size, boolean z, Boolean bool, int i) {
            this.f35543a = size;
            this.f35544b = z;
            this.f35545c = bool;
            this.f35546d = i;
        }

        /* renamed from: a */
        public final boolean m1534a() {
            return this.f35544b;
        }

        /* renamed from: b */
        public final int m1533b() {
            return this.f35546d;
        }

        /* renamed from: c */
        public final Size m1532c() {
            return this.f35543a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13786e) {
                C13786e c13786e = (C13786e) obj;
                return C9612q.m13922c(this.f35543a, c13786e.f35543a) && this.f35544b == c13786e.f35544b && C9612q.m13922c(this.f35545c, c13786e.f35545c) && this.f35546d == c13786e.f35546d;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            Size size = this.f35543a;
            int hashCode = (size == null ? 0 : size.hashCode()) * 31;
            boolean z = this.f35544b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            Boolean bool = this.f35545c;
            return ((i2 + (bool != null ? bool.hashCode() : 0)) * 31) + this.f35546d;
        }

        public String toString() {
            return "VideoOutput(targetSize=" + this.f35543a + ", enableRecording=" + this.f35544b + ", enableFrameProcessor=" + this.f35545c + ", format=" + this.f35546d + ')';
        }

        public /* synthetic */ C13786e(Size size, boolean z, Boolean bool, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : size, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? Boolean.FALSE : bool, (i2 & 8) != 0 ? 34 : i);
        }
    }
}