// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatastreamHttpsConnector {
    private String authenticationType;
    private @Nullable String caCert;
    private @Nullable String clientCert;
    private @Nullable String clientKey;
    private @Nullable Boolean compressLogs;
    private @Nullable String contentType;
    private @Nullable String customHeaderName;
    private @Nullable String customHeaderValue;
    private String displayName;
    private String endpoint;
    private @Nullable Boolean mTls;
    private @Nullable String password;
    private @Nullable String tlsHostname;
    private @Nullable String userName;

    private DatastreamHttpsConnector() {}
    public String authenticationType() {
        return this.authenticationType;
    }
    public Optional<String> caCert() {
        return Optional.ofNullable(this.caCert);
    }
    public Optional<String> clientCert() {
        return Optional.ofNullable(this.clientCert);
    }
    public Optional<String> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }
    public Optional<Boolean> compressLogs() {
        return Optional.ofNullable(this.compressLogs);
    }
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }
    public Optional<String> customHeaderName() {
        return Optional.ofNullable(this.customHeaderName);
    }
    public Optional<String> customHeaderValue() {
        return Optional.ofNullable(this.customHeaderValue);
    }
    public String displayName() {
        return this.displayName;
    }
    public String endpoint() {
        return this.endpoint;
    }
    public Optional<Boolean> mTls() {
        return Optional.ofNullable(this.mTls);
    }
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    public Optional<String> tlsHostname() {
        return Optional.ofNullable(this.tlsHostname);
    }
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastreamHttpsConnector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authenticationType;
        private @Nullable String caCert;
        private @Nullable String clientCert;
        private @Nullable String clientKey;
        private @Nullable Boolean compressLogs;
        private @Nullable String contentType;
        private @Nullable String customHeaderName;
        private @Nullable String customHeaderValue;
        private String displayName;
        private String endpoint;
        private @Nullable Boolean mTls;
        private @Nullable String password;
        private @Nullable String tlsHostname;
        private @Nullable String userName;
        public Builder() {}
        public Builder(DatastreamHttpsConnector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.caCert = defaults.caCert;
    	      this.clientCert = defaults.clientCert;
    	      this.clientKey = defaults.clientKey;
    	      this.compressLogs = defaults.compressLogs;
    	      this.contentType = defaults.contentType;
    	      this.customHeaderName = defaults.customHeaderName;
    	      this.customHeaderValue = defaults.customHeaderValue;
    	      this.displayName = defaults.displayName;
    	      this.endpoint = defaults.endpoint;
    	      this.mTls = defaults.mTls;
    	      this.password = defaults.password;
    	      this.tlsHostname = defaults.tlsHostname;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        @CustomType.Setter
        public Builder caCert(@Nullable String caCert) {
            this.caCert = caCert;
            return this;
        }
        @CustomType.Setter
        public Builder clientCert(@Nullable String clientCert) {
            this.clientCert = clientCert;
            return this;
        }
        @CustomType.Setter
        public Builder clientKey(@Nullable String clientKey) {
            this.clientKey = clientKey;
            return this;
        }
        @CustomType.Setter
        public Builder compressLogs(@Nullable Boolean compressLogs) {
            this.compressLogs = compressLogs;
            return this;
        }
        @CustomType.Setter
        public Builder contentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }
        @CustomType.Setter
        public Builder customHeaderName(@Nullable String customHeaderName) {
            this.customHeaderName = customHeaderName;
            return this;
        }
        @CustomType.Setter
        public Builder customHeaderValue(@Nullable String customHeaderValue) {
            this.customHeaderValue = customHeaderValue;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        @CustomType.Setter
        public Builder mTls(@Nullable Boolean mTls) {
            this.mTls = mTls;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder tlsHostname(@Nullable String tlsHostname) {
            this.tlsHostname = tlsHostname;
            return this;
        }
        @CustomType.Setter
        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }
        public DatastreamHttpsConnector build() {
            final var _resultValue = new DatastreamHttpsConnector();
            _resultValue.authenticationType = authenticationType;
            _resultValue.caCert = caCert;
            _resultValue.clientCert = clientCert;
            _resultValue.clientKey = clientKey;
            _resultValue.compressLogs = compressLogs;
            _resultValue.contentType = contentType;
            _resultValue.customHeaderName = customHeaderName;
            _resultValue.customHeaderValue = customHeaderValue;
            _resultValue.displayName = displayName;
            _resultValue.endpoint = endpoint;
            _resultValue.mTls = mTls;
            _resultValue.password = password;
            _resultValue.tlsHostname = tlsHostname;
            _resultValue.userName = userName;
            return _resultValue;
        }
    }
}
