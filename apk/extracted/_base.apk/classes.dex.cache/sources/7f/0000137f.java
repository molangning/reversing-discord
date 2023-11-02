package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.C2912R;
import com.discord.chat.databinding.MediaViewBinding;
import com.discord.chat.presentation.message.view.media.ViewAttachedListener;
import com.discord.media_player.MediaPlayer;
import com.discord.media_player.MediaPlayerManager;
import com.discord.media_player.MediaPlayerManagerModule;
import com.discord.media_player.MediaPlayerView;
import com.discord.media_player.MediaSource;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.portals.PortalViewContextManager;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C9818l;

@Metadata(m14358d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u00103\u001a\u00020\u001dH\u0014J\u0012\u00104\u001a\u00020\u001d2\b\u00105\u001a\u0004\u0018\u000106H\u0014J\u0010\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\u0019H\u0016J\b\u00109\u001a\u00020\u001dH\u0002J\b\u0010:\u001a\u00020\u001dH\u0002J$\u0010;\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020%0<2\u0006\u0010)\u001a\u00020*2\u0006\u0010=\u001a\u00020\u0019H\u0002J\b\u0010>\u001a\u00020\u001dH\u0002J\b\u0010?\u001a\u00020\u001dH\u0002JË\u0001\u0010@\u001a\u00020\u001d2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010,\u001a\u00020\u00192\b\b\u0002\u0010.\u001a\u00020\u00192\b\b\u0002\u0010-\u001a\u00020\u00192\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010/\u001a\u00020\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010+\u001a\u00020\u00072\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010AJ(\u0010B\u001a\u00020\u001d2\u0016\u0010C\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010E\u0012\u0004\u0012\u00020\u001d\u0018\u00010D2\b\u0010F\u001a\u0004\u0018\u00010GJ=\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u00192\b\u0010J\u001a\u0004\u0018\u00010\u00102\b\u0010K\u001a\u0004\u0018\u00010\u000e2\b\u0010L\u001a\u0004\u0018\u00010\u00072\b\u0010M\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010NJ\u0010\u0010O\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u0019H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u001f\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u00100\u001a\u00020\u0019*\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006P"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/MediaView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "attachStateChangeListener", "Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;", "attachmentTagBackgroundColor", "Ljava/lang/Integer;", "attachmentTagIcon", "Lcom/discord/react_asset_fetcher/ReactAsset;", "attachmentTagText", "", "attachmentTagTextColor", "binding", "Lcom/discord/chat/databinding/MediaViewBinding;", "getBinding$annotations", "()V", "managerModule", "Lcom/discord/media_player/MediaPlayerManagerModule;", "mediaCanPlayInline", "", "mediaHidePlayButton", "mediaOnPlayCallback", "Lkotlin/Function0;", "", "mediaOrientation", "mediaPlayThirdParty", "mediaPlaybackState", "Lcom/discord/media_player/MediaPlayer$Event;", "mediaPlayer", "Lcom/discord/media_player/MediaPlayer;", "mediaPlayerView", "Lcom/discord/media_player/MediaPlayerView;", "mediaPortalEvent", "Lcom/discord/portals/PortalViewContextManager$Event;", "mediaShouldResume", "mediaSource", "Lcom/discord/media_player/MediaSource;", "mediaThumbnailFadeDuration", "mediaViewDetached", "mediaViewFocused", "mediaViewScrolling", "mediaVolumeOn", "shouldShowGifIndicator", "getShouldShowGifIndicator", "(Lcom/discord/media_player/MediaSource;)Z", "onAttachedToWindow", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onWindowFocusChanged", "hasWindowFocus", "pause", "play", "prepareMediaPlayer", "Lkotlin/Pair;", "loopMedia", "registerForPortal", "releasePlayer", "setMediaData", "(Lcom/discord/media_player/MediaSource;ZZZLcom/discord/media_player/MediaPlayer$Event;ZLjava/lang/Integer;Lcom/discord/portals/PortalViewContextManager$Event;ZZZILkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/discord/react_asset_fetcher/ReactAsset;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setOnMediaClickListeners", "onClickListener", "Lkotlin/Function1;", "", "onLongClickListener", "Landroid/view/View$OnLongClickListener;", "setupTag", "isTagVisible", "content", "icon", ViewProps.BACKGROUND_COLOR, "textColor", "(ZLjava/lang/String;Lcom/discord/react_asset_fetcher/ReactAsset;Ljava/lang/Integer;Ljava/lang/Integer;)V", "togglePortalControl", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class MediaView extends FrameLayout {
    private final ViewAttachedListener attachStateChangeListener;
    private Integer attachmentTagBackgroundColor;
    private ReactAsset attachmentTagIcon;
    private String attachmentTagText;
    private Integer attachmentTagTextColor;
    private final MediaViewBinding binding;
    private final MediaPlayerManagerModule managerModule;
    private boolean mediaCanPlayInline;
    private boolean mediaHidePlayButton;
    private Function0<Unit> mediaOnPlayCallback;
    private Integer mediaOrientation;
    private boolean mediaPlayThirdParty;
    private MediaPlayer.Event mediaPlaybackState;
    private MediaPlayer mediaPlayer;
    private MediaPlayerView mediaPlayerView;
    private PortalViewContextManager.Event mediaPortalEvent;
    private boolean mediaShouldResume;
    private MediaSource mediaSource;
    private int mediaThumbnailFadeDuration;
    private boolean mediaViewDetached;
    private boolean mediaViewFocused;
    private boolean mediaViewScrolling;
    private boolean mediaVolumeOn;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context) {
        this(context, null, 0, 6, null);
        C9612q.m13917h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ MediaView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private static /* synthetic */ void getBinding$annotations() {
    }

    private final boolean getShouldShowGifIndicator(MediaSource mediaSource) {
        return mediaSource.isGifv() && !mediaSource.getShouldAutoPlay();
    }

    private final void pause() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        togglePortalControl(false);
    }

    public final void play() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.play();
        }
        togglePortalControl(true);
    }

    private final Pair<MediaPlayer, MediaPlayerView> prepareMediaPlayer(MediaSource mediaSource, boolean z) {
        float f;
        MediaPlayerView mediaPlayerView = this.mediaPlayerView;
        if (mediaPlayerView == null) {
            Context context = getContext();
            C9612q.m13918g(context, "context");
            mediaPlayerView = new MediaPlayerView(context);
            addView(mediaPlayerView.getView(), 0, new FrameLayout.LayoutParams(-1, -1));
        }
        mediaPlayerView.setVisible(true);
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            MediaPlayerManager mediaPlayerManager = MediaPlayerManager.INSTANCE;
            Context context2 = getContext();
            C9612q.m13918g(context2, "context");
            Double portal = mediaSource.getPortal();
            C9612q.m13920e(portal);
            mediaPlayer = mediaPlayerManager.acquire(context2, portal.doubleValue());
        }
        mediaPlayer.setEventListener(new MediaView$prepareMediaPlayer$1$1(this));
        mediaPlayer.setVolumeListener(new MediaView$prepareMediaPlayer$1$2(this));
        if (mediaSource.isGifv()) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        mediaPlayer.setVolume(f);
        mediaPlayer.preparePlayer(mediaSource, (i & 2) != 0 ? false : true, (i & 4) == 0 ? z : false, (i & 8) != 0 ? 0L : 0L, (i & 16) != 0 ? null : mediaPlayerView, (i & 32) == 0 ? null : null);
        this.mediaPlayer = mediaPlayer;
        this.mediaPlayerView = mediaPlayerView;
        ViewMeasureExtensionsKt.measureAndLayout(this);
        return new Pair<>(mediaPlayer, mediaPlayerView);
    }

    private final void registerForPortal() {
        Double portal;
        Pair<MediaPlayer, MediaPlayerView> prepareMediaPlayer;
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource != null && (portal = mediaSource.getPortal()) != null) {
            double doubleValue = portal.doubleValue();
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null && this.mediaPlayerView != null) {
                C9612q.m13920e(mediaPlayer);
                MediaPlayerView mediaPlayerView = this.mediaPlayerView;
                C9612q.m13920e(mediaPlayerView);
                prepareMediaPlayer = new Pair<>(mediaPlayer, mediaPlayerView);
            } else if (mediaSource.isValid()) {
                prepareMediaPlayer = prepareMediaPlayer(mediaSource, mediaSource.isGifv());
            } else {
                return;
            }
            MediaPlayer m14351a = prepareMediaPlayer.m14351a();
            PortalViewContextManager.INSTANCE.addPortal(doubleValue, prepareMediaPlayer.m14350b().getView(), new MediaView$registerForPortal$1(this), new MediaView$registerForPortal$2(this, doubleValue, m14351a), new MediaView$registerForPortal$3(this, m14351a, doubleValue, mediaSource), new MediaView$registerForPortal$4(mediaSource, this));
        }
    }

    public final void releasePlayer() {
        Double d;
        Double portal;
        MediaPlayerManagerModule mediaPlayerManagerModule = this.managerModule;
        if (mediaPlayerManagerModule != null) {
            MediaSource mediaSource = this.mediaSource;
            if (mediaSource != null && (portal = mediaSource.getPortal()) != null) {
                mediaPlayerManagerModule.toggle(portal.doubleValue(), false);
            } else {
                return;
            }
        }
        MediaPlayerManager mediaPlayerManager = MediaPlayerManager.INSTANCE;
        MediaSource mediaSource2 = this.mediaSource;
        if (mediaSource2 != null) {
            d = mediaSource2.getPortal();
        } else {
            d = null;
        }
        mediaPlayerManager.release(d);
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            Unit unit = Unit.f25302a;
            this.mediaPlayer = null;
        }
        MediaPlayerView mediaPlayerView = this.mediaPlayerView;
        if (mediaPlayerView != null) {
            mediaPlayerView.reset();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setMediaData$default(MediaView mediaView, MediaSource mediaSource, boolean z, boolean z2, boolean z3, MediaPlayer.Event event, boolean z4, Integer num, PortalViewContextManager.Event event2, boolean z5, boolean z6, boolean z7, int i, Function0 function0, String str, ReactAsset reactAsset, Integer num2, Integer num3, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMediaData");
        }
        mediaView.setMediaData((i2 & 1) != 0 ? mediaView.mediaSource : mediaSource, (i2 & 2) != 0 ? mediaView.mediaViewDetached : z, (i2 & 4) != 0 ? mediaView.mediaViewScrolling : z2, (i2 & 8) != 0 ? mediaView.mediaViewFocused : z3, (i2 & 16) != 0 ? mediaView.mediaPlaybackState : event, (i2 & 32) != 0 ? mediaView.mediaVolumeOn : z4, (i2 & 64) != 0 ? mediaView.mediaOrientation : num, (i2 & 128) != 0 ? mediaView.mediaPortalEvent : event2, (i2 & 256) != 0 ? mediaView.mediaCanPlayInline : z5, (i2 & 512) != 0 ? mediaView.mediaPlayThirdParty : z6, (i2 & 1024) != 0 ? mediaView.mediaHidePlayButton : z7, (i2 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? mediaView.mediaThumbnailFadeDuration : i, (i2 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? mediaView.mediaOnPlayCallback : function0, (i2 & 8192) != 0 ? mediaView.attachmentTagText : str, (i2 & 16384) != 0 ? mediaView.attachmentTagIcon : reactAsset, (i2 & 32768) != 0 ? mediaView.attachmentTagBackgroundColor : num2, (i2 & 65536) != 0 ? mediaView.attachmentTagTextColor : num3);
    }

    public static final void setMediaData$lambda$3(MediaView this$0, MediaSource mediaSource, View view) {
        C9612q.m13917h(this$0, "this$0");
        if (this$0.mediaPlayer != null && this$0.mediaPlayerView != null) {
            this$0.play();
            return;
        }
        this$0.prepareMediaPlayer(mediaSource, false);
        this$0.mediaOnPlayCallback.invoke();
    }

    public static final void setMediaData$lambda$5(MediaView this$0, boolean z, MediaSource mediaSource, View view) {
        Double portal;
        float f;
        C9612q.m13917h(this$0, "this$0");
        MediaPlayer mediaPlayer = this$0.mediaPlayer;
        if (mediaPlayer != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            mediaPlayer.setVolume(f);
        }
        if (mediaSource != null && (portal = mediaSource.getPortal()) != null) {
            double doubleValue = portal.doubleValue();
            MediaPlayerManagerModule mediaPlayerManagerModule = this$0.managerModule;
            if (mediaPlayerManagerModule != null) {
                mediaPlayerManagerModule.onMuteToggle(doubleValue, z);
            }
        }
    }

    public static final void setOnMediaClickListeners$lambda$7(MediaView this$0, Function1 function1, View view) {
        Double portal;
        C9612q.m13917h(this$0, "this$0");
        this$0.registerForPortal();
        MediaSource mediaSource = this$0.mediaSource;
        Double d = null;
        if (mediaSource != null && (portal = mediaSource.getPortal()) != null) {
            portal.doubleValue();
            MediaSource mediaSource2 = this$0.mediaSource;
            boolean z = false;
            if (mediaSource2 != null && mediaSource2.isValid()) {
                z = true;
            }
            if (z) {
                d = portal;
            }
        }
        function1.invoke(d);
    }

    private final void setupTag(boolean z, String str, ReactAsset reactAsset, Integer num, Integer num2) {
        int i;
        boolean z2;
        int i2;
        ConstraintLayout setupTag$lambda$8 = this.binding.attachmentTag;
        C9612q.m13918g(setupTag$lambda$8, "setupTag$lambda$8");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        setupTag$lambda$8.setVisibility(i);
        if (num != null) {
            setupTag$lambda$8.setBackgroundTintList(ColorStateList.valueOf(num.intValue()));
        }
        ConstraintLayout constraintLayout = this.binding.attachmentTag;
        C9612q.m13918g(constraintLayout, "binding.attachmentTag");
        if (constraintLayout.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = C2912R.color.white_500;
        }
        SimpleDraweeView setupTag$lambda$9 = this.binding.attachmentTagIcon;
        if (reactAsset != null) {
            C9612q.m13918g(setupTag$lambda$9, "setupTag$lambda$9");
            setupTag$lambda$9.setVisibility(0);
            ReactAssetUtilsKt.setReactAsset(setupTag$lambda$9, reactAsset);
            ColorUtilsKt.setTintColor(setupTag$lambda$9, Integer.valueOf(i2));
        } else {
            C9612q.m13918g(setupTag$lambda$9, "setupTag$lambda$9");
            setupTag$lambda$9.setVisibility(8);
        }
        TextView textView = this.binding.attachmentTagText;
        textView.setTextColor(i2);
        textView.setText(str);
    }

    private final void togglePortalControl(boolean z) {
        Double portal;
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource == null || (portal = mediaSource.getPortal()) == null) {
            return;
        }
        double doubleValue = portal.doubleValue();
        MediaPlayerManagerModule mediaPlayerManagerModule = this.managerModule;
        if (mediaPlayerManagerModule != null) {
            mediaPlayerManagerModule.toggle(doubleValue, z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9818l.m13179d(CoroutineViewUtilsKt.attachedScope(this, true), null, null, new MediaView$onAttachedToWindow$1(this, null), 3, null);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        Integer num;
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            num = Integer.valueOf(configuration.orientation);
        } else {
            num = null;
        }
        setMediaData$default(this, null, false, false, false, null, false, num, null, false, false, false, 0, null, null, null, null, null, 131007, null);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        setMediaData$default(this, null, false, false, z, null, false, null, null, false, false, false, 0, null, null, null, null, null, 131063, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:579:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x019c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:620:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x01b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:632:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x01e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:645:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x02a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:697:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x0307 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:722:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setMediaData(final com.discord.media_player.MediaSource r24, boolean r25, boolean r26, boolean r27, com.discord.media_player.MediaPlayer.Event r28, final boolean r29, java.lang.Integer r30, com.discord.portals.PortalViewContextManager.Event r31, boolean r32, boolean r33, boolean r34, int r35, kotlin.jvm.functions.Function0<kotlin.Unit> r36, java.lang.String r37, com.discord.react_asset_fetcher.ReactAsset r38, java.lang.Integer r39, java.lang.Integer r40) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.MediaView.setMediaData(com.discord.media_player.MediaSource, boolean, boolean, boolean, com.discord.media_player.MediaPlayer$Event, boolean, java.lang.Integer, com.discord.portals.PortalViewContextManager$Event, boolean, boolean, boolean, int, kotlin.jvm.functions.Function0, java.lang.String, com.discord.react_asset_fetcher.ReactAsset, java.lang.Integer, java.lang.Integer):void");
    }

    public final void setOnMediaClickListeners(final Function1<? super Double, Unit> function1, View.OnLongClickListener onLongClickListener) {
        View.OnClickListener onClickListener;
        if (function1 != null) {
            onClickListener = new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MediaView.setOnMediaClickListeners$lambda$7(MediaView.this, function1, view);
                }
            };
        } else {
            onClickListener = null;
        }
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, onClickListener, 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(this, false, onLongClickListener, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        MediaViewBinding inflate = MediaViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.mediaViewFocused = true;
        this.mediaViewDetached = true;
        this.mediaCanPlayInline = true;
        this.mediaThumbnailFadeDuration = getResources().getInteger(C2912R.integer.image_fade_duration);
        this.mediaOnPlayCallback = MediaView$mediaOnPlayCallback$1.INSTANCE;
        ThemedReactContext themedReactContext = (ThemedReactContext) (!(context instanceof ThemedReactContext) ? null : context);
        this.managerModule = themedReactContext != null ? (MediaPlayerManagerModule) themedReactContext.getNativeModule(MediaPlayerManagerModule.class) : null;
        ViewAttachedListener viewAttachedListener = new ViewAttachedListener(this, new MediaView$attachStateChangeListener$1(this), new MediaView$attachStateChangeListener$2(this));
        this.attachStateChangeListener = viewAttachedListener;
        addOnAttachStateChangeListener(viewAttachedListener);
        ImageView _init_$lambda$0 = inflate.inlineMediaPlayButton;
        C9612q.m13918g(_init_$lambda$0, "_init_$lambda$0");
        ViewBackgroundUtilsKt.setBackgroundOval$default(_init_$lambda$0, -16777216, 0, 2, null);
        ColorUtilsKt.setTintColor(_init_$lambda$0, (Integer) (-1));
        I18nUtilsKt.i18nContentDescription$default(_init_$lambda$0, I18nMessage.PLAY_FULL_VIDEO, (Function1) null, 2, (Object) null);
        SimpleDraweeView simpleDraweeView = inflate.inlineMediaGifIndicator;
        C9612q.m13918g(simpleDraweeView, "binding.inlineMediaGifIndicator");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.Gif);
        SimpleDraweeView simpleDraweeView2 = inflate.inlineMediaImagePreview;
        simpleDraweeView2.getHierarchy().m31460z(new ColorDrawable(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(simpleDraweeView2.getResources().getDimensionPixelSize(C2912R.dimen.message_media_view_stroke), ColorUtilsKt.getColorCompat(context, C2912R.color.chat_media_view_stroke));
        simpleDraweeView2.getHierarchy().m31461y(gradientDrawable);
    }
}