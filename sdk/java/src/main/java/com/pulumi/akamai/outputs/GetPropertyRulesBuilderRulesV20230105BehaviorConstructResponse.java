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
public final class GetPropertyRulesBuilderRulesV20230105BehaviorConstructResponse {
    private @Nullable String body;
    private @Nullable Boolean enabled;
    private @Nullable Boolean forceEviction;
    private @Nullable Boolean ignorePurge;
    private @Nullable Boolean locked;
    private @Nullable Integer responseCode;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorConstructResponse() {}
    public Optional<String> body() {
        return Optional.ofNullable(this.body);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> forceEviction() {
        return Optional.ofNullable(this.forceEviction);
    }
    public Optional<Boolean> ignorePurge() {
        return Optional.ofNullable(this.ignorePurge);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Integer> responseCode() {
        return Optional.ofNullable(this.responseCode);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorConstructResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String body;
        private @Nullable Boolean enabled;
        private @Nullable Boolean forceEviction;
        private @Nullable Boolean ignorePurge;
        private @Nullable Boolean locked;
        private @Nullable Integer responseCode;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorConstructResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.enabled = defaults.enabled;
    	      this.forceEviction = defaults.forceEviction;
    	      this.ignorePurge = defaults.ignorePurge;
    	      this.locked = defaults.locked;
    	      this.responseCode = defaults.responseCode;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder body(@Nullable String body) {
            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder forceEviction(@Nullable Boolean forceEviction) {
            this.forceEviction = forceEviction;
            return this;
        }
        @CustomType.Setter
        public Builder ignorePurge(@Nullable Boolean ignorePurge) {
            this.ignorePurge = ignorePurge;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder responseCode(@Nullable Integer responseCode) {
            this.responseCode = responseCode;
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
        public GetPropertyRulesBuilderRulesV20230105BehaviorConstructResponse build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorConstructResponse();
            _resultValue.body = body;
            _resultValue.enabled = enabled;
            _resultValue.forceEviction = forceEviction;
            _resultValue.ignorePurge = ignorePurge;
            _resultValue.locked = locked;
            _resultValue.responseCode = responseCode;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
