package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.C3874a;
import com.facebook.imageutils.C3877c;
import com.facebook.soloader.InterfaceC4303e;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import p075e3.C6104f;
import p170j4.C8792b;
import p380v4.C13065e;
import p394w2.C13372f;
import p394w2.C13379j;
import p414x2.C13677a;
import p455z2.C14081i;
import p455z2.InterfaceC14078g;
import p455z2.InterfaceC14080h;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class LocalExifThumbnailProducer implements InterfaceC3869z0<C13065e> {

    /* renamed from: a */
    private final Executor f10552a;

    /* renamed from: b */
    private final InterfaceC14080h f10553b;

    /* renamed from: c */
    private final ContentResolver f10554c;

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC4303e
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class Api24Utils {
        private Api24Utils() {
        }

        /* renamed from: a */
        ExifInterface m30901a(FileDescriptor fileDescriptor) {
            if (Build.VERSION.SDK_INT >= 24) {
                return new ExifInterface(fileDescriptor);
            }
            return null;
        }

        /* synthetic */ Api24Utils(LocalExifThumbnailProducer localExifThumbnailProducer, C3754a c3754a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3754a extends AbstractC3838s0<C13065e> {

        /* renamed from: o */
        final /* synthetic */ ImageRequest f10556o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3754a(Consumer consumer, InterfaceC3820n0 interfaceC3820n0, ProducerContext producerContext, String str, ImageRequest imageRequest) {
            super(consumer, interfaceC3820n0, producerContext, str);
            this.f10556o = imageRequest;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p359u2.AbstractRunnableC12826g
        /* renamed from: j */
        public void mo3858b(C13065e c13065e) {
            C13065e.m3335i(c13065e);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3838s0
        /* renamed from: k */
        public Map<String, String> mo30654i(C13065e c13065e) {
            return C13372f.m2695of("createdThumbnail", Boolean.toString(c13065e != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p359u2.AbstractRunnableC12826g
        /* renamed from: l */
        public C13065e mo3857c() {
            ExifInterface m30903g = LocalExifThumbnailProducer.this.m30903g(this.f10556o.getSourceUri());
            if (m30903g != null && m30903g.hasThumbnail()) {
                return LocalExifThumbnailProducer.this.m30905e(LocalExifThumbnailProducer.this.f10553b.mo718d((byte[]) C13379j.m2677g(m30903g.getThumbnail())), m30903g);
            }
            return null;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C3755b extends C3772e {

        /* renamed from: a */
        final /* synthetic */ AbstractC3838s0 f10558a;

        C3755b(AbstractC3838s0 abstractC3838s0) {
            this.f10558a = abstractC3838s0;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC3817m0
        /* renamed from: b */
        public void mo30638b() {
            this.f10558a.m3859a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, InterfaceC14080h interfaceC14080h, ContentResolver contentResolver) {
        this.f10552a = executor;
        this.f10553b = interfaceC14080h;
        this.f10554c = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public C13065e m30905e(InterfaceC14078g interfaceC14078g, ExifInterface exifInterface) {
        int i;
        Pair<Integer, Integer> m30556a = C3874a.m30556a(new C14081i(interfaceC14078g));
        int m30902h = m30902h(exifInterface);
        int i2 = -1;
        if (m30556a != null) {
            i = ((Integer) m30556a.first).intValue();
        } else {
            i = -1;
        }
        if (m30556a != null) {
            i2 = ((Integer) m30556a.second).intValue();
        }
        CloseableReference m31726R = CloseableReference.m31726R(interfaceC14078g);
        try {
            C13065e c13065e = new C13065e(m31726R);
            CloseableReference.m31715v(m31726R);
            c13065e.m3351F0(C8792b.f23081a);
            c13065e.m3350G0(m30902h);
            c13065e.m3346I0(i);
            c13065e.m3352E0(i2);
            return c13065e;
        } catch (Throwable th2) {
            CloseableReference.m31715v(m31726R);
            throw th2;
        }
    }

    /* renamed from: h */
    private int m30902h(ExifInterface exifInterface) {
        return C3877c.m30549a(Integer.parseInt((String) C13379j.m2677g(exifInterface.getAttribute("Orientation"))));
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3869z0
    /* renamed from: a */
    public boolean mo30599a(ResizeOptions resizeOptions) {
        return C3760a1.m30894b(512, 512, resizeOptions);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<C13065e> consumer, ProducerContext producerContext) {
        InterfaceC3820n0 mo30854i = producerContext.mo30854i();
        ImageRequest mo30851l = producerContext.mo30851l();
        producerContext.mo30858e("local", "exif");
        C3754a c3754a = new C3754a(consumer, mo30854i, producerContext, "LocalExifThumbnailProducer", mo30851l);
        producerContext.mo30860c(new C3755b(c3754a));
        this.f10552a.execute(c3754a);
    }

    /* renamed from: f */
    boolean m30904f(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.canRead()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    ExifInterface m30903g(Uri uri) {
        String m23571b = C6104f.m23571b(this.f10554c, uri);
        if (m23571b == null) {
            return null;
        }
        try {
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            C13677a.m1858f(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
        if (m30904f(m23571b)) {
            return new ExifInterface(m23571b);
        }
        AssetFileDescriptor m23572a = C6104f.m23572a(this.f10554c, uri);
        if (m23572a != null && Build.VERSION.SDK_INT >= 24) {
            ExifInterface m30901a = new Api24Utils(this, null).m30901a(m23572a.getFileDescriptor());
            m23572a.close();
            return m30901a;
        }
        return null;
    }
}
