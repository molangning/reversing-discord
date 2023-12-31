package com.discord.mobile_voice_overlay;

import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B@\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\rB*\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u0018\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J@\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001J!\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÇ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, m14357d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "", "seen1", "", "userId", "Lcom/discord/primitives/UserId;", "avatar", "", "speaking", "", "discriminator", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/UserId;Ljava/lang/String;ZILkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAvatar", "()Ljava/lang/String;", "getDiscriminator", "()I", "getSpeaking", "()Z", "getUserId-re6GcUE", "()J", "J", "component1", "component1-re6GcUE", "component2", "component3", "component4", "copy", "copy-ASSxI_0", "(JLjava/lang/String;ZI)Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "mobile_voice_overlay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MobileVoiceOverlayDataUser {
    public static final Companion Companion = new Companion(null);
    private final String avatar;
    private final int discriminator;
    private final boolean speaking;
    private final long userId;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "mobile_voice_overlay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MobileVoiceOverlayDataUser> serializer() {
            return MobileVoiceOverlayDataUser$$serializer.INSTANCE;
        }
    }

    private MobileVoiceOverlayDataUser(int i, UserId userId, String str, boolean z, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            C2620n1.m32836b(i, 15, MobileVoiceOverlayDataUser$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = userId.m42120unboximpl();
        this.avatar = str;
        this.speaking = z;
        this.discriminator = i2;
    }

    public /* synthetic */ MobileVoiceOverlayDataUser(int i, UserId userId, String str, boolean z, int i2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, userId, str, z, i2, serializationConstructorMarker);
    }

    public /* synthetic */ MobileVoiceOverlayDataUser(long j, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, z, i);
    }

    /* renamed from: copy-ASSxI_0$default */
    public static /* synthetic */ MobileVoiceOverlayDataUser m41955copyASSxI_0$default(MobileVoiceOverlayDataUser mobileVoiceOverlayDataUser, long j, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = mobileVoiceOverlayDataUser.userId;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = mobileVoiceOverlayDataUser.avatar;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            z = mobileVoiceOverlayDataUser.speaking;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            i = mobileVoiceOverlayDataUser.discriminator;
        }
        return mobileVoiceOverlayDataUser.m41957copyASSxI_0(j2, str2, z2, i);
    }

    public static final void write$Self(MobileVoiceOverlayDataUser self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12894i(serialDesc, 0, UserId$$serializer.INSTANCE, UserId.m42111boximpl(self.userId));
        output.mo12904E(serialDesc, 1, C2560a2.f7013a, self.avatar);
        output.mo12881x(serialDesc, 2, self.speaking);
        output.mo12882w(serialDesc, 3, self.discriminator);
    }

    /* renamed from: component1-re6GcUE */
    public final long m41956component1re6GcUE() {
        return this.userId;
    }

    public final String component2() {
        return this.avatar;
    }

    public final boolean component3() {
        return this.speaking;
    }

    public final int component4() {
        return this.discriminator;
    }

    /* renamed from: copy-ASSxI_0 */
    public final MobileVoiceOverlayDataUser m41957copyASSxI_0(long j, String str, boolean z, int i) {
        return new MobileVoiceOverlayDataUser(j, str, z, i, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MobileVoiceOverlayDataUser) {
            MobileVoiceOverlayDataUser mobileVoiceOverlayDataUser = (MobileVoiceOverlayDataUser) obj;
            return UserId.m42115equalsimpl0(this.userId, mobileVoiceOverlayDataUser.userId) && C9612q.m13922c(this.avatar, mobileVoiceOverlayDataUser.avatar) && this.speaking == mobileVoiceOverlayDataUser.speaking && this.discriminator == mobileVoiceOverlayDataUser.discriminator;
        }
        return false;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final int getDiscriminator() {
        return this.discriminator;
    }

    public final boolean getSpeaking() {
        return this.speaking;
    }

    /* renamed from: getUserId-re6GcUE */
    public final long m41958getUserIdre6GcUE() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m42116hashCodeimpl = UserId.m42116hashCodeimpl(this.userId) * 31;
        String str = this.avatar;
        int hashCode = (m42116hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.speaking;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.discriminator;
    }

    public String toString() {
        String m42118toStringimpl = UserId.m42118toStringimpl(this.userId);
        String str = this.avatar;
        boolean z = this.speaking;
        int i = this.discriminator;
        return "MobileVoiceOverlayDataUser(userId=" + m42118toStringimpl + ", avatar=" + str + ", speaking=" + z + ", discriminator=" + i + ")";
    }

    private MobileVoiceOverlayDataUser(long j, String str, boolean z, int i) {
        this.userId = j;
        this.avatar = str;
        this.speaking = z;
        this.discriminator = i;
    }
}