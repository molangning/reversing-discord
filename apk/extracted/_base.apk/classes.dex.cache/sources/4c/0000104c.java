package com.discord.chat.bridge.embed;

import com.facebook.react.util.JSStackTrace;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlinx.serialization.KSerializer;
import org.webrtc.MediaStreamTrack;
import p045cj.C2569c0;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class EmbedType$Companion$$cachedSerializer$delegate$1 extends AbstractC9614s implements Function0<KSerializer<Object>> {
    public static final EmbedType$Companion$$cachedSerializer$delegate$1 INSTANCE = new EmbedType$Companion$$cachedSerializer$delegate$1();

    EmbedType$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return C2569c0.m32959a("com.discord.chat.bridge.embed.EmbedType", EmbedType.values(), new String[]{"article", "image", MediaStreamTrack.VIDEO_TRACK_KIND, "tweet", "link", "html", JSStackTrace.FILE_KEY, "gifv", "rich", "text", "application_news", "post_preview", "safety_policy_notice", "unknown"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null});
    }
}