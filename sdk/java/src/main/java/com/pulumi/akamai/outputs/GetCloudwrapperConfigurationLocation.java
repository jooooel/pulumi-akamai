// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetCloudwrapperConfigurationLocationCapacity;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudwrapperConfigurationLocation {
    private GetCloudwrapperConfigurationLocationCapacity capacity;
    private String comments;
    private String mapName;
    private Integer trafficTypeId;

    private GetCloudwrapperConfigurationLocation() {}
    public GetCloudwrapperConfigurationLocationCapacity capacity() {
        return this.capacity;
    }
    public String comments() {
        return this.comments;
    }
    public String mapName() {
        return this.mapName;
    }
    public Integer trafficTypeId() {
        return this.trafficTypeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudwrapperConfigurationLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetCloudwrapperConfigurationLocationCapacity capacity;
        private String comments;
        private String mapName;
        private Integer trafficTypeId;
        public Builder() {}
        public Builder(GetCloudwrapperConfigurationLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.comments = defaults.comments;
    	      this.mapName = defaults.mapName;
    	      this.trafficTypeId = defaults.trafficTypeId;
        }

        @CustomType.Setter
        public Builder capacity(GetCloudwrapperConfigurationLocationCapacity capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }
        @CustomType.Setter
        public Builder comments(String comments) {
            this.comments = Objects.requireNonNull(comments);
            return this;
        }
        @CustomType.Setter
        public Builder mapName(String mapName) {
            this.mapName = Objects.requireNonNull(mapName);
            return this;
        }
        @CustomType.Setter
        public Builder trafficTypeId(Integer trafficTypeId) {
            this.trafficTypeId = Objects.requireNonNull(trafficTypeId);
            return this;
        }
        public GetCloudwrapperConfigurationLocation build() {
            final var _resultValue = new GetCloudwrapperConfigurationLocation();
            _resultValue.capacity = capacity;
            _resultValue.comments = comments;
            _resultValue.mapName = mapName;
            _resultValue.trafficTypeId = trafficTypeId;
            return _resultValue;
        }
    }
}
