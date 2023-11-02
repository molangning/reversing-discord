package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.PostPreviewEmbedViewBinding;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$1;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$10;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$11;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$2;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$3;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$4;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$5;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$6;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$7;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$8;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$9;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J&\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0002J\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0002J%\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u008f\u0001\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\u00132\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010.\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0010H\u0002J\"\u0010/\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/PostPreviewEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/PostPreviewEmbedViewBinding;", "setButtonColor", "", "ctaButtonColor", "setButtonText", "cta", "", "setCoverImage", "url", "", "blurredThumbnailUrl", "backgroundImageUrl", "setCoverImageButtonText", "coverImageOverlayText", "setFooter", "footer", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "messageId", "Lcom/discord/primitives/MessageId;", "setFooter-Ayv7vGE", "(Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;)V", "setPostPreviewEmbed", "title", "subtitle", "ctaCopy", "thumbnailUrl", "onButtonClickListener", "Landroid/view/View$OnClickListener;", "isSpoiler", "", "isObscureAwaitingScan", "spoilerConfig", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "setPostPreviewEmbed-6_IDHbM", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;ZZLcom/discord/chat/bridge/spoiler/SpoilerConfig;)V", "setSubtitle", "setTitle", "setupSpoilerView", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PostPreviewEmbedView extends ConstraintLayout {
    private final PostPreviewEmbedViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostPreviewEmbedView(Context context) {
        this(context, null, 0, 6, null);
        C9612q.m13917h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostPreviewEmbedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ PostPreviewEmbedView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void setButtonColor(int i) {
        this.binding.cta.setBackgroundColor(i);
    }

    private final void setButtonText(CharSequence charSequence) {
        this.binding.cta.setText(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setCoverImage(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            if (r8 == 0) goto Ld
            boolean r2 = kotlin.text.C9642f.m13789w(r8)
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = r1
            goto Le
        Ld:
            r2 = r0
        Le:
            if (r2 == 0) goto L21
            if (r9 == 0) goto L1b
            boolean r2 = kotlin.text.C9642f.m13789w(r9)
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r2 = r1
            goto L1c
        L1b:
            r2 = r0
        L1c:
            if (r2 != 0) goto L1f
            goto L21
        L1f:
            r2 = r1
            goto L22
        L21:
            r2 = r0
        L22:
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r3 = r7.binding
            com.facebook.drawee.view.SimpleDraweeView r3 = r3.coverImage
            java.lang.String r4 = "binding.coverImage"
            kotlin.jvm.internal.C9612q.m13918g(r3, r4)
            r5 = 8
            if (r2 == 0) goto L31
            r6 = r1
            goto L32
        L31:
            r6 = r5
        L32:
            r3.setVisibility(r6)
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r3 = r7.binding
            com.facebook.drawee.view.SimpleDraweeView r3 = r3.backgroundImage
            java.lang.String r6 = "binding.backgroundImage"
            kotlin.jvm.internal.C9612q.m13918g(r3, r6)
            if (r2 == 0) goto L50
            if (r10 == 0) goto L4b
            boolean r2 = kotlin.text.C9642f.m13789w(r10)
            if (r2 == 0) goto L49
            goto L4b
        L49:
            r2 = r1
            goto L4c
        L4b:
            r2 = r0
        L4c:
            if (r2 != 0) goto L50
            r2 = r0
            goto L51
        L50:
            r2 = r1
        L51:
            if (r2 == 0) goto L54
            r5 = r1
        L54:
            r3.setVisibility(r5)
            if (r8 == 0) goto L62
            boolean r2 = kotlin.text.C9642f.m13789w(r8)
            if (r2 == 0) goto L60
            goto L62
        L60:
            r2 = r1
            goto L63
        L62:
            r2 = r0
        L63:
            if (r2 != 0) goto L9f
            if (r10 == 0) goto L6f
            boolean r9 = kotlin.text.C9642f.m13789w(r10)
            if (r9 == 0) goto L6e
            goto L6f
        L6e:
            r0 = r1
        L6f:
            if (r0 != 0) goto L88
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r9 = r7.binding
            com.facebook.drawee.view.SimpleDraweeView r9 = r9.coverImage
            com.facebook.drawee.interfaces.DraweeHierarchy r9 = r9.getHierarchy()
            com.facebook.drawee.generic.GenericDraweeHierarchy r9 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r9
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r0 = com.facebook.drawee.drawable.ScalingUtils.ScaleType.f9840e
            r9.m31466t(r0)
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r9 = r7.binding
            com.facebook.drawee.view.SimpleDraweeView r9 = r9.backgroundImage
            r9.setImageURI(r10)
            goto L97
        L88:
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r9 = r7.binding
            com.facebook.drawee.view.SimpleDraweeView r9 = r9.coverImage
            com.facebook.drawee.interfaces.DraweeHierarchy r9 = r9.getHierarchy()
            com.facebook.drawee.generic.GenericDraweeHierarchy r9 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r9
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r10 = com.facebook.drawee.drawable.ScalingUtils.ScaleType.f9844i
            r9.m31466t(r10)
        L97:
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r9 = r7.binding
            com.facebook.drawee.view.SimpleDraweeView r9 = r9.coverImage
            r9.setImageURI(r8)
            goto Lb5
        L9f:
            if (r9 == 0) goto La9
            boolean r8 = kotlin.text.C9642f.m13789w(r9)
            if (r8 == 0) goto La8
            goto La9
        La8:
            r0 = r1
        La9:
            if (r0 != 0) goto Lb5
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r8 = r7.binding
            com.facebook.drawee.view.SimpleDraweeView r8 = r8.coverImage
            kotlin.jvm.internal.C9612q.m13918g(r8, r4)
            com.discord.react_asset_fetcher.ReactAssetUtilsKt.setOptionalReactImageUrl(r8, r9)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.PostPreviewEmbedView.setCoverImage(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setCoverImageButtonText(java.lang.String r5) {
        /*
            r4 = this;
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r0 = r4.binding
            com.discord.core.DCDButton r0 = r0.coverImageOverlayButton
            java.lang.String r1 = "setCoverImageButtonText$lambda$5"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L16
            boolean r3 = kotlin.text.C9642f.m13789w(r5)
            if (r3 == 0) goto L14
            goto L16
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            r2 = r2 ^ r3
            if (r2 == 0) goto L1b
            goto L1d
        L1b:
            r1 = 8
        L1d:
            r0.setVisibility(r1)
            r0.setText(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.PostPreviewEmbedView.setCoverImageButtonText(java.lang.String):void");
    }

    /* renamed from: setFooter-Ayv7vGE */
    private final void m41776setFooterAyv7vGE(StructurableText structurableText, String str) {
        DraweeSpanStringBuilder spannable;
        SimpleDraweeSpanTextView setFooter_Ayv7vGE$lambda$4 = this.binding.footer;
        C9612q.m13918g(setFooter_Ayv7vGE$lambda$4, "setFooter_Ayv7vGE$lambda$4");
        Context context = setFooter_Ayv7vGE$lambda$4.getContext();
        Paint.FontMetrics fontMetrics = setFooter_Ayv7vGE$lambda$4.getPaint().getFontMetrics();
        C9612q.m13918g(fontMetrics, "paint.fontMetrics");
        float baselineHeight = TextUtilsKt.getBaselineHeight(fontMetrics);
        TextPaint paint = setFooter_Ayv7vGE$lambda$4.getPaint();
        C9612q.m13918g(context, "context");
        C9612q.m13918g(paint, "paint");
        spannable = TextUtilsKt.toSpannable(structurableText, context, str, false, false, true, paint, (r44 & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : null, (r44 & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : null, (r44 & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : null, (r44 & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r44 & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r44 & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r44 & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : null, (32768 & r44) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (65536 & r44) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : null, (131072 & r44) != 0 ? false : true, (262144 & r44) != 0 ? ThemeManagerKt.getTheme() : null, (r44 & 524288) != 0 ? -1.0f : baselineHeight);
        ViewUtilsKt.setOptionalText(setFooter_Ayv7vGE$lambda$4, spannable);
        NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(setFooter_Ayv7vGE$lambda$4, false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setSubtitle(java.lang.CharSequence r5) {
        /*
            r4 = this;
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r0 = r4.binding
            android.widget.TextView r0 = r0.subtitle
            java.lang.String r1 = "binding.subtitle"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L16
            boolean r3 = kotlin.text.C9642f.m13789w(r5)
            if (r3 == 0) goto L14
            goto L16
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            r2 = r2 ^ r3
            if (r2 == 0) goto L1b
            goto L1d
        L1b:
            r1 = 8
        L1d:
            r0.setVisibility(r1)
            com.discord.chat.databinding.PostPreviewEmbedViewBinding r0 = r4.binding
            android.widget.TextView r0 = r0.subtitle
            r0.setText(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.PostPreviewEmbedView.setSubtitle(java.lang.CharSequence):void");
    }

    private final void setTitle(CharSequence charSequence) {
        this.binding.title.setText(charSequence);
    }

    private final void setupSpoilerView(SpoilerConfig spoilerConfig, boolean z, boolean z2) {
        boolean z3;
        this.binding.spoiler.configure(spoilerConfig, this);
        SpoilerView spoilerView = this.binding.spoiler;
        C9612q.m13918g(spoilerView, "binding.spoiler");
        if (spoilerView.getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.binding.spoiler.handleObscureAwaitingScan(z2);
            FrameLayout frameLayout = this.binding.imageBlurBg;
            C9612q.m13918g(frameLayout, "binding.imageBlurBg");
            frameLayout.setVisibility(0);
            this.binding.coverImage.setImportantForAccessibility(4);
            return;
        }
        FrameLayout frameLayout2 = this.binding.imageBlurBg;
        C9612q.m13918g(frameLayout2, "binding.imageBlurBg");
        frameLayout2.setVisibility(8);
        this.binding.coverImage.setImportantForAccessibility(0);
        if (z) {
            this.binding.coverImage.requestFocus();
        }
    }

    /* renamed from: setPostPreviewEmbed-6_IDHbM */
    public final void m41777setPostPreviewEmbed6_IDHbM(String title, String str, String ctaCopy, int i, StructurableText footer, String messageId, String str2, String str3, String str4, String str5, View.OnClickListener onButtonClickListener, boolean z, boolean z2, SpoilerConfig spoilerConfig) {
        C9612q.m13917h(title, "title");
        C9612q.m13917h(ctaCopy, "ctaCopy");
        C9612q.m13917h(footer, "footer");
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(onButtonClickListener, "onButtonClickListener");
        setButtonText(ctaCopy);
        setButtonColor(i);
        setTitle(title);
        setSubtitle(str);
        m41776setFooterAyv7vGE(footer, messageId);
        setCoverImage(str2, str3, str5);
        setCoverImageButtonText(str4);
        this.binding.cta.setOnClickButtonListener(onButtonClickListener);
        SimpleDraweeView simpleDraweeView = this.binding.coverImage;
        C9612q.m13918g(simpleDraweeView, "binding.coverImage");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView, false, onButtonClickListener, 1, null);
        this.binding.coverImageOverlayButton.setOnClickButtonListener(onButtonClickListener);
        setupSpoilerView(spoilerConfig, z, z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPreviewEmbedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        PostPreviewEmbedViewBinding inflate = PostPreviewEmbedViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        ViewClippingUtilsKt.clipToRoundedRectangle(this, SizeUtilsKt.getDpToPx(8));
        TextView _init_$lambda$0 = inflate.title;
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        C9612q.m13918g(_init_$lambda$0, "_init_$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimarySemibold);
        TextView _init_$lambda$1 = inflate.subtitle;
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        C9612q.m13918g(_init_$lambda$1, "_init_$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 14.0f);
        DiscordFont discordFont = DiscordFont.PrimaryNormal;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, discordFont);
        SimpleDraweeSpanTextView _init_$lambda$2 = inflate.footer;
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        C9612q.m13918g(_init_$lambda$2, "_init_$lambda$2");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$2, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, discordFont);
        DCDButton dCDButton = inflate.coverImageOverlayButton;
        dCDButton.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundMobilePrimary());
        dCDButton.setAlpha(0.7f);
        dCDButton.setTextSizeSp(12.0f);
        dCDButton.setCornerRadius(SizeUtilsKt.getDpToPx(64));
    }
}