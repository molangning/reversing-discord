package com.discord.core;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9818l;
import p208l3.C10035c;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\f\u0010\u0016\u001a\u00020\u000e*\u00020\u0017H\u0002J\u0014\u0010\u0018\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m14357d2 = {"Lcom/discord/core/LocalImageThumbnailView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageView", "Landroid/widget/ImageView;", "simpleDraweeView", "Lcom/facebook/drawee/view/SimpleDraweeView;", "setLocalImageSource", "", "uri", "Landroid/net/Uri;", "widthDp", "heightDp", "toggleImages", "showSimpleDraweeView", "", "addToParent", "Landroid/view/View;", "loadDefaultBitmap", "Companion", "core_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class LocalImageThumbnailView extends FrameLayout {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_SIZE = 200;
    private ImageView imageView;
    private SimpleDraweeView simpleDraweeView;

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/core/LocalImageThumbnailView$Companion;", "", "()V", "DEFAULT_SIZE", "", "core_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalImageThumbnailView(Context context) {
        this(context, null, 0, 6, null);
        C9612q.m13917h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalImageThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ LocalImageThumbnailView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void addToParent(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadDefaultBitmap(SimpleDraweeView simpleDraweeView, Uri uri) {
        simpleDraweeView.setController(C10035c.m12506g().m31625D(ImageRequestBuilder.m30567s(uri).m30591E(ResizeOptions.m31190a(simpleDraweeView.getWidth(), simpleDraweeView.getHeight())).m30585a()).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleImages(boolean z) {
        int i;
        SimpleDraweeView simpleDraweeView = this.simpleDraweeView;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        simpleDraweeView.setVisibility(i);
        ImageView imageView = this.imageView;
        if (!(!z)) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
    }

    public final void setLocalImageSource(Uri uri, int i, int i2) {
        C9612q.m13917h(uri, "uri");
        C9818l.m13179d(CoroutineViewUtilsKt.getAttachedScope(this), C9677b1.m13569b(), null, new LocalImageThumbnailView$setLocalImageSource$1(i, i2, this, uri, null), 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalImageThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        ImageView imageView = new ImageView(context);
        addToParent(imageView);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.imageView = imageView;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        addToParent(simpleDraweeView);
        simpleDraweeView.getHierarchy().m31466t(ScalingUtils.ScaleType.f9844i);
        this.simpleDraweeView = simpleDraweeView;
    }
}
