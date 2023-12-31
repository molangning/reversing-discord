package com.discord.emoji;

import co.discord.media_engine.C2689b;
import com.discord.icons.IconUrlUtils;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9560w;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0004\n\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/emoji/RenderableEmoji;", "", "()V", "getContentDescription", "", "getUrl", "allowAnimation", "", "sizePx", "", "Companion", "CustomWithEmojiId", "CustomWithUrl", "Unicode", "Lcom/discord/emoji/RenderableEmoji$CustomWithEmojiId;", "Lcom/discord/emoji/RenderableEmoji$CustomWithUrl;", "Lcom/discord/emoji/RenderableEmoji$Unicode;", "emoji_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class RenderableEmoji {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> exceptions;

    @Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m14357d2 = {"Lcom/discord/emoji/RenderableEmoji$Companion;", "", "()V", "exceptions", "", "", "customWithEmojiId", "Lcom/discord/emoji/RenderableEmoji$CustomWithEmojiId;", "id", "", "isAnimated", "", "alt", "customWithUrl", "Lcom/discord/emoji/RenderableEmoji$CustomWithUrl;", "url", "unicode", "Lcom/discord/emoji/RenderableEmoji$Unicode;", "surrogates", "emoji_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CustomWithEmojiId customWithEmojiId(long j, boolean z, String alt) {
            C9612q.m13917h(alt, "alt");
            return new CustomWithEmojiId(j, z, alt);
        }

        public final CustomWithUrl customWithUrl(String url, String alt) {
            C9612q.m13917h(url, "url");
            C9612q.m13917h(alt, "alt");
            return new CustomWithUrl(url, alt);
        }

        public final Unicode unicode(String surrogates) {
            C9612q.m13917h(surrogates, "surrogates");
            return new Unicode(Surrogates.m41924constructorimpl(surrogates), null);
        }
    }

    @Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\r¨\u0006\u001c"}, m14357d2 = {"Lcom/discord/emoji/RenderableEmoji$CustomWithEmojiId;", "Lcom/discord/emoji/RenderableEmoji;", "emojiId", "", "isAnimated", "", "alt", "", "(JZLjava/lang/String;)V", "getAlt", "()Ljava/lang/String;", "getEmojiId", "()J", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "getContentDescription", "getUrl", "allowAnimation", "sizePx", "", "hashCode", "toString", "emoji_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class CustomWithEmojiId extends RenderableEmoji {
        private final String alt;
        private final long emojiId;
        private final boolean isAnimated;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomWithEmojiId(long j, boolean z, String alt) {
            super(null);
            C9612q.m13917h(alt, "alt");
            this.emojiId = j;
            this.isAnimated = z;
            this.alt = alt;
        }

        public static /* synthetic */ CustomWithEmojiId copy$default(CustomWithEmojiId customWithEmojiId, long j, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = customWithEmojiId.emojiId;
            }
            if ((i & 2) != 0) {
                z = customWithEmojiId.isAnimated;
            }
            if ((i & 4) != 0) {
                str = customWithEmojiId.alt;
            }
            return customWithEmojiId.copy(j, z, str);
        }

        public final long component1() {
            return this.emojiId;
        }

        public final boolean component2() {
            return this.isAnimated;
        }

        public final String component3() {
            return this.alt;
        }

        public final CustomWithEmojiId copy(long j, boolean z, String alt) {
            C9612q.m13917h(alt, "alt");
            return new CustomWithEmojiId(j, z, alt);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CustomWithEmojiId) {
                CustomWithEmojiId customWithEmojiId = (CustomWithEmojiId) obj;
                return this.emojiId == customWithEmojiId.emojiId && this.isAnimated == customWithEmojiId.isAnimated && C9612q.m13922c(this.alt, customWithEmojiId.alt);
            }
            return false;
        }

        public final String getAlt() {
            return this.alt;
        }

        @Override // com.discord.emoji.RenderableEmoji
        public String getContentDescription() {
            return this.alt;
        }

        public final long getEmojiId() {
            return this.emojiId;
        }

        @Override // com.discord.emoji.RenderableEmoji
        public String getUrl(boolean z, int i) {
            return IconUrlUtils.INSTANCE.getCustomEmojiUrl(this.emojiId, z && this.isAnimated, Integer.valueOf(i));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int m32716a = C2689b.m32716a(this.emojiId) * 31;
            boolean z = this.isAnimated;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return ((m32716a + i) * 31) + this.alt.hashCode();
        }

        public final boolean isAnimated() {
            return this.isAnimated;
        }

        public String toString() {
            long j = this.emojiId;
            boolean z = this.isAnimated;
            String str = this.alt;
            return "CustomWithEmojiId(emojiId=" + j + ", isAnimated=" + z + ", alt=" + str + ")";
        }
    }

    @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0016"}, m14357d2 = {"Lcom/discord/emoji/RenderableEmoji$CustomWithUrl;", "Lcom/discord/emoji/RenderableEmoji;", "url", "", "alt", "(Ljava/lang/String;Ljava/lang/String;)V", "getAlt", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "", "getContentDescription", "allowAnimation", "sizePx", "", "hashCode", "toString", "emoji_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class CustomWithUrl extends RenderableEmoji {
        private final String alt;
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomWithUrl(String url, String alt) {
            super(null);
            C9612q.m13917h(url, "url");
            C9612q.m13917h(alt, "alt");
            this.url = url;
            this.alt = alt;
        }

        public static /* synthetic */ CustomWithUrl copy$default(CustomWithUrl customWithUrl, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customWithUrl.url;
            }
            if ((i & 2) != 0) {
                str2 = customWithUrl.alt;
            }
            return customWithUrl.copy(str, str2);
        }

        public final String component1() {
            return this.url;
        }

        public final String component2() {
            return this.alt;
        }

        public final CustomWithUrl copy(String url, String alt) {
            C9612q.m13917h(url, "url");
            C9612q.m13917h(alt, "alt");
            return new CustomWithUrl(url, alt);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CustomWithUrl) {
                CustomWithUrl customWithUrl = (CustomWithUrl) obj;
                return C9612q.m13922c(this.url, customWithUrl.url) && C9612q.m13922c(this.alt, customWithUrl.alt);
            }
            return false;
        }

        public final String getAlt() {
            return this.alt;
        }

        @Override // com.discord.emoji.RenderableEmoji
        public String getContentDescription() {
            return this.alt;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + this.alt.hashCode();
        }

        public String toString() {
            String str = this.url;
            String str2 = this.alt;
            return "CustomWithUrl(url=" + str + ", alt=" + str2 + ")";
        }

        @Override // com.discord.emoji.RenderableEmoji
        public String getUrl(boolean z, int i) {
            return this.url;
        }
    }

    @Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\bJ \u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\t\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, m14357d2 = {"Lcom/discord/emoji/RenderableEmoji$Unicode;", "Lcom/discord/emoji/RenderableEmoji;", "surrogates", "Lcom/discord/emoji/Surrogates;", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "exception", "", "getException", "()Ljava/lang/String;", "getSurrogates-Mny0UXI", "Ljava/lang/String;", "component1", "component1-Mny0UXI", "copy", "copy-hLBmEAo", "(Ljava/lang/String;)Lcom/discord/emoji/RenderableEmoji$Unicode;", "equals", "", "other", "", "getContentDescription", "getUrl", "allowAnimation", "sizePx", "", "hashCode", "toString", "emoji_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class Unicode extends RenderableEmoji {
        private final String exception;
        private final String surrogates;

        private Unicode(String str) {
            super(null);
            this.surrogates = str;
            String m41931withoutDiversityimpl = Surrogates.m41931withoutDiversityimpl(str);
            this.exception = RenderableEmoji.exceptions.contains(m41931withoutDiversityimpl) ? m41931withoutDiversityimpl : null;
        }

        public /* synthetic */ Unicode(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* renamed from: copy-hLBmEAo$default */
        public static /* synthetic */ Unicode m41919copyhLBmEAo$default(Unicode unicode, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unicode.surrogates;
            }
            return unicode.m41921copyhLBmEAo(str);
        }

        /* renamed from: component1-Mny0UXI */
        public final String m41920component1Mny0UXI() {
            return this.surrogates;
        }

        /* renamed from: copy-hLBmEAo */
        public final Unicode m41921copyhLBmEAo(String surrogates) {
            C9612q.m13917h(surrogates, "surrogates");
            return new Unicode(surrogates, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unicode) && Surrogates.m41926equalsimpl0(this.surrogates, ((Unicode) obj).surrogates);
        }

        @Override // com.discord.emoji.RenderableEmoji
        public String getContentDescription() {
            return this.surrogates;
        }

        public final String getException() {
            return this.exception;
        }

        /* renamed from: getSurrogates-Mny0UXI */
        public final String m41922getSurrogatesMny0UXI() {
            return this.surrogates;
        }

        @Override // com.discord.emoji.RenderableEmoji
        public String getUrl(boolean z, int i) {
            return Surrogates.m41928toAssetUrlimpl(this.surrogates);
        }

        public int hashCode() {
            return Surrogates.m41927hashCodeimpl(this.surrogates);
        }

        public String toString() {
            String m41930toStringimpl = Surrogates.m41930toStringimpl(this.surrogates);
            return "Unicode(surrogates=" + m41930toStringimpl + ")";
        }
    }

    static {
        Set<String> m14002i;
        m14002i = C9560w.m14002i("™", "©", "®");
        exceptions = m14002i;
    }

    private RenderableEmoji() {
    }

    public /* synthetic */ RenderableEmoji(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getContentDescription();

    public abstract String getUrl(boolean z, int i);
}