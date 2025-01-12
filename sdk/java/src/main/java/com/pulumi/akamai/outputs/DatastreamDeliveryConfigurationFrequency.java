// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class DatastreamDeliveryConfigurationFrequency {
    private Integer intervalInSecs;

    private DatastreamDeliveryConfigurationFrequency() {}
    public Integer intervalInSecs() {
        return this.intervalInSecs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastreamDeliveryConfigurationFrequency defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer intervalInSecs;
        public Builder() {}
        public Builder(DatastreamDeliveryConfigurationFrequency defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intervalInSecs = defaults.intervalInSecs;
        }

        @CustomType.Setter
        public Builder intervalInSecs(Integer intervalInSecs) {
            this.intervalInSecs = Objects.requireNonNull(intervalInSecs);
            return this;
        }
        public DatastreamDeliveryConfigurationFrequency build() {
            final var _resultValue = new DatastreamDeliveryConfigurationFrequency();
            _resultValue.intervalInSecs = intervalInSecs;
            return _resultValue;
        }
    }
}
