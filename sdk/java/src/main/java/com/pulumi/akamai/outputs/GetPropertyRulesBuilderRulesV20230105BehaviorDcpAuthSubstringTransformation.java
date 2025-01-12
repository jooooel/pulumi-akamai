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
public final class GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformation {
    private @Nullable Boolean locked;
    private @Nullable String substringEnd;
    private @Nullable String substringStart;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformation() {}
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> substringEnd() {
        return Optional.ofNullable(this.substringEnd);
    }
    public Optional<String> substringStart() {
        return Optional.ofNullable(this.substringStart);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean locked;
        private @Nullable String substringEnd;
        private @Nullable String substringStart;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.substringEnd = defaults.substringEnd;
    	      this.substringStart = defaults.substringStart;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder substringEnd(@Nullable String substringEnd) {
            this.substringEnd = substringEnd;
            return this;
        }
        @CustomType.Setter
        public Builder substringStart(@Nullable String substringStart) {
            this.substringStart = substringStart;
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
        public GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformation build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthSubstringTransformation();
            _resultValue.locked = locked;
            _resultValue.substringEnd = substringEnd;
            _resultValue.substringStart = substringStart;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
