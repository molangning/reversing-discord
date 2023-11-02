package com.discord.chat.presentation.message.view.voicemessages;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.C1170a;
import androidx.core.view.C1365w0;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.C2912R;
import com.discord.chat.databinding.AudioPlayerViewBinding;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.media.ViewAttachedListener;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.media_player.MediaPlayer;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.theme.LightTheme;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import gg.C6759j;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.C9662a;
import kotlin.time.Duration;
import kotlinx.coroutines.C9818l;
import kotlinx.coroutines.Job;
import p373ui.EnumC12982c;
import pf.C11577n;

@Metadata(m14358d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000 \\2\u00020\u0001:\u0002\\]B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010/\u001a\u0002002\u0006\u0010+\u001a\u00020,H\u0002J#\u00101\u001a\u0002002\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u00103\u001a\u00020(H\u0002¢\u0006\u0002\u00104J\u0010\u00105\u001a\u0002002\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u00106\u001a\u0002002\u0006\u0010+\u001a\u00020,H\u0002J\u001a\u00107\u001a\u0002002\u0006\u0010+\u001a\u00020,2\b\b\u0002\u00108\u001a\u00020(H\u0002J\b\u00109\u001a\u000200H\u0002J\u000f\u0010:\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0002\u0010;J\b\u0010<\u001a\u000200H\u0002J\u0012\u0010=\u001a\u0002002\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J\b\u0010@\u001a\u000200H\u0002J\u0010\u0010A\u001a\u0002002\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010B\u001a\u0002002\u0006\u0010C\u001a\u00020(H\u0002J\u000e\u0010D\u001a\u0002002\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010E\u001a\u0002002\u0006\u0010F\u001a\u00020GJ%\u0010H\u001a\u0002002\u0006\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010?ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJ\u001c\u0010N\u001a\u0002002\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010O\u001a\u00020(H\u0002J-\u0010P\u001a\u0002002\b\u0010Q\u001a\u0004\u0018\u00010\u00072\f\u0010R\u001a\b\u0012\u0004\u0012\u0002000S2\b\u0010T\u001a\u0004\u0018\u00010U¢\u0006\u0002\u0010VJ\u000e\u0010'\u001a\u0002002\u0006\u0010'\u001a\u00020(J\u0010\u0010W\u001a\u0002002\u0006\u0010X\u001a\u00020(H\u0002J\f\u0010Y\u001a\u00020?*\u00020\u0007H\u0002J\f\u0010Z\u001a\u00020?*\u00020\u0007H\u0002J\f\u0010[\u001a\u00020\u0007*\u00020\u001eH\u0002R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010*R\u000e\u0010+\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006^"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animatorManager", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;", "getAnimatorManager", "()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;", "animatorManager$delegate", "Lkotlin/Lazy;", "attachStateChangeListener", "Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;", "binding", "Lcom/discord/chat/databinding/AudioPlayerViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/AudioPlayerViewBinding;", "bounceAnimator", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "getBounceAnimator", "()Landroid/view/animation/Animation;", "bounceAnimator$delegate", "durationJob", "Lkotlinx/coroutines/Job;", "durationMs", "", "listener", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;", "getListener", "()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;", "setListener", "(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;)V", "playerJob", "resetJob", "shouldAnimate", "", "startTimeMS", "Ljava/lang/Long;", "state", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;", "uploadFinished", "wasPlayingBeforeBeingPaused", "configureAudioWave", "", "configureDuration", "overrideDuration", "isPlaying", "(Ljava/lang/Long;Z)V", "configureLoading", "configurePlayButton", "configurePlayerState", "hasSourceChanged", "configureProgress", "getCurrentPosition", "()Ljava/lang/Long;", "maybeLogPlaybackEnded", "maybeLogPlaybackFailed", "errorMessage", "", "maybeLogPlaybackStarted", "prepareAudio", "reset", "logDuration", "setDurationMs", "setSampleData", "sampleData", "", "setSourceUrl", "messageId", "Lcom/discord/primitives/MessageId;", "sourceUrl", "setSourceUrl-ntcYbpo", "(Ljava/lang/String;Ljava/lang/String;)V", "setState", "forceRefresh", "setUploadProgress", "progress", "onCancelUpload", "Lkotlin/Function0;", "attachmentsOpacity", "", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Ljava/lang/Float;)V", "toggleDurationEmitter", "shouldEmit", "timeRemainingAccessibilityText", "timeRemainingText", "toSeconds", "Companion", "Listener", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AudioPlayerView extends FrameLayout {
    public static final Companion Companion = new Companion(null);
    public static final long RESET_DELAY_MS = 500;
    private final Lazy animatorManager$delegate;
    private final ViewAttachedListener attachStateChangeListener;
    private final AudioPlayerViewBinding binding;
    private final Lazy bounceAnimator$delegate;
    private Job durationJob;
    private long durationMs;
    private Listener listener;
    private Job playerJob;
    private Job resetJob;
    private boolean shouldAnimate;
    private Long startTimeMS;
    private AudioPlayerViewState state;
    private boolean uploadFinished;
    private boolean wasPlayingBeforeBeingPaused;

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Companion;", "", "()V", "RESET_DELAY_MS", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&¨\u0006\r"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;", "", "voiceMessagePlaybackEnded", "", "endDurationSecs", "", "durationListeningSecs", "voiceMessagePlaybackFailed", "errorMessage", "", "voiceMessagePlaybackStarted", "startedDurationSecs", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public interface Listener {
        public static final Companion Companion = Companion.$$INSTANCE;

        @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener$Companion;", "", "()V", "secondsSinceStart", "", "startTimeMS", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final float secondsSinceStart(long j) {
                Comparable m21928e;
                Duration.C9661a c9661a = Duration.f25397k;
                m21928e = C6759j.m21928e(Duration.m13643e(C9662a.m13603t(System.currentTimeMillis() - j, EnumC12982c.MILLISECONDS)), Duration.m13643e(Duration.f25397k.m13624b()));
                return (float) Duration.m13653H(((Duration) m21928e).m13648M(), EnumC12982c.SECONDS);
            }
        }

        void voiceMessagePlaybackEnded(float f, float f2);

        void voiceMessagePlaybackFailed(String str);

        void voiceMessagePlaybackStarted(float f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView(Context context) {
        this(context, null, 0, 6, null);
        C9612q.m13917h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ AudioPlayerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static final void _init_$lambda$2(AudioPlayerView this$0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C9612q.m13917h(this$0, "this$0");
        boolean isPlaying$chat_release = this$0.state.isPlaying$chat_release(this$0.wasPlayingBeforeBeingPaused);
        if (isPlaying$chat_release) {
            this$0.getAnimatorManager().startAnimator(isPlaying$chat_release, false);
        }
    }

    public final void configureAudioWave(AudioPlayerViewState audioPlayerViewState) {
        int interactiveNormal;
        this.binding.wave.setOnAudioProgressChange(new AudioPlayerView$configureAudioWave$1(this, audioPlayerViewState));
        AudioWaveView audioWaveView = this.binding.wave;
        if (audioPlayerViewState.isPlaying$chat_release(this.wasPlayingBeforeBeingPaused)) {
            interactiveNormal = getContext().getColor(C2912R.color.brand_430);
        } else if (audioPlayerViewState.getCurrentProgress$chat_release() != null) {
            interactiveNormal = ThemeManagerKt.getTheme().getInteractiveMuted();
        } else {
            interactiveNormal = ThemeManagerKt.getTheme().getInteractiveNormal();
        }
        audioWaveView.setDefaultPaintColor(interactiveNormal);
    }

    public final void configureDuration(Long l, boolean z) {
        long longValue;
        boolean z2;
        CharSequence i18nFormat;
        if (l != null) {
            longValue = l.longValue();
        } else {
            MediaPlayer player$chat_release = this.state.getPlayer$chat_release();
            Long l2 = null;
            if (player$chat_release != null) {
                if (player$chat_release.durationMs() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    player$chat_release = null;
                }
                if (player$chat_release != null) {
                    l2 = Long.valueOf(player$chat_release.durationMs() - player$chat_release.currentPositionMs());
                }
            }
            if (l2 != null) {
                longValue = l2.longValue();
            } else {
                return;
            }
        }
        int seconds = toSeconds(longValue);
        int seconds2 = toSeconds(this.durationMs);
        LinearLayout linearLayout = this.binding.playerContainer;
        if (z) {
            Context context = getContext();
            C9612q.m13918g(context, "context");
            i18nFormat = I18nUtilsKt.i18nFormat(context, I18nMessage.VOICE_MESSAGES_PLAYING_A11Y_STATUS, new AudioPlayerView$configureDuration$1(this, seconds2, seconds));
        } else {
            Context context2 = getContext();
            C9612q.m13918g(context2, "context");
            i18nFormat = I18nUtilsKt.i18nFormat(context2, I18nMessage.VOICE_MESSAGES_A11Y_STATUS, new AudioPlayerView$configureDuration$2(this, seconds2));
        }
        linearLayout.setContentDescription(i18nFormat);
        this.binding.text.setText("  " + timeRemainingText(seconds) + "  ");
    }

    public static /* synthetic */ void configureDuration$default(AudioPlayerView audioPlayerView, Long l, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        audioPlayerView.configureDuration(l, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0026, code lost:
        if (r4 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void configureLoading(com.discord.chat.presentation.message.view.voicemessages.AudioPlayerViewState r4) {
        /*
            r3 = this;
            com.discord.chat.databinding.AudioPlayerViewBinding r0 = r3.binding
            android.widget.ProgressBar r0 = r0.progress
            java.lang.String r1 = "binding.progress"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            com.discord.media_player.MediaPlayer$Event r1 = r4.getMediaState$chat_release()
            com.discord.media_player.MediaPlayer$Event$BufferStart r2 = com.discord.media_player.MediaPlayer.Event.BufferStart.INSTANCE
            boolean r1 = kotlin.jvm.internal.C9612q.m13922c(r1, r2)
            r2 = 0
            if (r1 == 0) goto L29
            com.discord.media_player.MediaPlayer r4 = r4.getPlayer$chat_release()
            r1 = 1
            if (r4 == 0) goto L25
            boolean r4 = r4.shouldPlay()
            if (r4 != r1) goto L25
            r4 = r1
            goto L26
        L25:
            r4 = r2
        L26:
            if (r4 == 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L2d
            goto L2f
        L2d:
            r2 = 8
        L2f:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView.configureLoading(com.discord.chat.presentation.message.view.voicemessages.AudioPlayerViewState):void");
    }

    public final void configurePlayButton(final AudioPlayerViewState audioPlayerViewState) {
        ReactAsset reactAsset;
        int i;
        View.OnClickListener onClickListener;
        final boolean isPlaying$chat_release = audioPlayerViewState.isPlaying$chat_release(this.wasPlayingBeforeBeingPaused);
        SimpleDraweeView simpleDraweeView = this.binding.button;
        C9612q.m13918g(simpleDraweeView, "binding.button");
        if (isPlaying$chat_release) {
            reactAsset = ReactAsset.Pause;
        } else {
            reactAsset = ReactAsset.Play;
        }
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, reactAsset);
        SimpleDraweeView simpleDraweeView2 = this.binding.button;
        if (isPlaying$chat_release) {
            i = 0;
        } else {
            i = 2;
        }
        simpleDraweeView2.setPadding(i, 0, 0, 0);
        getAnimatorManager().startAnimator(isPlaying$chat_release, this.shouldAnimate);
        LinearLayout linearLayout = this.binding.playerContainer;
        C9612q.m13918g(linearLayout, "binding.playerContainer");
        if (audioPlayerViewState.getSourceUrl() != null) {
            onClickListener = new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.voicemessages.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AudioPlayerView.configurePlayButton$lambda$5(AudioPlayerView.this, audioPlayerViewState, isPlaying$chat_release, view);
                }
            };
        } else {
            onClickListener = null;
        }
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(linearLayout, false, onClickListener, 1, null);
    }

    public static final void configurePlayButton$lambda$5(AudioPlayerView this$0, AudioPlayerViewState state, boolean z, View view) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(state, "$state");
        this$0.binding.buttonContainer.startAnimation(this$0.getBounceAnimator());
        if (state.getPlayer$chat_release() == null) {
            this$0.prepareAudio(state);
        } else if (!z) {
            state.play$chat_release();
        } else {
            state.pause$chat_release();
        }
    }

    private final void configurePlayerState(AudioPlayerViewState audioPlayerViewState, boolean z) {
        boolean z2;
        boolean m13922c = C9612q.m13922c(audioPlayerViewState.getMediaState$chat_release(), MediaPlayer.Event.PlaybackEnded.INSTANCE);
        boolean z3 = false;
        if ((z && !AudioPlayerManager.INSTANCE.hasCurrentPlayer(audioPlayerViewState.getAudioSource())) || m13922c) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            reset(!m13922c);
            return;
        }
        boolean z4 = !hasWindowFocus();
        if (C9612q.m13922c(audioPlayerViewState.getMediaState$chat_release(), MediaPlayer.Event.StartedPlaying.INSTANCE) && !z4 && audioPlayerViewState.getAttached()) {
            z3 = true;
        }
        setKeepScreenOn(z3);
    }

    static /* synthetic */ void configurePlayerState$default(AudioPlayerView audioPlayerView, AudioPlayerViewState audioPlayerViewState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        audioPlayerView.configurePlayerState(audioPlayerViewState, z);
    }

    public final void configureProgress() {
        float f;
        AudioWaveView audioWaveView = this.binding.wave;
        MediaPlayer player$chat_release = this.state.getPlayer$chat_release();
        if (player$chat_release != null) {
            f = player$chat_release.currentPositionPercentage();
        } else {
            AudioPlayerManager.CurrentProgress currentProgress$chat_release = this.state.getCurrentProgress$chat_release();
            if (currentProgress$chat_release != null) {
                f = currentProgress$chat_release.getCurrentProgressPercentage();
            } else {
                f = 0.0f;
            }
        }
        audioWaveView.setAudioProgress(f, true);
    }

    private final AudioPlayerWipeAnimatorManager getAnimatorManager() {
        return (AudioPlayerWipeAnimatorManager) this.animatorManager$delegate.getValue();
    }

    private final Animation getBounceAnimator() {
        return (Animation) this.bounceAnimator$delegate.getValue();
    }

    private final Long getCurrentPosition() {
        MediaPlayer player$chat_release = this.state.getPlayer$chat_release();
        if (player$chat_release != null) {
            return Long.valueOf(player$chat_release.currentPositionMs());
        }
        AudioPlayerManager.CurrentProgress currentProgress$chat_release = this.state.getCurrentProgress$chat_release();
        if (currentProgress$chat_release != null) {
            return Long.valueOf(currentProgress$chat_release.getCurrentProgress());
        }
        return null;
    }

    public final void maybeLogPlaybackEnded() {
        Long currentPosition = getCurrentPosition();
        if (currentPosition != null) {
            long longValue = currentPosition.longValue();
            Long l = this.startTimeMS;
            if (l != null) {
                float secondsSinceStart = Listener.Companion.secondsSinceStart(l.longValue());
                this.startTimeMS = null;
                Listener listener = this.listener;
                if (listener != null) {
                    Duration.C9661a c9661a = Duration.f25397k;
                    listener.voiceMessagePlaybackEnded((float) Duration.m13653H(C9662a.m13603t(longValue, EnumC12982c.MILLISECONDS), EnumC12982c.SECONDS), secondsSinceStart);
                }
            }
        }
    }

    public final void maybeLogPlaybackFailed(String str) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.voiceMessagePlaybackFailed(str);
        }
    }

    public final void maybeLogPlaybackStarted() {
        Long currentPosition = getCurrentPosition();
        if (currentPosition != null) {
            long longValue = currentPosition.longValue();
            this.startTimeMS = Long.valueOf(System.currentTimeMillis());
            Listener listener = this.listener;
            if (listener != null) {
                Duration.C9661a c9661a = Duration.f25397k;
                listener.voiceMessagePlaybackStarted((float) Duration.m13653H(C9662a.m13603t(longValue, EnumC12982c.MILLISECONDS), EnumC12982c.SECONDS));
            }
        }
    }

    private final void prepareAudio(AudioPlayerViewState audioPlayerViewState) {
        AudioPlayerManager.AudioSource audioSource = audioPlayerViewState.getAudioSource();
        if (audioSource == null) {
            return;
        }
        AudioPlayerManager audioPlayerManager = AudioPlayerManager.INSTANCE;
        Context context = getContext();
        C9612q.m13918g(context, "context");
        audioPlayerManager.setupPlayer(context, audioSource, this.durationMs, new AudioPlayerView$prepareAudio$1(this));
        this.binding.wave.setEnabled(true);
    }

    private final void reset(boolean z) {
        Job m13179d;
        boolean z2 = false;
        toggleDurationEmitter(false);
        MediaPlayer player$chat_release = this.state.getPlayer$chat_release();
        if (player$chat_release != null && player$chat_release.shouldPlay()) {
            z2 = true;
        }
        this.wasPlayingBeforeBeingPaused = z2;
        if (z) {
            this.state.storeDuration$chat_release();
        }
        this.state.releasePlayer$chat_release();
        m13179d = C9818l.m13179d(CoroutineViewUtilsKt.getAttachedScope(this), null, null, new AudioPlayerView$reset$1(this, null), 3, null);
        this.resetJob = m13179d;
        C9818l.m13179d(CoroutineViewUtilsKt.getAttachedScope(this), null, null, new AudioPlayerView$reset$2(this, null), 3, null);
    }

    private final synchronized void setState(AudioPlayerViewState audioPlayerViewState, boolean z) {
        if (!z) {
            if (C9612q.m13922c(this.state, audioPlayerViewState)) {
                return;
            }
        }
        boolean z2 = !C9612q.m13922c(audioPlayerViewState.getSourceUrl(), this.state.getSourceUrl());
        if (z2 && AudioPlayerManager.INSTANCE.hasCurrentPlayer(audioPlayerViewState.getAudioSource())) {
            prepareAudio(audioPlayerViewState);
        }
        this.state = audioPlayerViewState;
        configurePlayButton(audioPlayerViewState);
        configureLoading(audioPlayerViewState);
        configureAudioWave(audioPlayerViewState);
        toggleDurationEmitter(audioPlayerViewState.shouldEmitDuration$chat_release());
        configurePlayerState(audioPlayerViewState, z2);
    }

    public static /* synthetic */ void setState$default(AudioPlayerView audioPlayerView, AudioPlayerViewState audioPlayerViewState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            audioPlayerViewState = audioPlayerView.state;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        audioPlayerView.setState(audioPlayerViewState, z);
    }

    public final String timeRemainingAccessibilityText(int i) {
        if (i >= 60) {
            return timeRemainingText(i);
        }
        return String.valueOf(i);
    }

    private final String timeRemainingText(int i) {
        String format = String.format("%01d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2));
        C9612q.m13918g(format, "format(this, *args)");
        return format;
    }

    private final int toSeconds(long j) {
        Duration.C9661a c9661a = Duration.f25397k;
        return (int) Math.ceil(Duration.m13653H(C9662a.m13603t(j, EnumC12982c.MILLISECONDS), EnumC12982c.SECONDS));
    }

    public final void toggleDurationEmitter(boolean z) {
        Job m13179d;
        Job job = this.durationJob;
        if (job != null) {
            Job.C9668a.m13594a(job, null, 1, null);
            Unit unit = Unit.f25302a;
        }
        this.durationJob = null;
        if (!z) {
            return;
        }
        m13179d = C9818l.m13179d(CoroutineViewUtilsKt.getAttachedScope(this), null, null, new AudioPlayerView$toggleDurationEmitter$2(this, null), 3, null);
        this.durationJob = m13179d;
    }

    public final AudioPlayerViewBinding getBinding() {
        return this.binding;
    }

    public final Listener getListener() {
        return this.listener;
    }

    public final void setDurationMs(long j) {
        long j2;
        boolean z;
        this.durationMs = j;
        AudioPlayerManager.CurrentProgress currentProgress$chat_release = this.state.getCurrentProgress$chat_release();
        if (currentProgress$chat_release != null) {
            j2 = currentProgress$chat_release.getCurrentProgress();
        } else {
            j2 = 0;
        }
        AudioWaveView setDurationMs$lambda$3 = this.binding.wave;
        setDurationMs$lambda$3.setDuration(Long.valueOf(j));
        C9612q.m13918g(setDurationMs$lambda$3, "setDurationMs$lambda$3");
        AudioWaveView.setAudioProgress$default(setDurationMs$lambda$3, ((float) j2) / ((float) j), false, 2, null);
        if (this.state.getCurrentProgress$chat_release() != null) {
            z = true;
        } else {
            z = false;
        }
        setDurationMs$lambda$3.setEnabled(z);
        configureDuration(Long.valueOf(j - j2), false);
    }

    public final void setListener(Listener listener) {
        this.listener = listener;
    }

    public final void setSampleData(byte[] sampleData) {
        C9612q.m13917h(sampleData, "sampleData");
        this.binding.wave.setOriginalSampleData(sampleData);
    }

    /* renamed from: setSourceUrl-ntcYbpo */
    public final void m41784setSourceUrlntcYbpo(String messageId, String str) {
        C9612q.m13917h(messageId, "messageId");
        this.binding.wave.setEnabled(false);
        if (C9612q.m13922c(str, this.state.getSourceUrl())) {
            return;
        }
        if (str == null) {
            reset(false);
        } else {
            setState(new AudioPlayerViewState(messageId, str, false, 4, null), true);
        }
    }

    public final void setUploadProgress(Integer num, Function0<Unit> onCancelUpload, Float f) {
        boolean z;
        float f2;
        C9612q.m13917h(onCancelUpload, "onCancelUpload");
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        View root = this.binding.getRoot();
        if (f != null) {
            f2 = f.floatValue();
        } else {
            f2 = 1.0f;
        }
        root.setAlpha(f2);
        AttachmentUploadOverlayView attachmentUploadOverlayView = this.binding.uploadOverlay;
        Integer valueOf = Integer.valueOf(SizeUtilsKt.getDpToPx(32));
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        Paint paint = shapeDrawable.getPaint();
        Context context = getContext();
        C9612q.m13918g(context, "context");
        paint.setColor(ColorUtilsKt.getColorCompat(context, 17170445));
        Unit unit = Unit.f25302a;
        attachmentUploadOverlayView.configureProgressView(valueOf, shapeDrawable, Integer.valueOf(SizeUtilsKt.getDpToPx(16)), Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()), Integer.valueOf(SizeUtilsKt.getDpToPx(29)), Integer.valueOf(ThemeManagerKt.getTheme().getBackgroundModifierAccent()));
        this.binding.uploadOverlay.configureCompleteView(Integer.valueOf(SizeUtilsKt.getDpToPx(32)), Integer.valueOf(SizeUtilsKt.getDpToPx(19)));
        if (z && !this.uploadFinished) {
            this.binding.uploadOverlayBackground.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
            LinearLayout linearLayout = this.binding.uploadOverlayBackground;
            C9612q.m13918g(linearLayout, "binding.uploadOverlayBackground");
            linearLayout.setVisibility(0);
        }
        AudioPlayerView$setUploadProgress$hideOverlayBackground$1 audioPlayerView$setUploadProgress$hideOverlayBackground$1 = new AudioPlayerView$setUploadProgress$hideOverlayBackground$1(this);
        AttachmentUploadOverlayView attachmentUploadOverlayView2 = this.binding.uploadOverlay;
        C9612q.m13918g(attachmentUploadOverlayView2, "binding.uploadOverlay");
        AttachmentUploadOverlayView.setProgress$default(attachmentUploadOverlayView2, num, null, 2, null);
        this.binding.uploadOverlay.setUploadCancel(onCancelUpload);
        this.binding.uploadOverlay.setOnProgressAnimationComplete(audioPlayerView$setUploadProgress$hideOverlayBackground$1);
    }

    public final void shouldAnimate(boolean z) {
        this.shouldAnimate = z;
        this.binding.wave.setShouldAnimate(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lazy m7601a;
        Lazy m7601a2;
        int i2;
        C9612q.m13917h(context, "context");
        AudioPlayerViewBinding inflate = AudioPlayerViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.state = new AudioPlayerViewState(null, null, false, 7, null);
        this.shouldAnimate = true;
        ViewAttachedListener viewAttachedListener = new ViewAttachedListener(this, new AudioPlayerView$attachStateChangeListener$1(this), null, 4, null);
        this.attachStateChangeListener = viewAttachedListener;
        m7601a = C11577n.m7601a(new AudioPlayerView$bounceAnimator$2(context));
        this.bounceAnimator$delegate = m7601a;
        m7601a2 = C11577n.m7601a(new AudioPlayerView$animatorManager$2(context, this));
        this.animatorManager$delegate = m7601a2;
        addOnAttachStateChangeListener(viewAttachedListener);
        LinearLayout _init_$lambda$0 = inflate.playerContainer;
        C9612q.m13918g(_init_$lambda$0, "_init_$lambda$0");
        int dpToPx = SizeUtilsKt.getDpToPx(8);
        _init_$lambda$0.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        _init_$lambda$0.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        ViewClippingUtilsKt.clipToRoundedRectangle(_init_$lambda$0, SizeUtilsKt.getDpToPx(24));
        _init_$lambda$0.setOrientation(0);
        _init_$lambda$0.setGravity(16);
        SimpleDraweeView simpleDraweeView = inflate.button;
        C9612q.m13918g(simpleDraweeView, "binding.button");
        ViewClippingUtilsKt.clipToCircle(simpleDraweeView);
        SimpleDraweeSpanTextView _init_$lambda$1 = inflate.text;
        C9612q.m13918g(_init_$lambda$1, "_init_$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 14.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, DiscordFont.PrimaryMedium);
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        if (ThemeManagerKt.getTheme() instanceof LightTheme) {
            i2 = C2912R.C2913drawable.drawable_audio_play_button_gradient_light;
        } else {
            i2 = C2912R.C2913drawable.drawable_audio_play_button_gradient_dark;
        }
        inflate.buttonContainer.setBackgroundResource(i2);
        inflate.wipe.setBackgroundResource(i2);
        C1365w0.m37185q0(this, new C1170a() { // from class: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView.3
            @Override // androidx.core.view.C1170a
            public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
                int i3;
                C9612q.m13917h(host, "host");
                C9612q.m13917h(child, "child");
                C9612q.m13917h(event, "event");
                LinearLayout linearLayout = AudioPlayerView.this.getBinding().playerContainer;
                if (event.getAction() == 32768) {
                    i3 = 2;
                } else {
                    i3 = 0;
                }
                linearLayout.setImportantForAccessibility(i3);
                return super.onRequestSendAccessibilityEvent(host, child, event);
            }
        });
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.chat.presentation.message.view.voicemessages.e
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                AudioPlayerView._init_$lambda$2(AudioPlayerView.this, view, i3, i4, i5, i6, i7, i8, i9, i10);
            }
        });
    }
}