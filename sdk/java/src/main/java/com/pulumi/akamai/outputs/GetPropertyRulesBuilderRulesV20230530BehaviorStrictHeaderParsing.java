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
public final class GetPropertyRulesBuilderRulesV20230530BehaviorStrictHeaderParsing {
    private @Nullable Boolean locked;
    private @Nullable Boolean strictMode;
    private @Nullable String templateUuid;
    private @Nullable String uuid;
    private @Nullable Boolean validMode;

    private GetPropertyRulesBuilderRulesV20230530BehaviorStrictHeaderParsing() {}
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Boolean> strictMode() {
        return Optional.ofNullable(this.strictMode);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public Optional<Boolean> validMode() {
        return Optional.ofNullable(this.validMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorStrictHeaderParsing defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean locked;
        private @Nullable Boolean strictMode;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        private @Nullable Boolean validMode;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorStrictHeaderParsing defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.strictMode = defaults.strictMode;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
    	      this.validMode = defaults.validMode;
        }

        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder strictMode(@Nullable Boolean strictMode) {
            this.strictMode = strictMode;
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
        public Builder validMode(@Nullable Boolean validMode) {
            this.validMode = validMode;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230530BehaviorStrictHeaderParsing build() {
            final var o = new GetPropertyRulesBuilderRulesV20230530BehaviorStrictHeaderParsing();
            o.locked = locked;
            o.strictMode = strictMode;
            o.templateUuid = templateUuid;
            o.uuid = uuid;
            o.validMode = validMode;
            return o;
        }
    }
}