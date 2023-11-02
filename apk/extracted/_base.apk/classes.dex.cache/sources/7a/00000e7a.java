package com.discord.bundle_updater;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p304qf.C11889v;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$BO\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006%"}, m14357d2 = {"Lcom/discord/bundle_updater/AppManifest;", "", "seen1", "", "metadata", "Lcom/discord/bundle_updater/AppManifestMetadata;", "hashes", "", "", "patches", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/bundle_updater/AppManifestMetadata;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/bundle_updater/AppManifestMetadata;Ljava/util/Map;Ljava/util/Map;)V", "getHashes", "()Ljava/util/Map;", "getMetadata", "()Lcom/discord/bundle_updater/AppManifestMetadata;", "getPatches", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "bundle_updater_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AppManifest {
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> hashes;
    private final AppManifestMetadata metadata;
    private final Map<String, String> patches;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/bundle_updater/AppManifest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/bundle_updater/AppManifest;", "bundle_updater_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AppManifest> serializer() {
            return AppManifest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AppManifest(int i, AppManifestMetadata appManifestMetadata, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        Map<String, String> m6754h;
        Map<String, String> m6754h2;
        if (1 != (i & 1)) {
            C2620n1.m32836b(i, 1, AppManifest$$serializer.INSTANCE.getDescriptor());
        }
        this.metadata = appManifestMetadata;
        if ((i & 2) == 0) {
            m6754h2 = C11889v.m6754h();
            this.hashes = m6754h2;
        } else {
            this.hashes = map;
        }
        if ((i & 4) != 0) {
            this.patches = map2;
            return;
        }
        m6754h = C11889v.m6754h();
        this.patches = m6754h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppManifest copy$default(AppManifest appManifest, AppManifestMetadata appManifestMetadata, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            appManifestMetadata = appManifest.metadata;
        }
        if ((i & 2) != 0) {
            map = appManifest.hashes;
        }
        if ((i & 4) != 0) {
            map2 = appManifest.patches;
        }
        return appManifest.copy(appManifestMetadata, map, map2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004f, code lost:
        if (kotlin.jvm.internal.C9612q.m13922c(r3, r4) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.discord.bundle_updater.AppManifest r5, kotlinx.serialization.encoding.CompositeEncoder r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            java.lang.String r0 = "self"
            kotlin.jvm.internal.C9612q.m13917h(r5, r0)
            java.lang.String r0 = "output"
            kotlin.jvm.internal.C9612q.m13917h(r6, r0)
            java.lang.String r0 = "serialDesc"
            kotlin.jvm.internal.C9612q.m13917h(r7, r0)
            com.discord.bundle_updater.AppManifestMetadata$$serializer r0 = com.discord.bundle_updater.AppManifestMetadata$$serializer.INSTANCE
            com.discord.bundle_updater.AppManifestMetadata r1 = r5.metadata
            r2 = 0
            r6.mo12894i(r7, r2, r0, r1)
            r0 = 1
            boolean r1 = r6.mo12879z(r7, r0)
            if (r1 == 0) goto L20
        L1e:
            r1 = r0
            goto L2e
        L20:
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.hashes
            java.util.Map r3 = p304qf.C11886s.m6771h()
            boolean r1 = kotlin.jvm.internal.C9612q.m13922c(r1, r3)
            if (r1 != 0) goto L2d
            goto L1e
        L2d:
            r1 = r2
        L2e:
            if (r1 == 0) goto L3c
            cj.r0 r1 = new cj.r0
            cj.a2 r3 = p045cj.C2560a2.f7013a
            r1.<init>(r3, r3)
            java.util.Map<java.lang.String, java.lang.String> r3 = r5.hashes
            r6.mo12894i(r7, r0, r1, r3)
        L3c:
            r1 = 2
            boolean r3 = r6.mo12879z(r7, r1)
            if (r3 == 0) goto L45
        L43:
            r2 = r0
            goto L52
        L45:
            java.util.Map<java.lang.String, java.lang.String> r3 = r5.patches
            java.util.Map r4 = p304qf.C11886s.m6771h()
            boolean r3 = kotlin.jvm.internal.C9612q.m13922c(r3, r4)
            if (r3 != 0) goto L52
            goto L43
        L52:
            if (r2 == 0) goto L60
            cj.r0 r0 = new cj.r0
            cj.a2 r2 = p045cj.C2560a2.f7013a
            r0.<init>(r2, r2)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.patches
            r6.mo12894i(r7, r1, r0, r5)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.bundle_updater.AppManifest.write$Self(com.discord.bundle_updater.AppManifest, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final AppManifestMetadata component1() {
        return this.metadata;
    }

    public final Map<String, String> component2() {
        return this.hashes;
    }

    public final Map<String, String> component3() {
        return this.patches;
    }

    public final AppManifest copy(AppManifestMetadata metadata, Map<String, String> hashes, Map<String, String> patches) {
        C9612q.m13917h(metadata, "metadata");
        C9612q.m13917h(hashes, "hashes");
        C9612q.m13917h(patches, "patches");
        return new AppManifest(metadata, hashes, patches);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppManifest) {
            AppManifest appManifest = (AppManifest) obj;
            return C9612q.m13922c(this.metadata, appManifest.metadata) && C9612q.m13922c(this.hashes, appManifest.hashes) && C9612q.m13922c(this.patches, appManifest.patches);
        }
        return false;
    }

    public final Map<String, String> getHashes() {
        return this.hashes;
    }

    public final AppManifestMetadata getMetadata() {
        return this.metadata;
    }

    public final Map<String, String> getPatches() {
        return this.patches;
    }

    public int hashCode() {
        return (((this.metadata.hashCode() * 31) + this.hashes.hashCode()) * 31) + this.patches.hashCode();
    }

    public String toString() {
        AppManifestMetadata appManifestMetadata = this.metadata;
        Map<String, String> map = this.hashes;
        Map<String, String> map2 = this.patches;
        return "AppManifest(metadata=" + appManifestMetadata + ", hashes=" + map + ", patches=" + map2 + ")";
    }

    public AppManifest(AppManifestMetadata metadata, Map<String, String> hashes, Map<String, String> patches) {
        C9612q.m13917h(metadata, "metadata");
        C9612q.m13917h(hashes, "hashes");
        C9612q.m13917h(patches, "patches");
        this.metadata = metadata;
        this.hashes = hashes;
        this.patches = patches;
    }

    public /* synthetic */ AppManifest(AppManifestMetadata appManifestMetadata, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appManifestMetadata, (i & 2) != 0 ? C11889v.m6754h() : map, (i & 4) != 0 ? C11889v.m6754h() : map2);
    }
}