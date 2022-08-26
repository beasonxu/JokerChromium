// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chrome/browser/power_bookmarks/proto/shopping_specifics.proto

package org.chromium.chrome.browser.power_bookmarks;

public interface ShoppingSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:power_bookmarks.ShoppingSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The title of the product.
   * </pre>
   *
   * <code>optional string title = 1;</code>
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   * <pre>
   * The title of the product.
   * </pre>
   *
   * <code>optional string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * The title of the product.
   * </pre>
   *
   * <code>optional string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * Direct link to the product image.
   * </pre>
   *
   * <code>optional string image_url = 2;</code>
   * @return Whether the imageUrl field is set.
   */
  boolean hasImageUrl();
  /**
   * <pre>
   * Direct link to the product image.
   * </pre>
   *
   * <code>optional string image_url = 2;</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <pre>
   * Direct link to the product image.
   * </pre>
   *
   * <code>optional string image_url = 2;</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <pre>
   * Price as shown in the page.
   * </pre>
   *
   * <code>optional .power_bookmarks.ProductPrice current_price = 3;</code>
   * @return Whether the currentPrice field is set.
   */
  boolean hasCurrentPrice();
  /**
   * <pre>
   * Price as shown in the page.
   * </pre>
   *
   * <code>optional .power_bookmarks.ProductPrice current_price = 3;</code>
   * @return The currentPrice.
   */
  org.chromium.chrome.browser.power_bookmarks.ProductPrice getCurrentPrice();

  /**
   * <pre>
   * Cluster id.
   * </pre>
   *
   * <code>optional uint64 product_cluster_id = 4;</code>
   * @return Whether the productClusterId field is set.
   */
  boolean hasProductClusterId();
  /**
   * <pre>
   * Cluster id.
   * </pre>
   *
   * <code>optional uint64 product_cluster_id = 4;</code>
   * @return The productClusterId.
   */
  long getProductClusterId();

  /**
   * <pre>
   * Whether the product is currently being tracked.
   * </pre>
   *
   * <code>optional bool is_price_tracked = 5;</code>
   * @return Whether the isPriceTracked field is set.
   */
  boolean hasIsPriceTracked();
  /**
   * <pre>
   * Whether the product is currently being tracked.
   * </pre>
   *
   * <code>optional bool is_price_tracked = 5;</code>
   * @return The isPriceTracked.
   */
  boolean getIsPriceTracked();

  /**
   * <pre>
   * The offer id for the product.
   * </pre>
   *
   * <code>optional fixed64 offer_id = 6;</code>
   * @return Whether the offerId field is set.
   */
  boolean hasOfferId();
  /**
   * <pre>
   * The offer id for the product.
   * </pre>
   *
   * <code>optional fixed64 offer_id = 6;</code>
   * @return The offerId.
   */
  long getOfferId();

  /**
   * <pre>
   * The country code of the offer.
   * </pre>
   *
   * <code>optional string country_code = 7;</code>
   * @return Whether the countryCode field is set.
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * The country code of the offer.
   * </pre>
   *
   * <code>optional string country_code = 7;</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * The country code of the offer.
   * </pre>
   *
   * <code>optional string country_code = 7;</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();
}
