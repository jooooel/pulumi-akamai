// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastreamHttpsConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatastreamHttpsConnectorArgs Empty = new DatastreamHttpsConnectorArgs();

    /**
     * Either `NONE` for no authentication, or `BASIC`. For basic authentication, provide the `user_name` and `password` you set in your custom HTTPS endpoint.
     * 
     */
    @Import(name="authenticationType", required=true)
    private Output<String> authenticationType;

    /**
     * @return Either `NONE` for no authentication, or `BASIC`. For basic authentication, provide the `user_name` and `password` you set in your custom HTTPS endpoint.
     * 
     */
    public Output<String> authenticationType() {
        return this.authenticationType;
    }

    /**
     * **Secret**. The certification authority (CA) certificate used to verify the origin server&#39;s certificate. It&#39;s needed if the certificate stored in `client_cert` is not signed by a well-known certification authority, enter the CA certificate in the PEM format for verification.
     * 
     */
    @Import(name="caCert")
    private @Nullable Output<String> caCert;

    /**
     * @return **Secret**. The certification authority (CA) certificate used to verify the origin server&#39;s certificate. It&#39;s needed if the certificate stored in `client_cert` is not signed by a well-known certification authority, enter the CA certificate in the PEM format for verification.
     * 
     */
    public Optional<Output<String>> caCert() {
        return Optional.ofNullable(this.caCert);
    }

    /**
     * **Secret**. The PEM-formatted digital certificate you want to authenticate requests to your destination with. If you want to use mutual authentication, you need to provide both the client certificate and the client key.
     * 
     */
    @Import(name="clientCert")
    private @Nullable Output<String> clientCert;

    /**
     * @return **Secret**. The PEM-formatted digital certificate you want to authenticate requests to your destination with. If you want to use mutual authentication, you need to provide both the client certificate and the client key.
     * 
     */
    public Optional<Output<String>> clientCert() {
        return Optional.ofNullable(this.clientCert);
    }

    /**
     * **Secret**. The private key in the non-encrypted PKCS8 format you want to use to authenticate with the backend server. If you want to use mutual authentication, you need to provide both the client certificate and the client key.
     * 
     */
    @Import(name="clientKey")
    private @Nullable Output<String> clientKey;

    /**
     * @return **Secret**. The private key in the non-encrypted PKCS8 format you want to use to authenticate with the backend server. If you want to use mutual authentication, you need to provide both the client certificate and the client key.
     * 
     */
    public Optional<Output<String>> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }

    /**
     * Enables GZIP compression for a log file sent to a destination. If unspecified, this defaults to `true`.
     * 
     */
    @Import(name="compressLogs")
    private @Nullable Output<Boolean> compressLogs;

    /**
     * @return Enables GZIP compression for a log file sent to a destination. If unspecified, this defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> compressLogs() {
        return Optional.ofNullable(this.compressLogs);
    }

    @Import(name="connectorId")
    private @Nullable Output<Integer> connectorId;

    public Optional<Output<Integer>> connectorId() {
        return Optional.ofNullable(this.connectorId);
    }

    /**
     * The name of the connector.
     * 
     */
    @Import(name="connectorName", required=true)
    private Output<String> connectorName;

    /**
     * @return The name of the connector.
     * 
     */
    public Output<String> connectorName() {
        return this.connectorName;
    }

    /**
     * Content type to pass in the log file header.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return Content type to pass in the log file header.
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * A human-readable name for the request&#39;s custom header, containing only alphanumeric, dash, and underscore characters.
     * 
     */
    @Import(name="customHeaderName")
    private @Nullable Output<String> customHeaderName;

    /**
     * @return A human-readable name for the request&#39;s custom header, containing only alphanumeric, dash, and underscore characters.
     * 
     */
    public Optional<Output<String>> customHeaderName() {
        return Optional.ofNullable(this.customHeaderName);
    }

    /**
     * The custom header&#39;s contents passed with the request that contains information about the client connection.
     * 
     */
    @Import(name="customHeaderValue")
    private @Nullable Output<String> customHeaderValue;

    /**
     * @return The custom header&#39;s contents passed with the request that contains information about the client connection.
     * 
     */
    public Optional<Output<String>> customHeaderValue() {
        return Optional.ofNullable(this.customHeaderValue);
    }

    @Import(name="mTls")
    private @Nullable Output<Boolean> mTls;

    public Optional<Output<Boolean>> mTls() {
        return Optional.ofNullable(this.mTls);
    }

    /**
     * **Secret**. The Elasticsearch basic access authentication password.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return **Secret**. The Elasticsearch basic access authentication password.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The hostname that verifies the server&#39;s certificate and matches the Subject Alternative Names (SANs) in the certificate. If not provided, DataStream fetches the hostname from the endpoint URL.
     * 
     */
    @Import(name="tlsHostname")
    private @Nullable Output<String> tlsHostname;

    /**
     * @return The hostname that verifies the server&#39;s certificate and matches the Subject Alternative Names (SANs) in the certificate. If not provided, DataStream fetches the hostname from the endpoint URL.
     * 
     */
    public Optional<Output<String>> tlsHostname() {
        return Optional.ofNullable(this.tlsHostname);
    }

    /**
     * Enter the secure URL where you want to send and store your logs.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return Enter the secure URL where you want to send and store your logs.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     * **Secret**. The Elasticsearch basic access authentication username.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return **Secret**. The Elasticsearch basic access authentication username.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private DatastreamHttpsConnectorArgs() {}

    private DatastreamHttpsConnectorArgs(DatastreamHttpsConnectorArgs $) {
        this.authenticationType = $.authenticationType;
        this.caCert = $.caCert;
        this.clientCert = $.clientCert;
        this.clientKey = $.clientKey;
        this.compressLogs = $.compressLogs;
        this.connectorId = $.connectorId;
        this.connectorName = $.connectorName;
        this.contentType = $.contentType;
        this.customHeaderName = $.customHeaderName;
        this.customHeaderValue = $.customHeaderValue;
        this.mTls = $.mTls;
        this.password = $.password;
        this.tlsHostname = $.tlsHostname;
        this.url = $.url;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastreamHttpsConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastreamHttpsConnectorArgs $;

        public Builder() {
            $ = new DatastreamHttpsConnectorArgs();
        }

        public Builder(DatastreamHttpsConnectorArgs defaults) {
            $ = new DatastreamHttpsConnectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationType Either `NONE` for no authentication, or `BASIC`. For basic authentication, provide the `user_name` and `password` you set in your custom HTTPS endpoint.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(Output<String> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType Either `NONE` for no authentication, or `BASIC`. For basic authentication, provide the `user_name` and `password` you set in your custom HTTPS endpoint.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(String authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        /**
         * @param caCert **Secret**. The certification authority (CA) certificate used to verify the origin server&#39;s certificate. It&#39;s needed if the certificate stored in `client_cert` is not signed by a well-known certification authority, enter the CA certificate in the PEM format for verification.
         * 
         * @return builder
         * 
         */
        public Builder caCert(@Nullable Output<String> caCert) {
            $.caCert = caCert;
            return this;
        }

        /**
         * @param caCert **Secret**. The certification authority (CA) certificate used to verify the origin server&#39;s certificate. It&#39;s needed if the certificate stored in `client_cert` is not signed by a well-known certification authority, enter the CA certificate in the PEM format for verification.
         * 
         * @return builder
         * 
         */
        public Builder caCert(String caCert) {
            return caCert(Output.of(caCert));
        }

        /**
         * @param clientCert **Secret**. The PEM-formatted digital certificate you want to authenticate requests to your destination with. If you want to use mutual authentication, you need to provide both the client certificate and the client key.
         * 
         * @return builder
         * 
         */
        public Builder clientCert(@Nullable Output<String> clientCert) {
            $.clientCert = clientCert;
            return this;
        }

        /**
         * @param clientCert **Secret**. The PEM-formatted digital certificate you want to authenticate requests to your destination with. If you want to use mutual authentication, you need to provide both the client certificate and the client key.
         * 
         * @return builder
         * 
         */
        public Builder clientCert(String clientCert) {
            return clientCert(Output.of(clientCert));
        }

        /**
         * @param clientKey **Secret**. The private key in the non-encrypted PKCS8 format you want to use to authenticate with the backend server. If you want to use mutual authentication, you need to provide both the client certificate and the client key.
         * 
         * @return builder
         * 
         */
        public Builder clientKey(@Nullable Output<String> clientKey) {
            $.clientKey = clientKey;
            return this;
        }

        /**
         * @param clientKey **Secret**. The private key in the non-encrypted PKCS8 format you want to use to authenticate with the backend server. If you want to use mutual authentication, you need to provide both the client certificate and the client key.
         * 
         * @return builder
         * 
         */
        public Builder clientKey(String clientKey) {
            return clientKey(Output.of(clientKey));
        }

        /**
         * @param compressLogs Enables GZIP compression for a log file sent to a destination. If unspecified, this defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder compressLogs(@Nullable Output<Boolean> compressLogs) {
            $.compressLogs = compressLogs;
            return this;
        }

        /**
         * @param compressLogs Enables GZIP compression for a log file sent to a destination. If unspecified, this defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder compressLogs(Boolean compressLogs) {
            return compressLogs(Output.of(compressLogs));
        }

        public Builder connectorId(@Nullable Output<Integer> connectorId) {
            $.connectorId = connectorId;
            return this;
        }

        public Builder connectorId(Integer connectorId) {
            return connectorId(Output.of(connectorId));
        }

        /**
         * @param connectorName The name of the connector.
         * 
         * @return builder
         * 
         */
        public Builder connectorName(Output<String> connectorName) {
            $.connectorName = connectorName;
            return this;
        }

        /**
         * @param connectorName The name of the connector.
         * 
         * @return builder
         * 
         */
        public Builder connectorName(String connectorName) {
            return connectorName(Output.of(connectorName));
        }

        /**
         * @param contentType Content type to pass in the log file header.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType Content type to pass in the log file header.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param customHeaderName A human-readable name for the request&#39;s custom header, containing only alphanumeric, dash, and underscore characters.
         * 
         * @return builder
         * 
         */
        public Builder customHeaderName(@Nullable Output<String> customHeaderName) {
            $.customHeaderName = customHeaderName;
            return this;
        }

        /**
         * @param customHeaderName A human-readable name for the request&#39;s custom header, containing only alphanumeric, dash, and underscore characters.
         * 
         * @return builder
         * 
         */
        public Builder customHeaderName(String customHeaderName) {
            return customHeaderName(Output.of(customHeaderName));
        }

        /**
         * @param customHeaderValue The custom header&#39;s contents passed with the request that contains information about the client connection.
         * 
         * @return builder
         * 
         */
        public Builder customHeaderValue(@Nullable Output<String> customHeaderValue) {
            $.customHeaderValue = customHeaderValue;
            return this;
        }

        /**
         * @param customHeaderValue The custom header&#39;s contents passed with the request that contains information about the client connection.
         * 
         * @return builder
         * 
         */
        public Builder customHeaderValue(String customHeaderValue) {
            return customHeaderValue(Output.of(customHeaderValue));
        }

        public Builder mTls(@Nullable Output<Boolean> mTls) {
            $.mTls = mTls;
            return this;
        }

        public Builder mTls(Boolean mTls) {
            return mTls(Output.of(mTls));
        }

        /**
         * @param password **Secret**. The Elasticsearch basic access authentication password.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password **Secret**. The Elasticsearch basic access authentication password.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param tlsHostname The hostname that verifies the server&#39;s certificate and matches the Subject Alternative Names (SANs) in the certificate. If not provided, DataStream fetches the hostname from the endpoint URL.
         * 
         * @return builder
         * 
         */
        public Builder tlsHostname(@Nullable Output<String> tlsHostname) {
            $.tlsHostname = tlsHostname;
            return this;
        }

        /**
         * @param tlsHostname The hostname that verifies the server&#39;s certificate and matches the Subject Alternative Names (SANs) in the certificate. If not provided, DataStream fetches the hostname from the endpoint URL.
         * 
         * @return builder
         * 
         */
        public Builder tlsHostname(String tlsHostname) {
            return tlsHostname(Output.of(tlsHostname));
        }

        /**
         * @param url Enter the secure URL where you want to send and store your logs.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Enter the secure URL where you want to send and store your logs.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param userName **Secret**. The Elasticsearch basic access authentication username.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName **Secret**. The Elasticsearch basic access authentication username.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public DatastreamHttpsConnectorArgs build() {
            $.authenticationType = Objects.requireNonNull($.authenticationType, "expected parameter 'authenticationType' to be non-null");
            $.connectorName = Objects.requireNonNull($.connectorName, "expected parameter 'connectorName' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}