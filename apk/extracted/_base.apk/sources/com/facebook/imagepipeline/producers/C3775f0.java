package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;
import org.webrtc.MediaStreamTrack;
import p075e3.C6104f;
import p257o4.C10986e;
import p380v4.AbstractC13063c;
import p380v4.C13064d;
import p380v4.C13068h;
import p394w2.C13372f;

/* renamed from: com.facebook.imagepipeline.producers.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3775f0 implements InterfaceC3810l0<CloseableReference<AbstractC13063c>> {

    /* renamed from: a */
    private final Executor f10602a;

    /* renamed from: b */
    private final ContentResolver f10603b;

    /* renamed from: com.facebook.imagepipeline.producers.f0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C3776a extends AbstractC3838s0<CloseableReference<AbstractC13063c>> {

        /* renamed from: o */
        final /* synthetic */ InterfaceC3820n0 f10604o;

        /* renamed from: p */
        final /* synthetic */ ProducerContext f10605p;

        /* renamed from: q */
        final /* synthetic */ ImageRequest f10606q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3776a(Consumer consumer, InterfaceC3820n0 interfaceC3820n0, ProducerContext producerContext, String str, InterfaceC3820n0 interfaceC3820n02, ProducerContext producerContext2, ImageRequest imageRequest) {
            super(consumer, interfaceC3820n0, producerContext, str);
            this.f10604o = interfaceC3820n02;
            this.f10605p = producerContext2;
            this.f10606q = imageRequest;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3838s0, p359u2.AbstractRunnableC12826g
        /* renamed from: e */
        public void mo3855e(Exception exc) {
            super.mo3855e(exc);
            this.f10604o.mo1812b(this.f10605p, "VideoThumbnailProducer", false);
            this.f10605p.mo30856g("local");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p359u2.AbstractRunnableC12826g
        /* renamed from: j */
        public void mo3858b(CloseableReference<AbstractC13063c> closeableReference) {
            CloseableReference.m31715v(closeableReference);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3838s0
        /* renamed from: k */
        public Map<String, String> mo30654i(CloseableReference<AbstractC13063c> closeableReference) {
            return C13372f.m2695of("createdThumbnail", String.valueOf(closeableReference != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p359u2.AbstractRunnableC12826g
        /* renamed from: l */
        public CloseableReference<AbstractC13063c> mo3857c() {
            String str;
            Bitmap m30830h;
            try {
                str = C3775f0.this.m30829i(this.f10606q);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                m30830h = ThumbnailUtils.createVideoThumbnail(str, C3775f0.m30831g(this.f10606q));
            } else {
                m30830h = C3775f0.m30830h(C3775f0.this.f10603b, this.f10606q.getSourceUri());
            }
            if (m30830h == null) {
                return null;
            }
            C13064d c13064d = new C13064d(m30830h, C10986e.m9408a(), C13068h.f33869d, 0);
            this.f10605p.mo30861b("image_format", "thumbnail");
            c13064d.m3368m(this.f10605p.getExtras());
            return CloseableReference.m31726R(c13064d);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3838s0, p359u2.AbstractRunnableC12826g
        /* renamed from: m */
        public void mo3854f(CloseableReference<AbstractC13063c> closeableReference) {
            boolean z;
            super.mo3854f(closeableReference);
            InterfaceC3820n0 interfaceC3820n0 = this.f10604o;
            ProducerContext producerContext = this.f10605p;
            if (closeableReference != null) {
                z = true;
            } else {
                z = false;
            }
            interfaceC3820n0.mo1812b(producerContext, "VideoThumbnailProducer", z);
            this.f10605p.mo30856g("local");
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.f0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C3777b extends C3772e {

        /* renamed from: a */
        final /* synthetic */ AbstractC3838s0 f10608a;

        C3777b(AbstractC3838s0 abstractC3838s0) {
            this.f10608a = abstractC3838s0;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC3817m0
        /* renamed from: b */
        public void mo30638b() {
            this.f10608a.m3859a();
        }
    }

    public C3775f0(Executor executor, ContentResolver contentResolver) {
        this.f10602a = executor;
        this.f10603b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static int m30831g(ImageRequest imageRequest) {
        return (imageRequest.getPreferredWidth() > 96 || imageRequest.getPreferredHeight() > 96) ? 1 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static Bitmap m30830h(ContentResolver contentResolver, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(openFileDescriptor.getFileDescriptor());
            return mediaMetadataRetriever.getFrameAtTime(-1L);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public String m30829i(ImageRequest imageRequest) {
        Uri uri;
        String str;
        String[] strArr;
        Uri sourceUri = imageRequest.getSourceUri();
        if (C6104f.m23562k(sourceUri)) {
            return imageRequest.getSourceFile().getPath();
        }
        if (C6104f.m23563j(sourceUri)) {
            if ("com.android.providers.media.documents".equals(sourceUri.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(sourceUri);
                str = "_id=?";
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                strArr = new String[]{documentId.split(":")[1]};
            } else {
                uri = sourceUri;
                str = null;
                strArr = null;
            }
            Cursor query = this.f10603b.query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        return query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (query != null) {
            }
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<CloseableReference<AbstractC13063c>> consumer, ProducerContext producerContext) {
        InterfaceC3820n0 mo30854i = producerContext.mo30854i();
        ImageRequest mo30851l = producerContext.mo30851l();
        producerContext.mo30858e("local", MediaStreamTrack.VIDEO_TRACK_KIND);
        C3776a c3776a = new C3776a(consumer, mo30854i, producerContext, "VideoThumbnailProducer", mo30854i, producerContext, mo30851l);
        producerContext.mo30860c(new C3777b(c3776a));
        this.f10602a.execute(c3776a);
    }
}
