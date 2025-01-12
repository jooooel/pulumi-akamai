// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPropertyIncludeParentsParent {
    private String id;
    private Boolean isIncludeUsedInProductionVersion;
    private Boolean isIncludeUsedInStagingVersion;
    private String name;
    private String productionVersion;
    private String stagingVersion;

    private GetPropertyIncludeParentsParent() {}
    public String id() {
        return this.id;
    }
    public Boolean isIncludeUsedInProductionVersion() {
        return this.isIncludeUsedInProductionVersion;
    }
    public Boolean isIncludeUsedInStagingVersion() {
        return this.isIncludeUsedInStagingVersion;
    }
    public String name() {
        return this.name;
    }
    public String productionVersion() {
        return this.productionVersion;
    }
    public String stagingVersion() {
        return this.stagingVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyIncludeParentsParent defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Boolean isIncludeUsedInProductionVersion;
        private Boolean isIncludeUsedInStagingVersion;
        private String name;
        private String productionVersion;
        private String stagingVersion;
        public Builder() {}
        public Builder(GetPropertyIncludeParentsParent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.isIncludeUsedInProductionVersion = defaults.isIncludeUsedInProductionVersion;
    	      this.isIncludeUsedInStagingVersion = defaults.isIncludeUsedInStagingVersion;
    	      this.name = defaults.name;
    	      this.productionVersion = defaults.productionVersion;
    	      this.stagingVersion = defaults.stagingVersion;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder isIncludeUsedInProductionVersion(Boolean isIncludeUsedInProductionVersion) {
            this.isIncludeUsedInProductionVersion = Objects.requireNonNull(isIncludeUsedInProductionVersion);
            return this;
        }
        @CustomType.Setter
        public Builder isIncludeUsedInStagingVersion(Boolean isIncludeUsedInStagingVersion) {
            this.isIncludeUsedInStagingVersion = Objects.requireNonNull(isIncludeUsedInStagingVersion);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder productionVersion(String productionVersion) {
            this.productionVersion = Objects.requireNonNull(productionVersion);
            return this;
        }
        @CustomType.Setter
        public Builder stagingVersion(String stagingVersion) {
            this.stagingVersion = Objects.requireNonNull(stagingVersion);
            return this;
        }
        public GetPropertyIncludeParentsParent build() {
            final var _resultValue = new GetPropertyIncludeParentsParent();
            _resultValue.id = id;
            _resultValue.isIncludeUsedInProductionVersion = isIncludeUsedInProductionVersion;
            _resultValue.isIncludeUsedInStagingVersion = isIncludeUsedInStagingVersion;
            _resultValue.name = name;
            _resultValue.productionVersion = productionVersion;
            _resultValue.stagingVersion = stagingVersion;
            return _resultValue;
        }
    }
}
