package org.jboss.netty.buffer;

import java.nio.ByteOrder;

public class LittleEndianHeapChannelBuffer extends HeapChannelBuffer {
    public LittleEndianHeapChannelBuffer(int i) {
        super(i);
    }

    public LittleEndianHeapChannelBuffer(byte[] bArr) {
        super(bArr);
    }

    private LittleEndianHeapChannelBuffer(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public ChannelBufferFactory factory() {
        return HeapChannelBufferFactory.getInstance(ByteOrder.LITTLE_ENDIAN);
    }

    public ByteOrder order() {
        return ByteOrder.LITTLE_ENDIAN;
    }

    public short getShort(int i) {
        return (short) ((this.array[i] & 255) | (this.array[i + 1] << 8));
    }

    public int getUnsignedMedium(int i) {
        return (this.array[i] & 255) | ((this.array[i + 1] & 255) << 8) | ((this.array[i + 2] & 255) << Tnaf.POW_2_WIDTH);
    }

    public int getInt(int i) {
        return (this.array[i] & 255) | ((this.array[i + 1] & 255) << 8) | ((this.array[i + 2] & 255) << Tnaf.POW_2_WIDTH) | ((this.array[i + 3] & 255) << 24);
    }

    public long getLong(int i) {
        return (((long) this.array[i]) & 255) | ((((long) this.array[i + 1]) & 255) << 8) | ((((long) this.array[i + 2]) & 255) << 16) | ((((long) this.array[i + 3]) & 255) << 24) | ((((long) this.array[i + 4]) & 255) << 32) | ((((long) this.array[i + 5]) & 255) << 40) | ((((long) this.array[i + 6]) & 255) << 48) | ((((long) this.array[i + 7]) & 255) << 56);
    }

    public void setShort(int i, int i2) {
        this.array[i] = (byte) i2;
        this.array[i + 1] = (byte) (i2 >>> 8);
    }

    public void setMedium(int i, int i2) {
        this.array[i] = (byte) i2;
        this.array[i + 1] = (byte) (i2 >>> 8);
        this.array[i + 2] = (byte) (i2 >>> 16);
    }

    public void setInt(int i, int i2) {
        this.array[i] = (byte) i2;
        this.array[i + 1] = (byte) (i2 >>> 8);
        this.array[i + 2] = (byte) (i2 >>> 16);
        this.array[i + 3] = (byte) (i2 >>> 24);
    }

    public void setLong(int i, long j) {
        this.array[i] = (byte) ((int) j);
        this.array[i + 1] = (byte) ((int) (j >>> 8));
        this.array[i + 2] = (byte) ((int) (j >>> 16));
        this.array[i + 3] = (byte) ((int) (j >>> 24));
        this.array[i + 4] = (byte) ((int) (j >>> 32));
        this.array[i + 5] = (byte) ((int) (j >>> 40));
        this.array[i + 6] = (byte) ((int) (j >>> 48));
        this.array[i + 7] = (byte) ((int) (j >>> 56));
    }

    public ChannelBuffer duplicate() {
        return new LittleEndianHeapChannelBuffer(this.array, readerIndex(), writerIndex());
    }

    public ChannelBuffer copy(int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > this.array.length) {
            throw new IndexOutOfBoundsException("Too many bytes to copy - Need " + (i + i2) + ", maximum is " + this.array.length);
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.array, i, bArr, 0, i2);
        return new LittleEndianHeapChannelBuffer(bArr);
    }
}