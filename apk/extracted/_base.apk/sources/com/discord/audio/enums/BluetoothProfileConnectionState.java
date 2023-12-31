package com.discord.audio.enums;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Parcelable;
import androidx.core.content.C0955e;
import com.discord.audio.utils.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, m14357d2 = {"Lcom/discord/audio/enums/BluetoothProfileConnectionState;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Disconnected", "Connecting", "Connected", "Disconnecting", "Companion", "Update", "audio_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public enum BluetoothProfileConnectionState {
    Disconnected(0),
    Connecting(1),
    Connected(2),
    Disconnecting(3);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m14357d2 = {"Lcom/discord/audio/enums/BluetoothProfileConnectionState$Companion;", "", "()V", "from", "Lcom/discord/audio/enums/BluetoothProfileConnectionState;", "bluetoothProfileState", "", "getUpdate", "Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;", "intent", "Landroid/content/Intent;", "audio_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BluetoothProfileConnectionState from(int i) {
            BluetoothProfileConnectionState[] values;
            boolean z;
            for (BluetoothProfileConnectionState bluetoothProfileConnectionState : BluetoothProfileConnectionState.values()) {
                if (bluetoothProfileConnectionState.getValue() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return bluetoothProfileConnectionState;
                }
            }
            return null;
        }

        public final Update getUpdate(Intent intent) {
            BluetoothProfileConnectionState bluetoothProfileConnectionState;
            C9612q.m13917h(intent, "intent");
            if (C9612q.m13922c(intent.getAction(), "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                Integer intExtraOrNull = ExtensionsKt.getIntExtraOrNull(intent, "android.bluetooth.profile.extra.PREVIOUS_STATE");
                BluetoothProfileConnectionState bluetoothProfileConnectionState2 = null;
                if (intExtraOrNull != null) {
                    bluetoothProfileConnectionState = BluetoothProfileConnectionState.Companion.from(intExtraOrNull.intValue());
                } else {
                    bluetoothProfileConnectionState = null;
                }
                Integer intExtraOrNull2 = ExtensionsKt.getIntExtraOrNull(intent, "android.bluetooth.profile.extra.STATE");
                if (intExtraOrNull2 != null) {
                    bluetoothProfileConnectionState2 = BluetoothProfileConnectionState.Companion.from(intExtraOrNull2.intValue());
                }
                return new Update(bluetoothProfileConnectionState, bluetoothProfileConnectionState2, (BluetoothDevice) ((Parcelable) C0955e.m38374b(intent, "android.bluetooth.device.extra.DEVICE", BluetoothDevice.class)));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m14357d2 = {"Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;", "", "previous", "Lcom/discord/audio/enums/BluetoothProfileConnectionState;", "current", "device", "Landroid/bluetooth/BluetoothDevice;", "(Lcom/discord/audio/enums/BluetoothProfileConnectionState;Lcom/discord/audio/enums/BluetoothProfileConnectionState;Landroid/bluetooth/BluetoothDevice;)V", "getCurrent", "()Lcom/discord/audio/enums/BluetoothProfileConnectionState;", "getDevice", "()Landroid/bluetooth/BluetoothDevice;", "getPrevious", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "audio_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class Update {
        private final BluetoothProfileConnectionState current;
        private final BluetoothDevice device;
        private final BluetoothProfileConnectionState previous;

        public Update(BluetoothProfileConnectionState bluetoothProfileConnectionState, BluetoothProfileConnectionState bluetoothProfileConnectionState2, BluetoothDevice bluetoothDevice) {
            this.previous = bluetoothProfileConnectionState;
            this.current = bluetoothProfileConnectionState2;
            this.device = bluetoothDevice;
        }

        public static /* synthetic */ Update copy$default(Update update, BluetoothProfileConnectionState bluetoothProfileConnectionState, BluetoothProfileConnectionState bluetoothProfileConnectionState2, BluetoothDevice bluetoothDevice, int i, Object obj) {
            if ((i & 1) != 0) {
                bluetoothProfileConnectionState = update.previous;
            }
            if ((i & 2) != 0) {
                bluetoothProfileConnectionState2 = update.current;
            }
            if ((i & 4) != 0) {
                bluetoothDevice = update.device;
            }
            return update.copy(bluetoothProfileConnectionState, bluetoothProfileConnectionState2, bluetoothDevice);
        }

        public final BluetoothProfileConnectionState component1() {
            return this.previous;
        }

        public final BluetoothProfileConnectionState component2() {
            return this.current;
        }

        public final BluetoothDevice component3() {
            return this.device;
        }

        public final Update copy(BluetoothProfileConnectionState bluetoothProfileConnectionState, BluetoothProfileConnectionState bluetoothProfileConnectionState2, BluetoothDevice bluetoothDevice) {
            return new Update(bluetoothProfileConnectionState, bluetoothProfileConnectionState2, bluetoothDevice);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Update) {
                Update update = (Update) obj;
                return this.previous == update.previous && this.current == update.current && C9612q.m13922c(this.device, update.device);
            }
            return false;
        }

        public final BluetoothProfileConnectionState getCurrent() {
            return this.current;
        }

        public final BluetoothDevice getDevice() {
            return this.device;
        }

        public final BluetoothProfileConnectionState getPrevious() {
            return this.previous;
        }

        public int hashCode() {
            BluetoothProfileConnectionState bluetoothProfileConnectionState = this.previous;
            int hashCode = (bluetoothProfileConnectionState == null ? 0 : bluetoothProfileConnectionState.hashCode()) * 31;
            BluetoothProfileConnectionState bluetoothProfileConnectionState2 = this.current;
            int hashCode2 = (hashCode + (bluetoothProfileConnectionState2 == null ? 0 : bluetoothProfileConnectionState2.hashCode())) * 31;
            BluetoothDevice bluetoothDevice = this.device;
            return hashCode2 + (bluetoothDevice != null ? bluetoothDevice.hashCode() : 0);
        }

        public String toString() {
            BluetoothProfileConnectionState bluetoothProfileConnectionState = this.previous;
            BluetoothProfileConnectionState bluetoothProfileConnectionState2 = this.current;
            BluetoothDevice bluetoothDevice = this.device;
            return "Update(previous=" + bluetoothProfileConnectionState + ", current=" + bluetoothProfileConnectionState2 + ", device=" + bluetoothDevice + ")";
        }
    }

    BluetoothProfileConnectionState(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
