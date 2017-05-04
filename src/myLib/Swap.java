package myLib;

import java.util.concurrent.atomic.AtomicInteger;

public final class Swap {

	public static final void swapIntAtomic(AtomicInteger x, AtomicInteger y) {
		x.set(y.getAndSet(x.get()));
	}
	
	public static final int[] swapIntArray(int[] valuesToSwap) {
		
		int tmp = valuesToSwap[0];
		valuesToSwap[0] = valuesToSwap[1];
		valuesToSwap[1] = tmp;
		
		return valuesToSwap;
	}
	
	public static final String[] swapStringArray(String[] valuesToSwap) {
		
		String tmp = valuesToSwap[0];
		valuesToSwap[0] = valuesToSwap[1];
		valuesToSwap[1] = tmp;
		
		return valuesToSwap;
	}
	
	public static final float[] swapFloatArray(float[] valuesToSwap) {
		
		float tmp = valuesToSwap[0];
		valuesToSwap[0] = valuesToSwap[1];
		valuesToSwap[1] = tmp;
		
		return valuesToSwap;
	}
	
	public static final <T> T[] shiftLeft(final T... val) {
		if (val.length <= 1) {
			return val;
		}
		
		final T t = val[0];
		int i = 0;
		for( ; i < val.length-1; i++) {
			val[i] = val[i+1];
		}
		val[i] = t;
		
		return val;
	}
}
