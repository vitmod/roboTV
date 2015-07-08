/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.xvdr.audio;

public class audiodecoderJNI {
  public final static native int AC3DecoderNative_layoutStereo_get();
  public final static native int AC3DecoderNative_layoutDolby_get();
  public final static native int AC3DecoderNative_layout50_get();
  public final static native int AC3DecoderNative_layout51_get();
  public final static native void AC3DecoderNative_channelLayout_set(long jarg1, AC3DecoderNative jarg1_, int jarg2);
  public final static native int AC3DecoderNative_channelLayout_get(long jarg1, AC3DecoderNative jarg1_);
  public final static native long new_AC3DecoderNative(int jarg1);
  public final static native void delete_AC3DecoderNative(long jarg1);
  public final static native int AC3DecoderNative_decode(long jarg1, AC3DecoderNative jarg1_, byte[] jarg2, int jarg3, int jarg4);
  public final static native boolean AC3DecoderNative_getOutput(long jarg1, AC3DecoderNative jarg1_, byte[] jarg2, int jarg3, int jarg4);
  public final static native int AC3DecoderNative_getChannels(long jarg1, AC3DecoderNative jarg1_);
  public final static native int AC3DecoderNative_getSampleRate(long jarg1, AC3DecoderNative jarg1_);


static {
	try {
		System.loadLibrary("a52");
		System.loadLibrary("mad");
		System.loadLibrary("audiodecoder");
	}
	catch (UnsatisfiedLinkError e) {
	}
}

}