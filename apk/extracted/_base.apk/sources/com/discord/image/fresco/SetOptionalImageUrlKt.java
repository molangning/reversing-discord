package com.discord.image.fresco;

import android.net.Uri;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.text.C9653o;
import p075e3.C6104f;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a4\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001a\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\f"}, m14357d2 = {"Lcom/facebook/drawee/view/SimpleDraweeView;", "", "imageUrl", "", "autoPlayAnimations", "Lkotlin/Function1;", "Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;", "", ViewProps.TRANSFORM, "setOptionalImageUrl", "url", "hasGif", "fresco_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class SetOptionalImageUrlKt {
    private static final boolean hasGif(String str) {
        String lastPathSegment;
        boolean m13756r;
        Uri m23558o = C6104f.m23558o(str);
        if (m23558o == null || (lastPathSegment = m23558o.getLastPathSegment()) == null) {
            return false;
        }
        m13756r = C9653o.m13756r(lastPathSegment, ".gif", true);
        return m13756r;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void setOptionalImageUrl(com.facebook.drawee.view.SimpleDraweeView r2, java.lang.String r3, boolean r4, kotlin.jvm.functions.Function1<? super com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder, kotlin.Unit> r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9612q.m13917h(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.C9612q.m13917h(r5, r0)
            r0 = 0
            if (r3 == 0) goto L16
            boolean r1 = kotlin.text.C9642f.m13789w(r3)
            if (r1 == 0) goto L14
            goto L16
        L14:
            r1 = r0
            goto L17
        L16:
            r1 = 1
        L17:
            if (r1 != 0) goto L1a
            goto L1c
        L1a:
            r0 = 8
        L1c:
            r2.setVisibility(r0)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r0 = p208l3.C10035c.m12506g()
            com.facebook.imagepipeline.request.ImageRequest r3 = com.facebook.imagepipeline.request.ImageRequest.fromUri(r3)
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r3 = r0.m31625D(r3)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r3 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r3
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r3 = r3.m31598z(r4)
            java.lang.String r4 = "newDraweeControllerBuild…tions(autoPlayAnimations)"
            kotlin.jvm.internal.C9612q.m13918g(r3, r4)
            r5.invoke(r3)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r3 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r3
            com.facebook.drawee.controller.a r3 = r3.build()
            r2.setController(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.image.fresco.SetOptionalImageUrlKt.setOptionalImageUrl(com.facebook.drawee.view.SimpleDraweeView, java.lang.String, boolean, kotlin.jvm.functions.Function1):void");
    }

    public static /* synthetic */ void setOptionalImageUrl$default(SimpleDraweeView simpleDraweeView, String str, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = hasGif(str);
        }
        if ((i & 4) != 0) {
            function1 = SetOptionalImageUrlKt$setOptionalImageUrl$1.INSTANCE;
        }
        setOptionalImageUrl(simpleDraweeView, str, z, function1);
    }
}
