package org.webrtc;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class MediaConstraints {
    public final List<KeyValuePair> mandatory = new ArrayList();
    public final List<KeyValuePair> optional = new ArrayList();

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class KeyValuePair {
        private final String key;
        private final String value;

        public KeyValuePair(String str, String str2) {
            this.key = str;
            this.value = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            KeyValuePair keyValuePair = (KeyValuePair) obj;
            if (this.key.equals(keyValuePair.key) && this.value.equals(keyValuePair.value)) {
                return true;
            }
            return false;
        }

        @CalledByNative("KeyValuePair")
        public String getKey() {
            return this.key;
        }

        @CalledByNative("KeyValuePair")
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.key.hashCode() + this.value.hashCode();
        }

        public String toString() {
            String str = this.key;
            String str2 = this.value;
            return str + ": " + str2;
        }
    }

    private static String stringifyKeyValuePairList(List<KeyValuePair> list) {
        StringBuilder sb2 = new StringBuilder("[");
        for (KeyValuePair keyValuePair : list) {
            if (sb2.length() > 1) {
                sb2.append(", ");
            }
            sb2.append(keyValuePair.toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    @CalledByNative
    List<KeyValuePair> getMandatory() {
        return this.mandatory;
    }

    @CalledByNative
    List<KeyValuePair> getOptional() {
        return this.optional;
    }

    public String toString() {
        String stringifyKeyValuePairList = stringifyKeyValuePairList(this.mandatory);
        String stringifyKeyValuePairList2 = stringifyKeyValuePairList(this.optional);
        return "mandatory: " + stringifyKeyValuePairList + ", optional: " + stringifyKeyValuePairList2;
    }
}
