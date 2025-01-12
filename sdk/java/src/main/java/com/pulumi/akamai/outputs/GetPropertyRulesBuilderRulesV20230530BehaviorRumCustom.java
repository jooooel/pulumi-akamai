// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530BehaviorRumCustom {
    private @Nullable Boolean locked;
    private @Nullable String rumGroupName;
    private @Nullable Integer rumSampleRate;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorRumCustom() {}
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> rumGroupName() {
        return Optional.ofNullable(this.rumGroupName);
    }
    public Optional<Integer> rumSampleRate() {
        return Optional.ofNullable(this.rumSampleRate);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorRumCustom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean locked;
        private @Nullable String rumGroupName;
        private @Nullable Integer rumSampleRate;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorRumCustom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.rumGroupName = defaults.rumGroupName;
    	      this.rumSampleRate = defaults.rumSampleRate;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder rumGroupName(@Nullable String rumGroupName) {
            this.rumGroupName = rumGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder rumSampleRate(@Nullable Integer rumSampleRate) {
            this.rumSampleRate = rumSampleRate;
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
        public GetPropertyRulesBuilderRulesV20230530BehaviorRumCustom build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorRumCustom();
            _resultValue.locked = locked;
            _resultValue.rumGroupName = rumGroupName;
            _resultValue.rumSampleRate = rumSampleRate;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
