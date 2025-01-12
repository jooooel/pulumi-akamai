// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatastreamNewRelicConnector {
    private String authToken;
    private @Nullable String contentType;
    private @Nullable String customHeaderName;
    private @Nullable String customHeaderValue;
    private String displayName;
    private String endpoint;

    private DatastreamNewRelicConnector() {}
    public String authToken() {
        return this.authToken;
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastreamNewRelicConnector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authToken;
        private @Nullable String contentType;
        private @Nullable String customHeaderName;
        private @Nullable String customHeaderValue;
        private String displayName;
        private String endpoint;
        public Builder() {}
        public Builder(DatastreamNewRelicConnector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authToken = defaults.authToken;
    	      this.contentType = defaults.contentType;
    	      this.customHeaderName = defaults.customHeaderName;
    	      this.customHeaderValue = defaults.customHeaderValue;
    	      this.displayName = defaults.displayName;
    	      this.endpoint = defaults.endpoint;
        }

        @CustomType.Setter
        public Builder authToken(String authToken) {
            this.authToken = Objects.requireNonNull(authToken);
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
        public DatastreamNewRelicConnector build() {
            final var _resultValue = new DatastreamNewRelicConnector();
            _resultValue.authToken = authToken;
            _resultValue.contentType = contentType;
            _resultValue.customHeaderName = customHeaderName;
            _resultValue.customHeaderValue = customHeaderValue;
            _resultValue.displayName = displayName;
            _resultValue.endpoint = endpoint;
            return _resultValue;
        }
    }
}
