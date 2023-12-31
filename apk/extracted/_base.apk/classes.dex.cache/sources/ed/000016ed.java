package com.discord.emoji_picker;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001bB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m14357d2 = {"Lcom/discord/emoji_picker/EmojiPickerRow;", "", "rowContentWidth", "", "rowContentPaddingVertical", "itemSize", "items", "", "Lcom/discord/emoji_picker/EmojiPickerRow$Emoji;", "(IIILjava/util/List;)V", "getItemSize", "()I", "getItems", "()Ljava/util/List;", "getRowContentPaddingVertical", "getRowContentWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Emoji", "emoji_picker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class EmojiPickerRow {
    private final int itemSize;
    private final List<Emoji> items;
    private final int rowContentPaddingVertical;
    private final int rowContentWidth;

    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m14357d2 = {"Lcom/discord/emoji_picker/EmojiPickerRow$Emoji;", "", "id", "", ZeroconfModule.KEY_SERVICE_NAME, "url", "disabled", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDisabled", "()Z", "getId", "()Ljava/lang/String;", "getName", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "emoji_picker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class Emoji {
        private final boolean disabled;

        /* renamed from: id */
        private final String f8703id;
        private final String name;
        private final String url;

        public Emoji(String str, String name, String url, boolean z) {
            C9612q.m13917h(name, "name");
            C9612q.m13917h(url, "url");
            this.f8703id = str;
            this.name = name;
            this.url = url;
            this.disabled = z;
        }

        public static /* synthetic */ Emoji copy$default(Emoji emoji, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = emoji.f8703id;
            }
            if ((i & 2) != 0) {
                str2 = emoji.name;
            }
            if ((i & 4) != 0) {
                str3 = emoji.url;
            }
            if ((i & 8) != 0) {
                z = emoji.disabled;
            }
            return emoji.copy(str, str2, str3, z);
        }

        public final String component1() {
            return this.f8703id;
        }

        public final String component2() {
            return this.name;
        }

        public final String component3() {
            return this.url;
        }

        public final boolean component4() {
            return this.disabled;
        }

        public final Emoji copy(String str, String name, String url, boolean z) {
            C9612q.m13917h(name, "name");
            C9612q.m13917h(url, "url");
            return new Emoji(str, name, url, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Emoji) {
                Emoji emoji = (Emoji) obj;
                return C9612q.m13922c(this.f8703id, emoji.f8703id) && C9612q.m13922c(this.name, emoji.name) && C9612q.m13922c(this.url, emoji.url) && this.disabled == emoji.disabled;
            }
            return false;
        }

        public final boolean getDisabled() {
            return this.disabled;
        }

        public final String getId() {
            return this.f8703id;
        }

        public final String getName() {
            return this.name;
        }

        public final String getUrl() {
            return this.url;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.f8703id;
            int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.name.hashCode()) * 31) + this.url.hashCode()) * 31;
            boolean z = this.disabled;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            String str = this.f8703id;
            String str2 = this.name;
            String str3 = this.url;
            boolean z = this.disabled;
            return "Emoji(id=" + str + ", name=" + str2 + ", url=" + str3 + ", disabled=" + z + ")";
        }
    }

    public EmojiPickerRow(int i, int i2, int i3, List<Emoji> items) {
        C9612q.m13917h(items, "items");
        this.rowContentWidth = i;
        this.rowContentPaddingVertical = i2;
        this.itemSize = i3;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmojiPickerRow copy$default(EmojiPickerRow emojiPickerRow, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = emojiPickerRow.rowContentWidth;
        }
        if ((i4 & 2) != 0) {
            i2 = emojiPickerRow.rowContentPaddingVertical;
        }
        if ((i4 & 4) != 0) {
            i3 = emojiPickerRow.itemSize;
        }
        if ((i4 & 8) != 0) {
            list = emojiPickerRow.items;
        }
        return emojiPickerRow.copy(i, i2, i3, list);
    }

    public final int component1() {
        return this.rowContentWidth;
    }

    public final int component2() {
        return this.rowContentPaddingVertical;
    }

    public final int component3() {
        return this.itemSize;
    }

    public final List<Emoji> component4() {
        return this.items;
    }

    public final EmojiPickerRow copy(int i, int i2, int i3, List<Emoji> items) {
        C9612q.m13917h(items, "items");
        return new EmojiPickerRow(i, i2, i3, items);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmojiPickerRow) {
            EmojiPickerRow emojiPickerRow = (EmojiPickerRow) obj;
            return this.rowContentWidth == emojiPickerRow.rowContentWidth && this.rowContentPaddingVertical == emojiPickerRow.rowContentPaddingVertical && this.itemSize == emojiPickerRow.itemSize && C9612q.m13922c(this.items, emojiPickerRow.items);
        }
        return false;
    }

    public final int getItemSize() {
        return this.itemSize;
    }

    public final List<Emoji> getItems() {
        return this.items;
    }

    public final int getRowContentPaddingVertical() {
        return this.rowContentPaddingVertical;
    }

    public final int getRowContentWidth() {
        return this.rowContentWidth;
    }

    public int hashCode() {
        return (((((this.rowContentWidth * 31) + this.rowContentPaddingVertical) * 31) + this.itemSize) * 31) + this.items.hashCode();
    }

    public String toString() {
        int i = this.rowContentWidth;
        int i2 = this.rowContentPaddingVertical;
        int i3 = this.itemSize;
        List<Emoji> list = this.items;
        return "EmojiPickerRow(rowContentWidth=" + i + ", rowContentPaddingVertical=" + i2 + ", itemSize=" + i3 + ", items=" + list + ")";
    }
}