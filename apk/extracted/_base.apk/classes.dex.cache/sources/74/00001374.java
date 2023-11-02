package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C1170a;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.C2912R;
import com.discord.chat.databinding.ImageAttachmentViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001IB\u001d\b\u0007\u0012\u0006\u0010D\u001a\u00020C\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bG\u0010HJ\u0099\u0001\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002J\u0018\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002J0\u0010%\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\"j\u0002`#JW\u0010.\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00042\b\u0010*\u001a\u0004\u0018\u00010)2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120\"ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u001e\u0010/\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bJ\u0010\u00101\u001a\u00020\u00122\b\u00100\u001a\u0004\u0018\u00010\u0002R\u0017\u00103\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00108R\u0014\u0010?\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00108R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006J"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/ImageAttachmentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "url", "", "width", "height", "maxHeightPx", "maxWidthPx", "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", ViewProps.RESIZE_MODE, "", "isSpoiler", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "radiusPx", "progress", "Lkotlin/Function0;", "", "onCancelUpload", "Lcom/discord/chat/presentation/message/view/UploadContext;", "uploadContext", "", "attachmentsOpacity", "isObscure", "isObscureAwaitingScan", "isPartOfMosaic", "setContent", "(Ljava/lang/String;IIIILcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;ZLcom/discord/chat/bridge/spoiler/SpoilerConfig;ILjava/lang/Integer;Lkotlin/jvm/functions/Function0;Lcom/discord/chat/presentation/message/view/UploadContext;Ljava/lang/Float;ZZZ)V", "description", "hint", "setDescription", "show", "showDescription", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/events/MessageTapShowAltText;", "onTapShowAltText", "showAltTextButton", "showRemixButton", "remixButtonIconColor", "remixButtonBackgroundColor", "Lcom/discord/primitives/MessageId;", "messageId", "onTapRemix", "maybeShowRemixButton-cUe2JkQ", "(ZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "maybeShowRemixButton", "updateMarginStart", "role", "setRole", "Lcom/discord/chat/databinding/ImageAttachmentViewBinding;", "binding", "Lcom/discord/chat/databinding/ImageAttachmentViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/ImageAttachmentViewBinding;", "imageFadeDuration", "I", "Lcom/discord/chat/presentation/message/view/ImageAttachmentView$TargetSize;", "targetSize", "Lcom/discord/chat/presentation/message/view/ImageAttachmentView$TargetSize;", "targetUrl", "Ljava/lang/String;", "messageStartGuidelinePx", "messageHorizontalSpacingPx", "", "remixingTitle", "Ljava/lang/CharSequence;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "TargetSize", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ImageAttachmentView extends ConstraintLayout {
    private final ImageAttachmentViewBinding binding;
    private final int imageFadeDuration;
    private final int messageHorizontalSpacingPx;
    private final int messageStartGuidelinePx;
    private final CharSequence remixingTitle;
    private TargetSize targetSize;
    private String targetUrl;

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/ImageAttachmentView$TargetSize;", "", "width", "", "height", "maxHeightPx", "(III)V", "getHeight", "()I", "getMaxHeightPx", "getWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class TargetSize {
        private final int height;
        private final int maxHeightPx;
        private final int width;

        public TargetSize(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            this.maxHeightPx = i3;
        }

        public static /* synthetic */ TargetSize copy$default(TargetSize targetSize, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = targetSize.width;
            }
            if ((i4 & 2) != 0) {
                i2 = targetSize.height;
            }
            if ((i4 & 4) != 0) {
                i3 = targetSize.maxHeightPx;
            }
            return targetSize.copy(i, i2, i3);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        public final int component3() {
            return this.maxHeightPx;
        }

        public final TargetSize copy(int i, int i2, int i3) {
            return new TargetSize(i, i2, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TargetSize) {
                TargetSize targetSize = (TargetSize) obj;
                return this.width == targetSize.width && this.height == targetSize.height && this.maxHeightPx == targetSize.maxHeightPx;
            }
            return false;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getMaxHeightPx() {
            return this.maxHeightPx;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (((this.width * 31) + this.height) * 31) + this.maxHeightPx;
        }

        public String toString() {
            int i = this.width;
            int i2 = this.height;
            int i3 = this.maxHeightPx;
            return "TargetSize(width=" + i + ", height=" + i2 + ", maxHeightPx=" + i3 + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageAttachmentView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ ImageAttachmentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: maybeShowRemixButton-cUe2JkQ$default */
    public static /* synthetic */ void m41769maybeShowRemixButtoncUe2JkQ$default(ImageAttachmentView imageAttachmentView, boolean z, boolean z2, Integer num, Integer num2, String str, Function1 function1, int i, Object obj) {
        ImageAttachmentView$maybeShowRemixButton$1 imageAttachmentView$maybeShowRemixButton$1 = function1;
        if ((i & 32) != 0) {
            imageAttachmentView$maybeShowRemixButton$1 = ImageAttachmentView$maybeShowRemixButton$1.INSTANCE;
        }
        imageAttachmentView.m41770maybeShowRemixButtoncUe2JkQ(z, z2, num, num2, str, imageAttachmentView$maybeShowRemixButton$1);
    }

    public static final void maybeShowRemixButton_cUe2JkQ$lambda$2(Function1 onTapRemix, String str, View view) {
        MessageId messageId;
        C9612q.m13917h(onTapRemix, "$onTapRemix");
        if (str != null) {
            messageId = MessageId.m42073boximpl(str);
        } else {
            messageId = null;
        }
        onTapRemix.invoke(messageId);
    }

    public final ImageAttachmentViewBinding getBinding() {
        return this.binding;
    }

    /* renamed from: maybeShowRemixButton-cUe2JkQ */
    public final void m41770maybeShowRemixButtoncUe2JkQ(boolean z, boolean z2, Integer num, Integer num2, final String str, final Function1<? super MessageId, Unit> onTapRemix) {
        int colorCompat;
        int colorCompat2;
        C9612q.m13917h(onTapRemix, "onTapRemix");
        if (z && !z2) {
            if (num != null) {
                colorCompat = num.intValue();
            } else {
                colorCompat = ColorUtilsKt.getColorCompat(this, C2912R.color.white);
            }
            this.binding.remixButton.setColorFilter(new PorterDuffColorFilter(colorCompat, PorterDuff.Mode.SRC_IN));
            FrameLayout frameLayout = this.binding.remixButtonContainer;
            if (num2 != null) {
                colorCompat2 = num2.intValue();
            } else {
                colorCompat2 = ColorUtilsKt.getColorCompat(this, C2912R.color.primary_400);
            }
            frameLayout.setBackgroundColor(colorCompat2);
            if (str != null) {
                FrameLayout frameLayout2 = this.binding.remixButtonContainer;
                C9612q.m13918g(frameLayout2, "binding.remixButtonContainer");
                NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(frameLayout2, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.c0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ImageAttachmentView.maybeShowRemixButton_cUe2JkQ$lambda$2(Function1.this, str, view);
                    }
                }, 1, null);
            }
            FrameLayout frameLayout3 = this.binding.remixButtonContainer;
            C9612q.m13918g(frameLayout3, "binding.remixButtonContainer");
            frameLayout3.setVisibility(0);
            return;
        }
        FrameLayout frameLayout4 = this.binding.remixButtonContainer;
        C9612q.m13918g(frameLayout4, "binding.remixButtonContainer");
        frameLayout4.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0033, code lost:
        if (kotlin.jvm.internal.C9612q.m13922c(r1, r15) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0074, code lost:
        if (kotlin.jvm.internal.C9612q.m13922c(r1, r0) == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setContent(java.lang.String r15, int r16, int r17, int r18, int r19, com.discord.chat.presentation.media.MediaContainingViewResizer.ResizeMode r20, boolean r21, com.discord.chat.bridge.spoiler.SpoilerConfig r22, int r23, java.lang.Integer r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25, com.discord.chat.presentation.message.view.UploadContext r26, java.lang.Float r27, boolean r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.ImageAttachmentView.setContent(java.lang.String, int, int, int, int, com.discord.chat.presentation.media.MediaContainingViewResizer$ResizeMode, boolean, com.discord.chat.bridge.spoiler.SpoilerConfig, int, java.lang.Integer, kotlin.jvm.functions.Function0, com.discord.chat.presentation.message.view.UploadContext, java.lang.Float, boolean, boolean, boolean):void");
    }

    public final void setDescription(String str, String str2) {
        if (str == null) {
            return;
        }
        SimpleDraweeView simpleDraweeView = this.binding.image;
        if (str2 == null) {
            str2 = "";
        }
        simpleDraweeView.setContentDescription(str + " " + str2);
    }

    public final void setRole(final String str) {
        if (str != null) {
            C1365w0.m37185q0(this.binding.image, new C1170a() { // from class: com.discord.chat.presentation.message.view.ImageAttachmentView$setRole$1
                @Override // androidx.core.view.C1170a
                public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                    C9612q.m13917h(host, "host");
                    C9612q.m13917h(info, "info");
                    super.onInitializeAccessibilityNodeInfo(host, info);
                    info.m37642B0(str);
                }
            });
        }
    }

    public final void showAltTextButton(boolean z, String str, Function1<? super String, Unit> onTapShowAltText) {
        C9612q.m13917h(onTapShowAltText, "onTapShowAltText");
        AltTextButtonView altTextButtonView = this.binding.mediaViewAltTextButton;
        if (!z) {
            str = null;
        }
        altTextButtonView.configure(str, onTapShowAltText);
    }

    public final void showDescription(boolean z, String str) {
        boolean z2;
        TextView showDescription$lambda$1 = this.binding.imageAltText;
        C9612q.m13918g(showDescription$lambda$1, "showDescription$lambda$1");
        ViewUtilsKt.setOptionalText(showDescription$lambda$1, str);
        int i = 0;
        if (str != null && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            i = 8;
        }
        showDescription$lambda$1.setVisibility(i);
    }

    public final void updateMarginStart(boolean z, boolean z2, boolean z3) {
        int i;
        if (z3) {
            return;
        }
        View root = this.binding.getRoot();
        C9612q.m13918g(root, "binding.root");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z && !z2) {
                i = this.messageHorizontalSpacingPx;
            } else {
                i = this.messageStartGuidelinePx;
            }
            marginLayoutParams.setMarginStart(i);
            root.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        ImageAttachmentViewBinding inflate = ImageAttachmentViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.imageFadeDuration = getResources().getInteger(C2912R.integer.image_fade_duration);
        this.messageStartGuidelinePx = getResources().getDimensionPixelSize(C2912R.dimen.message_start_guideline);
        this.messageHorizontalSpacingPx = getResources().getDimensionPixelSize(C2912R.dimen.message_horizontal_spacing);
        CharSequence i18nFormat$default = I18nUtilsKt.i18nFormat$default(context, I18nMessage.REMIXING_TITLE, null, 2, null);
        this.remixingTitle = i18nFormat$default;
        inflate.image.getHierarchy().m31460z(new ColorDrawable(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt()));
        TextView _init_$lambda$0 = inflate.imageAltText;
        _init_$lambda$0.setImportantForAccessibility(4);
        C9612q.m13918g(_init_$lambda$0, "_init_$lambda$0");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimaryNormal);
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 12.0f);
        SimpleDraweeView simpleDraweeView = inflate.remixButton;
        C9612q.m13918g(simpleDraweeView, "binding.remixButton");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.Remix);
        SimpleDraweeView simpleDraweeView2 = inflate.remixButton;
        C9612q.m13918g(simpleDraweeView2, "binding.remixButton");
        simpleDraweeView2.setVisibility(0);
        FrameLayout frameLayout = inflate.remixButtonContainer;
        C9612q.m13918g(frameLayout, "binding.remixButtonContainer");
        ViewClippingUtilsKt.clipToCircle(frameLayout);
        inflate.remixButton.setContentDescription(i18nFormat$default);
        inflate.imageBlurBg.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundMobilePrimary());
    }
}