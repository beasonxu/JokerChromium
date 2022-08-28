package org.chromium.mojo.system.impl;

import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.mojo.system.MessagePipeHandle;
import org.chromium.mojo.system.ResultAnd;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class CoreImplJni implements CoreImpl.Natives {
  private static CoreImpl.Natives testInstance;

  public static final JniStaticTestMocker<CoreImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<CoreImpl.Natives>() {
    @Override
    public void setInstanceForTesting(CoreImpl.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getTimeTicksNow(CoreImpl caller) {
    return (long)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_getTimeTicksNow(caller);
  }

  @Override
  public ResultAnd<CoreImpl.RawHandlePair> createMessagePipe(CoreImpl caller,
      ByteBuffer optionsBuffer) {
    return (ResultAnd<CoreImpl.RawHandlePair>)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_createMessagePipe(caller, optionsBuffer);
  }

  @Override
  public ResultAnd<CoreImpl.RawHandlePair> createDataPipe(CoreImpl caller,
      ByteBuffer optionsBuffer) {
    return (ResultAnd<CoreImpl.RawHandlePair>)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_createDataPipe(caller, optionsBuffer);
  }

  @Override
  public ResultAnd<Long> createSharedBuffer(CoreImpl caller, ByteBuffer optionsBuffer,
      long numBytes) {
    return (ResultAnd<Long>)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_createSharedBuffer(caller, optionsBuffer, numBytes);
  }

  @Override
  public int close(CoreImpl caller, long mojoHandle) {
    return (int)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_close(caller, mojoHandle);
  }

  @Override
  public int queryHandleSignalsState(CoreImpl caller, long mojoHandle,
      ByteBuffer signalsStateBuffer) {
    return (int)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_queryHandleSignalsState(caller, mojoHandle, signalsStateBuffer);
  }

  @Override
  public int writeMessage(CoreImpl caller, long mojoHandle, ByteBuffer bytes, int numBytes,
      ByteBuffer handlesBuffer, int flags) {
    return (int)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_writeMessage(caller, mojoHandle, bytes, numBytes, handlesBuffer, flags);
  }

  @Override
  public ResultAnd<MessagePipeHandle.ReadMessageResult> readMessage(CoreImpl caller,
      long mojoHandle, int flags) {
    return (ResultAnd<MessagePipeHandle.ReadMessageResult>)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_readMessage(caller, mojoHandle, flags);
  }

  @Override
  public ResultAnd<Integer> readData(CoreImpl caller, long mojoHandle, ByteBuffer elements,
      int elementsSize, int flags) {
    return (ResultAnd<Integer>)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_readData(caller, mojoHandle, elements, elementsSize, flags);
  }

  @Override
  public ResultAnd<ByteBuffer> beginReadData(CoreImpl caller, long mojoHandle, int numBytes,
      int flags) {
    return (ResultAnd<ByteBuffer>)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_beginReadData(caller, mojoHandle, numBytes, flags);
  }

  @Override
  public int endReadData(CoreImpl caller, long mojoHandle, int numBytesRead) {
    return (int)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_endReadData(caller, mojoHandle, numBytesRead);
  }

  @Override
  public ResultAnd<Integer> writeData(CoreImpl caller, long mojoHandle, ByteBuffer elements,
      int limit, int flags) {
    return (ResultAnd<Integer>)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_writeData(caller, mojoHandle, elements, limit, flags);
  }

  @Override
  public ResultAnd<ByteBuffer> beginWriteData(CoreImpl caller, long mojoHandle, int numBytes,
      int flags) {
    return (ResultAnd<ByteBuffer>)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_beginWriteData(caller, mojoHandle, numBytes, flags);
  }

  @Override
  public int endWriteData(CoreImpl caller, long mojoHandle, int numBytesWritten) {
    return (int)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_endWriteData(caller, mojoHandle, numBytesWritten);
  }

  @Override
  public ResultAnd<Long> duplicate(CoreImpl caller, long mojoHandle, ByteBuffer optionsBuffer) {
    return (ResultAnd<Long>)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_duplicate(caller, mojoHandle, optionsBuffer);
  }

  @Override
  public ResultAnd<ByteBuffer> map(CoreImpl caller, long mojoHandle, long offset, long numBytes,
      int flags) {
    return (ResultAnd<ByteBuffer>)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_map(caller, mojoHandle, offset, numBytes, flags);
  }

  @Override
  public int unmap(CoreImpl caller, ByteBuffer buffer) {
    return (int)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_unmap(caller, buffer);
  }

  @Override
  public int getNativeBufferOffset(CoreImpl caller, ByteBuffer buffer, int alignment) {
    return (int)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_getNativeBufferOffset(caller, buffer, alignment);
  }

  @Override
  public long createPlatformHandle(int fd) {
    return (long)GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_createPlatformHandle(fd);
  }

  public static CoreImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.mojo.system.impl.CoreImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new CoreImplJni();
  }
}