// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPropertyHostnamesHostnameCertStatus {
    private String hostname;
    private String productionStatus;
    private String stagingStatus;
    private String target;

    private GetPropertyHostnamesHostnameCertStatus() {}
    public String hostname() {
        return this.hostname;
    }
    public String productionStatus() {
        return this.productionStatus;
    }
    public String stagingStatus() {
        return this.stagingStatus;
    }
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyHostnamesHostnameCertStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hostname;
        private String productionStatus;
        private String stagingStatus;
        private String target;
        public Builder() {}
        public Builder(GetPropertyHostnamesHostnameCertStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.productionStatus = defaults.productionStatus;
    	      this.stagingStatus = defaults.stagingStatus;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        @CustomType.Setter
        public Builder productionStatus(String productionStatus) {
            this.productionStatus = Objects.requireNonNull(productionStatus);
            return this;
        }
        @CustomType.Setter
        public Builder stagingStatus(String stagingStatus) {
            this.stagingStatus = Objects.requireNonNull(stagingStatus);
            return this;
        }
        @CustomType.Setter
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public GetPropertyHostnamesHostnameCertStatus build() {
            final var o = new GetPropertyHostnamesHostnameCertStatus();
            o.hostname = hostname;
            o.productionStatus = productionStatus;
            o.stagingStatus = stagingStatus;
            o.target = target;
            return o;
        }
    }
}