package com.facebook.react.common;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class MapBuilder {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Builder<K, V> {
        private Map mMap;
        private boolean mUnderConstruction;

        private Builder() {
            this.mMap = MapBuilder.newHashMap();
            this.mUnderConstruction = true;
        }

        public Map<K, V> build() {
            if (this.mUnderConstruction) {
                this.mUnderConstruction = false;
                return this.mMap;
            }
            throw new IllegalStateException("Underlying map has already been built");
        }

        public Builder<K, V> put(K k, V v) {
            if (this.mUnderConstruction) {
                this.mMap.put(k, v);
                return this;
            }
            throw new IllegalStateException("Underlying map has already been built");
        }
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m30471of() {
        return newHashMap();
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m30470of(K k, V v) {
        Map<K, V> m30471of = m30471of();
        m30471of.put(k, v);
        return m30471of;
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m30469of(K k, V v, K k2, V v2) {
        Map<K, V> m30471of = m30471of();
        m30471of.put(k, v);
        m30471of.put(k2, v2);
        return m30471of;
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m30468of(K k, V v, K k2, V v2, K k3, V v3) {
        Map<K, V> m30471of = m30471of();
        m30471of.put(k, v);
        m30471of.put(k2, v2);
        m30471of.put(k3, v3);
        return m30471of;
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m30467of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Map<K, V> m30471of = m30471of();
        m30471of.put(k, v);
        m30471of.put(k2, v2);
        m30471of.put(k3, v3);
        m30471of.put(k4, v4);
        return m30471of;
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m30466of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Map<K, V> m30471of = m30471of();
        m30471of.put(k, v);
        m30471of.put(k2, v2);
        m30471of.put(k3, v3);
        m30471of.put(k4, v4);
        m30471of.put(k5, v5);
        return m30471of;
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m30465of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Map<K, V> m30471of = m30471of();
        m30471of.put(k, v);
        m30471of.put(k2, v2);
        m30471of.put(k3, v3);
        m30471of.put(k4, v4);
        m30471of.put(k5, v5);
        m30471of.put(k6, v6);
        return m30471of;
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m30464of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        Map<K, V> m30471of = m30471of();
        m30471of.put(k, v);
        m30471of.put(k2, v2);
        m30471of.put(k3, v3);
        m30471of.put(k4, v4);
        m30471of.put(k5, v5);
        m30471of.put(k6, v6);
        m30471of.put(k7, v7);
        return m30471of;
    }
}
