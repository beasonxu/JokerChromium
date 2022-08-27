/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium;
/**
 * Helper interface to report back whether the
 * payment app is ready for payment.
 */
public interface IsReadyToPayServiceCallback extends android.os.IInterface
{
  /** Default implementation for IsReadyToPayServiceCallback. */
  public static class Default implements IsReadyToPayServiceCallback
  {
    /**
         * Method to be called by the Service to indicate
         * whether the payment app is ready for payment.
         *
         * @param isReadyToPay Whether payment app is ready to pay.
         */
    @Override public void handleIsReadyToPay(boolean isReadyToPay) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements IsReadyToPayServiceCallback
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.IsReadyToPayServiceCallback interface,
     * generating a proxy if needed.
     */
    public static IsReadyToPayServiceCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof IsReadyToPayServiceCallback))) {
        return ((IsReadyToPayServiceCallback)iin);
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
        case TRANSACTION_handleIsReadyToPay:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.handleIsReadyToPay(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements IsReadyToPayServiceCallback
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
           * Method to be called by the Service to indicate
           * whether the payment app is ready for payment.
           *
           * @param isReadyToPay Whether payment app is ready to pay.
           */
      @Override public void handleIsReadyToPay(boolean isReadyToPay) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((isReadyToPay)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleIsReadyToPay, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            if (getDefaultImpl() != null) {
              getDefaultImpl().handleIsReadyToPay(isReadyToPay);
              return;
            }
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static IsReadyToPayServiceCallback sDefaultImpl;
    }
    static final int TRANSACTION_handleIsReadyToPay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(IsReadyToPayServiceCallback impl) {
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
    public static IsReadyToPayServiceCallback getDefaultImpl() {
      return Proxy.sDefaultImpl;
    }
  }
  public static final String DESCRIPTOR = "org.chromium.IsReadyToPayServiceCallback";
  /**
       * Method to be called by the Service to indicate
       * whether the payment app is ready for payment.
       *
       * @param isReadyToPay Whether payment app is ready to pay.
       */
  public void handleIsReadyToPay(boolean isReadyToPay) throws android.os.RemoteException;
}
