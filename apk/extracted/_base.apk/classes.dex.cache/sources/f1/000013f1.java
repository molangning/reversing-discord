package com.discord.chat.presentation.message.view.voicemessages;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import co.discord.media_engine.C2689b;
import com.discord.media_player.MediaPlayer;
import com.discord.media_player.MediaSource;
import com.discord.media_player.MediaType;
import com.discord.primitives.MessageId;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.C9736q;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.webrtc.MediaStreamTrack;

@Metadata(m14358d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002;<B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u0005J\u0012\u0010#\u001a\u0004\u0018\u00010\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u0005J\u0012\u0010$\u001a\u0004\u0018\u00010\u00192\b\u0010\"\u001a\u0004\u0018\u00010\u0005J\u0010\u0010%\u001a\u00020\u001e2\b\u0010&\u001a\u0004\u0018\u00010\u0005J\u000e\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020)J\u001a\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0002J\u0006\u0010-\u001a\u00020 J\b\u0010.\u001a\u00020 H\u0002J\u0010\u0010.\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\u0005J\u000e\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020\u001eJ\b\u00101\u001a\u00020 H\u0002J\u0010\u00101\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\u0005J\u0010\u00102\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0005J\b\u00103\u001a\u00020\u001eH\u0002J\u001e\u00104\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00052\u0006\u00105\u001a\u0002062\u0006\u0010+\u001a\u00020,J2\u00107\u001a\u00020 2\u0006\u0010(\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020 09J\u0010\u0010:\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0005R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;", "", "()V", "_currentPlayerSourceFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;", "audioManager", "Landroid/media/AudioManager;", "currentPlayerSource", "getCurrentPlayerSource", "()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;", "currentPlayerSourceFlow", "Lkotlinx/coroutines/flow/Flow;", "getCurrentPlayerSourceFlow", "()Lkotlinx/coroutines/flow/Flow;", "currentProgressMap", "", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;", "focusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "focusRequest", "Landroid/media/AudioFocusRequest;", "mediaPlayer", "Lcom/discord/media_player/MediaPlayer;", "mediaPlayerState", "Lcom/discord/media_player/MediaPlayer$Event;", "playbackAttributes", "Landroid/media/AudioAttributes;", "kotlin.jvm.PlatformType", "wasPlayingBeforePause", "", "abandonAudioFocus", "", "getCurrentProgress", "source", "getPlayer", "getState", "hasCurrentPlayer", "audioSource", "init", "context", "Landroid/content/Context;", "maybeCreateDuration", "durationMs", "", "maybePlayCurrentPlayer", "pause", "pauseCurrentPlayer", "storePauseState", "play", "releasePlayer", "requestAudioFocus", "setCurrentProgress", "progress", "", "setupPlayer", "onStateChanged", "Lkotlin/Function1;", "storeDuration", "AudioSource", "CurrentProgress", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AudioPlayerManager {
    private static final MutableStateFlow<AudioSource> _currentPlayerSourceFlow;
    private static AudioManager audioManager;
    private static final Flow<AudioSource> currentPlayerSourceFlow;
    private static AudioFocusRequest focusRequest;
    private static MediaPlayer mediaPlayer;
    private static MediaPlayer.Event mediaPlayerState;
    private static boolean wasPlayingBeforePause;
    public static final AudioPlayerManager INSTANCE = new AudioPlayerManager();
    private static final AudioManager.OnAudioFocusChangeListener focusListener = new AudioManager.OnAudioFocusChangeListener() { // from class: com.discord.chat.presentation.message.view.voicemessages.b
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            AudioPlayerManager.focusListener$lambda$0(i);
        }
    };
    private static final AudioAttributes playbackAttributes = new AudioAttributes.Builder().setUsage(2).setContentType(1).build();
    private static final Map<AudioSource, CurrentProgress> currentProgressMap = new LinkedHashMap();

    @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\bJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J*\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;", "", "messageId", "Lcom/discord/primitives/MessageId;", "url", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getUrl", "component1", "component1-3Eiw7ao", "component2", "copy", "copy-ntcYbpo", "(Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;", "equals", "", "other", "hashCode", "", "toString", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class AudioSource {
        private final String messageId;
        private final String url;

        private AudioSource(String str, String str2) {
            this.messageId = str;
            this.url = str2;
        }

        public /* synthetic */ AudioSource(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* renamed from: copy-ntcYbpo$default */
        public static /* synthetic */ AudioSource m41780copyntcYbpo$default(AudioSource audioSource, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = audioSource.messageId;
            }
            if ((i & 2) != 0) {
                str2 = audioSource.url;
            }
            return audioSource.m41782copyntcYbpo(str, str2);
        }

        /* renamed from: component1-3Eiw7ao */
        public final String m41781component13Eiw7ao() {
            return this.messageId;
        }

        public final String component2() {
            return this.url;
        }

        /* renamed from: copy-ntcYbpo */
        public final AudioSource m41782copyntcYbpo(String messageId, String url) {
            C9612q.m13917h(messageId, "messageId");
            C9612q.m13917h(url, "url");
            return new AudioSource(messageId, url, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AudioSource) {
                AudioSource audioSource = (AudioSource) obj;
                return MessageId.m42077equalsimpl0(this.messageId, audioSource.messageId) && C9612q.m13922c(this.url, audioSource.url);
            }
            return false;
        }

        /* renamed from: getMessageId-3Eiw7ao */
        public final String m41783getMessageId3Eiw7ao() {
            return this.messageId;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (MessageId.m42078hashCodeimpl(this.messageId) * 31) + this.url.hashCode();
        }

        public String toString() {
            String m42079toStringimpl = MessageId.m42079toStringimpl(this.messageId);
            String str = this.url;
            return "AudioSource(messageId=" + m42079toStringimpl + ", url=" + str + ")";
        }
    }

    @Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;", "", "currentProgress", "", "durationMs", "(JJ)V", "getCurrentProgress", "()J", "currentProgressPercentage", "", "getCurrentProgressPercentage", "()F", "getDurationMs", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class CurrentProgress {
        private final long currentProgress;
        private final float currentProgressPercentage;
        private final long durationMs;

        public CurrentProgress(long j, long j2) {
            this.currentProgress = j;
            this.durationMs = j2;
            this.currentProgressPercentage = ((float) j) / ((float) j2);
        }

        public static /* synthetic */ CurrentProgress copy$default(CurrentProgress currentProgress, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = currentProgress.currentProgress;
            }
            if ((i & 2) != 0) {
                j2 = currentProgress.durationMs;
            }
            return currentProgress.copy(j, j2);
        }

        public final long component1() {
            return this.currentProgress;
        }

        public final long component2() {
            return this.durationMs;
        }

        public final CurrentProgress copy(long j, long j2) {
            return new CurrentProgress(j, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CurrentProgress) {
                CurrentProgress currentProgress = (CurrentProgress) obj;
                return this.currentProgress == currentProgress.currentProgress && this.durationMs == currentProgress.durationMs;
            }
            return false;
        }

        public final long getCurrentProgress() {
            return this.currentProgress;
        }

        public final float getCurrentProgressPercentage() {
            return this.currentProgressPercentage;
        }

        public final long getDurationMs() {
            return this.durationMs;
        }

        public int hashCode() {
            return (C2689b.m32716a(this.currentProgress) * 31) + C2689b.m32716a(this.durationMs);
        }

        public String toString() {
            long j = this.currentProgress;
            long j2 = this.durationMs;
            return "CurrentProgress(currentProgress=" + j + ", durationMs=" + j2 + ")";
        }
    }

    static {
        MutableStateFlow<AudioSource> m13396a = C9736q.m13396a(null);
        _currentPlayerSourceFlow = m13396a;
        currentPlayerSourceFlow = m13396a;
    }

    private AudioPlayerManager() {
    }

    public final void abandonAudioFocus() {
        AudioManager audioManager2 = null;
        AudioFocusRequest audioFocusRequest = null;
        if (Build.VERSION.SDK_INT >= 26) {
            AudioManager audioManager3 = audioManager;
            if (audioManager3 == null) {
                C9612q.m13900y("audioManager");
                audioManager3 = null;
            }
            AudioFocusRequest audioFocusRequest2 = focusRequest;
            if (audioFocusRequest2 == null) {
                C9612q.m13900y("focusRequest");
            } else {
                audioFocusRequest = audioFocusRequest2;
            }
            audioManager3.abandonAudioFocusRequest(audioFocusRequest);
            return;
        }
        AudioManager audioManager4 = audioManager;
        if (audioManager4 == null) {
            C9612q.m13900y("audioManager");
        } else {
            audioManager2 = audioManager4;
        }
        audioManager2.abandonAudioFocus(focusListener);
    }

    public static final void focusListener$lambda$0(int i) {
        if (i == 1) {
            INSTANCE.maybePlayCurrentPlayer();
        } else {
            INSTANCE.pauseCurrentPlayer(false);
        }
    }

    private final AudioSource getCurrentPlayerSource() {
        return _currentPlayerSourceFlow.getValue();
    }

    private final CurrentProgress maybeCreateDuration(AudioSource audioSource, long j) {
        Map<AudioSource, CurrentProgress> map = currentProgressMap;
        if (map.get(audioSource) != null) {
            return null;
        }
        CurrentProgress currentProgress = new CurrentProgress(0L, j);
        map.put(audioSource, currentProgress);
        return currentProgress;
    }

    private final void pause() {
        MediaPlayer mediaPlayer2 = mediaPlayer;
        if (mediaPlayer2 != null) {
            mediaPlayer2.pause();
        }
    }

    private final void play() {
        MediaPlayer mediaPlayer2;
        if (!requestAudioFocus() || (mediaPlayer2 = mediaPlayer) == null) {
            return;
        }
        mediaPlayer2.play();
    }

    private final boolean requestAudioFocus() {
        int requestAudioFocus;
        AudioManager audioManager2 = null;
        AudioFocusRequest audioFocusRequest = null;
        if (Build.VERSION.SDK_INT >= 26) {
            AudioManager audioManager3 = audioManager;
            if (audioManager3 == null) {
                C9612q.m13900y("audioManager");
                audioManager3 = null;
            }
            AudioFocusRequest audioFocusRequest2 = focusRequest;
            if (audioFocusRequest2 == null) {
                C9612q.m13900y("focusRequest");
            } else {
                audioFocusRequest = audioFocusRequest2;
            }
            requestAudioFocus = audioManager3.requestAudioFocus(audioFocusRequest);
        } else {
            AudioManager audioManager4 = audioManager;
            if (audioManager4 == null) {
                C9612q.m13900y("audioManager");
            } else {
                audioManager2 = audioManager4;
            }
            requestAudioFocus = audioManager2.requestAudioFocus(focusListener, 3, 4);
        }
        if (requestAudioFocus == 1) {
            return true;
        }
        return false;
    }

    public final Flow<AudioSource> getCurrentPlayerSourceFlow() {
        return currentPlayerSourceFlow;
    }

    public final CurrentProgress getCurrentProgress(AudioSource audioSource) {
        return currentProgressMap.get(audioSource);
    }

    public final MediaPlayer getPlayer(AudioSource audioSource) {
        if (hasCurrentPlayer(audioSource)) {
            return mediaPlayer;
        }
        return null;
    }

    public final MediaPlayer.Event getState(AudioSource audioSource) {
        if (hasCurrentPlayer(audioSource)) {
            return mediaPlayerState;
        }
        return null;
    }

    public final boolean hasCurrentPlayer(AudioSource audioSource) {
        return audioSource != null && C9612q.m13922c(getCurrentPlayerSource(), audioSource);
    }

    public final void init(Context context) {
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest build;
        C9612q.m13917h(context, "context");
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        C9612q.m13919f(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        audioManager = (AudioManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            onAudioFocusChangeListener = new AudioFocusRequest.Builder(4).setOnAudioFocusChangeListener(focusListener);
            audioAttributes = onAudioFocusChangeListener.setAudioAttributes(playbackAttributes);
            build = audioAttributes.build();
            C9612q.m13918g(build, "Builder(AudioManager.AUD…\n                .build()");
            focusRequest = build;
        }
    }

    public final void maybePlayCurrentPlayer() {
        if (wasPlayingBeforePause) {
            wasPlayingBeforePause = false;
            play();
        }
    }

    public final void pauseCurrentPlayer(boolean z) {
        if (z) {
            MediaPlayer mediaPlayer2 = mediaPlayer;
            boolean z2 = false;
            if (mediaPlayer2 != null && mediaPlayer2.shouldPlay()) {
                z2 = true;
            }
            wasPlayingBeforePause = z2;
        }
        pause();
        storeDuration(getCurrentPlayerSource());
    }

    public final void releasePlayer(AudioSource audioSource) {
        if (hasCurrentPlayer(audioSource)) {
            _currentPlayerSourceFlow.setValue(null);
            MediaPlayer mediaPlayer2 = mediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.reset();
            }
            mediaPlayerState = null;
            wasPlayingBeforePause = false;
        }
    }

    public final void setCurrentProgress(AudioSource source, float f, long j) {
        C9612q.m13917h(source, "source");
        Map<AudioSource, CurrentProgress> map = currentProgressMap;
        CurrentProgress currentProgress = map.get(source);
        if (currentProgress == null && (currentProgress = maybeCreateDuration(source, j)) == null) {
            return;
        }
        map.put(source, CurrentProgress.copy$default(currentProgress, f * ((float) j), 0L, 2, null));
    }

    public final void setupPlayer(Context context, AudioSource source, long j, Function1<? super MediaPlayer.Event, Unit> onStateChanged) {
        long j2;
        C9612q.m13917h(context, "context");
        C9612q.m13917h(source, "source");
        C9612q.m13917h(onStateChanged, "onStateChanged");
        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.Factory.INSTANCE.create(context);
        }
        if (!C9612q.m13922c(source, getCurrentPlayerSource())) {
            storeDuration(getCurrentPlayerSource());
            mediaPlayerState = null;
            MutableStateFlow<AudioSource> mutableStateFlow = _currentPlayerSourceFlow;
            mutableStateFlow.setValue(source);
            maybeCreateDuration(source, j);
            if (requestAudioFocus()) {
                mutableStateFlow.setValue(source);
                MediaPlayer mediaPlayer2 = mediaPlayer;
                C9612q.m13920e(mediaPlayer2);
                String url = source.getUrl();
                String url2 = source.getUrl();
                MediaSource mediaSource = new MediaSource(url, null, "audio attachment: " + url2, MediaType.AUDIO, false, null, 50, null);
                CurrentProgress currentProgress = currentProgressMap.get(source);
                if (currentProgress != null) {
                    j2 = currentProgress.getCurrentProgress();
                } else {
                    j2 = 0;
                }
                mediaPlayer2.preparePlayer(mediaSource, (i & 2) != 0 ? false : true, (i & 4) == 0 ? false : false, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? null : null, (i & 32) == 0 ? null : null);
            }
        }
        MediaPlayer mediaPlayer3 = mediaPlayer;
        C9612q.m13920e(mediaPlayer3);
        mediaPlayer3.setEventListener(new AudioPlayerManager$setupPlayer$1$1(source, onStateChanged));
        mediaPlayer3.setVolume(1.0f);
    }

    public final void storeDuration(AudioSource audioSource) {
        MediaPlayer mediaPlayer2;
        CurrentProgress copy$default;
        if (hasCurrentPlayer(audioSource) && (mediaPlayer2 = mediaPlayer) != null) {
            Map<AudioSource, CurrentProgress> map = currentProgressMap;
            C9612q.m13920e(audioSource);
            CurrentProgress currentProgress = map.get(audioSource);
            if (currentProgress != null && (copy$default = CurrentProgress.copy$default(currentProgress, mediaPlayer2.currentPositionMs(), 0L, 2, null)) != null) {
                map.put(audioSource, copy$default);
            }
        }
    }

    public final void pause(AudioSource audioSource) {
        if (hasCurrentPlayer(audioSource)) {
            pause();
        }
    }

    public final void play(AudioSource audioSource) {
        if (hasCurrentPlayer(audioSource)) {
            play();
        }
    }
}