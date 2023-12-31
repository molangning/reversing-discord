package com.discord.mobile_voice_overlay.views;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.mobile_voice_overlay.C3317R;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import com.discord.mobile_voice_overlay.databinding.OverlayVoiceChannelSelectorBinding;
import com.discord.mobile_voice_overlay.utils.WindowUtils;
import com.discord.primitives.ChannelId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)B\u001b\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b(\u0010,B#\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b(\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\n\u001a\u00020\u0002H\u0014J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R.\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R1\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020\u001a8\u0006@\u0006X\u0086\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, m14357d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;", "Lcom/discord/mobile_voice_overlay/views/OverlayDialog;", "", "onViewBound", "bindData", "()Lkotlin/Unit;", "bindAssets", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "onAttachedToWindow", "Landroid/animation/Animator;", "getClosingAnimator", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "data", "setData", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "assets", "setAssets", "Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;", "binding", "Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "Lcom/discord/mobile_voice_overlay/views/ResultAdapter;", "adapter", "Lcom/discord/mobile_voice_overlay/views/ResultAdapter;", "Lkotlin/Function1;", "", "onTextChanged", "Lkotlin/jvm/functions/Function1;", "getOnTextChanged", "()Lkotlin/jvm/functions/Function1;", "setOnTextChanged", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/discord/primitives/ChannelId;", "onChannelSelected", "getOnChannelSelected", "setOnChannelSelected", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "attributeSetId", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mobile_voice_overlay_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class OverlayVoiceSelectorBubbleDialog extends OverlayDialog {
    private final ResultAdapter adapter;
    private OverlayVoiceChannelSelectorBinding binding;
    private MobileVoiceOverlayData data;
    private Function1<? super ChannelId, Unit> onChannelSelected;
    private Function1<? super String, Unit> onTextChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayVoiceSelectorBubbleDialog(Context context) {
        super(context);
        C9612q.m13917h(context, "context");
        OverlayVoiceChannelSelectorBinding inflate = OverlayVoiceChannelSelectorBinding.inflate(LayoutInflater.from(getContext()), this, true);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
        this.adapter = new ResultAdapter(new OverlayVoiceSelectorBubbleDialog$adapter$1(this));
        WindowUtils.INSTANCE.removeFlag(getWindowLayoutParams(), 8);
        this.onTextChanged = OverlayVoiceSelectorBubbleDialog$onTextChanged$1.INSTANCE;
        this.onChannelSelected = OverlayVoiceSelectorBubbleDialog$onChannelSelected$1.INSTANCE;
    }

    private final void bindAssets() {
        MobileVoiceOverlayAssets overlayAssets = getOverlayAssets();
        if (overlayAssets != null) {
            this.binding.channelSelect.setText(overlayAssets.getChannelSelect());
            this.binding.emptyResults.setText(overlayAssets.getNoResults());
            this.binding.overlayChannelSearch.setHint(overlayAssets.getSearchChannels());
            this.binding.close.setContentDescription(overlayAssets.getCloseWindow());
            SimpleDraweeView simpleDraweeView = this.binding.close;
            C9612q.m13918g(simpleDraweeView, "binding.close");
            ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
            SimpleDraweeView simpleDraweeView2 = this.binding.close;
            C9612q.m13918g(simpleDraweeView2, "binding.close");
            ReactAssetUtilsKt.setReactAsset(simpleDraweeView2, ReactAsset.Close);
        }
    }

    private final Unit bindData() {
        int i;
        MobileVoiceOverlayData mobileVoiceOverlayData = this.data;
        if (mobileVoiceOverlayData != null) {
            boolean isEmpty = mobileVoiceOverlayData.getChannelSelectorResults().isEmpty();
            TextView textView = this.binding.emptyResults;
            C9612q.m13918g(textView, "binding.emptyResults");
            int i2 = 0;
            if (isEmpty) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            RecyclerView recyclerView = this.binding.resultsRv;
            C9612q.m13918g(recyclerView, "binding.resultsRv");
            if (!(!isEmpty)) {
                i2 = 8;
            }
            recyclerView.setVisibility(i2);
            if (!isEmpty) {
                this.adapter.setResults(mobileVoiceOverlayData.getChannelSelectorResults());
            }
            return Unit.f25302a;
        }
        return null;
    }

    private final void onViewBound() {
        this.binding.close.setOnClickListener(new View.OnClickListener() { // from class: com.discord.mobile_voice_overlay.views.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverlayVoiceSelectorBubbleDialog.onViewBound$lambda$0(OverlayVoiceSelectorBubbleDialog.this, view);
            }
        });
        EditText editText = this.binding.overlayChannelSearch;
        C9612q.m13918g(editText, "binding.overlayChannelSearch");
        editText.addTextChangedListener(new TextWatcher() { // from class: com.discord.mobile_voice_overlay.views.OverlayVoiceSelectorBubbleDialog$onViewBound$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                OverlayVoiceSelectorBubbleDialog.this.getOnTextChanged().invoke((charSequence == null || (r1 = charSequence.toString()) == null) ? "" : "");
            }
        });
        TextView textView = this.binding.channelSelect;
        C9612q.m13918g(textView, "binding.channelSelect");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        TextView onViewBound$lambda$2 = this.binding.emptyResults;
        C9612q.m13918g(onViewBound$lambda$2, "onViewBound$lambda$2");
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(onViewBound$lambda$2, discordFont);
        onViewBound$lambda$2.setVisibility(8);
        EditText editText2 = this.binding.overlayChannelSearch;
        C9612q.m13918g(editText2, "binding.overlayChannelSearch");
        DiscordFontUtilsKt.setDiscordFont(editText2, discordFont);
        LinearLayout linearLayout = this.binding.menuContainer;
        C9612q.m13918g(linearLayout, "binding.menuContainer");
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(linearLayout, ThemeManagerKt.getTheme().getBackgroundTertiary(), 4, null, 0, 12, null);
        this.binding.dialogCard.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundMobilePrimary());
        this.binding.channelSelect.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        this.binding.emptyResults.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        EditText onViewBound$lambda$3 = this.binding.overlayChannelSearch;
        C9612q.m13918g(onViewBound$lambda$3, "onViewBound$lambda$3");
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(onViewBound$lambda$3, ThemeManagerKt.getTheme().getInteractiveMuted(), 8, null, 0, 12, null);
        onViewBound$lambda$3.setHintTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
        onViewBound$lambda$3.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        this.binding.resultsRv.setAdapter(this.adapter);
        bindAssets();
        bindData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewBound$lambda$0(OverlayVoiceSelectorBubbleDialog this$0, View view) {
        C9612q.m13917h(this$0, "this$0");
        this$0.closeDialog();
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayDialog
    public Animator getClosingAnimator() {
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), C3317R.animator.overlay_slide_down_fade_out);
        loadAnimator.setTarget(this.binding.dialogCard);
        C9612q.m13918g(loadAnimator, "loadAnimator(context, R.…ing.dialogCard)\n        }");
        return loadAnimator;
    }

    public final Function1<ChannelId, Unit> getOnChannelSelected() {
        return this.onChannelSelected;
    }

    public final Function1<String, Unit> getOnTextChanged() {
        return this.onTextChanged;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        onViewBound();
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), C3317R.animator.overlay_slide_up_fade_in);
        loadAnimator.setTarget(this.binding.dialogCard);
        loadAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.discord.mobile_voice_overlay.views.OverlayDialog, com.discord.mobile_voice_overlay.views.OverlayBubbleWrap, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        removeAllViewsInLayout();
        OverlayVoiceChannelSelectorBinding inflate = OverlayVoiceChannelSelectorBinding.inflate(LayoutInflater.from(getContext()), this, true);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
        onViewBound();
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayView
    public void setAssets(MobileVoiceOverlayAssets assets) {
        C9612q.m13917h(assets, "assets");
        super.setAssets(assets);
        bindAssets();
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayView
    public void setData(MobileVoiceOverlayData data) {
        C9612q.m13917h(data, "data");
        this.data = data;
        bindData();
    }

    public final void setOnChannelSelected(Function1<? super ChannelId, Unit> function1) {
        C9612q.m13917h(function1, "<set-?>");
        this.onChannelSelected = function1;
    }

    public final void setOnTextChanged(Function1<? super String, Unit> function1) {
        C9612q.m13917h(function1, "<set-?>");
        this.onTextChanged = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayVoiceSelectorBubbleDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        OverlayVoiceChannelSelectorBinding inflate = OverlayVoiceChannelSelectorBinding.inflate(LayoutInflater.from(getContext()), this, true);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
        this.adapter = new ResultAdapter(new OverlayVoiceSelectorBubbleDialog$adapter$1(this));
        WindowUtils.INSTANCE.removeFlag(getWindowLayoutParams(), 8);
        this.onTextChanged = OverlayVoiceSelectorBubbleDialog$onTextChanged$1.INSTANCE;
        this.onChannelSelected = OverlayVoiceSelectorBubbleDialog$onChannelSelected$1.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayVoiceSelectorBubbleDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        OverlayVoiceChannelSelectorBinding inflate = OverlayVoiceChannelSelectorBinding.inflate(LayoutInflater.from(getContext()), this, true);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
        this.adapter = new ResultAdapter(new OverlayVoiceSelectorBubbleDialog$adapter$1(this));
        WindowUtils.INSTANCE.removeFlag(getWindowLayoutParams(), 8);
        this.onTextChanged = OverlayVoiceSelectorBubbleDialog$onTextChanged$1.INSTANCE;
        this.onChannelSelected = OverlayVoiceSelectorBubbleDialog$onChannelSelected$1.INSTANCE;
    }
}
