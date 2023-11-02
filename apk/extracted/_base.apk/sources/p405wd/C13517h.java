package p405wd;

import android.media.Image;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9915y;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.Job;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082\u0002J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000bR<\u0010\u0011\u001a*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000ej\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m14357d2 = {"Lwd/h;", "", "", "key", "Lkotlinx/coroutines/CompletableDeferred;", "Landroid/media/Image;", "c", "timestamp", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "image", "", "d", "b", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "photoOutputQueue", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: wd.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13517h {

    /* renamed from: a */
    private final HashMap<Long, CompletableDeferred<Image>> f34866a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.core.PhotoOutputSynchronizer", m13986f = "PhotoOutputSynchronizer.kt", m13985l = {17}, m13984m = "await")
    /* renamed from: wd.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13518a extends AbstractC9570d {

        /* renamed from: j */
        Object f34867j;

        /* renamed from: k */
        long f34868k;

        /* renamed from: l */
        /* synthetic */ Object f34869l;

        /* renamed from: n */
        int f34871n;

        C13518a(Continuation<? super C13518a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f34869l = obj;
            this.f34871n |= Integer.MIN_VALUE;
            return C13517h.this.m2311a(0L, this);
        }
    }

    /* renamed from: c */
    private final CompletableDeferred<Image> m2309c(long j) {
        if (!this.f34866a.containsKey(Long.valueOf(j))) {
            this.f34866a.put(Long.valueOf(j), C9915y.m12965b(null, 1, null));
        }
        CompletableDeferred<Image> completableDeferred = this.f34866a.get(Long.valueOf(j));
        C9612q.m13920e(completableDeferred);
        return completableDeferred;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2311a(long r5, kotlin.coroutines.Continuation<? super android.media.Image> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p405wd.C13517h.C13518a
            if (r0 == 0) goto L13
            r0 = r7
            wd.h$a r0 = (p405wd.C13517h.C13518a) r0
            int r1 = r0.f34871n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34871n = r1
            goto L18
        L13:
            wd.h$a r0 = new wd.h$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34869l
            java.lang.Object r1 = p388vf.C13271b.m2873d()
            int r2 = r0.f34871n
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r5 = r0.f34868k
            java.lang.Object r0 = r0.f34867j
            wd.h r0 = (p405wd.C13517h) r0
            pf.C11586t.m7586b(r7)
            goto L4c
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            pf.C11586t.m7586b(r7)
            kotlinx.coroutines.CompletableDeferred r7 = r4.m2309c(r5)
            r0.f34867j = r4
            r0.f34868k = r5
            r0.f34871n = r3
            java.lang.Object r7 = r7.mo12975H(r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            android.media.Image r7 = (android.media.Image) r7
            java.util.HashMap<java.lang.Long, kotlinx.coroutines.CompletableDeferred<android.media.Image>> r0 = r0.f34866a
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.C9568b.m13988d(r5)
            r0.remove(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p405wd.C13517h.m2311a(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: b */
    public final void m2310b() {
        for (Map.Entry<Long, CompletableDeferred<Image>> entry : this.f34866a.entrySet()) {
            Job.C9668a.m13594a(entry.getValue(), null, 1, null);
        }
        this.f34866a.clear();
    }

    /* renamed from: d */
    public final void m2308d(long j, Image image) {
        C9612q.m13917h(image, "image");
        m2309c(j).mo12974V(image);
    }
}
