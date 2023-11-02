package com.discord.image.fresco;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.discord.image.fresco.postprocessors.PostProcessor;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.core.DefaultExecutorSupplier;
import com.facebook.imagepipeline.datasource.AbstractC3715b;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9838p;
import kotlinx.coroutines.CancellableContinuation;
import p208l3.C10035c;
import p380v4.AbstractC13063c;
import p388vf.C13272c;
import p388vf.C13277d;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001a6\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001a9\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\r\u001a9\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m14357d2 = {"Landroid/content/Context;", "", "uri", "Lcom/discord/image/fresco/postprocessors/PostProcessor;", "postProcessor", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "onDecodedImage", "fetchDecodedImage", "Landroid/net/Uri;", "", "copyBitmap", "(Landroid/content/Context;Ljava/lang/String;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroid/content/Context;Landroid/net/Uri;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;", "executorSupplier", "Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;", "fresco_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class FrescoFetchDecodedImageKt {
    private static final DefaultExecutorSupplier executorSupplier = new DefaultExecutorSupplier(3);

    public static final void fetchDecodedImage(Context context, String str, PostProcessor postProcessor, Function1<? super Bitmap, Unit> onDecodedImage) {
        Object m7596b;
        C9612q.m13917h(context, "<this>");
        C9612q.m13917h(onDecodedImage, "onDecodedImage");
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            m7596b = C11583s.m7596b(Uri.parse(str));
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        if (C11583s.m7591g(m7596b)) {
            m7596b = null;
        }
        fetchDecodedImage(context, (Uri) m7596b, postProcessor, onDecodedImage);
    }

    public static /* synthetic */ void fetchDecodedImage$default(Context context, String str, PostProcessor postProcessor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            postProcessor = null;
        }
        fetchDecodedImage(context, str, postProcessor, function1);
    }

    public static /* synthetic */ void fetchDecodedImage$default(Context context, Uri uri, PostProcessor postProcessor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            postProcessor = null;
        }
        fetchDecodedImage(context, uri, postProcessor, function1);
    }

    public static final void fetchDecodedImage(Context context, Uri uri, PostProcessor postProcessor, final Function1<? super Bitmap, Unit> onDecodedImage) {
        C9612q.m13917h(context, "<this>");
        C9612q.m13917h(onDecodedImage, "onDecodedImage");
        if (uri == null) {
            onDecodedImage.invoke(null);
        } else {
            C10035c.m12512a().m31179d(ImageRequestBuilder.m30567s(uri).m30595A(postProcessor != null ? postProcessor.create() : null).m30585a(), context).mo31710d(new AbstractC3715b() { // from class: com.discord.image.fresco.FrescoFetchDecodedImageKt$fetchDecodedImage$2
                @Override // com.facebook.datasource.AbstractC3574b
                protected void onFailureImpl(DataSource<CloseableReference<AbstractC13063c>> dataSource) {
                    C9612q.m13917h(dataSource, "dataSource");
                    onDecodedImage.invoke(null);
                }

                @Override // com.facebook.imagepipeline.datasource.AbstractC3715b
                protected void onNewResultImpl(Bitmap bitmap) {
                    onDecodedImage.invoke(bitmap);
                }
            }, executorSupplier.mo6456d());
        }
    }

    public static /* synthetic */ Object fetchDecodedImage$default(Context context, String str, PostProcessor postProcessor, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            postProcessor = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fetchDecodedImage(context, str, postProcessor, z, continuation);
    }

    public static /* synthetic */ Object fetchDecodedImage$default(Context context, Uri uri, PostProcessor postProcessor, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            postProcessor = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fetchDecodedImage(context, uri, postProcessor, z, continuation);
    }

    public static final Object fetchDecodedImage(Context context, String str, PostProcessor postProcessor, boolean z, Continuation<? super Bitmap> continuation) {
        Object m7596b;
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            m7596b = C11583s.m7596b(Uri.parse(str));
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        if (C11583s.m7591g(m7596b)) {
            m7596b = null;
        }
        return fetchDecodedImage(context, (Uri) m7596b, postProcessor, z, continuation);
    }

    public static final Object fetchDecodedImage(Context context, Uri uri, PostProcessor postProcessor, final boolean z, Continuation<? super Bitmap> continuation) {
        Continuation m2870c;
        Object m2869d;
        m2870c = C13272c.m2870c(continuation);
        final C9838p c9838p = new C9838p(m2870c, 1);
        c9838p.m13155C();
        if (uri == null) {
            c9838p.resumeWith(C11583s.m7596b(null));
        } else {
            DataSource<CloseableReference<AbstractC13063c>> m31179d = C10035c.m12512a().m31179d(ImageRequestBuilder.m30567s(uri).m30595A(postProcessor != null ? postProcessor.create() : null).m30585a(), context);
            m31179d.mo31710d(new AbstractC3715b() { // from class: com.discord.image.fresco.FrescoFetchDecodedImageKt$fetchDecodedImage$6$subscriber$1
                @Override // com.facebook.datasource.AbstractC3574b
                protected void onFailureImpl(DataSource<CloseableReference<AbstractC13063c>> dataSource) {
                    C9612q.m13917h(dataSource, "dataSource");
                    c9838p.resumeWith(C11583s.m7596b(null));
                }

                @Override // com.facebook.imagepipeline.datasource.AbstractC3715b
                protected void onNewResultImpl(Bitmap bitmap) {
                    CancellableContinuation<Bitmap> cancellableContinuation = c9838p;
                    C11583s.C11584a c11584a = C11583s.f30090k;
                    if (z && bitmap != null) {
                        bitmap = Bitmap.createBitmap(bitmap);
                    }
                    cancellableContinuation.resumeWith(C11583s.m7596b(bitmap));
                }
            }, executorSupplier.mo6456d());
            c9838p.mo13135l(new FrescoFetchDecodedImageKt$fetchDecodedImage$6$1(m31179d));
        }
        Object m13122y = c9838p.m13122y();
        m2869d = C13277d.m2869d();
        if (m13122y == m2869d) {
            C9573g.m13976c(continuation);
        }
        return m13122y;
    }
}