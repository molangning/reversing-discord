package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager;
import com.discord.media_player.MediaPlayer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "event", "Lcom/discord/media_player/MediaPlayer$Event;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AudioPlayerManager$setupPlayer$1$1 extends AbstractC9614s implements Function1<MediaPlayer.Event, Unit> {
    final /* synthetic */ Function1<MediaPlayer.Event, Unit> $onStateChanged;
    final /* synthetic */ AudioPlayerManager.AudioSource $source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AudioPlayerManager$setupPlayer$1$1(AudioPlayerManager.AudioSource audioSource, Function1<? super MediaPlayer.Event, Unit> function1) {
        super(1);
        this.$source = audioSource;
        this.$onStateChanged = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MediaPlayer.Event event) {
        invoke2(event);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(MediaPlayer.Event event) {
        MediaPlayer.Event event2;
        Map map;
        C9612q.m13917h(event, "event");
        if (C9612q.m13922c(event, MediaPlayer.Event.PlaybackEnded.INSTANCE)) {
            map = AudioPlayerManager.currentProgressMap;
            map.remove(this.$source);
            AudioPlayerManager.INSTANCE.abandonAudioFocus();
        } else {
            AudioPlayerManager.INSTANCE.storeDuration(this.$source);
        }
        event2 = AudioPlayerManager.mediaPlayerState;
        if (C9612q.m13922c(event2, event)) {
            return;
        }
        AudioPlayerManager.mediaPlayerState = event;
        this.$onStateChanged.invoke(event);
    }
}