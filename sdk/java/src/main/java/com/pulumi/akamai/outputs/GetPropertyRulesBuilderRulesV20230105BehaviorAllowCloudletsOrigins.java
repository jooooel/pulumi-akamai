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
public final class GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins {
    private @Nullable Boolean enabled;
    private @Nullable Boolean honorBaseDirectory;
    private @Nullable Boolean locked;
    private @Nullable String purgeOriginQueryParameter;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins() {}
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> honorBaseDirectory() {
        return Optional.ofNullable(this.honorBaseDirectory);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> purgeOriginQueryParameter() {
        return Optional.ofNullable(this.purgeOriginQueryParameter);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Boolean honorBaseDirectory;
        private @Nullable Boolean locked;
        private @Nullable String purgeOriginQueryParameter;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.honorBaseDirectory = defaults.honorBaseDirectory;
    	      this.locked = defaults.locked;
    	      this.purgeOriginQueryParameter = defaults.purgeOriginQueryParameter;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder honorBaseDirectory(@Nullable Boolean honorBaseDirectory) {
            this.honorBaseDirectory = honorBaseDirectory;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder purgeOriginQueryParameter(@Nullable String purgeOriginQueryParameter) {
            this.purgeOriginQueryParameter = purgeOriginQueryParameter;
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
        public GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins();
            _resultValue.enabled = enabled;
            _resultValue.honorBaseDirectory = honorBaseDirectory;
            _resultValue.locked = locked;
            _resultValue.purgeOriginQueryParameter = purgeOriginQueryParameter;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
