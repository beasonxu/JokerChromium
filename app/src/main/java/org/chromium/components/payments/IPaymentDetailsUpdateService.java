/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.components.payments;
/**
 * Helper interface used by the invoked native payment app to notify the
 * browser that the user has selected a different payment method, shipping
 * option, or shipping address.
 */
public interface IPaymentDetailsUpdateService extends android.os.IInterface
{
  /** Default implementation for IPaymentDetailsUpdateService. */
  public static class Default implements org.chromium.components.payments.IPaymentDetailsUpdateService
  {
    /**
     * Called to notify the browser that the user has selected a different
     * payment method.
     * 
     * @param paymentHandlerMethodData The data containing the selected payment
     *      method's name and optional stringified details.
     */
    @Override public void changePaymentMethod(android.os.Bundle paymentHandlerMethodData, org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback callback) throws android.os.RemoteException
    {
    }
    /**
     * Called to notify the browser that the user has selected a different
     * shipping option.
     * 
     * @param shippingOptionId The identifier of the selected shipping option.
     */
    @Override public void changeShippingOption(java.lang.String shippingOptionId, org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback callback) throws android.os.RemoteException
    {
    }
    /**
     * Called to notify the browser that the user has selected a different
     * shipping address.
     * 
     * @param shippingAddress The selected shipping address.
     */
    @Override public void changeShippingAddress(android.os.Bundle shippingAddress, org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback callback) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.components.payments.IPaymentDetailsUpdateService
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.components.payments.IPaymentDetailsUpdateService interface,
     * generating a proxy if needed.
     */
    public static org.chromium.components.payments.IPaymentDetailsUpdateService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.components.payments.IPaymentDetailsUpdateService))) {
        return ((org.chromium.components.payments.IPaymentDetailsUpdateService)iin);
      }
      return new org.chromium.components.payments.IPaymentDetailsUpdateService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
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
        case TRANSACTION_changePaymentMethod:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback _arg1;
          _arg1 = org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback.Stub.asInterface(data.readStrongBinder());
          this.changePaymentMethod(_arg0, _arg1);
          break;
        }
        case TRANSACTION_changeShippingOption:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback _arg1;
          _arg1 = org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback.Stub.asInterface(data.readStrongBinder());
          this.changeShippingOption(_arg0, _arg1);
          break;
        }
        case TRANSACTION_changeShippingAddress:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback _arg1;
          _arg1 = org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback.Stub.asInterface(data.readStrongBinder());
          this.changeShippingAddress(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements org.chromium.components.payments.IPaymentDetailsUpdateService
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
      /**
       * Called to notify the browser that the user has selected a different
       * payment method.
       * 
       * @param paymentHandlerMethodData The data containing the selected payment
       *      method's name and optional stringified details.
       */
      @Override public void changePaymentMethod(android.os.Bundle paymentHandlerMethodData, org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, paymentHandlerMethodData, 0);
          _data.writeStrongInterface(callback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_changePaymentMethod, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Called to notify the browser that the user has selected a different
       * shipping option.
       * 
       * @param shippingOptionId The identifier of the selected shipping option.
       */
      @Override public void changeShippingOption(java.lang.String shippingOptionId, org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(shippingOptionId);
          _data.writeStrongInterface(callback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_changeShippingOption, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Called to notify the browser that the user has selected a different
       * shipping address.
       * 
       * @param shippingAddress The selected shipping address.
       */
      @Override public void changeShippingAddress(android.os.Bundle shippingAddress, org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, shippingAddress, 0);
          _data.writeStrongInterface(callback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_changeShippingAddress, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_changePaymentMethod = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_changeShippingOption = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_changeShippingAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
  }
  public static final java.lang.String DESCRIPTOR = "org.chromium.components.payments.IPaymentDetailsUpdateService";
  /**
   * Called to notify the browser that the user has selected a different
   * payment method.
   * 
   * @param paymentHandlerMethodData The data containing the selected payment
   *      method's name and optional stringified details.
   */
  public void changePaymentMethod(android.os.Bundle paymentHandlerMethodData, org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback callback) throws android.os.RemoteException;
  /**
   * Called to notify the browser that the user has selected a different
   * shipping option.
   * 
   * @param shippingOptionId The identifier of the selected shipping option.
   */
  public void changeShippingOption(java.lang.String shippingOptionId, org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback callback) throws android.os.RemoteException;
  /**
   * Called to notify the browser that the user has selected a different
   * shipping address.
   * 
   * @param shippingAddress The selected shipping address.
   */
  public void changeShippingAddress(android.os.Bundle shippingAddress, org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback callback) throws android.os.RemoteException;
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        android.os.Parcelable.Creator<T> c) {
      if (parcel.readInt() != 0) {
          return c.createFromParcel(parcel);
      } else {
          return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
        android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
  }
}
