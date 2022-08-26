/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.components.webapk_install;
public interface IOnFinishInstallCallback extends android.os.IInterface
{
  /** Default implementation for IOnFinishInstallCallback. */
  public static class Default implements org.chromium.components.webapk_install.IOnFinishInstallCallback
  {
    @Override public void handleOnFinishInstall(int result) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.components.webapk_install.IOnFinishInstallCallback
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.components.webapk_install.IOnFinishInstallCallback interface,
     * generating a proxy if needed.
     */
    public static org.chromium.components.webapk_install.IOnFinishInstallCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.components.webapk_install.IOnFinishInstallCallback))) {
        return ((org.chromium.components.webapk_install.IOnFinishInstallCallback)iin);
      }
      return new org.chromium.components.webapk_install.IOnFinishInstallCallback.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
      }
      switch (code)
      {
        case TRANSACTION_handleOnFinishInstall:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.handleOnFinishInstall(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.components.webapk_install.IOnFinishInstallCallback
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void handleOnFinishInstall(int result) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(result);
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleOnFinishInstall, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            if (getDefaultImpl() != null) {
              getDefaultImpl().handleOnFinishInstall(result);
              return;
            }
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static org.chromium.components.webapk_install.IOnFinishInstallCallback sDefaultImpl;
    }
    static final int TRANSACTION_handleOnFinishInstall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(org.chromium.components.webapk_install.IOnFinishInstallCallback impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static org.chromium.components.webapk_install.IOnFinishInstallCallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public static final java.lang.String DESCRIPTOR = "org.chromium.components.webapk_install.IOnFinishInstallCallback";
  public void handleOnFinishInstall(int result) throws android.os.RemoteException;
}
