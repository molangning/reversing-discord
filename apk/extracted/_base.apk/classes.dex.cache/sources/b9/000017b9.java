package com.discord.friend_finder;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2620n1;
import p045cj.C2647v1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002:;Bk\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010BA\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\u0010\u0011J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010+\u001a\u00020\fHÆ\u0003J\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003¢\u0006\u0002\u0010 JV\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001J!\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209HÇ\u0001R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001d\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u001cR$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010!\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010 R$\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006<"}, m14357d2 = {"Lcom/discord/friend_finder/ContactsDataEntry;", "", "seen1", "", "contactMethod", "", "contactMethodLabel", "contactMethodType", "contactNames", "", "Lcom/discord/friend_finder/ContactName;", "hasImageData", "", "deviceContactIds", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/discord/friend_finder/ContactName;Z[Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/discord/friend_finder/ContactName;Z[Ljava/lang/String;)V", "getContactMethod$annotations", "()V", "getContactMethod", "()Ljava/lang/String;", "getContactMethodLabel$annotations", "getContactMethodLabel", "getContactMethodType$annotations", "getContactMethodType", "getContactNames$annotations", "getContactNames", "()[Lcom/discord/friend_finder/ContactName;", "[Lcom/discord/friend_finder/ContactName;", "getDeviceContactIds$annotations", "getDeviceContactIds", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getHasImageData$annotations", "getHasImageData", "()Z", "setHasImageData", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/discord/friend_finder/ContactName;Z[Ljava/lang/String;)Lcom/discord/friend_finder/ContactsDataEntry;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "friend_finder_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class ContactsDataEntry {
    public static final Companion Companion = new Companion(null);
    private final String contactMethod;
    private final String contactMethodLabel;
    private final String contactMethodType;
    private final ContactName[] contactNames;
    private final String[] deviceContactIds;
    private boolean hasImageData;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/friend_finder/ContactsDataEntry$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/friend_finder/ContactsDataEntry;", "friend_finder_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContactsDataEntry> serializer() {
            return ContactsDataEntry$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContactsDataEntry(int i, String str, String str2, String str3, ContactName[] contactNameArr, boolean z, String[] strArr, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            C2620n1.m32836b(i, 63, ContactsDataEntry$$serializer.INSTANCE.getDescriptor());
        }
        this.contactMethod = str;
        this.contactMethodLabel = str2;
        this.contactMethodType = str3;
        this.contactNames = contactNameArr;
        this.hasImageData = z;
        this.deviceContactIds = strArr;
    }

    public static /* synthetic */ ContactsDataEntry copy$default(ContactsDataEntry contactsDataEntry, String str, String str2, String str3, ContactName[] contactNameArr, boolean z, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactsDataEntry.contactMethod;
        }
        if ((i & 2) != 0) {
            str2 = contactsDataEntry.contactMethodLabel;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = contactsDataEntry.contactMethodType;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            contactNameArr = contactsDataEntry.contactNames;
        }
        ContactName[] contactNameArr2 = contactNameArr;
        if ((i & 16) != 0) {
            z = contactsDataEntry.hasImageData;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            strArr = contactsDataEntry.deviceContactIds;
        }
        return contactsDataEntry.copy(str, str4, str5, contactNameArr2, z2, strArr);
    }

    public static /* synthetic */ void getContactMethod$annotations() {
    }

    public static /* synthetic */ void getContactMethodLabel$annotations() {
    }

    public static /* synthetic */ void getContactMethodType$annotations() {
    }

    public static /* synthetic */ void getContactNames$annotations() {
    }

    public static /* synthetic */ void getDeviceContactIds$annotations() {
    }

    public static /* synthetic */ void getHasImageData$annotations() {
    }

    public static final void write$Self(ContactsDataEntry self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12880y(serialDesc, 0, self.contactMethod);
        output.mo12880y(serialDesc, 1, self.contactMethodLabel);
        output.mo12880y(serialDesc, 2, self.contactMethodType);
        output.mo12894i(serialDesc, 3, new C2647v1(C9591f0.m13969b(ContactName.class), ContactName$$serializer.INSTANCE), self.contactNames);
        output.mo12881x(serialDesc, 4, self.hasImageData);
        output.mo12894i(serialDesc, 5, new C2647v1(C9591f0.m13969b(String.class), C2560a2.f7013a), self.deviceContactIds);
    }

    public final String component1() {
        return this.contactMethod;
    }

    public final String component2() {
        return this.contactMethodLabel;
    }

    public final String component3() {
        return this.contactMethodType;
    }

    public final ContactName[] component4() {
        return this.contactNames;
    }

    public final boolean component5() {
        return this.hasImageData;
    }

    public final String[] component6() {
        return this.deviceContactIds;
    }

    public final ContactsDataEntry copy(String contactMethod, String contactMethodLabel, String contactMethodType, ContactName[] contactNames, boolean z, String[] deviceContactIds) {
        C9612q.m13917h(contactMethod, "contactMethod");
        C9612q.m13917h(contactMethodLabel, "contactMethodLabel");
        C9612q.m13917h(contactMethodType, "contactMethodType");
        C9612q.m13917h(contactNames, "contactNames");
        C9612q.m13917h(deviceContactIds, "deviceContactIds");
        return new ContactsDataEntry(contactMethod, contactMethodLabel, contactMethodType, contactNames, z, deviceContactIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContactsDataEntry) {
            ContactsDataEntry contactsDataEntry = (ContactsDataEntry) obj;
            return C9612q.m13922c(this.contactMethod, contactsDataEntry.contactMethod) && C9612q.m13922c(this.contactMethodLabel, contactsDataEntry.contactMethodLabel) && C9612q.m13922c(this.contactMethodType, contactsDataEntry.contactMethodType) && C9612q.m13922c(this.contactNames, contactsDataEntry.contactNames) && this.hasImageData == contactsDataEntry.hasImageData && C9612q.m13922c(this.deviceContactIds, contactsDataEntry.deviceContactIds);
        }
        return false;
    }

    public final String getContactMethod() {
        return this.contactMethod;
    }

    public final String getContactMethodLabel() {
        return this.contactMethodLabel;
    }

    public final String getContactMethodType() {
        return this.contactMethodType;
    }

    public final ContactName[] getContactNames() {
        return this.contactNames;
    }

    public final String[] getDeviceContactIds() {
        return this.deviceContactIds;
    }

    public final boolean getHasImageData() {
        return this.hasImageData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.contactMethod.hashCode() * 31) + this.contactMethodLabel.hashCode()) * 31) + this.contactMethodType.hashCode()) * 31) + Arrays.hashCode(this.contactNames)) * 31;
        boolean z = this.hasImageData;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + Arrays.hashCode(this.deviceContactIds);
    }

    public final void setHasImageData(boolean z) {
        this.hasImageData = z;
    }

    public String toString() {
        String str = this.contactMethod;
        String str2 = this.contactMethodLabel;
        String str3 = this.contactMethodType;
        String arrays = Arrays.toString(this.contactNames);
        boolean z = this.hasImageData;
        String arrays2 = Arrays.toString(this.deviceContactIds);
        return "ContactsDataEntry(contactMethod=" + str + ", contactMethodLabel=" + str2 + ", contactMethodType=" + str3 + ", contactNames=" + arrays + ", hasImageData=" + z + ", deviceContactIds=" + arrays2 + ")";
    }

    public ContactsDataEntry(String contactMethod, String contactMethodLabel, String contactMethodType, ContactName[] contactNames, boolean z, String[] deviceContactIds) {
        C9612q.m13917h(contactMethod, "contactMethod");
        C9612q.m13917h(contactMethodLabel, "contactMethodLabel");
        C9612q.m13917h(contactMethodType, "contactMethodType");
        C9612q.m13917h(contactNames, "contactNames");
        C9612q.m13917h(deviceContactIds, "deviceContactIds");
        this.contactMethod = contactMethod;
        this.contactMethodLabel = contactMethodLabel;
        this.contactMethodType = contactMethodType;
        this.contactNames = contactNames;
        this.hasImageData = z;
        this.deviceContactIds = deviceContactIds;
    }
}