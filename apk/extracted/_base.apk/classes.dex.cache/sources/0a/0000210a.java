package com.discord.user_search_worker;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2590h;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002#$B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000e¨\u0006%"}, m14357d2 = {"Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "", "seen1", "", "guild", "", "friends", "", "strict", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getFriends", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGuild", "()Ljava/lang/String;", "getStrict", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "user_search_worker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class UserSearchQuerySetFilters {
    public static final Companion Companion = new Companion(null);
    private final Boolean friends;
    private final String guild;
    private final Boolean strict;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/user_search_worker/UserSearchQuerySetFilters$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "user_search_worker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserSearchQuerySetFilters> serializer() {
            return UserSearchQuerySetFilters$$serializer.INSTANCE;
        }
    }

    public UserSearchQuerySetFilters() {
        this((String) null, (Boolean) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ UserSearchQuerySetFilters(int i, String str, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            C2620n1.m32836b(i, 0, UserSearchQuerySetFilters$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.guild = null;
        } else {
            this.guild = str;
        }
        if ((i & 2) == 0) {
            this.friends = null;
        } else {
            this.friends = bool;
        }
        if ((i & 4) == 0) {
            this.strict = null;
        } else {
            this.strict = bool2;
        }
    }

    public static /* synthetic */ UserSearchQuerySetFilters copy$default(UserSearchQuerySetFilters userSearchQuerySetFilters, String str, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userSearchQuerySetFilters.guild;
        }
        if ((i & 2) != 0) {
            bool = userSearchQuerySetFilters.friends;
        }
        if ((i & 4) != 0) {
            bool2 = userSearchQuerySetFilters.strict;
        }
        return userSearchQuerySetFilters.copy(str, bool, bool2);
    }

    public static final void write$Self(UserSearchQuerySetFilters self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z3 = false;
        if (output.mo12879z(serialDesc, 0) || self.guild != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 0, C2560a2.f7013a, self.guild);
        }
        if (output.mo12879z(serialDesc, 1) || self.friends != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 1, C2590h.f7055a, self.friends);
        }
        if (output.mo12879z(serialDesc, 2) || self.strict != null) {
            z3 = true;
        }
        if (z3) {
            output.mo12904E(serialDesc, 2, C2590h.f7055a, self.strict);
        }
    }

    public final String component1() {
        return this.guild;
    }

    public final Boolean component2() {
        return this.friends;
    }

    public final Boolean component3() {
        return this.strict;
    }

    public final UserSearchQuerySetFilters copy(String str, Boolean bool, Boolean bool2) {
        return new UserSearchQuerySetFilters(str, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserSearchQuerySetFilters) {
            UserSearchQuerySetFilters userSearchQuerySetFilters = (UserSearchQuerySetFilters) obj;
            return C9612q.m13922c(this.guild, userSearchQuerySetFilters.guild) && C9612q.m13922c(this.friends, userSearchQuerySetFilters.friends) && C9612q.m13922c(this.strict, userSearchQuerySetFilters.strict);
        }
        return false;
    }

    public final Boolean getFriends() {
        return this.friends;
    }

    public final String getGuild() {
        return this.guild;
    }

    public final Boolean getStrict() {
        return this.strict;
    }

    public int hashCode() {
        String str = this.guild;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.friends;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.strict;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        String str = this.guild;
        Boolean bool = this.friends;
        Boolean bool2 = this.strict;
        return "UserSearchQuerySetFilters(guild=" + str + ", friends=" + bool + ", strict=" + bool2 + ")";
    }

    public UserSearchQuerySetFilters(String str, Boolean bool, Boolean bool2) {
        this.guild = str;
        this.friends = bool;
        this.strict = bool2;
    }

    public /* synthetic */ UserSearchQuerySetFilters(String str, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2);
    }
}