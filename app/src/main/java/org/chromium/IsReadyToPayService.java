/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium;
/**
 * Interface to determine whether a payment app
 * is ready for payment.
 */
public interface IsReadyToPayService extends android.os.IInterface
{
  /** Default implementation for IsReadyToPayService. */
  public static class Default implements IsReadyToPayService
  {
    /**
         * Method that will be called on the Service to query
         * whether the payment app is ready for payment.
         *
         * @param callback The callback to report back to the browser.
         */
    @Override public void isReadyToPay(IsReadyToPayServiceCallback callback) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements IsReadyToPayService
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.IsReadyToPayService interface,
     * generating a proxy if needed.
     */
    public static IsReadyToPayService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof IsReadyToPayService))) {
        return ((IsReadyToPayService)iin);
      }
      return new Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      String descriptor = DESCRIPTOR;
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
        case TRANSACTION_isReadyToPay:
        {
          data.enforceInterface(descriptor);
          IsReadyToPayServiceCallback _arg0;
          _arg0 = IsReadyToPayServiceCallback.Stub.asInterface(data.readStrongBinder());
          this.isReadyToPay(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements IsReadyToPayService
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
      public String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
           * Method that will be called on the Service to query
           * whether the payment app is ready for payment.
           *
           * @param callback The callback to report back to the browser.
           */
      @Override public void isReadyToPay(IsReadyToPayServiceCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_isReadyToPay, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            if (getDefaultImpl() != null) {
              getDefaultImpl().isReadyToPay(callback);
              return;
            }
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static IsReadyToPayService sDefaultImpl;
    }
    static final int TRANSACTION_isReadyToPay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(IsReadyToPayService impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static IsReadyToPayService getDefaultImpl() {
      return Proxy.sDefaultImpl;
    }
  }
  public static final String DESCRIPTOR = "org.chromium.IsReadyToPayService";
  /**
       * Method that will be called on the Service to query
       * whether the payment app is ready for payment.
       *
       * @param callback The callback to report back to the browser.
       */
  public void isReadyToPay(IsReadyToPayServiceCallback callback) throws android.os.RemoteException;
}
