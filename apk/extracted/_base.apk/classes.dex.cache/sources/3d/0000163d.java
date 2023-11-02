package com.discord.core;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Size;
import android.widget.ImageView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.discord.crash_reporting.CrashReporting;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.AbstractC9760i2;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9810j;
import kotlinx.coroutines.CoroutineScope;
import p304qf.C11889v;
import p388vf.C13277d;
import pf.C11586t;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.core.LocalImageThumbnailView$setLocalImageSource$1", m13986f = "LocalImageThumbnailView.kt", m13985l = {82, 101}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class LocalImageThumbnailView$setLocalImageSource$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $heightDp;
    final /* synthetic */ Uri $uri;
    final /* synthetic */ int $widthDp;
    int label;
    final /* synthetic */ LocalImageThumbnailView this$0;

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.core.LocalImageThumbnailView$setLocalImageSource$1$1", m13986f = "LocalImageThumbnailView.kt", m13985l = {}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.core.LocalImageThumbnailView$setLocalImageSource$1$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C31301 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ boolean $isBitmapEmpty;
        final /* synthetic */ Uri $uri;
        int label;
        final /* synthetic */ LocalImageThumbnailView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31301(LocalImageThumbnailView localImageThumbnailView, boolean z, Uri uri, Bitmap bitmap, Continuation<? super C31301> continuation) {
            super(2, continuation);
            this.this$0 = localImageThumbnailView;
            this.$isBitmapEmpty = z;
            this.$uri = uri;
            this.$bitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31301(this.this$0, this.$isBitmapEmpty, this.$uri, this.$bitmap, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31301) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            ImageView imageView;
            SimpleDraweeView simpleDraweeView;
            C13277d.m2869d();
            if (this.label == 0) {
                C11586t.m7586b(obj);
                this.this$0.toggleImages(this.$isBitmapEmpty);
                if (this.$isBitmapEmpty) {
                    LocalImageThumbnailView localImageThumbnailView = this.this$0;
                    simpleDraweeView = localImageThumbnailView.simpleDraweeView;
                    localImageThumbnailView.loadDefaultBitmap(simpleDraweeView, this.$uri);
                } else {
                    imageView = this.this$0.imageView;
                    imageView.setImageBitmap(this.$bitmap);
                }
                return Unit.f25302a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.core.LocalImageThumbnailView$setLocalImageSource$1$2", m13986f = "LocalImageThumbnailView.kt", m13985l = {}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.core.LocalImageThumbnailView$setLocalImageSource$1$2 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C31312 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Uri $uri;
        int label;
        final /* synthetic */ LocalImageThumbnailView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31312(LocalImageThumbnailView localImageThumbnailView, Uri uri, Continuation<? super C31312> continuation) {
            super(2, continuation);
            this.this$0 = localImageThumbnailView;
            this.$uri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31312(this.this$0, this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31312) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            SimpleDraweeView simpleDraweeView;
            C13277d.m2869d();
            if (this.label == 0) {
                C11586t.m7586b(obj);
                this.this$0.toggleImages(true);
                LocalImageThumbnailView localImageThumbnailView = this.this$0;
                simpleDraweeView = localImageThumbnailView.simpleDraweeView;
                localImageThumbnailView.loadDefaultBitmap(simpleDraweeView, this.$uri);
                return Unit.f25302a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalImageThumbnailView$setLocalImageSource$1(int i, int i2, LocalImageThumbnailView localImageThumbnailView, Uri uri, Continuation<? super LocalImageThumbnailView$setLocalImageSource$1> continuation) {
        super(2, continuation);
        this.$widthDp = i;
        this.$heightDp = i2;
        this.this$0 = localImageThumbnailView;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalImageThumbnailView$setLocalImageSource$1(this.$widthDp, this.$heightDp, this.this$0, this.$uri, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LocalImageThumbnailView$setLocalImageSource$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        Map m6751k;
        Size size;
        Bitmap thumbnail;
        int i;
        boolean z;
        boolean z2;
        m2869d = C13277d.m2869d();
        int i2 = this.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        C11586t.m7586b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C11586t.m7586b(obj);
                }
            } else {
                C11586t.m7586b(obj);
                int dpToPx = SizeUtilsKt.getDpToPx(this.$widthDp);
                int dpToPx2 = SizeUtilsKt.getDpToPx(this.$heightDp);
                if (dpToPx != 0 && dpToPx2 != 0) {
                    size = new Size(dpToPx, dpToPx2);
                } else {
                    size = new Size(ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION, ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION);
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    thumbnail = this.this$0.getContext().getContentResolver().loadThumbnail(this.$uri, size, null);
                } else {
                    ContentResolver contentResolver = this.this$0.getContext().getContentResolver();
                    String lastPathSegment = this.$uri.getLastPathSegment();
                    C9612q.m13920e(lastPathSegment);
                    thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, Long.parseLong(lastPathSegment), 1, null);
                }
                Bitmap bitmap = thumbnail;
                if (bitmap != null) {
                    i = bitmap.getAllocationByteCount();
                } else {
                    i = 0;
                }
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC9760i2 m13568c = C9677b1.m13568c();
                LocalImageThumbnailView localImageThumbnailView = this.this$0;
                if (z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C31301 c31301 = new C31301(localImageThumbnailView, z2, this.$uri, bitmap, null);
                this.label = 1;
                if (C9810j.m13190g(m13568c, c31301, this) == m2869d) {
                    return m2869d;
                }
            }
        } catch (Exception e) {
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            m6751k = C11889v.m6751k(C11591x.m7577a("exception", e.toString()), C11591x.m7577a("url", this.$uri.toString()));
            CrashReporting.addBreadcrumb$default(crashReporting, "DCDLocalImageThumbnail - Failed to load thumbnail", m6751k, null, 4, null);
            AbstractC9760i2 m13568c2 = C9677b1.m13568c();
            C31312 c31312 = new C31312(this.this$0, this.$uri, null);
            this.label = 2;
            if (C9810j.m13190g(m13568c2, c31312, this) == m2869d) {
                return m2869d;
            }
        }
        return Unit.f25302a;
    }
}