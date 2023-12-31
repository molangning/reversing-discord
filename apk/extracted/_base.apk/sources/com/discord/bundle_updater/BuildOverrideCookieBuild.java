package com.discord.bundle_updater;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006!"}, m14357d2 = {"Lcom/discord/bundle_updater/BuildOverrideCookieBuild;", "", "seen1", "", "type", "", "id", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toNativeMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "bundle_updater_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class BuildOverrideCookieBuild {
    public static final Companion Companion = new Companion(null);

    /* renamed from: id */
    private final String f8200id;
    private final String type;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/bundle_updater/BuildOverrideCookieBuild$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/bundle_updater/BuildOverrideCookieBuild;", "bundle_updater_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BuildOverrideCookieBuild> serializer() {
            return BuildOverrideCookieBuild$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BuildOverrideCookieBuild(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C2620n1.m32836b(i, 3, BuildOverrideCookieBuild$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.f8200id = str2;
    }

    public static /* synthetic */ BuildOverrideCookieBuild copy$default(BuildOverrideCookieBuild buildOverrideCookieBuild, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buildOverrideCookieBuild.type;
        }
        if ((i & 2) != 0) {
            str2 = buildOverrideCookieBuild.f8200id;
        }
        return buildOverrideCookieBuild.copy(str, str2);
    }

    public static final void write$Self(BuildOverrideCookieBuild self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12880y(serialDesc, 0, self.type);
        output.mo12880y(serialDesc, 1, self.f8200id);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.f8200id;
    }

    public final BuildOverrideCookieBuild copy(String type, String id2) {
        C9612q.m13917h(type, "type");
        C9612q.m13917h(id2, "id");
        return new BuildOverrideCookieBuild(type, id2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuildOverrideCookieBuild) {
            BuildOverrideCookieBuild buildOverrideCookieBuild = (BuildOverrideCookieBuild) obj;
            return C9612q.m13922c(this.type, buildOverrideCookieBuild.type) && C9612q.m13922c(this.f8200id, buildOverrideCookieBuild.f8200id);
        }
        return false;
    }

    public final String getId() {
        return this.f8200id;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.f8200id.hashCode();
    }

    public final WritableNativeMap toNativeMap() {
        return NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("type", this.type), C11591x.m7577a("id", this.f8200id));
    }

    public String toString() {
        String str = this.type;
        String str2 = this.f8200id;
        return "BuildOverrideCookieBuild(type=" + str + ", id=" + str2 + ")";
    }

    public BuildOverrideCookieBuild(String type, String id2) {
        C9612q.m13917h(type, "type");
        C9612q.m13917h(id2, "id");
        this.type = type;
        this.f8200id = id2;
    }
}
