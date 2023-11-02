package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.C2912R;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.databinding.FileAttachmentViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.coroutines.AttachedViewCoroutineScope;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9818l;

@Metadata(m14358d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0085\u0001\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001d¨\u0006$"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/FileAttachmentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "attachmentName", "attachmentDescription", "url", "Lkotlin/Function2;", "", "onClick", "", "isSpoiler", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "", "progress", "Lkotlin/Function0;", "onCancelUpload", "Lcom/discord/chat/presentation/message/view/UploadContext;", "uploadContext", "", "attachmentsOpacity", ViewProps.BACKGROUND_COLOR, "setContent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZLcom/discord/chat/bridge/spoiler/SpoilerConfig;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lcom/discord/chat/presentation/message/view/UploadContext;Ljava/lang/Float;Ljava/lang/Integer;)V", "Lcom/discord/chat/databinding/FileAttachmentViewBinding;", "binding", "Lcom/discord/chat/databinding/FileAttachmentViewBinding;", "uploadFinished", "Z", "Lcom/discord/chat/presentation/message/view/UploadContext;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class FileAttachmentView extends ConstraintLayout {
    private final FileAttachmentViewBinding binding;
    private UploadContext uploadContext;
    private boolean uploadFinished;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileAttachmentView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ FileAttachmentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static final void setContent$lambda$0(Function2 onClick, String url, String attachmentName, View view) {
        C9612q.m13917h(onClick, "$onClick");
        C9612q.m13917h(url, "$url");
        C9612q.m13917h(attachmentName, "$attachmentName");
        onClick.invoke(url, attachmentName);
    }

    public static final void setContent$lambda$1(FileAttachmentView this$0, String url, String attachmentName, String attachmentDescription, View view) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(url, "$url");
        C9612q.m13917h(attachmentName, "$attachmentName");
        C9612q.m13917h(attachmentDescription, "$attachmentDescription");
        C9818l.m13179d(CoroutineViewUtilsKt.getAttachedScope(this$0), C9677b1.m13569b(), null, new FileAttachmentView$setContent$2$1(this$0, url, attachmentName, attachmentDescription, null), 2, null);
    }

    public final void setContent(final String attachmentName, final String attachmentDescription, final String url, final Function2<? super String, ? super String, Unit> onClick, boolean z, SpoilerConfig spoilerConfig, Integer num, Function0<Unit> onCancelUpload, UploadContext uploadContext, Float f, Integer num2) {
        int i;
        boolean z2;
        C9612q.m13917h(attachmentName, "attachmentName");
        C9612q.m13917h(attachmentDescription, "attachmentDescription");
        C9612q.m13917h(url, "url");
        C9612q.m13917h(onClick, "onClick");
        C9612q.m13917h(onCancelUpload, "onCancelUpload");
        C9612q.m13917h(uploadContext, "uploadContext");
        boolean z3 = num != null;
        AttachedViewCoroutineScope attachedScope = CoroutineViewUtilsKt.getAttachedScope(this);
        String simpleName = FileAttachmentView.class.getSimpleName();
        AttachedViewCoroutineScope.cancelAllWork$default(attachedScope, "Binding " + simpleName, null, 2, null);
        SimpleDraweeView simpleDraweeView = this.binding.fileAttachmentDownload;
        C9612q.m13918g(simpleDraweeView, "binding.fileAttachmentDownload");
        simpleDraweeView.setVisibility(z3 ^ true ? 0 : 8);
        ProgressBar progressBar = this.binding.fileAttachmentDownloadProgressBar;
        C9612q.m13918g(progressBar, "binding.fileAttachmentDownloadProgressBar");
        progressBar.setVisibility(4);
        TextView textView = this.binding.fileAttachmentName;
        C9612q.m13918g(textView, "binding.fileAttachmentName");
        ViewUtilsKt.setOptionalText(textView, attachmentName);
        TextView textView2 = this.binding.fileAttachmentDescription;
        C9612q.m13918g(textView2, "binding.fileAttachmentDescription");
        ViewUtilsKt.setOptionalText(textView2, attachmentDescription);
        int intValue = num2 != null ? num2.intValue() : ThemeManagerKt.getTheme().getBackgroundSecondary();
        View root = this.binding.getRoot();
        C9612q.m13918g(root, "binding.root");
        ViewBackgroundUtilsKt.setBackgroundRectangle(root, intValue, SizeUtilsKt.getDpToPx(8), Integer.valueOf(ColorUtilsKt.getColorCompat(this, C2912R.color.primary_dark_700_alpha_60)), SizeUtilsKt.getDpToPx(0.25f));
        if (z3) {
            i = 1;
            z2 = false;
        } else {
            i = 1;
            z2 = false;
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileAttachmentView.setContent$lambda$0(Function2.this, url, attachmentName, view);
                }
            }, 1, null);
        }
        SimpleDraweeView simpleDraweeView2 = this.binding.fileAttachmentDownload;
        C9612q.m13918g(simpleDraweeView2, "binding.fileAttachmentDownload");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView2, z2, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileAttachmentView.setContent$lambda$1(FileAttachmentView.this, url, attachmentName, attachmentDescription, view);
            }
        }, i, null);
        this.binding.spoiler.configure(spoilerConfig, this);
        if (z) {
            SpoilerView spoilerView = this.binding.spoiler;
            C9612q.m13918g(spoilerView, "binding.spoiler");
            if ((spoilerView.getVisibility() == 0 ? i : 0) != 0) {
                this.binding.fileAttachmentDownload.setImportantForAccessibility(4);
                this.binding.fileAttachmentName.setImportantForAccessibility(4);
                this.binding.fileAttachmentDescription.setImportantForAccessibility(4);
            }
        }
        this.binding.getRoot().setAlpha(f != null ? f.floatValue() : 1.0f);
        AttachmentUploadOverlayView uploadOverlay = this.binding.uploadOverlay;
        int interactiveNormal = ThemeManagerKt.getTheme().getInteractiveNormal();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        Paint paint = shapeDrawable.getPaint();
        Context context = getContext();
        C9612q.m13918g(context, "context");
        paint.setColor(ColorUtilsKt.getColorCompat(context, 17170445));
        int backgroundModifierAccent = ThemeManagerKt.getTheme().getBackgroundModifierAccent();
        C9612q.m13918g(uploadOverlay, "uploadOverlay");
        AttachmentUploadOverlayView.configureProgressView$default(uploadOverlay, null, shapeDrawable, null, Integer.valueOf(interactiveNormal), null, Integer.valueOf(backgroundModifierAccent), 21, null);
        if (!C9612q.m13922c(this.uploadContext, uploadContext)) {
            this.uploadContext = uploadContext;
            this.uploadFinished = false;
        }
        if (z3 && !this.uploadFinished) {
            this.binding.uploadOverlayBackground.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
            LinearLayout linearLayout = this.binding.uploadOverlayBackground;
            C9612q.m13918g(linearLayout, "binding.uploadOverlayBackground");
            linearLayout.setVisibility(0);
        }
        FileAttachmentView$setContent$hideOverlayBackground$1 fileAttachmentView$setContent$hideOverlayBackground$1 = new FileAttachmentView$setContent$hideOverlayBackground$1(this);
        this.binding.uploadOverlay.setProgress(num, uploadContext);
        this.binding.uploadOverlay.setUploadCancel(onCancelUpload);
        this.binding.uploadOverlay.setOnProgressAnimationComplete(fileAttachmentView$setContent$hideOverlayBackground$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        FileAttachmentViewBinding inflate = FileAttachmentViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        SimpleDraweeView simpleDraweeView = inflate.fileAttachmentDownload;
        C9612q.m13918g(simpleDraweeView, "binding.fileAttachmentDownload");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.Download);
        SimpleDraweeView simpleDraweeView2 = inflate.fileAttachmentDownload;
        C9612q.m13918g(simpleDraweeView2, "binding.fileAttachmentDownload");
        ColorUtilsKt.setTintColor(simpleDraweeView2, Integer.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
        SimpleDraweeView simpleDraweeView3 = inflate.fileAttachmentIcon;
        C9612q.m13918g(simpleDraweeView3, "binding.fileAttachmentIcon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView3, ReactAsset.File);
        SimpleDraweeView simpleDraweeView4 = inflate.fileAttachmentIcon;
        C9612q.m13918g(simpleDraweeView4, "binding.fileAttachmentIcon");
        ColorUtilsKt.setTintColor(simpleDraweeView4, Integer.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
        inflate.fileAttachmentName.setTextColor(ThemeManagerKt.getTheme().getTextLink());
        TextView textView = inflate.fileAttachmentName;
        C9612q.m13918g(textView, "binding.fileAttachmentName");
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        inflate.fileAttachmentDescription.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        TextView textView2 = inflate.fileAttachmentDescription;
        C9612q.m13918g(textView2, "binding.fileAttachmentDescription");
        SetTextSizeSpKt.setTextSizeSp(textView2, 12.0f);
        TextView textView3 = inflate.fileAttachmentDescription;
        C9612q.m13918g(textView3, "binding.fileAttachmentDescription");
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont);
        inflate.fileAttachmentDownloadProgressBar.setIndeterminateTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
        View root = inflate.getRoot();
        C9612q.m13918g(root, "binding.root");
        int dpToPx = SizeUtilsKt.getDpToPx(8);
        root.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
    }
}