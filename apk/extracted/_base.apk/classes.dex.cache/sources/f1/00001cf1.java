package com.discord.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import co.discord.media_engine.C2689b;
import com.discord.snowflake.SnowflakePrimitive;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087@\u0018\u0000 $2\u00020\u0001:\u0002#$B\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, m14357d2 = {"Lcom/discord/primitives/StickerId;", "Lcom/discord/snowflake/SnowflakePrimitive;", "snowflake", "", "Lcom/discord/snowflake/Snowflake;", "constructor-impl", "(J)J", "getSnowflake", "()J", "describeContents", "", "describeContents-impl", "(J)I", "equals", "", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isValid", "isValid-impl", "(J)Z", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "writeToParcel-impl", "(JLandroid/os/Parcel;I)V", "$serializer", "Companion", "primitives_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class StickerId implements SnowflakePrimitive {
    private final long snowflake;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<StickerId> CREATOR = new Creator();

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/primitives/StickerId$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/primitives/StickerId;", "primitives_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StickerId> serializer() {
            return StickerId$$serializer.INSTANCE;
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
    public static final class Creator implements Parcelable.Creator<StickerId> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ StickerId createFromParcel(Parcel parcel) {
            return StickerId.m42098boximpl(m42110createFromParcelaEuejx8(parcel));
        }

        /* renamed from: createFromParcel-aEuejx8 */
        public final long m42110createFromParcelaEuejx8(Parcel parcel) {
            C9612q.m13917h(parcel, "parcel");
            return StickerId.m42099constructorimpl(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final StickerId[] newArray(int i) {
            return new StickerId[i];
        }
    }

    private /* synthetic */ StickerId(long j) {
        this.snowflake = j;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ StickerId m42098boximpl(long j) {
        return new StickerId(j);
    }

    /* renamed from: constructor-impl */
    public static long m42099constructorimpl(long j) {
        return j;
    }

    /* renamed from: describeContents-impl */
    public static int m42100describeContentsimpl(long j) {
        return 0;
    }

    /* renamed from: equals-impl */
    public static boolean m42101equalsimpl(long j, Object obj) {
        return (obj instanceof StickerId) && j == ((StickerId) obj).m42107unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m42102equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl */
    public static int m42103hashCodeimpl(long j) {
        return C2689b.m32716a(j);
    }

    /* renamed from: isValid-impl */
    public static boolean m42104isValidimpl(long j) {
        return j > 0;
    }

    /* renamed from: toString-impl */
    public static String m42105toStringimpl(long j) {
        return String.valueOf(j);
    }

    /* renamed from: writeToParcel-impl */
    public static void m42106writeToParcelimpl(long j, Parcel out, int i) {
        C9612q.m13917h(out, "out");
        out.writeLong(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return m42100describeContentsimpl(this.snowflake);
    }

    public boolean equals(Object obj) {
        return m42101equalsimpl(this.snowflake, obj);
    }

    @Override // com.discord.snowflake.SnowflakePrimitive
    public long getSnowflake() {
        return this.snowflake;
    }

    public int hashCode() {
        return m42103hashCodeimpl(this.snowflake);
    }

    @Override // com.discord.snowflake.SnowflakePrimitive
    public boolean isValid() {
        return m42104isValidimpl(this.snowflake);
    }

    public String toString() {
        return m42105toStringimpl(this.snowflake);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ long m42107unboximpl() {
        return this.snowflake;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        C9612q.m13917h(out, "out");
        m42106writeToParcelimpl(this.snowflake, out, i);
    }
}