// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatastreamsStreamProperty {
    private Integer propertyId;
    private String propertyName;

    private GetDatastreamsStreamProperty() {}
    public Integer propertyId() {
        return this.propertyId;
    }
    public String propertyName() {
        return this.propertyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatastreamsStreamProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer propertyId;
        private String propertyName;
        public Builder() {}
        public Builder(GetDatastreamsStreamProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propertyId = defaults.propertyId;
    	      this.propertyName = defaults.propertyName;
        }

        @CustomType.Setter
        public Builder propertyId(Integer propertyId) {
            this.propertyId = Objects.requireNonNull(propertyId);
            return this;
        }
        @CustomType.Setter
        public Builder propertyName(String propertyName) {
            this.propertyName = Objects.requireNonNull(propertyName);
            return this;
        }
        public GetDatastreamsStreamProperty build() {
            final var o = new GetDatastreamsStreamProperty();
            o.propertyId = propertyId;
            o.propertyName = propertyName;
            return o;
        }
    }
}