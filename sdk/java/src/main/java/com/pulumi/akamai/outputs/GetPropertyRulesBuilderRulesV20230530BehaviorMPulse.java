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
public final class GetPropertyRulesBuilderRulesV20230530BehaviorMPulse {
    private @Nullable String apiKey;
    private @Nullable String bufferSize;
    private @Nullable String configOverride;
    private @Nullable Boolean enabled;
    private @Nullable String loaderVersion;
    private @Nullable Boolean locked;
    private @Nullable Boolean requirePci;
    private @Nullable String templateUuid;
    private @Nullable String titleOptional;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorMPulse() {}
    public Optional<String> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }
    public Optional<String> bufferSize() {
        return Optional.ofNullable(this.bufferSize);
    }
    public Optional<String> configOverride() {
        return Optional.ofNullable(this.configOverride);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> loaderVersion() {
        return Optional.ofNullable(this.loaderVersion);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Boolean> requirePci() {
        return Optional.ofNullable(this.requirePci);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> titleOptional() {
        return Optional.ofNullable(this.titleOptional);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorMPulse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiKey;
        private @Nullable String bufferSize;
        private @Nullable String configOverride;
        private @Nullable Boolean enabled;
        private @Nullable String loaderVersion;
        private @Nullable Boolean locked;
        private @Nullable Boolean requirePci;
        private @Nullable String templateUuid;
        private @Nullable String titleOptional;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorMPulse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.bufferSize = defaults.bufferSize;
    	      this.configOverride = defaults.configOverride;
    	      this.enabled = defaults.enabled;
    	      this.loaderVersion = defaults.loaderVersion;
    	      this.locked = defaults.locked;
    	      this.requirePci = defaults.requirePci;
    	      this.templateUuid = defaults.templateUuid;
    	      this.titleOptional = defaults.titleOptional;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder apiKey(@Nullable String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        @CustomType.Setter
        public Builder bufferSize(@Nullable String bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }
        @CustomType.Setter
        public Builder configOverride(@Nullable String configOverride) {
            this.configOverride = configOverride;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder loaderVersion(@Nullable String loaderVersion) {
            this.loaderVersion = loaderVersion;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder requirePci(@Nullable Boolean requirePci) {
            this.requirePci = requirePci;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder titleOptional(@Nullable String titleOptional) {
            this.titleOptional = titleOptional;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230530BehaviorMPulse build() {
            final var o = new GetPropertyRulesBuilderRulesV20230530BehaviorMPulse();
            o.apiKey = apiKey;
            o.bufferSize = bufferSize;
            o.configOverride = configOverride;
            o.enabled = enabled;
            o.loaderVersion = loaderVersion;
            o.locked = locked;
            o.requirePci = requirePci;
            o.templateUuid = templateUuid;
            o.titleOptional = titleOptional;
            o.uuid = uuid;
            return o;
        }
    }
}