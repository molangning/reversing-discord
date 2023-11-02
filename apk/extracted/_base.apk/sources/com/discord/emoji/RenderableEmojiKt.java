package com.discord.emoji;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import com.discord.emoji.RenderableEmoji;
import com.facebook.drawee.controller.AbstractC3591a;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p208l3.C10035c;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aP\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u001aH\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u001aZ\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¨\u0006\u0014"}, m14357d2 = {"Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "builder", "Lcom/discord/emoji/RenderableEmoji;", "emoji", "Landroid/content/Context;", "context", "", "sizePx", "", "allowAnimation", "verticalAlignment", "Lkotlin/Function1;", "Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;", "", "additionalBuilderActions", "renderEmojiInto", "renderEmoji", "", "src", "contentDescription", "emoji_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class RenderableEmojiKt {
    public static final DraweeSpanStringBuilder renderEmoji(RenderableEmoji emoji, Context context, int i, boolean z, int i2, Function1<? super GenericDraweeHierarchyBuilder, Unit> additionalBuilderActions) {
        C9612q.m13917h(emoji, "emoji");
        C9612q.m13917h(context, "context");
        C9612q.m13917h(additionalBuilderActions, "additionalBuilderActions");
        DraweeSpanStringBuilder draweeSpanStringBuilder = new DraweeSpanStringBuilder();
        renderEmojiInto(draweeSpanStringBuilder, emoji, context, i, z, i2, additionalBuilderActions);
        return draweeSpanStringBuilder;
    }

    public static /* synthetic */ DraweeSpanStringBuilder renderEmoji$default(RenderableEmoji renderableEmoji, Context context, int i, boolean z, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            i2 = 2;
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            function1 = RenderableEmojiKt$renderEmoji$1.INSTANCE;
        }
        return renderEmoji(renderableEmoji, context, i, z, i4, function1);
    }

    public static final void renderEmojiInto(DraweeSpanStringBuilder builder, RenderableEmoji emoji, Context context, int i, boolean z, int i2, Function1<? super GenericDraweeHierarchyBuilder, Unit> additionalBuilderActions) {
        String exception;
        C9612q.m13917h(builder, "builder");
        C9612q.m13917h(emoji, "emoji");
        C9612q.m13917h(context, "context");
        C9612q.m13917h(additionalBuilderActions, "additionalBuilderActions");
        SpannableStringBuilder spannableStringBuilder = null;
        RenderableEmoji.Unicode unicode = emoji instanceof RenderableEmoji.Unicode ? (RenderableEmoji.Unicode) emoji : null;
        if (unicode != null && (exception = unicode.getException()) != null) {
            spannableStringBuilder = builder.append((CharSequence) exception);
        }
        if (spannableStringBuilder == null) {
            renderEmojiInto(builder, emoji.getUrl(z, i), emoji.getContentDescription(), context, i, z, i2, additionalBuilderActions);
        }
    }

    public static /* synthetic */ void renderEmojiInto$default(DraweeSpanStringBuilder draweeSpanStringBuilder, RenderableEmoji renderableEmoji, Context context, int i, boolean z, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = 2;
        }
        int i4 = i2;
        if ((i3 & 64) != 0) {
            function1 = RenderableEmojiKt$renderEmojiInto$1.INSTANCE;
        }
        renderEmojiInto(draweeSpanStringBuilder, renderableEmoji, context, i, z, i4, function1);
    }

    public static final void renderEmojiInto(DraweeSpanStringBuilder draweeSpanStringBuilder, String str, String str2, Context context, int i, boolean z, int i2, Function1<? super GenericDraweeHierarchyBuilder, Unit> function1) {
        int length = draweeSpanStringBuilder.length();
        draweeSpanStringBuilder.append((char) 8203);
        AbstractC3591a build = C10035c.m12506g().m31598z(z).m31625D(ImageRequestBuilder.m30567s(Uri.parse(str)).m30591E(new ResizeOptions(i, i)).m30560z(ImageRequest.RequestLevel.FULL_FETCH).m30585a()).m31627B(str2).build();
        GenericDraweeHierarchyBuilder m31425w = GenericDraweeHierarchyBuilder.m31427u(context.getResources()).m31425w(ScalingUtils.ScaleType.f9840e);
        function1.invoke(m31425w);
        draweeSpanStringBuilder.m31374j(context, m31425w.m31447a(), build, length, i, i, false, i2);
    }
}
