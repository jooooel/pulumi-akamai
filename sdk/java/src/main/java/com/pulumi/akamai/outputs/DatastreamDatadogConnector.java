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
public final class DatastreamDatadogConnector {
    private String authToken;
    private @Nullable Boolean compressLogs;
    private String displayName;
    private String endpoint;
    private @Nullable String service;
    private @Nullable String source;
    private @Nullable String tags;

    private DatastreamDatadogConnector() {}
    public String authToken() {
        return this.authToken;
    }
    public Optional<Boolean> compressLogs() {
        return Optional.ofNullable(this.compressLogs);
    }
    public String displayName() {
        return this.displayName;
    }
    public String endpoint() {
        return this.endpoint;
    }
    public Optional<String> service() {
        return Optional.ofNullable(this.service);
    }
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    public Optional<String> tags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastreamDatadogConnector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authToken;
        private @Nullable Boolean compressLogs;
        private String displayName;
        private String endpoint;
        private @Nullable String service;
        private @Nullable String source;
        private @Nullable String tags;
        public Builder() {}
        public Builder(DatastreamDatadogConnector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authToken = defaults.authToken;
    	      this.compressLogs = defaults.compressLogs;
    	      this.displayName = defaults.displayName;
    	      this.endpoint = defaults.endpoint;
    	      this.service = defaults.service;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder authToken(String authToken) {
            this.authToken = Objects.requireNonNull(authToken);
            return this;
        }
        @CustomType.Setter
        public Builder compressLogs(@Nullable Boolean compressLogs) {
            this.compressLogs = compressLogs;
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
        public Builder service(@Nullable String service) {
            this.service = service;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable String tags) {
            this.tags = tags;
            return this;
        }
        public DatastreamDatadogConnector build() {
            final var _resultValue = new DatastreamDatadogConnector();
            _resultValue.authToken = authToken;
            _resultValue.compressLogs = compressLogs;
            _resultValue.displayName = displayName;
            _resultValue.endpoint = endpoint;
            _resultValue.service = service;
            _resultValue.source = source;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
