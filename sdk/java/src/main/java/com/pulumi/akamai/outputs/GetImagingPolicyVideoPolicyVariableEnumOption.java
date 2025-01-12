// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetImagingPolicyVideoPolicyVariableEnumOption {
    private String id;
    private String value;

    private GetImagingPolicyVideoPolicyVariableEnumOption() {}
    public String id() {
        return this.id;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyVideoPolicyVariableEnumOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String value;
        public Builder() {}
        public Builder(GetImagingPolicyVideoPolicyVariableEnumOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetImagingPolicyVideoPolicyVariableEnumOption build() {
            final var _resultValue = new GetImagingPolicyVideoPolicyVariableEnumOption();
            _resultValue.id = id;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
