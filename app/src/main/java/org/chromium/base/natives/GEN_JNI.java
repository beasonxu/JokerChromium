package org.chromium.base.natives;

import java.lang.Object;

public final class GEN_JNI {
  public static boolean TESTING_ENABLED;

  public static boolean REQUIRE_MOCK;

  /**
   * org.chromium.mojo.system.impl.BaseRunLoop.createBaseRunLoop
   * @param caller (org.chromium.mojo.system.impl.BaseRunLoop)
   * @return (long)
   */
  public static final native long org_chromium_mojo_system_impl_BaseRunLoop_createBaseRunLoop(
      Object caller);

  /**
   * org.chromium.mojo.system.impl.BaseRunLoop.deleteMessageLoop
   * @param caller (org.chromium.mojo.system.impl.BaseRunLoop)
   * @param runLoopID (long)
   * @return (void)
   */
  public static final native void org_chromium_mojo_system_impl_BaseRunLoop_deleteMessageLoop(
      Object caller, long runLoopID);

  /**
   * org.chromium.mojo.system.impl.BaseRunLoop.postDelayedTask
   * @param caller (org.chromium.mojo.system.impl.BaseRunLoop)
   * @param runLoopID (long)
   * @param runnable (java.lang.Runnable)
   * @param delay (long)
   * @return (void)
   */
  public static final native void org_chromium_mojo_system_impl_BaseRunLoop_postDelayedTask(
      Object caller, long runLoopID, Object runnable, long delay);

  /**
   * org.chromium.mojo.system.impl.BaseRunLoop.quit
   * @param caller (org.chromium.mojo.system.impl.BaseRunLoop)
   * @return (void)
   */
  public static final native void org_chromium_mojo_system_impl_BaseRunLoop_quit(Object caller);

  /**
   * org.chromium.mojo.system.impl.BaseRunLoop.run
   * @param caller (org.chromium.mojo.system.impl.BaseRunLoop)
   * @return (void)
   */
  public static final native void org_chromium_mojo_system_impl_BaseRunLoop_run(Object caller);

  /**
   * org.chromium.mojo.system.impl.BaseRunLoop.runUntilIdle
   * @param caller (org.chromium.mojo.system.impl.BaseRunLoop)
   * @return (void)
   */
  public static final native void org_chromium_mojo_system_impl_BaseRunLoop_runUntilIdle(
      Object caller);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.beginReadData
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param mojoHandle (long)
   * @param numBytes (int)
   * @param flags (int)
   * @return (org.chromium.mojo.system.ResultAnd<java.nio.ByteBuffer>)
   */
  public static final native Object org_chromium_mojo_system_impl_CoreImpl_beginReadData(
      Object caller, long mojoHandle, int numBytes, int flags);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.beginWriteData
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param mojoHandle (long)
   * @param numBytes (int)
   * @param flags (int)
   * @return (org.chromium.mojo.system.ResultAnd<java.nio.ByteBuffer>)
   */
  public static final native Object org_chromium_mojo_system_impl_CoreImpl_beginWriteData(
      Object caller, long mojoHandle, int numBytes, int flags);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.close
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param mojoHandle (long)
   * @return (int)
   */
  public static final native int org_chromium_mojo_system_impl_CoreImpl_close(Object caller,
      long mojoHandle);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.createDataPipe
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param optionsBuffer (java.nio.ByteBuffer)
   * @return (org.chromium.mojo.system.ResultAnd<org.chromium.mojo.system.impl.CoreImpl.RawHandlePair>)
   */
  public static final native Object org_chromium_mojo_system_impl_CoreImpl_createDataPipe(
      Object caller, Object optionsBuffer);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.createMessagePipe
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param optionsBuffer (java.nio.ByteBuffer)
   * @return (org.chromium.mojo.system.ResultAnd<org.chromium.mojo.system.impl.CoreImpl.RawHandlePair>)
   */
  public static final native Object org_chromium_mojo_system_impl_CoreImpl_createMessagePipe(
      Object caller, Object optionsBuffer);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.createPlatformHandle
   * @param fd (int)
   * @return (long)
   */
  public static final native long org_chromium_mojo_system_impl_CoreImpl_createPlatformHandle(
      int fd);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.createSharedBuffer
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param optionsBuffer (java.nio.ByteBuffer)
   * @param numBytes (long)
   * @return (org.chromium.mojo.system.ResultAnd<java.lang.Long>)
   */
  public static final native Object org_chromium_mojo_system_impl_CoreImpl_createSharedBuffer(
      Object caller, Object optionsBuffer, long numBytes);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.duplicate
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param mojoHandle (long)
   * @param optionsBuffer (java.nio.ByteBuffer)
   * @return (org.chromium.mojo.system.ResultAnd<java.lang.Long>)
   */
  public static final native Object org_chromium_mojo_system_impl_CoreImpl_duplicate(Object caller,
      long mojoHandle, Object optionsBuffer);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.endReadData
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param mojoHandle (long)
   * @param numBytesRead (int)
   * @return (int)
   */
  public static final native int org_chromium_mojo_system_impl_CoreImpl_endReadData(Object caller,
      long mojoHandle, int numBytesRead);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.endWriteData
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param mojoHandle (long)
   * @param numBytesWritten (int)
   * @return (int)
   */
  public static final native int org_chromium_mojo_system_impl_CoreImpl_endWriteData(Object caller,
      long mojoHandle, int numBytesWritten);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.getNativeBufferOffset
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param buffer (java.nio.ByteBuffer)
   * @param alignment (int)
   * @return (int)
   */
  public static final native int org_chromium_mojo_system_impl_CoreImpl_getNativeBufferOffset(
      Object caller, Object buffer, int alignment);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.getTimeTicksNow
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @return (long)
   */
  public static final native long org_chromium_mojo_system_impl_CoreImpl_getTimeTicksNow(
      Object caller);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.map
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param mojoHandle (long)
   * @param offset (long)
   * @param numBytes (long)
   * @param flags (int)
   * @return (org.chromium.mojo.system.ResultAnd<java.nio.ByteBuffer>)
   */
  public static final native Object org_chromium_mojo_system_impl_CoreImpl_map(Object caller,
      long mojoHandle, long offset, long numBytes, int flags);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.queryHandleSignalsState
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param mojoHandle (long)
   * @param signalsStateBuffer (java.nio.ByteBuffer)
   * @return (int)
   */
  public static final native int org_chromium_mojo_system_impl_CoreImpl_queryHandleSignalsState(
      Object caller, long mojoHandle, Object signalsStateBuffer);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.readData
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param mojoHandle (long)
   * @param elements (java.nio.ByteBuffer)
   * @param elementsSize (int)
   * @param flags (int)
   * @return (org.chromium.mojo.system.ResultAnd<java.lang.Integer>)
   */
  public static final native Object org_chromium_mojo_system_impl_CoreImpl_readData(Object caller,
      long mojoHandle, Object elements, int elementsSize, int flags);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.readMessage
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param mojoHandle (long)
   * @param flags (int)
   * @return (org.chromium.mojo.system.ResultAnd<org.chromium.mojo.system.MessagePipeHandle.ReadMessageResult>)
   */
  public static final native Object org_chromium_mojo_system_impl_CoreImpl_readMessage(
      Object caller, long mojoHandle, int flags);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.unmap
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param buffer (java.nio.ByteBuffer)
   * @return (int)
   */
  public static final native int org_chromium_mojo_system_impl_CoreImpl_unmap(Object caller,
      Object buffer);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.writeData
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param mojoHandle (long)
   * @param elements (java.nio.ByteBuffer)
   * @param limit (int)
   * @param flags (int)
   * @return (org.chromium.mojo.system.ResultAnd<java.lang.Integer>)
   */
  public static final native Object org_chromium_mojo_system_impl_CoreImpl_writeData(Object caller,
      long mojoHandle, Object elements, int limit, int flags);

  /**
   * org.chromium.mojo.system.impl.CoreImpl.writeMessage
   * @param caller (org.chromium.mojo.system.impl.CoreImpl)
   * @param mojoHandle (long)
   * @param bytes (java.nio.ByteBuffer)
   * @param numBytes (int)
   * @param handlesBuffer (java.nio.ByteBuffer)
   * @param flags (int)
   * @return (int)
   */
  public static final native int org_chromium_mojo_system_impl_CoreImpl_writeMessage(Object caller,
      long mojoHandle, Object bytes, int numBytes, Object handlesBuffer, int flags);

  /**
   * org.chromium.mojo.system.impl.WatcherImpl.cancel
   * @param caller (org.chromium.mojo.system.impl.WatcherImpl)
   * @param implPtr (long)
   * @return (void)
   */
  public static final native void org_chromium_mojo_system_impl_WatcherImpl_cancel(Object caller,
      long implPtr);

  /**
   * org.chromium.mojo.system.impl.WatcherImpl.createWatcher
   * @param caller (org.chromium.mojo.system.impl.WatcherImpl)
   * @return (long)
   */
  public static final native long org_chromium_mojo_system_impl_WatcherImpl_createWatcher(
      Object caller);

  /**
   * org.chromium.mojo.system.impl.WatcherImpl.delete
   * @param caller (org.chromium.mojo.system.impl.WatcherImpl)
   * @param implPtr (long)
   * @return (void)
   */
  public static final native void org_chromium_mojo_system_impl_WatcherImpl_delete(Object caller,
      long implPtr);

  /**
   * org.chromium.mojo.system.impl.WatcherImpl.start
   * @param caller (org.chromium.mojo.system.impl.WatcherImpl)
   * @param implPtr (long)
   * @param mojoHandle (long)
   * @param flags (int)
   * @return (int)
   */
  public static final native int org_chromium_mojo_system_impl_WatcherImpl_start(Object caller,
      long implPtr, long mojoHandle, int flags);
}
