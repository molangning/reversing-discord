package sd;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.facebook.react.util.JSStackTrace;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import p248nd.C10575c;

/* renamed from: sd.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12455b implements InterfaceC12459d {

    /* renamed from: i */
    private static final String f32405i = "b";

    /* renamed from: a */
    LinkedList<C12457b> f32406a;

    /* renamed from: b */
    boolean f32407b;

    /* renamed from: c */
    MediaMuxer f32408c;

    /* renamed from: d */
    private MediaFormat[] f32409d;

    /* renamed from: e */
    private ParcelFileDescriptor f32410e;

    /* renamed from: f */
    private String f32411f;

    /* renamed from: g */
    private int f32412g;

    /* renamed from: h */
    private int f32413h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sd.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C12457b {

        /* renamed from: a */
        private int f32414a;

        /* renamed from: b */
        private ByteBuffer f32415b;

        /* renamed from: c */
        private MediaCodec.BufferInfo f32416c;

        private C12457b(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.f32414a = i;
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            this.f32416c = bufferInfo2;
            bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
            this.f32415b = allocate;
            allocate.put(byteBuffer);
            this.f32415b.flip();
        }
    }

    public C12455b(Context context, Uri uri, int i, int i2, int i3) {
        MediaMuxer mediaMuxer;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rwt");
                this.f32410e = openFileDescriptor;
                if (openFileDescriptor != null) {
                    mediaMuxer = new MediaMuxer(this.f32410e.getFileDescriptor(), i3);
                } else {
                    throw new IOException("Inaccessible URI " + uri);
                }
            } else if (JSStackTrace.FILE_KEY.equalsIgnoreCase(uri.getScheme()) && uri.getPath() != null) {
                mediaMuxer = new MediaMuxer(uri.getPath(), i3);
            } else {
                throw new C10575c(C10575c.EnumC10576a.UNSUPPORTED_URI_TYPE, uri, i3, new Throwable());
            }
            m5228d(mediaMuxer, i, i2);
        } catch (IOException e) {
            m5227e();
            throw new C10575c(C10575c.EnumC10576a.IO_FAILUE, uri, i3, e);
        } catch (IllegalArgumentException e2) {
            throw new C10575c(C10575c.EnumC10576a.INVALID_PARAMS, uri, i3, e2);
        }
    }

    /* renamed from: d */
    private void m5228d(MediaMuxer mediaMuxer, int i, int i2) {
        this.f32413h = i;
        this.f32408c = mediaMuxer;
        mediaMuxer.setOrientationHint(i2);
        this.f32412g = 0;
        this.f32407b = false;
        this.f32406a = new LinkedList<>();
        this.f32409d = new MediaFormat[i];
    }

    /* renamed from: e */
    private void m5227e() {
        try {
            ParcelFileDescriptor parcelFileDescriptor = this.f32410e;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
                this.f32410e = null;
            }
        } catch (IOException unused) {
        }
    }

    @Override // sd.InterfaceC12459d
    /* renamed from: a */
    public String mo5223a() {
        String str = this.f32411f;
        return str != null ? str : "";
    }

    @Override // sd.InterfaceC12459d
    /* renamed from: b */
    public void mo5222b(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f32407b) {
            if (byteBuffer == null) {
                Log.e(f32405i, "Trying to write a null buffer, skipping");
                return;
            } else {
                this.f32408c.writeSampleData(i, byteBuffer, bufferInfo);
                return;
            }
        }
        this.f32406a.addLast(new C12457b(i, byteBuffer, bufferInfo));
    }

    @Override // sd.InterfaceC12459d
    /* renamed from: c */
    public int mo5221c(MediaFormat mediaFormat, int i) {
        this.f32409d[i] = mediaFormat;
        int i2 = this.f32412g + 1;
        this.f32412g = i2;
        if (i2 == this.f32413h) {
            Log.d(f32405i, "All tracks added, starting MediaMuxer, writing out " + this.f32406a.size() + " queued samples");
            for (MediaFormat mediaFormat2 : this.f32409d) {
                this.f32408c.addTrack(mediaFormat2);
            }
            this.f32408c.start();
            this.f32407b = true;
            while (!this.f32406a.isEmpty()) {
                C12457b removeFirst = this.f32406a.removeFirst();
                this.f32408c.writeSampleData(removeFirst.f32414a, removeFirst.f32415b, removeFirst.f32416c);
            }
        }
        return i;
    }

    @Override // sd.InterfaceC12459d
    public void release() {
        this.f32408c.release();
        m5227e();
    }
}
