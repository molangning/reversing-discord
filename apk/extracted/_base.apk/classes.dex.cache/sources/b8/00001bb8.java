package com.discord.notifications.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.notifications.api.StickerFormatType;
import com.discord.notifications.api.StickerType;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.StickerId;
import com.discord.primitives.StickerId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2590h;
import p045cj.C2620n1;
import p045cj.C2649w0;
import p470zi.InterfaceC14277f;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002VWB\u0088\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016Bf\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0019\u00105\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u0010(J\t\u00107\u001a\u00020\u0007HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010.J\u0019\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b:J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\t\u0010<\u001a\u00020\u000eHÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\t\u0010>\u001a\u00020\u0011HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010\u001bJv\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\t\u0010C\u001a\u00020\u0003HÖ\u0001J\u0013\u0010D\u001a\u00020\u00132\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\u0006\u0010G\u001a\u00020\u0007J\t\u0010H\u001a\u00020\u0003HÖ\u0001J\u0006\u0010I\u001a\u00020\u0013J\t\u0010J\u001a\u00020\u0007HÖ\u0001J!\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QHÇ\u0001J\u0019\u0010R\u001a\u00020L2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u0003HÖ\u0001R \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001c\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\"R'\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R'\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010)\u0012\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010(R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001fR \u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010/\u0012\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010.R\u001c\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u0019\u001a\u0004\b1\u0010\u001fR\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u0019\u001a\u0004\b3\u00104\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, m14357d2 = {"Lcom/discord/notifications/api/Sticker;", "Landroid/os/Parcelable;", "seen1", "", "id", "Lcom/discord/primitives/StickerId;", ZeroconfModule.KEY_SERVICE_NAME, "", "packId", "", "guildId", "Lcom/discord/primitives/GuildId;", "description", "formatType", "Lcom/discord/notifications/api/StickerFormatType;", "tags", "type", "Lcom/discord/notifications/api/StickerType;", "available", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/StickerId;Ljava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JLjava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAvailable$annotations", "()V", "getAvailable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDescription$annotations", "getDescription", "()Ljava/lang/String;", "getFormatType$annotations", "getFormatType", "()Lcom/discord/notifications/api/StickerFormatType;", "getGuildId-qOKuAAo$annotations", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "getId-e_wqtJY$annotations", "getId-e_wqtJY", "()J", "J", "getName$annotations", "getName", "getPackId$annotations", "getPackId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTags$annotations", "getTags", "getType$annotations", "getType", "()Lcom/discord/notifications/api/StickerType;", "component1", "component1-e_wqtJY", "component2", "component3", "component4", "component4-qOKuAAo", "component5", "component6", "component7", "component8", "component9", "copy", "copy-fJhvhH4", "(JLjava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;)Lcom/discord/notifications/api/Sticker;", "describeContents", "equals", "other", "", "getExtension", "hashCode", "isAnimated", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "notification_api_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class Sticker implements Parcelable {
    private final Boolean available;
    private final String description;
    private final StickerFormatType formatType;
    private final GuildId guildId;

    /* renamed from: id */
    private final long f8986id;
    private final String name;
    private final Long packId;
    private final String tags;
    private final StickerType type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Sticker> CREATOR = new Creator();

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/notifications/api/Sticker$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/api/Sticker;", "notification_api_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Sticker> serializer() {
            return Sticker$$serializer.INSTANCE;
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Creator implements Parcelable.Creator<Sticker> {
        @Override // android.os.Parcelable.Creator
        public final Sticker createFromParcel(Parcel parcel) {
            Boolean valueOf;
            C9612q.m13917h(parcel, "parcel");
            long m42107unboximpl = ((StickerId) parcel.readParcelable(Sticker.class.getClassLoader())).m42107unboximpl();
            String readString = parcel.readString();
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            GuildId guildId = (GuildId) parcel.readParcelable(Sticker.class.getClassLoader());
            String readString2 = parcel.readString();
            StickerFormatType valueOf3 = StickerFormatType.valueOf(parcel.readString());
            String readString3 = parcel.readString();
            StickerType valueOf4 = StickerType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Sticker(m42107unboximpl, readString, valueOf2, guildId, readString2, valueOf3, readString3, valueOf4, valueOf, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Sticker[] newArray(int i) {
            return new Sticker[i];
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickerFormatType.values().length];
            try {
                iArr[StickerFormatType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerFormatType.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickerFormatType.APNG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StickerFormatType.LOTTIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private Sticker(int i, StickerId stickerId, String str, Long l, GuildId guildId, String str2, StickerFormatType stickerFormatType, String str3, StickerType stickerType, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        long m42107unboximpl;
        if (2 != (i & 2)) {
            C2620n1.m32836b(i, 2, Sticker$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            m42107unboximpl = StickerId.m42099constructorimpl(0L);
        } else {
            m42107unboximpl = stickerId.m42107unboximpl();
        }
        this.f8986id = m42107unboximpl;
        this.name = str;
        if ((i & 4) == 0) {
            this.packId = null;
        } else {
            this.packId = l;
        }
        if ((i & 8) == 0) {
            this.guildId = null;
        } else {
            this.guildId = guildId;
        }
        if ((i & 16) == 0) {
            this.description = "";
        } else {
            this.description = str2;
        }
        if ((i & 32) == 0) {
            this.formatType = StickerFormatType.Companion.fromInt(0);
        } else {
            this.formatType = stickerFormatType;
        }
        if ((i & 64) == 0) {
            this.tags = "";
        } else {
            this.tags = str3;
        }
        if ((i & 128) == 0) {
            this.type = StickerType.Companion.fromInt(0);
        } else {
            this.type = stickerType;
        }
        if ((i & 256) == 0) {
            this.available = null;
        } else {
            this.available = bool;
        }
    }

    public /* synthetic */ Sticker(int i, StickerId stickerId, String str, Long l, GuildId guildId, String str2, StickerFormatType stickerFormatType, String str3, StickerType stickerType, Boolean bool, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, stickerId, str, l, guildId, str2, stickerFormatType, str3, stickerType, bool, serializationConstructorMarker);
    }

    public /* synthetic */ Sticker(long j, String str, Long l, GuildId guildId, String str2, StickerFormatType stickerFormatType, String str3, StickerType stickerType, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, l, guildId, str2, stickerFormatType, str3, stickerType, bool);
    }

    public static /* synthetic */ void getAvailable$annotations() {
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    public static /* synthetic */ void getFormatType$annotations() {
    }

    /* renamed from: getGuildId-qOKuAAo$annotations */
    public static /* synthetic */ void m42020getGuildIdqOKuAAo$annotations() {
    }

    /* renamed from: getId-e_wqtJY$annotations */
    public static /* synthetic */ void m42021getIde_wqtJY$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getPackId$annotations() {
    }

    public static /* synthetic */ void getTags$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final void write$Self(Sticker self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z8 = false;
        if (output.mo12879z(serialDesc, 0) || !StickerId.m42102equalsimpl0(self.f8986id, StickerId.m42099constructorimpl(0L))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12894i(serialDesc, 0, StickerId$$serializer.INSTANCE, StickerId.m42098boximpl(self.f8986id));
        }
        output.mo12880y(serialDesc, 1, self.name);
        if (output.mo12879z(serialDesc, 2) || self.packId != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 2, C2649w0.f7129a, self.packId);
        }
        if (output.mo12879z(serialDesc, 3) || self.guildId != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo12904E(serialDesc, 3, GuildId$$serializer.INSTANCE, self.guildId);
        }
        if (output.mo12879z(serialDesc, 4) || !C9612q.m13922c(self.description, "")) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            output.mo12880y(serialDesc, 4, self.description);
        }
        if (output.mo12879z(serialDesc, 5) || self.formatType != StickerFormatType.Companion.fromInt(0)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            output.mo12894i(serialDesc, 5, StickerFormatType.Serializer.INSTANCE, self.formatType);
        }
        if (output.mo12879z(serialDesc, 6) || !C9612q.m13922c(self.tags, "")) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            output.mo12880y(serialDesc, 6, self.tags);
        }
        if (output.mo12879z(serialDesc, 7) || self.type != StickerType.Companion.fromInt(0)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            output.mo12894i(serialDesc, 7, StickerType.Serializer.INSTANCE, self.type);
        }
        if (output.mo12879z(serialDesc, 8) || self.available != null) {
            z8 = true;
        }
        if (z8) {
            output.mo12904E(serialDesc, 8, C2590h.f7055a, self.available);
        }
    }

    /* renamed from: component1-e_wqtJY */
    public final long m42022component1e_wqtJY() {
        return this.f8986id;
    }

    public final String component2() {
        return this.name;
    }

    public final Long component3() {
        return this.packId;
    }

    /* renamed from: component4-qOKuAAo */
    public final GuildId m42023component4qOKuAAo() {
        return this.guildId;
    }

    public final String component5() {
        return this.description;
    }

    public final StickerFormatType component6() {
        return this.formatType;
    }

    public final String component7() {
        return this.tags;
    }

    public final StickerType component8() {
        return this.type;
    }

    public final Boolean component9() {
        return this.available;
    }

    /* renamed from: copy-fJhvhH4 */
    public final Sticker m42024copyfJhvhH4(long j, String name, Long l, GuildId guildId, String description, StickerFormatType formatType, String tags, StickerType type, Boolean bool) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(description, "description");
        C9612q.m13917h(formatType, "formatType");
        C9612q.m13917h(tags, "tags");
        C9612q.m13917h(type, "type");
        return new Sticker(j, name, l, guildId, description, formatType, tags, type, bool, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Sticker) {
            Sticker sticker = (Sticker) obj;
            return StickerId.m42102equalsimpl0(this.f8986id, sticker.f8986id) && C9612q.m13922c(this.name, sticker.name) && C9612q.m13922c(this.packId, sticker.packId) && C9612q.m13922c(this.guildId, sticker.guildId) && C9612q.m13922c(this.description, sticker.description) && this.formatType == sticker.formatType && C9612q.m13922c(this.tags, sticker.tags) && this.type == sticker.type && C9612q.m13922c(this.available, sticker.available);
        }
        return false;
    }

    public final Boolean getAvailable() {
        return this.available;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getExtension() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.formatType.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    return ".json";
                }
                throw new C11581q();
            }
            return ".png";
        }
        return "";
    }

    public final StickerFormatType getFormatType() {
        return this.formatType;
    }

    /* renamed from: getGuildId-qOKuAAo */
    public final GuildId m42025getGuildIdqOKuAAo() {
        return this.guildId;
    }

    /* renamed from: getId-e_wqtJY */
    public final long m42026getIde_wqtJY() {
        return this.f8986id;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getPackId() {
        return this.packId;
    }

    public final String getTags() {
        return this.tags;
    }

    public final StickerType getType() {
        return this.type;
    }

    public int hashCode() {
        int m42103hashCodeimpl = ((StickerId.m42103hashCodeimpl(this.f8986id) * 31) + this.name.hashCode()) * 31;
        Long l = this.packId;
        int hashCode = (m42103hashCodeimpl + (l == null ? 0 : l.hashCode())) * 31;
        GuildId guildId = this.guildId;
        int m42065hashCodeimpl = (((((((((hashCode + (guildId == null ? 0 : GuildId.m42065hashCodeimpl(guildId.m42069unboximpl()))) * 31) + this.description.hashCode()) * 31) + this.formatType.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.type.hashCode()) * 31;
        Boolean bool = this.available;
        return m42065hashCodeimpl + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isAnimated() {
        StickerFormatType stickerFormatType = this.formatType;
        return stickerFormatType == StickerFormatType.APNG || stickerFormatType == StickerFormatType.LOTTIE;
    }

    public String toString() {
        String m42105toStringimpl = StickerId.m42105toStringimpl(this.f8986id);
        String str = this.name;
        Long l = this.packId;
        GuildId guildId = this.guildId;
        String str2 = this.description;
        StickerFormatType stickerFormatType = this.formatType;
        String str3 = this.tags;
        StickerType stickerType = this.type;
        Boolean bool = this.available;
        return "Sticker(id=" + m42105toStringimpl + ", name=" + str + ", packId=" + l + ", guildId=" + guildId + ", description=" + str2 + ", formatType=" + stickerFormatType + ", tags=" + str3 + ", type=" + stickerType + ", available=" + bool + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        C9612q.m13917h(out, "out");
        out.writeParcelable(StickerId.m42098boximpl(this.f8986id), i);
        out.writeString(this.name);
        Long l = this.packId;
        if (l == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l.longValue());
        }
        out.writeParcelable(this.guildId, i);
        out.writeString(this.description);
        out.writeString(this.formatType.name());
        out.writeString(this.tags);
        out.writeString(this.type.name());
        Boolean bool = this.available;
        if (bool == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(bool.booleanValue() ? 1 : 0);
    }

    private Sticker(long j, String str, Long l, GuildId guildId, String str2, StickerFormatType stickerFormatType, String str3, StickerType stickerType, Boolean bool) {
        this.f8986id = j;
        this.name = str;
        this.packId = l;
        this.guildId = guildId;
        this.description = str2;
        this.formatType = stickerFormatType;
        this.tags = str3;
        this.type = stickerType;
        this.available = bool;
    }

    public /* synthetic */ Sticker(long j, String str, Long l, GuildId guildId, String str2, StickerFormatType stickerFormatType, String str3, StickerType stickerType, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? StickerId.m42099constructorimpl(0L) : j, str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : guildId, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? StickerFormatType.Companion.fromInt(0) : stickerFormatType, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? StickerType.Companion.fromInt(0) : stickerType, (i & 256) != 0 ? null : bool, null);
    }
}