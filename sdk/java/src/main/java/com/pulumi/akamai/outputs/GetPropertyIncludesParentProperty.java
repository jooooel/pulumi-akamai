// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPropertyIncludesParentProperty {
    private String id;
    private Integer version;

    private GetPropertyIncludesParentProperty() {}
    public String id() {
        return this.id;
    }
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyIncludesParentProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Integer version;
        public Builder() {}
        public Builder(GetPropertyIncludesParentProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetPropertyIncludesParentProperty build() {
            final var _resultValue = new GetPropertyIncludesParentProperty();
            _resultValue.id = id;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
