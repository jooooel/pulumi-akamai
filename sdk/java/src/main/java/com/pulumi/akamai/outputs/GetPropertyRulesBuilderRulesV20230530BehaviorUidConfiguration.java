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
public final class GetPropertyRulesBuilderRulesV20230530BehaviorUidConfiguration {
    private @Nullable Boolean enabled;
    private @Nullable String extractLocation;
    private @Nullable String headerName;
    private @Nullable String legalText;
    private @Nullable Boolean locked;
    private @Nullable String queryParameterName;
    private @Nullable String templateUuid;
    private @Nullable String uuid;
    private @Nullable String variableName;

    private GetPropertyRulesBuilderRulesV20230530BehaviorUidConfiguration() {}
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> extractLocation() {
        return Optional.ofNullable(this.extractLocation);
    }
    public Optional<String> headerName() {
        return Optional.ofNullable(this.headerName);
    }
    public Optional<String> legalText() {
        return Optional.ofNullable(this.legalText);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> queryParameterName() {
        return Optional.ofNullable(this.queryParameterName);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public Optional<String> variableName() {
        return Optional.ofNullable(this.variableName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorUidConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String extractLocation;
        private @Nullable String headerName;
        private @Nullable String legalText;
        private @Nullable Boolean locked;
        private @Nullable String queryParameterName;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        private @Nullable String variableName;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorUidConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.extractLocation = defaults.extractLocation;
    	      this.headerName = defaults.headerName;
    	      this.legalText = defaults.legalText;
    	      this.locked = defaults.locked;
    	      this.queryParameterName = defaults.queryParameterName;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
    	      this.variableName = defaults.variableName;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder extractLocation(@Nullable String extractLocation) {
            this.extractLocation = extractLocation;
            return this;
        }
        @CustomType.Setter
        public Builder headerName(@Nullable String headerName) {
            this.headerName = headerName;
            return this;
        }
        @CustomType.Setter
        public Builder legalText(@Nullable String legalText) {
            this.legalText = legalText;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder queryParameterName(@Nullable String queryParameterName) {
            this.queryParameterName = queryParameterName;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder variableName(@Nullable String variableName) {
            this.variableName = variableName;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230530BehaviorUidConfiguration build() {
            final var o = new GetPropertyRulesBuilderRulesV20230530BehaviorUidConfiguration();
            o.enabled = enabled;
            o.extractLocation = extractLocation;
            o.headerName = headerName;
            o.legalText = legalText;
            o.locked = locked;
            o.queryParameterName = queryParameterName;
            o.templateUuid = templateUuid;
            o.uuid = uuid;
            o.variableName = variableName;
            return o;
        }
    }
}