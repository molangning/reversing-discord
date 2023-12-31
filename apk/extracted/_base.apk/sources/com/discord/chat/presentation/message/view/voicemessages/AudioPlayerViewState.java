package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager;
import com.discord.media_player.MediaPlayer;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B*\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0010J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J8\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0002\b\u001eJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010 H\u0000¢\u0006\u0002\b!J\u000f\u0010\"\u001a\u0004\u0018\u00010#H\u0000¢\u0006\u0002\b$J\t\u0010%\u001a\u00020&HÖ\u0001J\u0015\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0000¢\u0006\u0002\b)J\r\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,J\r\u0010-\u001a\u00020+H\u0000¢\u0006\u0002\b.J\r\u0010/\u001a\u00020+H\u0000¢\u0006\u0002\b0J!\u00101\u001a\u0004\u0018\u00010+2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0007H\u0000¢\u0006\u0002\b9J\r\u0010:\u001a\u00020+H\u0000¢\u0006\u0002\b;J\t\u0010<\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;", "", "messageId", "Lcom/discord/primitives/MessageId;", "sourceUrl", "", "attached", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAttached", "()Z", "audioSource", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;", "getAudioSource", "()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;", "getMessageId-N_6c4I0", "()Ljava/lang/String;", "Ljava/lang/String;", "getSourceUrl", "component1", "component1-N_6c4I0", "component2", "component3", "copy", "copy-P6IPuNM", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;", "equals", "other", "getCurrentProgress", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;", "getCurrentProgress$chat_release", "getMediaState", "Lcom/discord/media_player/MediaPlayer$Event;", "getMediaState$chat_release", "getPlayer", "Lcom/discord/media_player/MediaPlayer;", "getPlayer$chat_release", "hashCode", "", "isPlaying", "wasPlayingBeforeBeingPaused", "isPlaying$chat_release", "pause", "", "pause$chat_release", "play", "play$chat_release", "releasePlayer", "releasePlayer$chat_release", "setCurrentProgress", "progress", "", "durationMs", "", "setCurrentProgress$chat_release", "(FJ)Lkotlin/Unit;", "shouldEmitDuration", "shouldEmitDuration$chat_release", "storeDuration", "storeDuration$chat_release", "toString", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AudioPlayerViewState {
    private final boolean attached;
    private final AudioPlayerManager.AudioSource audioSource;
    private final String messageId;
    private final String sourceUrl;

    private AudioPlayerViewState(String str, String str2, boolean z) {
        this.messageId = str;
        this.sourceUrl = str2;
        this.attached = z;
        AudioPlayerManager.AudioSource audioSource = null;
        if (str != null && str2 != null) {
            audioSource = new AudioPlayerManager.AudioSource(str, str2, null);
        }
        this.audioSource = audioSource;
    }

    public /* synthetic */ AudioPlayerViewState(String str, String str2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z);
    }

    /* renamed from: copy-P6IPuNM$default  reason: not valid java name */
    public static /* synthetic */ AudioPlayerViewState m41785copyP6IPuNM$default(AudioPlayerViewState audioPlayerViewState, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioPlayerViewState.messageId;
        }
        if ((i & 2) != 0) {
            str2 = audioPlayerViewState.sourceUrl;
        }
        if ((i & 4) != 0) {
            z = audioPlayerViewState.attached;
        }
        return audioPlayerViewState.m41787copyP6IPuNM(str, str2, z);
    }

    /* renamed from: component1-N_6c4I0  reason: not valid java name */
    public final String m41786component1N_6c4I0() {
        return this.messageId;
    }

    public final String component2() {
        return this.sourceUrl;
    }

    public final boolean component3() {
        return this.attached;
    }

    /* renamed from: copy-P6IPuNM  reason: not valid java name */
    public final AudioPlayerViewState m41787copyP6IPuNM(String str, String str2, boolean z) {
        return new AudioPlayerViewState(str, str2, z, null);
    }

    public boolean equals(Object obj) {
        boolean m42077equalsimpl0;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AudioPlayerViewState) {
            AudioPlayerViewState audioPlayerViewState = (AudioPlayerViewState) obj;
            String str = this.messageId;
            String str2 = audioPlayerViewState.messageId;
            if (str == null) {
                if (str2 == null) {
                    m42077equalsimpl0 = true;
                }
                m42077equalsimpl0 = false;
            } else {
                if (str2 != null) {
                    m42077equalsimpl0 = MessageId.m42077equalsimpl0(str, str2);
                }
                m42077equalsimpl0 = false;
            }
            return m42077equalsimpl0 && C9612q.m13922c(this.sourceUrl, audioPlayerViewState.sourceUrl) && this.attached == audioPlayerViewState.attached;
        }
        return false;
    }

    public final boolean getAttached() {
        return this.attached;
    }

    public final AudioPlayerManager.AudioSource getAudioSource() {
        return this.audioSource;
    }

    public final AudioPlayerManager.CurrentProgress getCurrentProgress$chat_release() {
        return AudioPlayerManager.INSTANCE.getCurrentProgress(this.audioSource);
    }

    public final MediaPlayer.Event getMediaState$chat_release() {
        return AudioPlayerManager.INSTANCE.getState(this.audioSource);
    }

    /* renamed from: getMessageId-N_6c4I0  reason: not valid java name */
    public final String m41788getMessageIdN_6c4I0() {
        return this.messageId;
    }

    public final MediaPlayer getPlayer$chat_release() {
        return AudioPlayerManager.INSTANCE.getPlayer(this.audioSource);
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.messageId;
        int m42078hashCodeimpl = (str == null ? 0 : MessageId.m42078hashCodeimpl(str)) * 31;
        String str2 = this.sourceUrl;
        int hashCode = (m42078hashCodeimpl + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.attached;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isPlaying$chat_release(boolean z) {
        boolean z2;
        MediaPlayer player$chat_release = getPlayer$chat_release();
        if (player$chat_release != null && ((player$chat_release.shouldPlay() || player$chat_release.isPlaying()) && !player$chat_release.hasError())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || z) {
            return true;
        }
        return false;
    }

    public final void pause$chat_release() {
        AudioPlayerManager.INSTANCE.pause(this.audioSource);
    }

    public final void play$chat_release() {
        AudioPlayerManager.INSTANCE.play(this.audioSource);
    }

    public final void releasePlayer$chat_release() {
        AudioPlayerManager.INSTANCE.releasePlayer(this.audioSource);
    }

    public final Unit setCurrentProgress$chat_release(float f, long j) {
        AudioPlayerManager.AudioSource audioSource = this.audioSource;
        if (audioSource != null) {
            AudioPlayerManager.INSTANCE.setCurrentProgress(audioSource, f, j);
            return Unit.f25302a;
        }
        return null;
    }

    public final boolean shouldEmitDuration$chat_release() {
        MediaPlayer player$chat_release = getPlayer$chat_release();
        return player$chat_release != null && player$chat_release.shouldPlay();
    }

    public final void storeDuration$chat_release() {
        AudioPlayerManager.INSTANCE.storeDuration(this.audioSource);
    }

    public String toString() {
        String str = this.messageId;
        String m42079toStringimpl = str == null ? "null" : MessageId.m42079toStringimpl(str);
        String str2 = this.sourceUrl;
        boolean z = this.attached;
        return "AudioPlayerViewState(messageId=" + m42079toStringimpl + ", sourceUrl=" + str2 + ", attached=" + z + ")";
    }

    public /* synthetic */ AudioPlayerViewState(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, null);
    }
}
