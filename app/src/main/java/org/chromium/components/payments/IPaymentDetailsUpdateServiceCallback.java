/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.components.payments;
/**
 * Helper interface used by the browser to notify the invoked native app about
 * merchant's response to one of the paymentmethodchange, shippingoptionchange,
 * or shippingaddresschange events.
 */
public interface IPaymentDetailsUpdateServiceCallback extends android.os.IInterface
{
  /** Default implementation for IPaymentDetailsUpdateServiceCallback. */
  public static class Default implements org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback
  {
    /**
     * Called to notify the invoked payment app about updated payment details
     * received from the merchant.
     * 
     * @param updatedPaymentDetails The updated payment details received from
     *      the merchant.
     */
    @Override public void updateWith(android.os.Bundle updatedPaymentDetails) throws android.os.RemoteException
    {
    }
    /**
     * Called to notify the invoked payment app that the merchant has not
     * modified the payment details.
     */
    @Override public void paymentDetailsNotUpdated() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback interface,
     * generating a proxy if needed.
     */
    public static org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback))) {
        return ((org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback)iin);
      }
      return new org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback.Stub.Proxy(obj);
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
        case TRANSACTION_updateWith:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          this.updateWith(_arg0);
          break;
        }
        case TRANSACTION_paymentDetailsNotUpdated:
        {
          this.paymentDetailsNotUpdated();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback
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
       * Called to notify the invoked payment app about updated payment details
       * received from the merchant.
       * 
       * @param updatedPaymentDetails The updated payment details received from
       *      the merchant.
       */
      @Override public void updateWith(android.os.Bundle updatedPaymentDetails) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, updatedPaymentDetails, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateWith, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Called to notify the invoked payment app that the merchant has not
       * modified the payment details.
       */
      @Override public void paymentDetailsNotUpdated() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_paymentDetailsNotUpdated, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_updateWith = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_paymentDetailsNotUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  public static final java.lang.String DESCRIPTOR = "org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback";
  /**
   * Called to notify the invoked payment app about updated payment details
   * received from the merchant.
   * 
   * @param updatedPaymentDetails The updated payment details received from
   *      the merchant.
   */
  public void updateWith(android.os.Bundle updatedPaymentDetails) throws android.os.RemoteException;
  /**
   * Called to notify the invoked payment app that the merchant has not
   * modified the payment details.
   */
  public void paymentDetailsNotUpdated() throws android.os.RemoteException;
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
