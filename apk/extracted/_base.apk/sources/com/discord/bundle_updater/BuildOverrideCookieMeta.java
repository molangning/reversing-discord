package com.discord.bundle_updater;

import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2581f;
import p045cj.C2590h;
import p045cj.C2615m0;
import p045cj.C2620n1;
import p045cj.C2634r0;
import p470zi.InterfaceC14277f;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223Bm\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010Be\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003Jn\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0006\u0010(\u001a\u00020)J\t\u0010*\u001a\u00020\u0005HÖ\u0001J!\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201HÇ\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016¨\u00064"}, m14357d2 = {"Lcom/discord/bundle_updater/BuildOverrideCookieMeta;", "", "seen1", "", "expiresAt", "", "releaseChannel", "validForUserIds", "", "allowedVersions", "allowLoggedOut", "", "experiments", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;)V", "getAllowLoggedOut", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAllowedVersions", "()Ljava/util/List;", "getExperiments", "()Ljava/util/Map;", "getExpiresAt", "()Ljava/lang/String;", "getReleaseChannel", "getValidForUserIds", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;)Lcom/discord/bundle_updater/BuildOverrideCookieMeta;", "equals", "other", "hashCode", "toNativeMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "bundle_updater_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class BuildOverrideCookieMeta {
    public static final Companion Companion = new Companion(null);
    private final Boolean allowLoggedOut;
    private final List<String> allowedVersions;
    private final Map<String, Integer> experiments;
    private final String expiresAt;
    private final String releaseChannel;
    private final List<String> validForUserIds;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/bundle_updater/BuildOverrideCookieMeta$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/bundle_updater/BuildOverrideCookieMeta;", "bundle_updater_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BuildOverrideCookieMeta> serializer() {
            return BuildOverrideCookieMeta$$serializer.INSTANCE;
        }
    }

    public BuildOverrideCookieMeta() {
        this((String) null, (String) null, (List) null, (List) null, (Boolean) null, (Map) null, 63, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ BuildOverrideCookieMeta(int i, String str, String str2, List list, List list2, Boolean bool, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            C2620n1.m32836b(i, 0, BuildOverrideCookieMeta$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.expiresAt = null;
        } else {
            this.expiresAt = str;
        }
        if ((i & 2) == 0) {
            this.releaseChannel = null;
        } else {
            this.releaseChannel = str2;
        }
        if ((i & 4) == 0) {
            this.validForUserIds = null;
        } else {
            this.validForUserIds = list;
        }
        if ((i & 8) == 0) {
            this.allowedVersions = null;
        } else {
            this.allowedVersions = list2;
        }
        if ((i & 16) == 0) {
            this.allowLoggedOut = null;
        } else {
            this.allowLoggedOut = bool;
        }
        if ((i & 32) == 0) {
            this.experiments = null;
        } else {
            this.experiments = map;
        }
    }

    public static /* synthetic */ BuildOverrideCookieMeta copy$default(BuildOverrideCookieMeta buildOverrideCookieMeta, String str, String str2, List list, List list2, Boolean bool, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buildOverrideCookieMeta.expiresAt;
        }
        if ((i & 2) != 0) {
            str2 = buildOverrideCookieMeta.releaseChannel;
        }
        String str3 = str2;
        List<String> list3 = list;
        if ((i & 4) != 0) {
            list3 = buildOverrideCookieMeta.validForUserIds;
        }
        List list4 = list3;
        List<String> list5 = list2;
        if ((i & 8) != 0) {
            list5 = buildOverrideCookieMeta.allowedVersions;
        }
        List list6 = list5;
        if ((i & 16) != 0) {
            bool = buildOverrideCookieMeta.allowLoggedOut;
        }
        Boolean bool2 = bool;
        Map<String, Integer> map2 = map;
        if ((i & 32) != 0) {
            map2 = buildOverrideCookieMeta.experiments;
        }
        return buildOverrideCookieMeta.copy(str, str3, list4, list6, bool2, map2);
    }

    public static final void write$Self(BuildOverrideCookieMeta self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z6 = false;
        if (output.mo12879z(serialDesc, 0) || self.expiresAt != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 0, C2560a2.f7013a, self.expiresAt);
        }
        if (output.mo12879z(serialDesc, 1) || self.releaseChannel != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 1, C2560a2.f7013a, self.releaseChannel);
        }
        if (output.mo12879z(serialDesc, 2) || self.validForUserIds != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo12904E(serialDesc, 2, new C2581f(C2560a2.f7013a), self.validForUserIds);
        }
        if (output.mo12879z(serialDesc, 3) || self.allowedVersions != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            output.mo12904E(serialDesc, 3, new C2581f(C2560a2.f7013a), self.allowedVersions);
        }
        if (output.mo12879z(serialDesc, 4) || self.allowLoggedOut != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            output.mo12904E(serialDesc, 4, C2590h.f7055a, self.allowLoggedOut);
        }
        if (output.mo12879z(serialDesc, 5) || self.experiments != null) {
            z6 = true;
        }
        if (z6) {
            output.mo12904E(serialDesc, 5, new C2634r0(C2560a2.f7013a, C2615m0.f7088a), self.experiments);
        }
    }

    public final String component1() {
        return this.expiresAt;
    }

    public final String component2() {
        return this.releaseChannel;
    }

    public final List<String> component3() {
        return this.validForUserIds;
    }

    public final List<String> component4() {
        return this.allowedVersions;
    }

    public final Boolean component5() {
        return this.allowLoggedOut;
    }

    public final Map<String, Integer> component6() {
        return this.experiments;
    }

    public final BuildOverrideCookieMeta copy(String str, String str2, List<String> list, List<String> list2, Boolean bool, Map<String, Integer> map) {
        return new BuildOverrideCookieMeta(str, str2, list, list2, bool, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuildOverrideCookieMeta) {
            BuildOverrideCookieMeta buildOverrideCookieMeta = (BuildOverrideCookieMeta) obj;
            return C9612q.m13922c(this.expiresAt, buildOverrideCookieMeta.expiresAt) && C9612q.m13922c(this.releaseChannel, buildOverrideCookieMeta.releaseChannel) && C9612q.m13922c(this.validForUserIds, buildOverrideCookieMeta.validForUserIds) && C9612q.m13922c(this.allowedVersions, buildOverrideCookieMeta.allowedVersions) && C9612q.m13922c(this.allowLoggedOut, buildOverrideCookieMeta.allowLoggedOut) && C9612q.m13922c(this.experiments, buildOverrideCookieMeta.experiments);
        }
        return false;
    }

    public final Boolean getAllowLoggedOut() {
        return this.allowLoggedOut;
    }

    public final List<String> getAllowedVersions() {
        return this.allowedVersions;
    }

    public final Map<String, Integer> getExperiments() {
        return this.experiments;
    }

    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final String getReleaseChannel() {
        return this.releaseChannel;
    }

    public final List<String> getValidForUserIds() {
        return this.validForUserIds;
    }

    public int hashCode() {
        String str = this.expiresAt;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.releaseChannel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.validForUserIds;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.allowedVersions;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.allowLoggedOut;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, Integer> map = this.experiments;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final WritableNativeMap toNativeMap() {
        ReadableNativeArray readableNativeArray;
        ReadableNativeArray readableNativeArray2;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11591x.m7577a("expiresAt", this.expiresAt);
        pairArr[1] = C11591x.m7577a("releaseChannel", this.releaseChannel);
        List<String> list = this.validForUserIds;
        WritableNativeMap writableNativeMap = null;
        if (list != null) {
            readableNativeArray = NativeArrayExtensionsKt.toNativeArray(list);
        } else {
            readableNativeArray = null;
        }
        pairArr[2] = C11591x.m7577a("validForUserIds", readableNativeArray);
        List<String> list2 = this.allowedVersions;
        if (list2 != null) {
            readableNativeArray2 = NativeArrayExtensionsKt.toNativeArray(list2);
        } else {
            readableNativeArray2 = null;
        }
        pairArr[3] = C11591x.m7577a("allowedVersions", readableNativeArray2);
        pairArr[4] = C11591x.m7577a("allowLoggedOut", this.allowLoggedOut);
        Map<String, Integer> map = this.experiments;
        if (map != null) {
            writableNativeMap = NativeMapExtensionsKt.toNativeMap(map);
        }
        pairArr[5] = C11591x.m7577a("experiments", writableNativeMap);
        return NativeMapExtensionsKt.nativeMapOf(pairArr);
    }

    public String toString() {
        String str = this.expiresAt;
        String str2 = this.releaseChannel;
        List<String> list = this.validForUserIds;
        List<String> list2 = this.allowedVersions;
        Boolean bool = this.allowLoggedOut;
        Map<String, Integer> map = this.experiments;
        return "BuildOverrideCookieMeta(expiresAt=" + str + ", releaseChannel=" + str2 + ", validForUserIds=" + list + ", allowedVersions=" + list2 + ", allowLoggedOut=" + bool + ", experiments=" + map + ")";
    }

    public BuildOverrideCookieMeta(String str, String str2, List<String> list, List<String> list2, Boolean bool, Map<String, Integer> map) {
        this.expiresAt = str;
        this.releaseChannel = str2;
        this.validForUserIds = list;
        this.allowedVersions = list2;
        this.allowLoggedOut = bool;
        this.experiments = map;
    }

    public /* synthetic */ BuildOverrideCookieMeta(String str, String str2, List list, List list2, Boolean bool, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : map);
    }
}
