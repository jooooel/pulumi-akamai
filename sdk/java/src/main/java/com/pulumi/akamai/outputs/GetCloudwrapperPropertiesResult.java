// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetCloudwrapperPropertiesProperty;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCloudwrapperPropertiesResult {
    private @Nullable List<String> contractIds;
    /**
     * @deprecated
     * Required by the terraform plugin testing framework, always set to `akamai_cloudwrapper_properties`
     * 
     */
    @Deprecated /* Required by the terraform plugin testing framework, always set to `akamai_cloudwrapper_properties` */
    private String id;
    private @Nullable List<GetCloudwrapperPropertiesProperty> properties;
    private @Nullable Boolean unused;

    private GetCloudwrapperPropertiesResult() {}
    public List<String> contractIds() {
        return this.contractIds == null ? List.of() : this.contractIds;
    }
    /**
     * @deprecated
     * Required by the terraform plugin testing framework, always set to `akamai_cloudwrapper_properties`
     * 
     */
    @Deprecated /* Required by the terraform plugin testing framework, always set to `akamai_cloudwrapper_properties` */
    public String id() {
        return this.id;
    }
    public List<GetCloudwrapperPropertiesProperty> properties() {
        return this.properties == null ? List.of() : this.properties;
    }
    public Optional<Boolean> unused() {
        return Optional.ofNullable(this.unused);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudwrapperPropertiesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> contractIds;
        private String id;
        private @Nullable List<GetCloudwrapperPropertiesProperty> properties;
        private @Nullable Boolean unused;
        public Builder() {}
        public Builder(GetCloudwrapperPropertiesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contractIds = defaults.contractIds;
    	      this.id = defaults.id;
    	      this.properties = defaults.properties;
    	      this.unused = defaults.unused;
        }

        @CustomType.Setter
        public Builder contractIds(@Nullable List<String> contractIds) {
            this.contractIds = contractIds;
            return this;
        }
        public Builder contractIds(String... contractIds) {
            return contractIds(List.of(contractIds));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder properties(@Nullable List<GetCloudwrapperPropertiesProperty> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(GetCloudwrapperPropertiesProperty... properties) {
            return properties(List.of(properties));
        }
        @CustomType.Setter
        public Builder unused(@Nullable Boolean unused) {
            this.unused = unused;
            return this;
        }
        public GetCloudwrapperPropertiesResult build() {
            final var o = new GetCloudwrapperPropertiesResult();
            o.contractIds = contractIds;
            o.id = id;
            o.properties = properties;
            o.unused = unused;
            return o;
        }
    }
}