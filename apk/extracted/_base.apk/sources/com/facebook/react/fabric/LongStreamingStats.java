package com.facebook.react.fabric;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class LongStreamingStats {
    private Queue<Long> minHeap = new PriorityQueue(11, new Comparator<Long>() { // from class: com.facebook.react.fabric.LongStreamingStats.1
        @Override // java.util.Comparator
        public int compare(Long l, Long l2) {
            return Long.compare(l.longValue(), l2.longValue());
        }
    });
    private Queue<Long> maxHeap = new PriorityQueue(11, new Comparator<Long>() { // from class: com.facebook.react.fabric.LongStreamingStats.2
        @Override // java.util.Comparator
        public int compare(Long l, Long l2) {
            return Long.compare(l2.longValue(), l.longValue());
        }
    });
    private double streamingAverage = 0.0d;
    private int len = 0;
    private long max = 0;

    public void add(long j) {
        if (j != 0) {
            if (this.minHeap.size() == this.maxHeap.size()) {
                this.maxHeap.offer(Long.valueOf(j));
                this.minHeap.offer(this.maxHeap.poll());
            } else {
                this.minHeap.offer(Long.valueOf(j));
                this.maxHeap.offer(this.minHeap.poll());
            }
        }
        int i = this.len + 1;
        this.len = i;
        if (i == 1) {
            this.streamingAverage = j;
        } else {
            this.streamingAverage = (this.streamingAverage / (i / (i - 1))) + (j / i);
        }
        long j2 = this.max;
        if (j <= j2) {
            j = j2;
        }
        this.max = j;
    }

    public double getAverage() {
        return this.streamingAverage;
    }

    public long getMax() {
        return this.max;
    }

    public double getMedian() {
        long longValue;
        if (this.minHeap.size() == 0 && this.maxHeap.size() == 0) {
            return 0.0d;
        }
        if (this.minHeap.size() > this.maxHeap.size()) {
            longValue = this.minHeap.peek().longValue();
        } else {
            longValue = (this.minHeap.peek().longValue() + this.maxHeap.peek().longValue()) / 2;
        }
        return longValue;
    }
}
